package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yi0 extends LinearLayout {
    public boolean f32659a;
    public final bj0 f32660b;

    public yi0(bj0 bj0Var, Activity activity) {
        super(activity);
        this.f32660b = bj0Var;
        this.f32659a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        bj0 bj0Var = this.f32660b;
        od0 od0Var = bj0Var.H;
        od0 od0Var2 = bj0Var.G;
        this.f32659a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        od0Var2.setItemCount(i12);
        od0Var.setItemCount(i12);
        od0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f32659a = false;
        int size = View.MeasureSpec.getSize(i10);
        bj0Var.N = size;
        if (size != 0) {
            bj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32659a) {
            return;
        }
        super.requestLayout();
    }
}
