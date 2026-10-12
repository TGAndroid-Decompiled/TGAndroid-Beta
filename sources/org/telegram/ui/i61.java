package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends ViewOutlineProvider {
    public final Rect f38786a = new Rect();
    public final Integer f38787b;
    public final n71 f38788c;

    public i61(n71 n71Var, Integer num) {
        this.f38788c = n71Var;
        this.f38787b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f38787b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        n71 n71Var = this.f38788c;
        boolean n10 = n71Var.n();
        Rect rect = this.f38786a;
        if (n10) {
            int paddingLeft = (int) ((dp - (n71Var.f40255a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40258b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40258b1, AndroidUtilities.dp(n71Var.f40263d1), y3), (int) (((width - dp) * n71Var.f40255a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40258b1, AndroidUtilities.dp(n71Var.f40263d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (n71Var.f40255a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * n71Var.f40255a1) + view.getPaddingLeft() + dp), (int) ((height * n71Var.f40258b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
