package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.c40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f28933a;
    public final c40 f28934b;

    public g0(c40 c40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f28934b = c40Var;
        this.f28933a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.f28934b;
        nr nrVar = c40Var.f29041c0;
        float measuredWidth = (1.0f - nrVar.f26531g) * c40Var.f29042d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((c40Var.f29043e0.getMeasuredWidth() * nrVar.f26531g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f28933a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28933a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28933a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28933a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
