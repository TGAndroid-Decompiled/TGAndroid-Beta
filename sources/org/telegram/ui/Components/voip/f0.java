package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.j30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f33689a;
    public final j30 f33690b;

    public f0(j30 j30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f33690b = j30Var;
        this.f33689a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f33690b;
        gr grVar = j30Var.V;
        float measuredWidth = (1.0f - grVar.f28970g) * j30Var.W.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((j30Var.f33795a0.getMeasuredWidth() * grVar.f28970g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f33689a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33689a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33689a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33689a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
