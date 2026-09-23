package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class b50 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.sp f31965t1;
    public final f60 f31966u1;

    public b50(f60 f60Var, LaunchActivity launchActivity, org.telegram.ui.Components.sp spVar) {
        super(launchActivity, null);
        this.f31966u1 = f60Var;
        this.f31965t1 = spVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.sp spVar = this.f31965t1;
            spVar.f27963f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            spVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f31966u1).containerView;
            viewGroup.invalidate();
        }
    }
}
