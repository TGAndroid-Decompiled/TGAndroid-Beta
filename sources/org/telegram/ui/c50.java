package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class c50 extends org.telegram.ui.ActionBar.l {
    public final org.telegram.ui.Components.tp f32525y1;
    public final g60 f32526z1;

    public c50(g60 g60Var, LaunchActivity launchActivity, org.telegram.ui.Components.tp tpVar) {
        super(launchActivity, null);
        this.f32526z1 = g60Var;
        this.f32525y1 = tpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.tp tpVar = this.f32525y1;
            tpVar.f28667f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            tpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f32526z1).containerView;
            viewGroup.invalidate();
        }
    }
}
