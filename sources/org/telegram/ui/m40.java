package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class m40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.bq f39108u1;
    public final q50 f39109v1;

    public m40(q50 q50Var, LaunchActivity launchActivity, org.telegram.ui.Components.bq bqVar) {
        super(launchActivity, null);
        this.f39109v1 = q50Var;
        this.f39108u1 = bqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.bq bqVar = this.f39108u1;
            bqVar.f25007f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            bqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f39109v1).containerView;
            viewGroup.invalidate();
        }
    }
}
