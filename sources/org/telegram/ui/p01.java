package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class p01 extends ViewOutlineProvider {
    public final Rect f48611a = new Rect();
    public final Integer f48612b;
    public final t11 f48613c;

    public p01(t11 t11Var, Integer num) {
        this.f48613c = t11Var;
        this.f48612b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f48612b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        t11 t11Var = this.f48613c;
        boolean n10 = t11Var.n();
        Rect rect = this.f48611a;
        if (n10) {
            int paddingLeft = (int) ((L - (t11Var.f50019a1 * L)) + view.getPaddingLeft());
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, t11Var.f50022b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.recaptcha.internal.a.z(1.0f, t11Var.f50022b1, org.telegram.messenger.g0.L(t11Var.f50027d1), z9), (int) (((width - L) * t11Var.f50019a1) + view.getPaddingLeft() + L), (int) com.google.android.recaptcha.internal.a.z(1.0f, t11Var.f50022b1, org.telegram.messenger.g0.L(t11Var.f50027d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (t11Var.f50019a1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * t11Var.f50019a1) + view.getPaddingLeft() + L), (int) ((height * t11Var.f50022b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
