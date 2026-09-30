package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pi0 extends LinearLayout {
    public boolean f27365a;
    public final si0 f27366b;

    public pi0(si0 si0Var, Activity activity) {
        super(activity);
        this.f27366b = si0Var;
        this.f27365a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        si0 si0Var = this.f27366b;
        hd0 hd0Var = si0Var.H;
        hd0 hd0Var2 = si0Var.G;
        this.f27365a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        hd0Var2.setItemCount(i12);
        hd0Var.setItemCount(i12);
        hd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        hd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f27365a = false;
        int size = View.MeasureSpec.getSize(i10);
        si0Var.N = size;
        if (size != 0) {
            si0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27365a) {
            return;
        }
        super.requestLayout();
    }
}
