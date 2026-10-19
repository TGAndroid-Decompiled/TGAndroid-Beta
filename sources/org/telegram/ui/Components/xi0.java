package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xi0 extends LinearLayout {
    public boolean f32401a;
    public final aj0 f32402b;

    public xi0(aj0 aj0Var, Activity activity) {
        super(activity);
        this.f32402b = aj0Var;
        this.f32401a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        aj0 aj0Var = this.f32402b;
        od0 od0Var = aj0Var.H;
        od0 od0Var2 = aj0Var.G;
        this.f32401a = true;
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
        this.f32401a = false;
        int size = View.MeasureSpec.getSize(i10);
        aj0Var.N = size;
        if (size != 0) {
            aj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32401a) {
            return;
        }
        super.requestLayout();
    }
}
