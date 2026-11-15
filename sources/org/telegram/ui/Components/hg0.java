package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class hg0 extends LinearLayout {
    public boolean f35249a;
    public final kg0 f35250b;

    public hg0(kg0 kg0Var, Activity activity) {
        super(activity);
        this.f35250b = kg0Var;
        this.f35249a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        kg0 kg0Var = this.f35250b;
        ib0 ib0Var = kg0Var.I;
        ib0 ib0Var2 = kg0Var.H;
        this.f35249a = true;
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        ib0Var2.setItemCount(i11);
        ib0Var.setItemCount(i11);
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f35249a = false;
        int size = View.MeasureSpec.getSize(i7);
        kg0Var.O = size;
        if (size != 0) {
            kg0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f35249a) {
            return;
        }
        super.requestLayout();
    }
}
