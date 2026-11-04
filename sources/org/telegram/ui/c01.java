package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class c01 extends ViewOutlineProvider {
    public final Rect f44185a = new Rect();
    public final Integer f44186b;
    public final g11 f44187c;

    public c01(g11 g11Var, Integer num) {
        this.f44187c = g11Var;
        this.f44186b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f44186b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g11 g11Var = this.f44187c;
        boolean n4 = g11Var.n();
        Rect rect = this.f44185a;
        if (n4) {
            int paddingLeft = (int) ((L - (g11Var.f45440b1 * L)) + view.getPaddingLeft());
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, g11Var.f45443c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.recaptcha.internal.a.y(1.0f, g11Var.f45443c1, org.telegram.messenger.g0.L(g11Var.f45448e1), y9), (int) (((width - L) * g11Var.f45440b1) + view.getPaddingLeft() + L), (int) com.google.android.recaptcha.internal.a.y(1.0f, g11Var.f45443c1, org.telegram.messenger.g0.L(g11Var.f45448e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (g11Var.f45440b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * g11Var.f45440b1) + view.getPaddingLeft() + L), (int) ((height * g11Var.f45443c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
