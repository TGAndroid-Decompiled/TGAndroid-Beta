package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.or;
import org.telegram.ui.x30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f28924a;
    public final x30 f28925b;

    public g0(x30 x30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f28925b = x30Var;
        this.f28924a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.f28925b;
        or orVar = x30Var.f29032c0;
        float measuredWidth = (1.0f - orVar.f26837g) * x30Var.f29033d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((x30Var.f29034e0.getMeasuredWidth() * orVar.f26837g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f28924a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28924a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f28924a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28924a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
