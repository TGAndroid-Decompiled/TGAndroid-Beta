package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends ViewOutlineProvider {
    public final Rect f35950a = new Rect();
    public final Integer f35951b;
    public final j71 f35952c;

    public e61(j71 j71Var, Integer num) {
        this.f35952c = j71Var;
        this.f35951b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f35951b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        j71 j71Var = this.f35952c;
        boolean n10 = j71Var.n();
        Rect rect = this.f35950a;
        if (n10) {
            int paddingLeft = (int) ((dp - (j71Var.f37629a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.f37632b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.f37632b1, AndroidUtilities.dp(j71Var.f37637d1), z10), (int) (((width - dp) * j71Var.f37629a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.f37632b1, AndroidUtilities.dp(j71Var.f37637d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (j71Var.f37629a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * j71Var.f37629a1) + view.getPaddingLeft() + dp), (int) ((height * j71Var.f37632b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
