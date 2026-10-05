package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class e50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.up f35955v1;
    public final h60 f35956w1;

    public e50(h60 h60Var, LaunchActivity launchActivity, org.telegram.ui.Components.up upVar) {
        super(launchActivity, null);
        this.f35956w1 = h60Var;
        this.f35955v1 = upVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.up upVar = this.f35955v1;
            upVar.f31496f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            upVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35956w1).containerView;
            viewGroup.invalidate();
        }
    }
}
