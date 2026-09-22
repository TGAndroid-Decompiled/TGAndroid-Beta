package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class e50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.rp f33241u1;
    public final i60 f33242v1;

    public e50(i60 i60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.f33242v1 = i60Var;
        this.f33241u1 = rpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.rp rpVar = this.f33241u1;
            rpVar.f28026f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
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
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f33242v1).containerView;
            viewGroup.invalidate();
        }
    }
}
