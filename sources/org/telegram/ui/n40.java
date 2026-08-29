package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class n40 extends org.telegram.ui.ActionBar.l {
    public final org.telegram.ui.Components.lp f40707p1;
    public final r50 f40708q1;

    public n40(r50 r50Var, LaunchActivity launchActivity, org.telegram.ui.Components.lp lpVar) {
        super(launchActivity, null);
        this.f40708q1 = r50Var;
        this.f40707p1 = lpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.lp lpVar = this.f40707p1;
            lpVar.f30408f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            lpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f9) {
        ViewGroup viewGroup;
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f40708q1).containerView;
            viewGroup.invalidate();
        }
    }
}
