package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.v30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f29275a;
    public final v30 f29276b;

    public g0(v30 v30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29276b = v30Var;
        this.f29275a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29276b;
        qr qrVar = v30Var.f29382c0;
        float measuredWidth = (1.0f - qrVar.f27709g) * v30Var.f29383d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((v30Var.f29384e0.getMeasuredWidth() * qrVar.f27709g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29275a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29275a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29275a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29275a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
