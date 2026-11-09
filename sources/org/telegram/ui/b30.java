package org.telegram.ui;

import android.graphics.Canvas;
public final class b30 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.ap F1;
    public final e40 G1;

    public b30(e40 e40Var, LaunchActivity launchActivity, org.telegram.ui.Components.ap apVar) {
        super(launchActivity, null);
        this.G1 = e40Var;
        this.F1 = apVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.ap apVar = this.F1;
            apVar.f31939f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            apVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.f28624b.invalidate();
        }
    }
}
