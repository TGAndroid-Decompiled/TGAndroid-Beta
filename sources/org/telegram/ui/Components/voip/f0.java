package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.h30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31408a;
    public final h30 f31409b;

    public f0(h30 h30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31409b = h30Var;
        this.f31408a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h30 h30Var = this.f31409b;
        yr yrVar = h30Var.f31522c0;
        float measuredWidth = (1.0f - yrVar.f32723g) * h30Var.f31523d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((h30Var.f31524e0.getMeasuredWidth() * yrVar.f32723g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31408a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31408a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31408a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31408a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
