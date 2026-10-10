package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class f61 extends ViewOutlineProvider {
    public final Rect f37509a = new Rect();
    public final Integer f37510b;
    public final k71 f37511c;

    public f61(k71 k71Var, Integer num) {
        this.f37511c = k71Var;
        this.f37510b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37510b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        k71 k71Var = this.f37511c;
        boolean n10 = k71Var.n();
        Rect rect = this.f37509a;
        if (n10) {
            int paddingLeft = (int) ((dp - (k71Var.f39159a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39162b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39162b1, AndroidUtilities.dp(k71Var.f39167d1), y3), (int) (((width - dp) * k71Var.f39159a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39162b1, AndroidUtilities.dp(k71Var.f39167d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (k71Var.f39159a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * k71Var.f39159a1) + view.getPaddingLeft() + dp), (int) ((height * k71Var.f39162b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
