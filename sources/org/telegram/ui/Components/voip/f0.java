package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.k30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.y f31589a;
    public final k30 f31590b;

    public f0(k30 k30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.f31590b = k30Var;
        this.f31589a = yVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k30 k30Var = this.f31590b;
        yr yrVar = k30Var.f31703c0;
        float measuredWidth = (1.0f - yrVar.f33025g) * k30Var.f31704d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((k30Var.f31705e0.getMeasuredWidth() * yrVar.f33025g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.y yVar = this.f31589a;
        yVar.setBounds(0, 0, dp, measuredHeight);
        yVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31589a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31589a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31589a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
