package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class o01 extends ViewOutlineProvider {
    public final Rect f50390a = new Rect();
    public final Integer f50391b;
    public final s11 f50392c;

    public o01(s11 s11Var, Integer num) {
        this.f50392c = s11Var;
        this.f50391b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f50391b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        s11 s11Var = this.f50392c;
        boolean n10 = s11Var.n();
        Rect rect = this.f50390a;
        if (n10) {
            int paddingLeft = (int) ((L - (s11Var.f51828b1 * L)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.f51831c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.f51831c1, org.telegram.messenger.g0.L(s11Var.f51836e1), z10), (int) (((width - L) * s11Var.f51828b1) + view.getPaddingLeft() + L), (int) com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.f51831c1, org.telegram.messenger.g0.L(s11Var.f51836e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (s11Var.f51828b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * s11Var.f51828b1) + view.getPaddingLeft() + L), (int) ((height * s11Var.f51831c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
