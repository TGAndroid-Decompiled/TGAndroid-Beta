package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.h30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31452a;
    public final h30 f31453b;

    public f0(h30 h30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31453b = h30Var;
        this.f31452a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h30 h30Var = this.f31453b;
        yr yrVar = h30Var.f31566c0;
        float measuredWidth = (1.0f - yrVar.f32734g) * h30Var.f31567d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((h30Var.f31568e0.getMeasuredWidth() * yrVar.f32734g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31452a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31452a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31452a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31452a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
