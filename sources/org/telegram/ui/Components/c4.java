package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class c4 extends LinearLayout {
    public boolean f33921a;
    public final qb0 f33922b;
    public final qb0 f33923c;
    public final qb0 d;

    public c4(Context context, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
        super(context);
        this.f33922b = qb0Var;
        this.f33923c = qb0Var2;
        this.d = qb0Var3;
        this.f33921a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.f33921a = true;
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        qb0 qb0Var = this.f33922b;
        qb0Var.setItemCount(i11);
        qb0 qb0Var2 = this.f33923c;
        qb0Var2.setItemCount(i11);
        qb0 qb0Var3 = this.d;
        qb0Var3.setItemCount(i11);
        qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        qb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f33921a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33921a) {
            return;
        }
        super.requestLayout();
    }
}
