package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.o30;
public final class f0 extends View {
    public final org.telegram.ui.Cells.y f33898a;
    public final o30 f33899b;

    public f0(o30 o30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.f33899b = o30Var;
        this.f33898a = yVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o30 o30Var = this.f33899b;
        as asVar = o30Var.f34011c0;
        float measuredWidth = (1.0f - asVar.f26653g) * o30Var.f34012d0.getMeasuredWidth();
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) ((o30Var.f34013e0.getMeasuredWidth() * asVar.f26653g) + measuredWidth));
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.y yVar = this.f33898a;
        yVar.setBounds(0, 0, dp, measuredHeight);
        yVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33898a.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f33898a.jumpToCurrentState();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33898a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
