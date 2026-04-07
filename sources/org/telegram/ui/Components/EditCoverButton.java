package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
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
    private final Drawable arrowDrawable;
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final Rect bounds;
    private final RectF imageBounds;
    private final ImageReceiver imageReceiver;
    private final Text text;

    public EditCoverButton(Context context, CharSequence charSequence, boolean z) {
        super(context);
        this.bounds = new Rect();
        this.imageBounds = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.text = new Text(charSequence, 14.0f, AndroidUtilities.bold());
        if (z) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
            this.arrowDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.arrowDrawable = null;
    }

    public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f)).setRadius(AndroidUtilities.dp(11.0f));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    public void lambda$setImage$0(Bitmap bitmap) {
        this.imageReceiver.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(TLRPC.Photo photo, Object obj) {
        if (photo == null) {
            lambda$setImage$0((Bitmap) null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false), photo), "24_24", 0L, null, obj, 0);
    }

    public void setImage(final String str) {
        if (str == null) {
            lambda$setImage$0((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setImage$1(str);
                }
            });
        }
    }

    public void lambda$setImage$1(String str) {
        final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
        Paint paint = new Paint(3);
        canvas.translate(r0.getWidth() / 2.0f, r0.getHeight() / 2.0f);
        float fMax = Math.max(r0.getWidth() / bitmapDecodeFile.getWidth(), r0.getHeight() / bitmapDecodeFile.getHeight());
        canvas.scale(fMax, fMax);
        canvas.drawBitmap(bitmapDecodeFile, (-bitmapDecodeFile.getWidth()) / 2.0f, (-bitmapDecodeFile.getHeight()) / 2.0f, paint);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setImage$0(bitmapDecodeFile);
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        boolean zHasBitmapImage = this.imageReceiver.hasBitmapImage();
        int iCeil = ((int) Math.ceil(this.text.getCurrentWidth())) + AndroidUtilities.dp(zHasBitmapImage ? 30.33f : 11.33f) + AndroidUtilities.dp(19.0f);
        int iDp = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - iCeil) / 2;
        int height = getHeight() / 2;
        int i = height - (iDp / 2);
        int i2 = iCeil + width;
        this.bounds.set(width, i, i2, iDp + i);
        this.bounds.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(this.bounds);
            this.blurredBackgroundDrawable.draw(canvas);
        }
        if (zHasBitmapImage) {
            float f = height;
            this.imageBounds.set(AndroidUtilities.dp(0.66f) + width, f - (AndroidUtilities.dp(22.66f) / 2.0f), AndroidUtilities.dp(23.32f) + width, f + (AndroidUtilities.dp(22.66f) / 2.0f));
            this.imageReceiver.setImageCoords(this.imageBounds);
            this.imageReceiver.draw(canvas);
        }
        this.text.draw(canvas, width + r1, height, -1, 1.0f);
        this.arrowDrawable.setBounds(i2 - AndroidUtilities.dp(17.0f), height - AndroidUtilities.dp(6.0f), i2 - AndroidUtilities.dp(5.0f), height + AndroidUtilities.dp(6.0f));
        this.arrowDrawable.draw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.bounds.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
