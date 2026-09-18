package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class g50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.rp f33859u1;
    public final k60 f33860v1;

    public g50(k60 k60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.f33860v1 = k60Var;
        this.f33859u1 = rpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.rp rpVar = this.f33859u1;
            rpVar.f27668f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            rpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f33860v1).containerView;
            viewGroup.invalidate();
        }
    }
}
