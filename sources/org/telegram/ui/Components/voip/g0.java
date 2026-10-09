package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.y30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f31941a;
    public final y30 f31942b;

    public g0(y30 y30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31942b = y30Var;
        this.f31941a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f31942b;
        es esVar = y30Var.f32058c0;
        float measuredWidth = (1.0f - esVar.f26157g) * y30Var.f32059d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((y30Var.f32061e0.getMeasuredWidth() * esVar.f26157g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31941a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31941a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31941a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31941a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
