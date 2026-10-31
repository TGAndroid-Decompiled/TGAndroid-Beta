package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class e21 extends ViewOutlineProvider {
    public final Rect f36897a = new Rect();
    public final Integer f36898b;
    public final i31 f36899c;

    public e21(i31 i31Var, Integer num) {
        this.f36899c = i31Var;
        this.f36898b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f36898b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.i0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        i31 i31Var = this.f36899c;
        boolean n10 = i31Var.n();
        Rect rect = this.f36897a;
        if (n10) {
            int paddingLeft = (int) ((L - (i31Var.f38113a1 * L)) + view.getPaddingLeft());
            float z10 = c3.i0.z(1.0f, i31Var.f38116b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) c3.i0.z(1.0f, i31Var.f38116b1, org.telegram.messenger.i0.L(i31Var.f38121d1), z10), (int) (((width - L) * i31Var.f38113a1) + view.getPaddingLeft() + L), (int) c3.i0.z(1.0f, i31Var.f38116b1, org.telegram.messenger.i0.L(i31Var.f38121d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (i31Var.f38113a1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * i31Var.f38113a1) + view.getPaddingLeft() + L), (int) ((height * i31Var.f38116b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.i0.L(12.0f));
    }
}
