package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.j30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f31443a;
    public final j30 f31444b;

    public f0(j30 j30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f31444b = j30Var;
        this.f31443a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f31444b;
        yr yrVar = j30Var.f31557c0;
        float measuredWidth = (1.0f - yrVar.f32743g) * j30Var.f31558d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((j30Var.f31559e0.getMeasuredWidth() * yrVar.f32743g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f31443a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31443a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31443a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31443a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
