package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class b61 extends ViewOutlineProvider {
    public final Rect f32253a = new Rect();
    public final Integer f32254b;
    public final g71 f32255c;

    public b61(g71 g71Var, Integer num) {
        this.f32255c = g71Var;
        this.f32254b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f32254b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g71 g71Var = this.f32255c;
        boolean n10 = g71Var.n();
        Rect rect = this.f32253a;
        if (n10) {
            int paddingLeft = (int) ((dp - (g71Var.f33712a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.f33715b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.f33715b1, AndroidUtilities.dp(g71Var.f33720d1), z10), (int) (((width - dp) * g71Var.f33712a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.f33715b1, AndroidUtilities.dp(g71Var.f33720d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (g71Var.f33712a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * g71Var.f33712a1) + view.getPaddingLeft() + dp), (int) ((height * g71Var.f33715b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
