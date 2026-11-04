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
public class ps extends View {
    public final ly0 f37232a;
    public final Drawable f37233b;
    public final ImageReceiver f37234c;
    public final Rect d;
    public final RectF f37235e;
    public gh.g f37236f;

    public ps(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.f37235e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f37234c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(22.66f));
        this.f37232a = new ly0(charSequence, 14.0f, org.telegram.messenger.g0.o());
        Drawable g7 = k2.p1.g(context, 2131230872);
        this.f37233b = g7;
        g7.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(48.0f), false, null, true);
        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(24.0f), false, w10, false);
        this.f37234c.r0(org.telegram.messenger.ac.i(w10, photo), "24_24", org.telegram.messenger.ac.i(w11, photo), "24_24", null, 0L, null, obj, 0);
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
        this.f37234c.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37234c.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int L;
        ImageReceiver imageReceiver = this.f37234c;
        boolean I = imageReceiver.I();
        if (I) {
            f10 = 30.33f;
        } else {
            f10 = 11.33f;
        }
        int L2 = org.telegram.messenger.g0.L(19.0f) + ((int) Math.ceil(this.f37232a.f35918c)) + org.telegram.messenger.g0.L(f10);
        int L3 = org.telegram.messenger.g0.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i3 = height - (L3 / 2);
        int i10 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i3, i10, L3 + i3);
        rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        gh.g gVar = this.f37236f;
        if (gVar != null) {
            gVar.setBounds(rect);
            this.f37236f.draw(canvas);
        }
        if (I) {
            float f11 = height;
            float L4 = (org.telegram.messenger.g0.L(22.66f) / 2.0f) + f11;
            RectF rectF = this.f37235e;
            rectF.set(org.telegram.messenger.g0.L(0.66f) + width, f11 - (org.telegram.messenger.g0.L(22.66f) / 2.0f), org.telegram.messenger.g0.L(23.32f) + width, L4);
            imageReceiver.A0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.f37232a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.f37233b;
        drawable.setBounds(i10 - org.telegram.messenger.g0.L(17.0f), height - org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(gh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        gVar.r(org.telegram.messenger.g0.L(11.0f));
        this.f37236f = gVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f37234c.v0(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.f21387e.c(new cl(10, this, str));
        }
    }
}
