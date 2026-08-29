package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z3 extends LinearLayout {
    public boolean f35186a;
    public final qc0 f35187b;
    public final qc0 f35188c;
    public final qc0 d;

    public z3(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
        super(context);
        this.f35187b = qc0Var;
        this.f35188c = qc0Var2;
        this.d = qc0Var3;
        this.f35186a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f35186a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qc0 qc0Var = this.f35187b;
        qc0Var.setItemCount(i12);
        qc0 qc0Var2 = this.f35188c;
        qc0Var2.setItemCount(i12);
        qc0 qc0Var3 = this.d;
        qc0Var3.setItemCount(i12);
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f35186a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35186a) {
            return;
        }
        super.requestLayout();
    }
}
