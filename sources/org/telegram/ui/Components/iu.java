package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class iu extends View {
    public org.telegram.messenger.bc[] f34825a;
    public ei.c3 f34826b;
    public p5 f34827c;
    public ValueAnimator d;
    public float f34828e;

    public TLRPC.Document getDocument() {
        p5 p5Var = this.f34827c;
        if (p5Var != null) {
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                return g5.e(org.telegram.messenger.h10.f22829t0, p5Var.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824));
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
                float f10 = this.f34828e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 17));
                    this.d.addListener(new x5(this, 23));
                    org.telegram.messenger.camera.q.i(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
