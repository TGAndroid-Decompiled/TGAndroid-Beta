package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class m01 extends ViewOutlineProvider {
    public final Rect f49918a = new Rect();
    public final Integer f49919b;
    public final q11 f49920c;

    public m01(q11 q11Var, Integer num) {
        this.f49920c = q11Var;
        this.f49919b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f49919b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        q11 q11Var = this.f49920c;
        boolean n10 = q11Var.n();
        Rect rect = this.f49918a;
        if (n10) {
            int paddingLeft = (int) ((L - (q11Var.f51231b1 * L)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, q11Var.f51234c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, q11Var.f51234c1, org.telegram.messenger.g0.L(q11Var.f51239e1), z10), (int) (((width - L) * q11Var.f51231b1) + view.getPaddingLeft() + L), (int) com.google.android.gms.internal.vision.e2.z(1.0f, q11Var.f51234c1, org.telegram.messenger.g0.L(q11Var.f51239e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (q11Var.f51231b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * q11Var.f51231b1) + view.getPaddingLeft() + L), (int) ((height * q11Var.f51234c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
