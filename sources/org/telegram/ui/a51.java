package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class a51 extends ViewOutlineProvider {
    public final Rect f37696a = new Rect();
    public final Integer f37697b;
    public final f61 f37698c;

    public a51(f61 f61Var, Integer num) {
        this.f37698c = f61Var;
        this.f37697b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37697b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        f61 f61Var = this.f37698c;
        boolean n10 = f61Var.n();
        Rect rect = this.f37696a;
        if (n10) {
            int paddingLeft = (int) ((dp - (f61Var.f39186a1 * dp)) + view.getPaddingLeft());
            float z10 = c3.h0.z(1.0f, f61Var.f39189b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) c3.h0.z(1.0f, f61Var.f39189b1, AndroidUtilities.dp(f61Var.f39194d1), z10), (int) (((width - dp) * f61Var.f39186a1) + view.getPaddingLeft() + dp), (int) c3.h0.z(1.0f, f61Var.f39189b1, AndroidUtilities.dp(f61Var.f39194d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (f61Var.f39186a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * f61Var.f39186a1) + view.getPaddingLeft() + dp), (int) ((height * f61Var.f39189b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
