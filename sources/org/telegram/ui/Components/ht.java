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
public class ht extends View {
    public final zz0 f29224a;
    public final Drawable f29225b;
    public final ImageReceiver f29226c;
    public final Rect d;
    public final RectF f29227e;
    public ng.d f29228f;

    public ht(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.f29227e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29226c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.f29224a = new zz0(charSequence, 14.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
        this.f29225b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false);
        this.f29226c.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), "24_24", 0L, null, obj, 0);
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
        this.f29226c.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29226c.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        int dp;
        ImageReceiver imageReceiver = this.f29226c;
        boolean hasBitmapImage = imageReceiver.hasBitmapImage();
        if (hasBitmapImage) {
            f9 = 30.33f;
        } else {
            f9 = 11.33f;
        }
        int dp2 = AndroidUtilities.dp(19.0f) + ((int) Math.ceil(this.f29224a.f35462c)) + AndroidUtilities.dp(f9);
        int dp3 = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - dp2) / 2;
        int height = getHeight() / 2;
        int i10 = height - (dp3 / 2);
        int i11 = dp2 + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, dp3 + i10);
        rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        ng.d dVar = this.f29228f;
        if (dVar != null) {
            dVar.setBounds(rect);
            this.f29228f.draw(canvas);
        }
        if (hasBitmapImage) {
            float f10 = height;
            float dp4 = (AndroidUtilities.dp(22.66f) / 2.0f) + f10;
            RectF rectF = this.f29227e;
            rectF.set(AndroidUtilities.dp(0.66f) + width, f10 - (AndroidUtilities.dp(22.66f) / 2.0f), AndroidUtilities.dp(23.32f) + width, dp4);
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
        }
        this.f29224a.c(width + dp, height, 1.0f, -1, canvas);
        Drawable drawable = this.f29225b;
        drawable.setBounds(i11 - AndroidUtilities.dp(17.0f), height - AndroidUtilities.dp(6.0f), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(ng.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        dVar.p(AndroidUtilities.dp(11.0f));
        this.f29228f = dVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f29226c.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new gt(0, this, str));
        }
    }
}
