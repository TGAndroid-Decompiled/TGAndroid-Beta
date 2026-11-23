package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class sg0 extends LinearLayout {
    public boolean f39615a;
    public final vg0 f39616b;

    public sg0(vg0 vg0Var, Activity activity) {
        super(activity);
        this.f39616b = vg0Var;
        this.f39615a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        vg0 vg0Var = this.f39616b;
        qb0 qb0Var = vg0Var.I;
        qb0 qb0Var2 = vg0Var.H;
        this.f39615a = true;
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        qb0Var2.setItemCount(i11);
        qb0Var.setItemCount(i11);
        qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f39615a = false;
        int size = View.MeasureSpec.getSize(i7);
        vg0Var.O = size;
        if (size != 0) {
            vg0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f39615a) {
            return;
        }
        super.requestLayout();
    }
}
