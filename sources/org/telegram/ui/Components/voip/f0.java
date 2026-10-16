package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.e40;
public final class f0 extends View {
    public final org.telegram.ui.Cells.z f29839a;
    public final e40 f29840b;

    public f0(e40 e40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f29840b = e40Var;
        this.f29839a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e40 e40Var = this.f29840b;
        bs bsVar = e40Var.f29953c0;
        float measuredWidth = (1.0f - bsVar.f23540g) * e40Var.f29954d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((e40Var.f29955e0.getMeasuredWidth() * bsVar.f23540g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f29839a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f29839a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f29839a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29839a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
