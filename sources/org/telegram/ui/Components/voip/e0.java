package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.x30;
public final class e0 extends View {
    public final org.telegram.ui.Cells.z f29582a;
    public final x30 f29583b;

    public e0(x30 x30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29583b = x30Var;
        this.f29582a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.f29583b;
        jr jrVar = x30Var.W;
        float measuredWidth = (1.0f - jrVar.f26041g) * x30Var.f29684a0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((x30Var.f29686b0.getMeasuredWidth() * jrVar.f26041g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29582a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29582a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29582a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29582a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
