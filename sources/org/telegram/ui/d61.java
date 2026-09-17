package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends ViewOutlineProvider {
    public final Rect f33021a = new Rect();
    public final Integer f33022b;
    public final i71 f33023c;

    public d61(i71 i71Var, Integer num) {
        this.f33023c = i71Var;
        this.f33022b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f33022b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        i71 i71Var = this.f33023c;
        boolean n10 = i71Var.n();
        Rect rect = this.f33021a;
        if (n10) {
            int paddingLeft = (int) ((dp - (i71Var.f34445a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.f34448b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.f34448b1, AndroidUtilities.dp(i71Var.f34453d1), z10), (int) (((width - dp) * i71Var.f34445a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.f34448b1, AndroidUtilities.dp(i71Var.f34453d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (i71Var.f34445a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * i71Var.f34445a1) + view.getPaddingLeft() + dp), (int) ((height * i71Var.f34448b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
