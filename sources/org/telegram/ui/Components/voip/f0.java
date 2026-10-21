package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.h30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31404a;
    public final h30 f31405b;

    public f0(h30 h30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31405b = h30Var;
        this.f31404a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h30 h30Var = this.f31405b;
        yr yrVar = h30Var.f31518c0;
        float measuredWidth = (1.0f - yrVar.f32719g) * h30Var.f31519d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((h30Var.f31520e0.getMeasuredWidth() * yrVar.f32719g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31404a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31404a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31404a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31404a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
