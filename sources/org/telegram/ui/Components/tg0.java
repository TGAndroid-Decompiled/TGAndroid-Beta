package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class tg0 extends LinearLayout {
    public boolean f39907a;
    public final wg0 f39908b;

    public tg0(wg0 wg0Var, Activity activity) {
        super(activity);
        this.f39908b = wg0Var;
        this.f39907a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        wg0 wg0Var = this.f39908b;
        tb0 tb0Var = wg0Var.I;
        tb0 tb0Var2 = wg0Var.H;
        this.f39907a = true;
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        tb0Var2.setItemCount(i11);
        tb0Var.setItemCount(i11);
        tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f39907a = false;
        int size = View.MeasureSpec.getSize(i7);
        wg0Var.O = size;
        if (size != 0) {
            wg0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f39907a) {
            return;
        }
        super.requestLayout();
    }
}
