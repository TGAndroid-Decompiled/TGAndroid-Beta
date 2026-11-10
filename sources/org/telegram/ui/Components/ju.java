package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ju extends View {
    public org.telegram.messenger.ic[] f35075a;
    public di.z2 f35076b;
    public q5 f35077c;
    public ValueAnimator d;
    public float f35078e;

    public TLRPC.Document getDocument() {
        q5 q5Var = this.f35077c;
        if (q5Var != null) {
            TLRPC.Document document = q5Var.document;
            if (document == null) {
                return h5.e(org.telegram.messenger.p10.f24474s0, q5Var.getDocumentId());
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
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (!z9) {
                float f10 = this.f35078e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new d6(this, 17));
                    this.d.addListener(new y5(this, 23));
                    org.telegram.messenger.camera.q.i(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
