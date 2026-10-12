package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class e50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.jq f36985u1;
    public final i60 f36986v1;

    public e50(i60 i60Var, LaunchActivity launchActivity, org.telegram.ui.Components.jq jqVar) {
        super(launchActivity, null);
        this.f36986v1 = i60Var;
        this.f36985u1 = jqVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.jq jqVar = this.f36985u1;
            jqVar.f27626f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            jqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36986v1).containerView;
            viewGroup.invalidate();
        }
    }
}
