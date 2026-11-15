package org.telegram.ui;

import android.graphics.Canvas;
public final class a30 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.jp G1;
    public final c40 H1;

    public a30(c40 c40Var, LaunchActivity launchActivity, org.telegram.ui.Components.jp jpVar) {
        super(launchActivity, null);
        this.H1 = c40Var;
        this.G1 = jpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.jp jpVar = this.G1;
            jpVar.f36135f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            jpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.H1.f29682b.invalidate();
        }
    }
}
