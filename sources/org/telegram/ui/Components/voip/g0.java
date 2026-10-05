package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.a40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f31937a;
    public final a40 f31938b;

    public g0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31938b = a40Var;
        this.f31937a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f31938b;
        qr qrVar = a40Var.f32052c0;
        float measuredWidth = (1.0f - qrVar.f30185g) * a40Var.f32053d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f32055e0.getMeasuredWidth() * qrVar.f30185g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31937a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31937a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31937a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31937a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
