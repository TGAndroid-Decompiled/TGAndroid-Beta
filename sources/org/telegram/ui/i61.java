package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends ViewOutlineProvider {
    public final Rect f38789a = new Rect();
    public final Integer f38790b;
    public final n71 f38791c;

    public i61(n71 n71Var, Integer num) {
        this.f38791c = n71Var;
        this.f38790b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f38790b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        n71 n71Var = this.f38791c;
        boolean n10 = n71Var.n();
        Rect rect = this.f38789a;
        if (n10) {
            int paddingLeft = (int) ((dp - (n71Var.f40258a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40261b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40261b1, AndroidUtilities.dp(n71Var.f40266d1), y3), (int) (((width - dp) * n71Var.f40258a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40261b1, AndroidUtilities.dp(n71Var.f40266d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (n71Var.f40258a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * n71Var.f40258a1) + view.getPaddingLeft() + dp), (int) ((height * n71Var.f40261b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
