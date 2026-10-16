package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class j50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.eq f36929u1;
    public final n60 f36930v1;

    public j50(n60 n60Var, LaunchActivity launchActivity, org.telegram.ui.Components.eq eqVar) {
        super(launchActivity, null);
        this.f36930v1 = n60Var;
        this.f36929u1 = eqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.eq eqVar = this.f36929u1;
            eqVar.f24451f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            eqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36930v1).containerView;
            viewGroup.invalidate();
        }
    }
}
