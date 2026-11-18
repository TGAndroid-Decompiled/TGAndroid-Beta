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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class ct extends View {
    public final vy0 f34175a;
    public final Drawable f34176b;
    public final ImageReceiver f34177c;
    public final Rect d;
    public final RectF f34178e;
    public fh.g f34179f;

    public ct(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.f34178e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f34177c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(22.66f));
        this.f34175a = new vy0(charSequence, 14.0f, org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, 2131230872);
        this.f34176b = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(48.0f), false, null, true);
        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(24.0f), false, w10, false);
        this.f34177c.r0(org.telegram.messenger.fc.i(w10, photo), "24_24", org.telegram.messenger.fc.i(w11, photo), "24_24", null, 0L, null, obj, 0);
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
        this.f34177c.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34177c.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        ImageReceiver imageReceiver = this.f34177c;
        boolean I = imageReceiver.I();
        if (I) {
            f10 = 30.33f;
        } else {
            f10 = 11.33f;
        }
        int L2 = org.telegram.messenger.g0.L(19.0f) + ((int) Math.ceil(this.f34175a.f41482c)) + org.telegram.messenger.g0.L(f10);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i7 = height - (L3 / 2);
        int i10 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i7, i10, L3 + i7);
        rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        fh.g gVar = this.f34179f;
        if (gVar != null) {
            gVar.setBounds(rect);
            this.f34179f.draw(canvas);
        }
        if (I) {
            float f11 = height;
            float L4 = (org.telegram.messenger.g0.L(22.66f) / 2.0f) + f11;
            RectF rectF = this.f34178e;
            rectF.set(org.telegram.messenger.g0.L(0.66f) + width, f11 - (org.telegram.messenger.g0.L(22.66f) / 2.0f), org.telegram.messenger.g0.L(23.32f) + width, L4);
            imageReceiver.A0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.f34175a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.f34176b;
        drawable.setBounds(i10 - org.telegram.messenger.g0.L(17.0f), height - org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        gVar.r(org.telegram.messenger.g0.L(11.0f));
        this.f34179f = gVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f34177c.v0(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.f22782e.c(new mg(25, this, str));
        }
    }
}
