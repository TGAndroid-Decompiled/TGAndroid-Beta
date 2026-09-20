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
public class pt extends View {
    public final u01 f27442a;
    public final Drawable f27443b;
    public final ImageReceiver f27444c;
    public final Rect d;
    public final RectF e;
    public ch.d f27445f;

    public pt(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f27444c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.f27442a = new u01(charSequence, 14.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
        this.f27443b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false);
        this.f27444c.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), "24_24", 0L, null, obj, 0);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27444c.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27444c.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int dp;
        ImageReceiver imageReceiver = this.f27444c;
        boolean hasBitmapImage = imageReceiver.hasBitmapImage();
        if (hasBitmapImage) {
            f7 = 30.33f;
        } else {
            f7 = 11.33f;
        }
        int dp2 = AndroidUtilities.dp(19.0f) + ((int) Math.ceil(this.f27442a.f28493c)) + AndroidUtilities.dp(f7);
        int dp3 = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - dp2) / 2;
        int height = getHeight() / 2;
        int i10 = height - (dp3 / 2);
        int i11 = dp2 + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, dp3 + i10);
        rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        ch.d dVar = this.f27445f;
        if (dVar != null) {
            dVar.setBounds(rect);
            this.f27445f.draw(canvas);
        }
        if (hasBitmapImage) {
            float f10 = height;
            float dp4 = (AndroidUtilities.dp(22.66f) / 2.0f) + f10;
            RectF rectF = this.e;
            rectF.set(AndroidUtilities.dp(0.66f) + width, f10 - (AndroidUtilities.dp(22.66f) / 2.0f), AndroidUtilities.dp(23.32f) + width, dp4);
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
        }
        this.f27442a.c(width + dp, height, 1.0f, -1, canvas);
        Drawable drawable = this.f27443b;
        drawable.setBounds(i11 - AndroidUtilities.dp(17.0f), height - AndroidUtilities.dp(6.0f), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(ch.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        dVar.q(AndroidUtilities.dp(11.0f));
        this.f27445f = dVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f27444c.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new tc(27, this, str));
        }
    }
}
