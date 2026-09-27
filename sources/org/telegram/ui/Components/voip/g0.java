package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.y30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f29300a;
    public final y30 f29301b;

    public g0(y30 y30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29301b = y30Var;
        this.f29300a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f29301b;
        pr prVar = y30Var.f29407c0;
        float measuredWidth = (1.0f - prVar.f27446g) * y30Var.f29408d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((y30Var.f29409e0.getMeasuredWidth() * prVar.f27446g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29300a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29300a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29300a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29300a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
