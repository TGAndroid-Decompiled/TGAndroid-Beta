package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nh0 extends LinearLayout {
    public boolean f31113a;
    public final qh0 f31114b;

    public nh0(qh0 qh0Var, Activity activity) {
        super(activity);
        this.f31114b = qh0Var;
        this.f31113a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        qh0 qh0Var = this.f31114b;
        bc0 bc0Var = qh0Var.D;
        bc0 bc0Var2 = qh0Var.C;
        this.f31113a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        bc0Var2.setItemCount(i11);
        bc0Var.setItemCount(i11);
        bc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i11;
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i11;
        this.f31113a = false;
        int size = View.MeasureSpec.getSize(i9);
        qh0Var.J = size;
        if (size != 0) {
            qh0Var.c(false);
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f31113a) {
            return;
        }
        super.requestLayout();
    }
}
