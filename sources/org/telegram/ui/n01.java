package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class n01 extends ViewOutlineProvider {
    public final Rect f50022a = new Rect();
    public final Integer f50023b;
    public final r11 f50024c;

    public n01(r11 r11Var, Integer num) {
        this.f50024c = r11Var;
        this.f50023b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f50023b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + org.telegram.messenger.g0.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r11 r11Var = this.f50024c;
        boolean n10 = r11Var.n();
        Rect rect = this.f50022a;
        if (n10) {
            int paddingLeft = (int) ((L - (r11Var.f51382b1 * L)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.f51385c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.f51385c1, org.telegram.messenger.g0.L(r11Var.f51390e1), z10), (int) (((width - L) * r11Var.f51382b1) + view.getPaddingLeft() + L), (int) com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.f51385c1, org.telegram.messenger.g0.L(r11Var.f51390e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (r11Var.f51382b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * r11Var.f51382b1) + view.getPaddingLeft() + L), (int) ((height * r11Var.f51385c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
