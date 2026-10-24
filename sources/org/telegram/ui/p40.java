package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.aq f40326v1;
    public final u50 f40327w1;

    public p40(u50 u50Var, LaunchActivity launchActivity, org.telegram.ui.Components.aq aqVar) {
        super(launchActivity, null);
        this.f40327w1 = u50Var;
        this.f40326v1 = aqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.aq aqVar = this.f40326v1;
            aqVar.f24780f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            aqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f40327w1).containerView;
            viewGroup.invalidate();
        }
    }
}
