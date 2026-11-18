package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class rg0 extends LinearLayout {
    public boolean f39141a;
    public final ug0 f39142b;

    public rg0(ug0 ug0Var, Activity activity) {
        super(activity);
        this.f39142b = ug0Var;
        this.f39141a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        ug0 ug0Var = this.f39142b;
        sb0 sb0Var = ug0Var.I;
        sb0 sb0Var2 = ug0Var.H;
        this.f39141a = true;
        Point point = org.telegram.messenger.g0.f24118q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        sb0Var2.setItemCount(i11);
        sb0Var.setItemCount(i11);
        sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f39141a = false;
        int size = View.MeasureSpec.getSize(i7);
        ug0Var.O = size;
        if (size != 0) {
            ug0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f39141a) {
            return;
        }
        super.requestLayout();
    }
}
