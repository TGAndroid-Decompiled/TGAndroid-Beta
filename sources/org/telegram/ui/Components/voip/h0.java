package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gs;
import org.telegram.ui.a40;
public final class h0 extends View {
    public final org.telegram.ui.Cells.z f31697a;
    public final a40 f31698b;

    public h0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31698b = a40Var;
        this.f31697a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f31698b;
        gs gsVar = a40Var.f31802c0;
        float measuredWidth = (1.0f - gsVar.f26507g) * a40Var.f31803d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f31805e0.getMeasuredWidth() * gsVar.f26507g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31697a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31697a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31697a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31697a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
