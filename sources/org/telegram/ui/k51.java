package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class k51 extends ViewOutlineProvider {
    public final Rect f35576a = new Rect();
    public final Integer f35577b;
    public final q61 f35578c;

    public k51(q61 q61Var, Integer num) {
        this.f35578c = q61Var;
        this.f35577b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f35577b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        q61 q61Var = this.f35578c;
        boolean n10 = q61Var.n();
        Rect rect = this.f35576a;
        if (n10) {
            int paddingLeft = (int) ((dp - (q61Var.X0 * dp)) + view.getPaddingLeft());
            float w10 = e2.c.w(1.0f, q61Var.Y0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) e2.c.w(1.0f, q61Var.Y0, AndroidUtilities.dp(q61Var.f37596a1), w10), (int) (((width - dp) * q61Var.X0) + view.getPaddingLeft() + dp), (int) e2.c.w(1.0f, q61Var.Y0, AndroidUtilities.dp(q61Var.f37596a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (q61Var.X0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * q61Var.X0) + view.getPaddingLeft() + dp), (int) ((height * q61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
