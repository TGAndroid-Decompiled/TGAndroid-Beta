package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class f61 extends ViewOutlineProvider {
    public final Rect f37465a = new Rect();
    public final Integer f37466b;
    public final k71 f37467c;

    public f61(k71 k71Var, Integer num) {
        this.f37467c = k71Var;
        this.f37466b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37466b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        k71 k71Var = this.f37467c;
        boolean n10 = k71Var.n();
        Rect rect = this.f37465a;
        if (n10) {
            int paddingLeft = (int) ((dp - (k71Var.f39115a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39118b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39118b1, AndroidUtilities.dp(k71Var.f39123d1), y3), (int) (((width - dp) * k71Var.f39115a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39118b1, AndroidUtilities.dp(k71Var.f39123d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (k71Var.f39115a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * k71Var.f39115a1) + view.getPaddingLeft() + dp), (int) ((height * k71Var.f39118b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
