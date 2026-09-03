package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ki0 extends LinearLayout {
    public boolean f28420a;
    public final ni0 f28421b;

    public ki0(ni0 ni0Var, Activity activity) {
        super(activity);
        this.f28421b = ni0Var;
        this.f28420a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ni0 ni0Var = this.f28421b;
        yc0 yc0Var = ni0Var.E;
        yc0 yc0Var2 = ni0Var.D;
        this.f28420a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yc0Var2.setItemCount(i12);
        yc0Var.setItemCount(i12);
        yc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f28420a = false;
        int size = View.MeasureSpec.getSize(i10);
        ni0Var.K = size;
        if (size != 0) {
            ni0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28420a) {
            return;
        }
        super.requestLayout();
    }
}
