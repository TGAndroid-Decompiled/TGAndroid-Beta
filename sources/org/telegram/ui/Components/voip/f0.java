package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.a40;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31478a;
    public final a40 f31479b;

    public f0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31479b = a40Var;
        this.f31478a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f31479b;
        mr mrVar = a40Var.f31601c0;
        float measuredWidth = (1.0f - mrVar.f28500g) * a40Var.f31602d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f31604e0.getMeasuredWidth() * mrVar.f28500g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31478a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31478a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31478a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31478a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
