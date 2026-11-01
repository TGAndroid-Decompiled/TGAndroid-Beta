package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class hh0 extends LinearLayout {
    public boolean f26802a;
    public final kh0 f26803b;

    public hh0(kh0 kh0Var, Activity activity) {
        super(activity);
        this.f26803b = kh0Var;
        this.f26802a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        kh0 kh0Var = this.f26803b;
        ac0 ac0Var = kh0Var.H;
        ac0 ac0Var2 = kh0Var.G;
        this.f26802a = true;
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ac0Var2.setItemCount(i12);
        ac0Var.setItemCount(i12);
        ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        this.f26802a = false;
        int size = View.MeasureSpec.getSize(i10);
        kh0Var.N = size;
        if (size != 0) {
            kh0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26802a) {
            return;
        }
        super.requestLayout();
    }
}
