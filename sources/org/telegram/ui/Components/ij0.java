package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ij0 extends LinearLayout {
    public boolean f27362a;
    public final lj0 f27363b;

    public ij0(lj0 lj0Var, Activity activity) {
        super(activity);
        this.f27363b = lj0Var;
        this.f27362a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        lj0 lj0Var = this.f27363b;
        vd0 vd0Var = lj0Var.H;
        vd0 vd0Var2 = lj0Var.G;
        this.f27362a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vd0Var2.setItemCount(i12);
        vd0Var.setItemCount(i12);
        vd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        vd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f27362a = false;
        int size = View.MeasureSpec.getSize(i10);
        lj0Var.N = size;
        if (size != 0) {
            lj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27362a) {
            return;
        }
        super.requestLayout();
    }
}
