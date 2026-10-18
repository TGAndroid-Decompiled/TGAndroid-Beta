package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.j30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31450a;
    public final j30 f31451b;

    public f0(j30 j30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31451b = j30Var;
        this.f31450a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f31451b;
        yr yrVar = j30Var.f31564c0;
        float measuredWidth = (1.0f - yrVar.f32750g) * j30Var.f31565d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((j30Var.f31566e0.getMeasuredWidth() * yrVar.f32750g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31450a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31450a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31450a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31450a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
