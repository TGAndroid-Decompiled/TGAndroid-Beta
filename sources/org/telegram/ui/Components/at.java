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

public class at extends View {

    public final pz0 f26818a;

    public final Drawable f26819b;

    public final ImageReceiver f26820c;
    public final Rect d;

    public final RectF f26821e;

    public lg.d f26822f;

    public at(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.f26821e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f26820c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.f26818a = new pz0(charSequence, 14.0f, AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
        this.f26819b = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false);
        this.f26820c.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), "24_24", 0L, null, obj, 0);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26820c.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26820c.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f26820c;
        boolean zHasBitmapImage = imageReceiver.hasBitmapImage();
        int iDp = AndroidUtilities.dp(zHasBitmapImage ? 30.33f : 11.33f);
        int iDp2 = AndroidUtilities.dp(19.0f) + ((int) Math.ceil(this.f26818a.f31697c)) + iDp;
        int iDp3 = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - iDp2) / 2;
        int height = getHeight() / 2;
        int i10 = height - (iDp3 / 2);
        int i11 = iDp2 + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, iDp3 + i10);
        rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        lg.d dVar = this.f26822f;
        if (dVar != null) {
            dVar.setBounds(rect);
            this.f26822f.draw(canvas);
        }
        if (zHasBitmapImage) {
            float fDp = AndroidUtilities.dp(0.66f) + width;
            float f10 = height;
            float fDp2 = f10 - (AndroidUtilities.dp(22.66f) / 2.0f);
            float fDp3 = AndroidUtilities.dp(23.32f) + width;
            float fDp4 = (AndroidUtilities.dp(22.66f) / 2.0f) + f10;
            RectF rectF = this.f26821e;
            rectF.set(fDp, fDp2, fDp3, fDp4);
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
        }
        this.f26818a.c(width + iDp, height, 1.0f, -1, canvas);
        int iDp4 = i11 - AndroidUtilities.dp(17.0f);
        int iDp5 = height - AndroidUtilities.dp(6.0f);
        int iDp6 = i11 - AndroidUtilities.dp(5.0f);
        int iDp7 = AndroidUtilities.dp(6.0f) + height;
        Drawable drawable = this.f26819b;
        drawable.setBounds(iDp4, iDp5, iDp6, iDp7);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(lg.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        dVar.p(AndroidUtilities.dp(11.0f));
        this.f26822f = dVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f26820c.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new xq(3, this, str));
        }
    }
}
