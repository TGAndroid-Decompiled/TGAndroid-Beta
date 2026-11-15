package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class u3 extends LinearLayout {
    public boolean f39887a;
    public final ib0 f39888b;
    public final ib0 f39889c;
    public final ib0 d;

    public u3(Context context, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
        super(context);
        this.f39888b = ib0Var;
        this.f39889c = ib0Var2;
        this.d = ib0Var3;
        this.f39887a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.f39887a = true;
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        ib0 ib0Var = this.f39888b;
        ib0Var.setItemCount(i11);
        ib0 ib0Var2 = this.f39889c;
        ib0Var2.setItemCount(i11);
        ib0 ib0Var3 = this.d;
        ib0Var3.setItemCount(i11);
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        ib0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f39887a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f39887a) {
            return;
        }
        super.requestLayout();
    }
}
