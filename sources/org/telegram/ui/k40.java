package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.hp f39696p1;
    public final o50 f39697q1;

    public k40(o50 o50Var, LaunchActivity launchActivity, org.telegram.ui.Components.hp hpVar) {
        super(launchActivity, null);
        this.f39697q1 = o50Var;
        this.f39696p1 = hpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.hp hpVar = this.f39696p1;
            hpVar.f29169f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            hpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f39697q1).containerView;
            viewGroup.invalidate();
        }
    }
}
