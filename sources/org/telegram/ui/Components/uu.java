package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uu extends View {
    public org.telegram.messenger.gc[] f40417a;
    public fi.s2 f40418b;
    public x5 f40419c;
    public ValueAnimator d;
    public float f40420e;

    public TLRPC.Document getDocument() {
        x5 x5Var = this.f40419c;
        if (x5Var != null) {
            TLRPC.Document document = x5Var.document;
            if (document == null) {
                return o5.e(org.telegram.messenger.j10.f24773t0, x5Var.getDocumentId());
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
                float f10 = this.f40420e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new w(this, 18));
                    this.d.addListener(new x(this, 24));
                    org.telegram.ui.Cells.c0.q(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
