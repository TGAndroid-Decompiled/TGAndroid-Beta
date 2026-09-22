package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oi0 extends LinearLayout {
    public boolean f27083a;
    public final ri0 f27084b;

    public oi0(ri0 ri0Var, Activity activity) {
        super(activity);
        this.f27084b = ri0Var;
        this.f27083a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ri0 ri0Var = this.f27084b;
        fd0 fd0Var = ri0Var.H;
        fd0 fd0Var2 = ri0Var.G;
        this.f27083a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0Var2.setItemCount(i12);
        fd0Var.setItemCount(i12);
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f27083a = false;
        int size = View.MeasureSpec.getSize(i10);
        ri0Var.N = size;
        if (size != 0) {
            ri0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27083a) {
            return;
        }
        super.requestLayout();
    }
}
