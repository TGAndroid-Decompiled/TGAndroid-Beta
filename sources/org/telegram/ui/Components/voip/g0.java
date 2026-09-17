package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.c40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f28930a;
    public final c40 f28931b;

    public g0(c40 c40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f28931b = c40Var;
        this.f28930a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.f28931b;
        nr nrVar = c40Var.f29038c0;
        float measuredWidth = (1.0f - nrVar.f26528g) * c40Var.f29039d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((c40Var.f29040e0.getMeasuredWidth() * nrVar.f26528g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f28930a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28930a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28930a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28930a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
