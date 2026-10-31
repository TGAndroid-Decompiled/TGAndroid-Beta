package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class gh0 extends LinearLayout {
    public boolean f26371a;
    public final jh0 f26372b;

    public gh0(jh0 jh0Var, Activity activity) {
        super(activity);
        this.f26372b = jh0Var;
        this.f26371a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        jh0 jh0Var = this.f26372b;
        ac0 ac0Var = jh0Var.H;
        ac0 ac0Var2 = jh0Var.G;
        this.f26371a = true;
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ac0Var2.setItemCount(i12);
        ac0Var.setItemCount(i12);
        ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        this.f26371a = false;
        int size = View.MeasureSpec.getSize(i10);
        jh0Var.N = size;
        if (size != 0) {
            jh0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26371a) {
            return;
        }
        super.requestLayout();
    }
}
