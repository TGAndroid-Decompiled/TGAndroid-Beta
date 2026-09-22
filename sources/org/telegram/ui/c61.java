package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class c61 extends ViewOutlineProvider {
    public final Rect f32686a = new Rect();
    public final Integer f32687b;
    public final h71 f32688c;

    public c61(h71 h71Var, Integer num) {
        this.f32688c = h71Var;
        this.f32687b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f32687b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        h71 h71Var = this.f32688c;
        boolean n10 = h71Var.n();
        Rect rect = this.f32686a;
        if (n10) {
            int paddingLeft = (int) ((dp - (h71Var.f34116a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.f34119b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.f34119b1, AndroidUtilities.dp(h71Var.f34124d1), z10), (int) (((width - dp) * h71Var.f34116a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.f34119b1, AndroidUtilities.dp(h71Var.f34124d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (h71Var.f34116a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * h71Var.f34116a1) + view.getPaddingLeft() + dp), (int) ((height * h71Var.f34119b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
