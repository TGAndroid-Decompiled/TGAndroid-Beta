package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends ViewOutlineProvider {
    public final Rect f37254a = new Rect();
    public final Integer f37255b;
    public final j71 f37256c;

    public e61(j71 j71Var, Integer num) {
        this.f37256c = j71Var;
        this.f37255b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f37255b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        j71 j71Var = this.f37256c;
        boolean n10 = j71Var.n();
        Rect rect = this.f37254a;
        if (n10) {
            int paddingLeft = (int) ((dp - (j71Var.f38911a1 * dp)) + view.getPaddingLeft());
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, j71Var.f38914b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.y(1.0f, j71Var.f38914b1, AndroidUtilities.dp(j71Var.f38919d1), y3), (int) (((width - dp) * j71Var.f38911a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.y(1.0f, j71Var.f38914b1, AndroidUtilities.dp(j71Var.f38919d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (j71Var.f38911a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * j71Var.f38911a1) + view.getPaddingLeft() + dp), (int) ((height * j71Var.f38914b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
