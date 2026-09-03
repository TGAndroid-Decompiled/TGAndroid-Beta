package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class a50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.rp f35024q1;
    public final d60 f35025r1;

    public a50(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.f35025r1 = d60Var;
        this.f35024q1 = rpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.rp rpVar = this.f35024q1;
            rpVar.f30866f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            rpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f35025r1).containerView;
            viewGroup.invalidate();
        }
    }
}
