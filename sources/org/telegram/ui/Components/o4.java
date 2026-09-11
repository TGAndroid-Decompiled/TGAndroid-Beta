package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f28947a;
    public final vc0 f28948b;
    public final vc0 f28949c;
    public final vc0 d;

    public o4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3) {
        super(context);
        this.f28948b = vc0Var;
        this.f28949c = vc0Var2;
        this.d = vc0Var3;
        this.f28947a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f28947a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vc0 vc0Var = this.f28948b;
        vc0Var.setItemCount(i12);
        vc0 vc0Var2 = this.f28949c;
        vc0Var2.setItemCount(i12);
        vc0 vc0Var3 = this.d;
        vc0Var3.setItemCount(i12);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f28947a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28947a) {
            return;
        }
        super.requestLayout();
    }
}
