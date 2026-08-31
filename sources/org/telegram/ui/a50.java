package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class a50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.rp f35013q1;
    public final d60 f35014r1;

    public a50(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.f35014r1 = d60Var;
        this.f35013q1 = rpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.rp rpVar = this.f35013q1;
            rpVar.f30814f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
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
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f35014r1).containerView;
            viewGroup.invalidate();
        }
    }
}
