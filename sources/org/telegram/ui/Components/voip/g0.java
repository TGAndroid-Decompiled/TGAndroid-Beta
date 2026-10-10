package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fs;
import org.telegram.ui.y30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f32006a;
    public final y30 f32007b;

    public g0(y30 y30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f32007b = y30Var;
        this.f32006a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f32007b;
        fs fsVar = y30Var.f32123c0;
        float measuredWidth = (1.0f - fsVar.f26513g) * y30Var.f32124d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((y30Var.f32126e0.getMeasuredWidth() * fsVar.f26513g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f32006a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32006a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32006a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32006a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
