package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.br;
import org.telegram.ui.j30;

public final class e0 extends View {

    public final org.telegram.ui.Cells.z f33543a;

    public final j30 f33544b;

    public e0(j30 j30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.f33544b = j30Var;
        this.f33543a = zVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f33544b;
        float measuredWidth = j30Var.W.getMeasuredWidth();
        br brVar = j30Var.V;
        float measuredWidth2 = (j30Var.f33647a0.getMeasuredWidth() * brVar.f27199g) + ((1.0f - brVar.f27199g) * measuredWidth);
        canvas.save();
        int iDp = AndroidUtilities.dp(50.0f) + ((int) measuredWidth2);
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.f33543a;
        zVar.setBounds(0, 0, iDp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33543a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33543a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f33543a == drawable || super.verifyDrawable(drawable);
    }
}
