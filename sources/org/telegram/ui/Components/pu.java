package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pu extends View {
    public org.telegram.messenger.hc[] f38409a;
    public fi.u2 f38410b;
    public p5 f38411c;
    public ValueAnimator d;
    public float f38412e;

    public TLRPC.Document getDocument() {
        p5 p5Var = this.f38411c;
        if (p5Var != null) {
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                return g5.e(org.telegram.messenger.m10.f24934t0, p5Var.getDocumentId());
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
                float f10 = this.f38412e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 17));
                    this.d.addListener(new x5(this, 23));
                    org.telegram.messenger.i20.k(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
