package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.a40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f28953a;
    public final a40 f28954b;

    public g0(a40 a40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f28954b = a40Var;
        this.f28953a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f28954b;
        nr nrVar = a40Var.f29061c0;
        float measuredWidth = (1.0f - nrVar.f26560g) * a40Var.f29062d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((a40Var.f29063e0.getMeasuredWidth() * nrVar.f26560g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f28953a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28953a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28953a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28953a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
