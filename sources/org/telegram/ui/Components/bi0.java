package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bi0 extends LinearLayout {
    public boolean f22795a;
    public final ei0 f22796b;

    public bi0(ei0 ei0Var, Activity activity) {
        super(activity);
        this.f22796b = ei0Var;
        this.f22795a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ei0 ei0Var = this.f22796b;
        uc0 uc0Var = ei0Var.H;
        uc0 uc0Var2 = ei0Var.G;
        this.f22795a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        uc0Var2.setItemCount(i12);
        uc0Var.setItemCount(i12);
        uc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f22795a = false;
        int size = View.MeasureSpec.getSize(i10);
        ei0Var.N = size;
        if (size != 0) {
            ei0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22795a) {
            return;
        }
        super.requestLayout();
    }
}
