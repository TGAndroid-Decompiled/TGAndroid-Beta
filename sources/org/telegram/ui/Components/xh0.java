package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xh0 extends LinearLayout {
    public boolean f34725a;
    public final ai0 f34726b;

    public xh0(ai0 ai0Var, Activity activity) {
        super(activity);
        this.f34726b = ai0Var;
        this.f34725a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ai0 ai0Var = this.f34726b;
        qc0 qc0Var = ai0Var.D;
        qc0 qc0Var2 = ai0Var.C;
        this.f34725a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qc0Var2.setItemCount(i12);
        qc0Var.setItemCount(i12);
        qc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f34725a = false;
        int size = View.MeasureSpec.getSize(i10);
        ai0Var.J = size;
        if (size != 0) {
            ai0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34725a) {
            return;
        }
        super.requestLayout();
    }
}
