package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class m61 extends ViewOutlineProvider {
    public final Rect f38176a = new Rect();
    public final Integer f38177b;
    public final r71 f38178c;

    public m61(r71 r71Var, Integer num) {
        this.f38178c = r71Var;
        this.f38177b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f38177b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r71 r71Var = this.f38178c;
        boolean n10 = r71Var.n();
        Rect rect = this.f38176a;
        if (n10) {
            int paddingLeft = (int) ((dp - (r71Var.f39621a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.f39624b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.f39624b1, AndroidUtilities.dp(r71Var.f39629d1), y3), (int) (((width - dp) * r71Var.f39621a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.f39624b1, AndroidUtilities.dp(r71Var.f39629d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (r71Var.f39621a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * r71Var.f39621a1) + view.getPaddingLeft() + dp), (int) ((height * r71Var.f39624b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
