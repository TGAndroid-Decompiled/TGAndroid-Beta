package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bj0 extends LinearLayout {
    public boolean f26836a;
    public final ej0 f26837b;

    public bj0(ej0 ej0Var, Activity activity) {
        super(activity);
        this.f26837b = ej0Var;
        this.f26836a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ej0 ej0Var = this.f26837b;
        nd0 nd0Var = ej0Var.H;
        nd0 nd0Var2 = ej0Var.G;
        this.f26836a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        nd0Var2.setItemCount(i12);
        nd0Var.setItemCount(i12);
        nd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26836a = false;
        int size = View.MeasureSpec.getSize(i10);
        ej0Var.N = size;
        if (size != 0) {
            ej0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26836a) {
            return;
        }
        super.requestLayout();
    }
}
