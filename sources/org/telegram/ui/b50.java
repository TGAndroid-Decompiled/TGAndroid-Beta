package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class b50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.op f32739q1;
    public final e60 f32740r1;

    public b50(e60 e60Var, LaunchActivity launchActivity, org.telegram.ui.Components.op opVar) {
        super(launchActivity, null);
        this.f32740r1 = e60Var;
        this.f32739q1 = opVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.op opVar = this.f32739q1;
            opVar.f27625f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            opVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f32740r1).containerView;
            viewGroup.invalidate();
        }
    }
}
