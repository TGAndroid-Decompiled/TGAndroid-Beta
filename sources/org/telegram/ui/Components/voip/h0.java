package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fs;
import org.telegram.ui.y30;
public final class h0 extends View {
    public final org.telegram.ui.Cells.z f32075a;
    public final y30 f32076b;

    public h0(y30 y30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f32076b = y30Var;
        this.f32075a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f32076b;
        fs fsVar = y30Var.f32181c0;
        float measuredWidth = (1.0f - fsVar.f26562g) * y30Var.f32182d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((y30Var.f32184e0.getMeasuredWidth() * fsVar.f26562g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f32075a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32075a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32075a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32075a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
