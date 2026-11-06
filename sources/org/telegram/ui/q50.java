package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q50 extends ReplacementSpan {
    public final Paint f49109a;
    public final ImageReceiver f49110b;
    public final float f49111c;
    public float d;
    public final View f49112e;
    public boolean f49113f;
    public float h;
    public int f49114n;

    public q50(float f10, int i7, View view) {
        e5 e5Var = new e5(this, 3);
        this.f49113f = true;
        this.f49114n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49110b = imageReceiver;
        imageReceiver.d = i7;
        this.f49111c = f10;
        Paint paint = new Paint(1);
        this.f49109a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.f49112e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f49112e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f49112e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f49112e = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.f49110b.J0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9 = this.f49113f;
        Paint paint2 = this.f49109a;
        if (z9 && this.f49114n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f49114n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.f49114n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.f49111c) / 2.0f);
        if (this.f49113f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.f49111c) + f11, org.telegram.messenger.g0.L(this.f49111c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f49110b;
        imageReceiver.y0(f11, L, org.telegram.messenger.g0.L(this.f49111c), org.telegram.messenger.g0.L(this.f49111c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f49111c);
    }
}
