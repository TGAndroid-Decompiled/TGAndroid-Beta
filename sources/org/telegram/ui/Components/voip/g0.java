package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.v30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f29269a;
    public final v30 f29270b;

    public g0(v30 v30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29270b = v30Var;
        this.f29269a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29270b;
        pr prVar = v30Var.f29376c0;
        float measuredWidth = (1.0f - prVar.f27405g) * v30Var.f29377d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((v30Var.f29378e0.getMeasuredWidth() * prVar.f27405g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29269a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29269a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29269a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29269a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
