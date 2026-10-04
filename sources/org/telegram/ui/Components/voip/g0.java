package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.a40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f31870a;
    public final a40 f31871b;

    public g0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31871b = a40Var;
        this.f31870a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f31871b;
        qr qrVar = a40Var.f31985c0;
        float measuredWidth = (1.0f - qrVar.f30159g) * a40Var.f31986d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f31988e0.getMeasuredWidth() * qrVar.f30159g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31870a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31870a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31870a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31870a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
