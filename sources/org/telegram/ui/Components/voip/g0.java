package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.a40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f29356a;
    public final a40 f29357b;

    public g0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29357b = a40Var;
        this.f29356a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f29357b;
        nr nrVar = a40Var.f29464c0;
        float measuredWidth = (1.0f - nrVar.f26722g) * a40Var.f29465d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f29466e0.getMeasuredWidth() * nrVar.f26722g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29356a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29356a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29356a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29356a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
