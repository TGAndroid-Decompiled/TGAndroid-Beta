package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class j01 extends ViewOutlineProvider {
    public final Rect f48163a = new Rect();
    public final Integer f48164b;
    public final n11 f48165c;

    public j01(n11 n11Var, Integer num) {
        this.f48165c = n11Var;
        this.f48164b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f48164b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        n11 n11Var = this.f48165c;
        boolean n10 = n11Var.n();
        Rect rect = this.f48163a;
        if (n10) {
            int paddingLeft = (int) ((L - (n11Var.f49369b1 * L)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.f49372c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.f49372c1, org.telegram.messenger.g0.L(n11Var.f49377e1), z10), (int) (((width - L) * n11Var.f49369b1) + view.getPaddingLeft() + L), (int) com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.f49372c1, org.telegram.messenger.g0.L(n11Var.f49377e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (n11Var.f49369b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * n11Var.f49369b1) + view.getPaddingLeft() + L), (int) ((height * n11Var.f49372c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
