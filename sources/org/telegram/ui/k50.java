package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class k50 extends ReplacementSpan {
    public final Paint f46771a;
    public final ImageReceiver f46772b;
    public final float f46773c;
    public float d;
    public final View f46774e;
    public boolean f46775f;
    public float h;
    public int f46776n;

    public k50(float f10, int i3, View view) {
        g5 g5Var = new g5(this, 3);
        this.f46775f = true;
        this.f46776n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f46772b = imageReceiver;
        imageReceiver.d = i3;
        this.f46773c = f10;
        Paint paint = new Paint(1);
        this.f46771a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.f46774e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(g5Var);
                if (this.f46774e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f46774e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f46774e = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(g5Var);
            }
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.f46772b.J0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10 = this.f46775f;
        Paint paint2 = this.f46771a;
        if (z10 && this.f46776n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f46776n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.f46776n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.f46773c) / 2.0f);
        if (this.f46775f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.f46773c) + f11, org.telegram.messenger.g0.L(this.f46773c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f46772b;
        imageReceiver.y0(f11, L, org.telegram.messenger.g0.L(this.f46773c), org.telegram.messenger.g0.L(this.f46773c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f46773c);
    }
}
