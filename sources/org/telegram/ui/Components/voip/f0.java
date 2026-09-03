package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.w30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f32031a;
    public final w30 f32032b;

    public f0(w30 w30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f32032b = w30Var;
        this.f32031a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w30 w30Var = this.f32032b;
        mr mrVar = w30Var.W;
        float measuredWidth = (1.0f - mrVar.f29247g) * w30Var.f32144a0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((w30Var.f32146b0.getMeasuredWidth() * mrVar.f29247g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f32031a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32031a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32031a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32031a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
