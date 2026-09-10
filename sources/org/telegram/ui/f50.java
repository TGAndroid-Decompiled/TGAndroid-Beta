package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class f50 extends org.telegram.ui.ActionBar.l {
    public final org.telegram.ui.Components.xp f32685t1;
    public final j60 f32686u1;

    public f50(j60 j60Var, LaunchActivity launchActivity, org.telegram.ui.Components.xp xpVar) {
        super(launchActivity, null);
        this.f32686u1 = j60Var;
        this.f32685t1 = xpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.xp xpVar = this.f32685t1;
            xpVar.f29122f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            xpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f32686u1).containerView;
            viewGroup.invalidate();
        }
    }
}
