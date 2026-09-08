package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class f50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.qp f36293t1;
    public final j60 f36294u1;

    public f50(j60 j60Var, LaunchActivity launchActivity, org.telegram.ui.Components.qp qpVar) {
        super(launchActivity, null);
        this.f36294u1 = j60Var;
        this.f36293t1 = qpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.qp qpVar = this.f36293t1;
            qpVar.f29819f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            qpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36294u1).containerView;
            viewGroup.invalidate();
        }
    }
}
