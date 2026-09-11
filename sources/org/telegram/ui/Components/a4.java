package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f24263a;
    public final vc0 f24264b;
    public final vc0 f24265c;
    public final vc0 d;

    public a4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3) {
        super(context);
        this.f24264b = vc0Var;
        this.f24265c = vc0Var2;
        this.d = vc0Var3;
        this.f24263a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f24263a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vc0 vc0Var = this.f24264b;
        vc0Var.setItemCount(i12);
        vc0 vc0Var2 = this.f24265c;
        vc0Var2.setItemCount(i12);
        vc0 vc0Var3 = this.d;
        vc0Var3.setItemCount(i12);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f24263a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24263a) {
            return;
        }
        super.requestLayout();
    }
}
