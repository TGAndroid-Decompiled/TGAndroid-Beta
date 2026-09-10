package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class g61 extends ViewOutlineProvider {
    public final Rect f33025a = new Rect();
    public final Integer f33026b;
    public final l71 f33027c;

    public g61(l71 l71Var, Integer num) {
        this.f33027c = l71Var;
        this.f33026b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f33026b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        l71 l71Var = this.f33027c;
        boolean n10 = l71Var.n();
        Rect rect = this.f33025a;
        if (n10) {
            int paddingLeft = (int) ((dp - (l71Var.f34554a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.f34557b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.f34557b1, AndroidUtilities.dp(l71Var.f34562d1), z10), (int) (((width - dp) * l71Var.f34554a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.f34557b1, AndroidUtilities.dp(l71Var.f34562d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (l71Var.f34554a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * l71Var.f34554a1) + view.getPaddingLeft() + dp), (int) ((height * l71Var.f34557b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
