package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.b40;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f28131a;
    public final b40 f28132b;

    public g0(b40 b40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f28132b = b40Var;
        this.f28131a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b40 b40Var = this.f28132b;
        tr trVar = b40Var.f28244c0;
        float measuredWidth = (1.0f - trVar.f27473g) * b40Var.f28245d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((b40Var.f28246e0.getMeasuredWidth() * trVar.f27473g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f28131a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28131a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28131a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28131a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
