package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hj0 extends LinearLayout {
    public boolean f27049a;
    public final kj0 f27050b;

    public hj0(kj0 kj0Var, Activity activity) {
        super(activity);
        this.f27050b = kj0Var;
        this.f27049a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        kj0 kj0Var = this.f27050b;
        vd0 vd0Var = kj0Var.H;
        vd0 vd0Var2 = kj0Var.G;
        this.f27049a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vd0Var2.setItemCount(i12);
        vd0Var.setItemCount(i12);
        vd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        vd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f27049a = false;
        int size = View.MeasureSpec.getSize(i10);
        kj0Var.N = size;
        if (size != 0) {
            kj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27049a) {
            return;
        }
        super.requestLayout();
    }
}
