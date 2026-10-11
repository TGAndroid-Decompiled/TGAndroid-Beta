package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fs;
import org.telegram.ui.y30;
public final class h0 extends View {
    public final org.telegram.ui.Cells.z f32011a;
    public final y30 f32012b;

    public h0(y30 y30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f32012b = y30Var;
        this.f32011a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f32012b;
        fs fsVar = y30Var.f32117c0;
        float measuredWidth = (1.0f - fsVar.f26482g) * y30Var.f32118d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((y30Var.f32120e0.getMeasuredWidth() * fsVar.f26482g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f32011a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32011a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32011a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32011a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
