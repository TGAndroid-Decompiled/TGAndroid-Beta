package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class fg0 extends LinearLayout {
    public boolean f33671a;
    public final ig0 f33672b;

    public fg0(ig0 ig0Var, Activity activity) {
        super(activity);
        this.f33672b = ig0Var;
        this.f33671a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        ig0 ig0Var = this.f33672b;
        ib0 ib0Var = ig0Var.H;
        ib0 ib0Var2 = ig0Var.G;
        this.f33671a = true;
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        ib0Var2.setItemCount(i11);
        ib0Var.setItemCount(i11);
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f33671a = false;
        int size = View.MeasureSpec.getSize(i7);
        ig0Var.N = size;
        if (size != 0) {
            ig0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33671a) {
            return;
        }
        super.requestLayout();
    }
}
