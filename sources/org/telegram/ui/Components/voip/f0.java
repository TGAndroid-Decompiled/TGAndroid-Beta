package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.w30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f32026a;
    public final w30 f32027b;

    public f0(w30 w30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f32027b = w30Var;
        this.f32026a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w30 w30Var = this.f32027b;
        mr mrVar = w30Var.W;
        float measuredWidth = (1.0f - mrVar.f29236g) * w30Var.f32139a0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((w30Var.f32141b0.getMeasuredWidth() * mrVar.f29236g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f32026a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32026a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f32026a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32026a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
