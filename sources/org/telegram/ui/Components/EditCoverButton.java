package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class EditCoverButton extends View {
    public final Drawable arrowDrawable;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public final Rect bounds;
    public final RectF imageBounds;
    public final ImageReceiver imageReceiver;
    public final Text text;

    public EditCoverButton(Context context, String str) {
        super(context);
        this.bounds = new Rect();
        this.imageBounds = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.text = new Text(str, 14.0f, AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
        this.arrowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.bounds.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.imageReceiver;
        boolean zHasBitmapImage = imageReceiver.hasBitmapImage();
        int iDp = AndroidUtilities.dp(zHasBitmapImage ? 30.33f : 11.33f);
        int iDp2 = AndroidUtilities.dp(19.0f) + ((int) Math.ceil(this.text.width)) + iDp;
        int iDp3 = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - iDp2) / 2;
        int height = getHeight() / 2;
        int i = height - (iDp3 / 2);
        int i2 = iDp2 + width;
        Rect rect = this.bounds;
        rect.set(width, i, i2, iDp3 + i);
        rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(rect);
            this.blurredBackgroundDrawable.draw(canvas);
        }
        if (zHasBitmapImage) {
            RectF rectF = this.imageBounds;
            float f = height;
            rectF.set(AndroidUtilities.dp(0.66f) + width, f - (AndroidUtilities.dp(22.66f) / 2.0f), AndroidUtilities.dp(23.32f) + width, (AndroidUtilities.dp(22.66f) / 2.0f) + f);
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
        }
        this.text.draw(width + iDp, height, 1.0f, -1, canvas);
        int iDp4 = i2 - AndroidUtilities.dp(17.0f);
        int iDp5 = height - AndroidUtilities.dp(6.0f);
        int iDp6 = i2 - AndroidUtilities.dp(5.0f);
        int iDp7 = AndroidUtilities.dp(6.0f) + height;
        Drawable drawable = this.arrowDrawable;
        drawable.setBounds(iDp4, iDp5, iDp6, iDp7);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(11.0f));
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
    }

    public void setImage(Bitmap bitmap) {
        this.imageReceiver.setImageBitmap(bitmap);
        invalidate();
    }

    public final void setImage(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false), photo), "24_24", 0L, null, obj, 0);
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new EmojiView$2$$ExternalSyntheticLambda1(16, this, str));
        }
    }
}
