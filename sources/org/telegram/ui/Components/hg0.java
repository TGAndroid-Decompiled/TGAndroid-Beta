package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class hg0 extends LinearLayout {
    public boolean f34386a;
    public final kg0 f34387b;

    public hg0(kg0 kg0Var, Activity activity) {
        super(activity);
        this.f34387b = kg0Var;
        this.f34386a = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        kg0 kg0Var = this.f34387b;
        cb0 cb0Var = kg0Var.I;
        cb0 cb0Var2 = kg0Var.H;
        this.f34386a = true;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        cb0Var2.setItemCount(i11);
        cb0Var.setItemCount(i11);
        cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f34386a = false;
        int size = View.MeasureSpec.getSize(i3);
        kg0Var.O = size;
        if (size != 0) {
            kg0Var.c(false);
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f34386a) {
            return;
        }
        super.requestLayout();
    }
}
