package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ji0 extends LinearLayout {
    public boolean f25965a;
    public final mi0 f25966b;

    public ji0(mi0 mi0Var, Activity activity) {
        super(activity);
        this.f25966b = mi0Var;
        this.f25965a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        mi0 mi0Var = this.f25966b;
        xc0 xc0Var = mi0Var.E;
        xc0 xc0Var2 = mi0Var.D;
        this.f25965a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        xc0Var2.setItemCount(i12);
        xc0Var.setItemCount(i12);
        xc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f25965a = false;
        int size = View.MeasureSpec.getSize(i10);
        mi0Var.K = size;
        if (size != 0) {
            mi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25965a) {
            return;
        }
        super.requestLayout();
    }
}
