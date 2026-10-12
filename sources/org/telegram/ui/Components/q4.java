package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q4 extends LinearLayout {
    public boolean f29681a;
    public final yd0 f29682b;
    public final yd0 f29683c;
    public final yd0 d;

    public q4(Context context, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        super(context);
        this.f29682b = yd0Var;
        this.f29683c = yd0Var2;
        this.d = yd0Var3;
        this.f29681a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f29681a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yd0 yd0Var = this.f29682b;
        yd0Var.setItemCount(i12);
        yd0 yd0Var2 = this.f29683c;
        yd0Var2.setItemCount(i12);
        yd0 yd0Var3 = this.d;
        yd0Var3.setItemCount(i12);
        yd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29681a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29681a) {
            return;
        }
        super.requestLayout();
    }
}
