package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class c21 extends ViewOutlineProvider {
    public final Rect f36167a = new Rect();
    public final Integer f36168b;
    public final g31 f36169c;

    public c21(g31 g31Var, Integer num) {
        this.f36169c = g31Var;
        this.f36168b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f36168b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.i0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g31 g31Var = this.f36169c;
        boolean n10 = g31Var.n();
        Rect rect = this.f36167a;
        if (n10) {
            int paddingLeft = (int) ((L - (g31Var.f37289a1 * L)) + view.getPaddingLeft());
            float z10 = c3.i0.z(1.0f, g31Var.f37292b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) c3.i0.z(1.0f, g31Var.f37292b1, org.telegram.messenger.i0.L(g31Var.f37297d1), z10), (int) (((width - L) * g31Var.f37289a1) + view.getPaddingLeft() + L), (int) c3.i0.z(1.0f, g31Var.f37292b1, org.telegram.messenger.i0.L(g31Var.f37297d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (g31Var.f37289a1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * g31Var.f37289a1) + view.getPaddingLeft() + L), (int) ((height * g31Var.f37292b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.i0.L(12.0f));
    }
}
