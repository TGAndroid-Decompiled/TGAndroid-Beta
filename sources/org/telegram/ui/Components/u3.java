package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class u3 extends LinearLayout {
    public boolean f38630a;
    public final cb0 f38631b;
    public final cb0 f38632c;
    public final cb0 d;

    public u3(Context context, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        super(context);
        this.f38631b = cb0Var;
        this.f38632c = cb0Var2;
        this.d = cb0Var3;
        this.f38630a = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        this.f38630a = true;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        cb0 cb0Var = this.f38631b;
        cb0Var.setItemCount(i11);
        cb0 cb0Var2 = this.f38632c;
        cb0Var2.setItemCount(i11);
        cb0 cb0Var3 = this.d;
        cb0Var3.setItemCount(i11);
        cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        cb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f38630a = false;
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f38630a) {
            return;
        }
        super.requestLayout();
    }
}
