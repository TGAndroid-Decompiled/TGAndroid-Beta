package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xu extends View {
    public org.telegram.messenger.hc[] f42218a;
    public fi.s2 f42219b;
    public y5 f42220c;
    public ValueAnimator d;
    public float f42221e;

    public TLRPC.Document getDocument() {
        y5 y5Var = this.f42220c;
        if (y5Var != null) {
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                return p5.e(org.telegram.messenger.k10.f24968t0, y5Var.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (!z10) {
                float f10 = this.f42221e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new x(this, 18));
                    this.d.addListener(new y(this, 24));
                    org.telegram.ui.Cells.c0.q(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
