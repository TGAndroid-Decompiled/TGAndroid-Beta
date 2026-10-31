package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class o60 extends ReplacementSpan {
    public final Paint f40150a;
    public final ImageReceiver f40151b;
    public final float f40152c;
    public float d;
    public final View e;
    public boolean f40153f;
    public float h;
    public int f40154n;

    public o60(float f7, int i10, View view) {
        d5 d5Var = new d5(this, 3);
        this.f40153f = true;
        this.f40154n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f40151b = imageReceiver;
        imageReceiver.d = i10;
        this.f40152c = f7;
        Paint paint = new Paint(1);
        this.f40150a = paint;
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), 855638016);
        View view2 = this.e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(d5Var);
                if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.e = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(d5Var);
            }
        }
    }

    public final void a(float f7) {
        float L = org.telegram.messenger.i0.L(f7);
        this.d = L;
        this.f40151b.J0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f40153f;
        Paint paint2 = this.f40150a;
        if (z10 && this.f40154n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f40154n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.f40154n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float L = (((i12 + i14) / 2.0f) + 0.0f) - (org.telegram.messenger.i0.L(this.f40152c) / 2.0f);
        if (this.f40153f) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(f10, L, org.telegram.messenger.i0.L(this.f40152c) + f10, org.telegram.messenger.i0.L(this.f40152c) + L);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f40151b;
        imageReceiver.y0(f10, L, org.telegram.messenger.i0.L(this.f40152c), org.telegram.messenger.i0.L(this.f40152c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(this.f40152c);
    }
}
