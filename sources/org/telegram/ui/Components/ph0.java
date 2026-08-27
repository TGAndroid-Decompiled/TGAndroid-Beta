package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ph0 extends LinearLayout {

    public boolean f31610a;

    public final sh0 f31611b;

    public ph0(sh0 sh0Var, Activity activity) {
        super(activity);
        this.f31611b = sh0Var;
        this.f31610a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sh0 sh0Var = this.f31611b;
        fc0 fc0Var = sh0Var.D;
        fc0 fc0Var2 = sh0Var.C;
        this.f31610a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fc0Var2.setItemCount(i12);
        fc0Var.setItemCount(i12);
        fc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f31610a = false;
        int size = View.MeasureSpec.getSize(i10);
        sh0Var.J = size;
        if (size != 0) {
            sh0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31610a) {
            return;
        }
        super.requestLayout();
    }
}
