package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.v30;
public final class g0 extends View {
    public final org.telegram.ui.Cells.z f29278a;
    public final v30 f29279b;

    public g0(v30 v30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29279b = v30Var;
        this.f29278a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29279b;
        pr prVar = v30Var.f29385c0;
        float measuredWidth = (1.0f - prVar.f27403g) * v30Var.f29386d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((v30Var.f29387e0.getMeasuredWidth() * prVar.f27403g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29278a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29278a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29278a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29278a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
