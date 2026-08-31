package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class m51 extends ViewOutlineProvider {
    public final Rect f38970a = new Rect();
    public final Integer f38971b;
    public final r61 f38972c;

    public m51(r61 r61Var, Integer num) {
        this.f38972c = r61Var;
        this.f38971b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f38971b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r61 r61Var = this.f38972c;
        boolean n10 = r61Var.n();
        Rect rect = this.f38970a;
        if (n10) {
            int paddingLeft = (int) ((dp - (r61Var.X0 * dp)) + view.getPaddingLeft());
            float w10 = e2.c.w(1.0f, r61Var.Y0, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) e2.c.w(1.0f, r61Var.Y0, AndroidUtilities.dp(r61Var.f40781a1), w10), (int) (((width - dp) * r61Var.X0) + view.getPaddingLeft() + dp), (int) e2.c.w(1.0f, r61Var.Y0, AndroidUtilities.dp(r61Var.f40781a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (r61Var.X0 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * r61Var.X0) + view.getPaddingLeft() + dp), (int) ((height * r61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
