package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.cq f40344v1;
    public final u50 f40345w1;

    public p40(u50 u50Var, LaunchActivity launchActivity, org.telegram.ui.Components.cq cqVar) {
        super(launchActivity, null);
        this.f40345w1 = u50Var;
        this.f40344v1 = cqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.cq cqVar = this.f40344v1;
            cqVar.f25403f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            cqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f40345w1).containerView;
            viewGroup.invalidate();
        }
    }
}
