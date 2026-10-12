package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jj0 extends LinearLayout {
    public boolean f27535a;
    public final mj0 f27536b;

    public jj0(mj0 mj0Var, Activity activity) {
        super(activity);
        this.f27536b = mj0Var;
        this.f27535a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        mj0 mj0Var = this.f27536b;
        yd0 yd0Var = mj0Var.H;
        yd0 yd0Var2 = mj0Var.G;
        this.f27535a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yd0Var2.setItemCount(i12);
        yd0Var.setItemCount(i12);
        yd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        yd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f27535a = false;
        int size = View.MeasureSpec.getSize(i10);
        mj0Var.N = size;
        if (size != 0) {
            mj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27535a) {
            return;
        }
        super.requestLayout();
    }
}
