package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class hg0 extends LinearLayout {
    public boolean f35240a;
    public final kg0 f35241b;

    public hg0(kg0 kg0Var, Activity activity) {
        super(activity);
        this.f35241b = kg0Var;
        this.f35240a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        kg0 kg0Var = this.f35241b;
        ib0 ib0Var = kg0Var.I;
        ib0 ib0Var2 = kg0Var.H;
        this.f35240a = true;
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        ib0Var2.setItemCount(i11);
        ib0Var.setItemCount(i11);
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f35240a = false;
        int size = View.MeasureSpec.getSize(i7);
        kg0Var.O = size;
        if (size != 0) {
            kg0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f35240a) {
            return;
        }
        super.requestLayout();
    }
}
