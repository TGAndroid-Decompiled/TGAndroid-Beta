package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class li0 extends LinearLayout {
    public boolean f24995a;
    public final oi0 f24996b;

    public li0(oi0 oi0Var, Activity activity) {
        super(activity);
        this.f24996b = oi0Var;
        this.f24995a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        oi0 oi0Var = this.f24996b;
        dd0 dd0Var = oi0Var.H;
        dd0 dd0Var2 = oi0Var.G;
        this.f24995a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0Var2.setItemCount(i12);
        dd0Var.setItemCount(i12);
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f24995a = false;
        int size = View.MeasureSpec.getSize(i10);
        oi0Var.N = size;
        if (size != 0) {
            oi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24995a) {
            return;
        }
        super.requestLayout();
    }
}
