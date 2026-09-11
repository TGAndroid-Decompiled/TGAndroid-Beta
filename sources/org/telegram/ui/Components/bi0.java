package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bi0 extends LinearLayout {
    public boolean f24715a;
    public final ei0 f24716b;

    public bi0(ei0 ei0Var, Activity activity) {
        super(activity);
        this.f24716b = ei0Var;
        this.f24715a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ei0 ei0Var = this.f24716b;
        vc0 vc0Var = ei0Var.H;
        vc0 vc0Var2 = ei0Var.G;
        this.f24715a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vc0Var2.setItemCount(i12);
        vc0Var.setItemCount(i12);
        vc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f24715a = false;
        int size = View.MeasureSpec.getSize(i10);
        ei0Var.N = size;
        if (size != 0) {
            ei0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24715a) {
            return;
        }
        super.requestLayout();
    }
}
