package org.telegram.ui;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

public final class o40 extends org.telegram.ui.ActionBar.k {

    public final org.telegram.ui.Components.fp f40985p1;

    public final s50 f40986q1;

    public o40(s50 s50Var, LaunchActivity launchActivity, org.telegram.ui.Components.fp fpVar) {
        super(launchActivity, null);
        this.f40986q1 = s50Var;
        this.f40985p1 = fpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.fp fpVar = this.f40985p1;
            fpVar.f28426f = alpha;
            fpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            ((org.telegram.ui.ActionBar.e3) this.f40986q1).containerView.invalidate();
        }
    }
}
