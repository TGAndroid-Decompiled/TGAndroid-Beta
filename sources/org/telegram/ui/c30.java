package org.telegram.ui;

import android.graphics.Canvas;
public final class c30 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.pp G1;
    public final e40 H1;

    public c30(e40 e40Var, LaunchActivity launchActivity, org.telegram.ui.Components.pp ppVar) {
        super(launchActivity, null);
        this.H1 = e40Var;
        this.G1 = ppVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.pp ppVar = this.G1;
            ppVar.f38536f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            ppVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.H1.f30226b.invalidate();
        }
    }
}
