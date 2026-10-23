package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bj0 extends LinearLayout {
    public boolean f25082a;
    public final ej0 f25083b;

    public bj0(ej0 ej0Var, Activity activity) {
        super(activity);
        this.f25083b = ej0Var;
        this.f25082a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ej0 ej0Var = this.f25083b;
        qd0 qd0Var = ej0Var.H;
        qd0 qd0Var2 = ej0Var.G;
        this.f25082a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qd0Var2.setItemCount(i12);
        qd0Var.setItemCount(i12);
        qd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        qd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f25082a = false;
        int size = View.MeasureSpec.getSize(i10);
        ej0Var.N = size;
        if (size != 0) {
            ej0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25082a) {
            return;
        }
        super.requestLayout();
    }
}
