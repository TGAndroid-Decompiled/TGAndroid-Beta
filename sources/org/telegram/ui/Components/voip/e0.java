package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dr;
import org.telegram.ui.g30;
public final class e0 extends View {
    public final org.telegram.ui.Cells.z f33493a;
    public final g30 f33494b;

    public e0(g30 g30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f33494b = g30Var;
        this.f33493a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g30 g30Var = this.f33494b;
        dr drVar = g30Var.V;
        float measuredWidth = (1.0f - drVar.f27793g) * g30Var.W.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((g30Var.f33597a0.getMeasuredWidth() * drVar.f27793g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f33493a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33493a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33493a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33493a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
