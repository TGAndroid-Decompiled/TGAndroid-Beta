package org.telegram.ui;

import android.graphics.Canvas;
public final class d30 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.qp G1;
    public final f40 H1;

    public d30(f40 f40Var, LaunchActivity launchActivity, org.telegram.ui.Components.qp qpVar) {
        super(launchActivity, null);
        this.H1 = f40Var;
        this.G1 = qpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.qp qpVar = this.G1;
            qpVar.f38857f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            qpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.H1.f30190b.invalidate();
        }
    }
}
