package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class c50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.hq f36530u1;
    public final g60 f36531v1;

    public c50(g60 g60Var, LaunchActivity launchActivity, org.telegram.ui.Components.hq hqVar) {
        super(launchActivity, null);
        this.f36531v1 = g60Var;
        this.f36530u1 = hqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.hq hqVar = this.f36530u1;
            hqVar.f27111f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            hqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36531v1).containerView;
            viewGroup.invalidate();
        }
    }
}
