package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ku extends View {
    public org.telegram.messenger.ic[] f35433a;
    public di.z2 f35434b;
    public r5 f35435c;
    public ValueAnimator d;
    public float f35436e;

    public TLRPC.Document getDocument() {
        r5 r5Var = this.f35435c;
        if (r5Var != null) {
            TLRPC.Document document = r5Var.document;
            if (document == null) {
                return i5.e(org.telegram.messenger.p10.f24470s0, r5Var.getDocumentId());
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
                float f10 = this.f35436e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new e6(this, 17));
                    this.d.addListener(new z5(this, 23));
                    org.telegram.messenger.camera.q.i(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
