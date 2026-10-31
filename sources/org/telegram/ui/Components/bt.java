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
public class bt extends View {
    public final qz0 f24875a;
    public final Drawable f24876b;
    public final ImageReceiver f24877c;
    public final Rect d;
    public final RectF e;
    public vg.f f24878f;

    public bt(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24877c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(22.66f));
        this.f24875a = new qz0(charSequence, 14.0f, org.telegram.messenger.i0.o());
        Drawable f7 = i0.a.f(context, 2131230872);
        this.f24876b = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(48.0f), false, null, true);
        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(24.0f), false, w9, false);
        this.f24877c.r0(org.telegram.messenger.ic.i(w9, photo), "24_24", org.telegram.messenger.ic.i(w10, photo), "24_24", null, 0L, null, obj, 0);
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
        this.f24877c.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24877c.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int L;
        ImageReceiver imageReceiver = this.f24877c;
        boolean I = imageReceiver.I();
        if (I) {
            f7 = 30.33f;
        } else {
            f7 = 11.33f;
        }
        int L2 = org.telegram.messenger.i0.L(19.0f) + ((int) Math.ceil(this.f24875a.f29774c)) + org.telegram.messenger.i0.L(f7);
        int L3 = org.telegram.messenger.i0.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i10 = height - (L3 / 2);
        int i11 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, L3 + i10);
        rect.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        vg.f fVar = this.f24878f;
        if (fVar != null) {
            fVar.setBounds(rect);
            this.f24878f.draw(canvas);
        }
        if (I) {
            float f10 = height;
            float L4 = (org.telegram.messenger.i0.L(22.66f) / 2.0f) + f10;
            RectF rectF = this.e;
            rectF.set(org.telegram.messenger.i0.L(0.66f) + width, f10 - (org.telegram.messenger.i0.L(22.66f) / 2.0f), org.telegram.messenger.i0.L(23.32f) + width, L4);
            imageReceiver.A0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.f24875a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.f24876b;
        drawable.setBounds(i11 - org.telegram.messenger.i0.L(17.0f), height - org.telegram.messenger.i0.L(6.0f), i11 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(vg.f fVar) {
        fVar.p(org.telegram.messenger.i0.L(4.0f));
        fVar.q(org.telegram.messenger.i0.L(11.0f));
        this.f24878f = fVar;
    }

    public void setImage(Bitmap bitmap) {
        this.f24877c.v0(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new cd(29, this, str));
        }
    }
}
