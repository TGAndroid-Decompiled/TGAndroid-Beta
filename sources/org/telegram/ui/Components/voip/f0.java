package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.m30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.y f33793a;
    public final m30 f33794b;

    public f0(m30 m30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.f33794b = m30Var;
        this.f33793a = yVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m30 m30Var = this.f33794b;
        as asVar = m30Var.f33906c0;
        float measuredWidth = (1.0f - asVar.f26608g) * m30Var.f33907d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((m30Var.f33908e0.getMeasuredWidth() * asVar.f26608g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.y yVar = this.f33793a;
        yVar.setBounds(0, 0, dp, measuredHeight);
        yVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33793a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33793a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33793a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
