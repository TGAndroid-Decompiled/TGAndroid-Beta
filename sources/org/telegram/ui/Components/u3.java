package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class u3 extends LinearLayout {
    public boolean f30840a;
    public final ac0 f30841b;
    public final ac0 f30842c;
    public final ac0 d;

    public u3(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        super(context);
        this.f30841b = ac0Var;
        this.f30842c = ac0Var2;
        this.d = ac0Var3;
        this.f30840a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30840a = true;
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ac0 ac0Var = this.f30841b;
        ac0Var.setItemCount(i12);
        ac0 ac0Var2 = this.f30842c;
        ac0Var2.setItemCount(i12);
        ac0 ac0Var3 = this.d;
        ac0Var3.setItemCount(i12);
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        this.f30840a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30840a) {
            return;
        }
        super.requestLayout();
    }
}
