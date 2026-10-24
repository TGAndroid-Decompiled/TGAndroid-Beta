package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.k30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.y f31559a;
    public final k30 f31560b;

    public f0(k30 k30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.f31560b = k30Var;
        this.f31559a = yVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k30 k30Var = this.f31560b;
        wr wrVar = k30Var.f31673c0;
        float measuredWidth = (1.0f - wrVar.f32335g) * k30Var.f31674d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((k30Var.f31675e0.getMeasuredWidth() * wrVar.f32335g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.y yVar = this.f31559a;
        yVar.setBounds(0, 0, dp, measuredHeight);
        yVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f31559a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f31559a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31559a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
