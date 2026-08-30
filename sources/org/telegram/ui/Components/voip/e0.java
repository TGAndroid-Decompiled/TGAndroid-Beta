package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kr;
import org.telegram.ui.v30;
public final class e0 extends View {
    public final org.telegram.ui.Cells.z f29610a;
    public final v30 f29611b;

    public e0(v30 v30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29611b = v30Var;
        this.f29610a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29611b;
        kr krVar = v30Var.W;
        float measuredWidth = (1.0f - krVar.f26373g) * v30Var.f29712a0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((v30Var.f29714b0.getMeasuredWidth() * krVar.f26373g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29610a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29610a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29610a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29610a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
