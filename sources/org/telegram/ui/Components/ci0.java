package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ci0 extends LinearLayout {
    public boolean f23042a;
    public final fi0 f23043b;

    public ci0(fi0 fi0Var, Activity activity) {
        super(activity);
        this.f23043b = fi0Var;
        this.f23042a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        fi0 fi0Var = this.f23043b;
        tc0 tc0Var = fi0Var.H;
        tc0 tc0Var2 = fi0Var.G;
        this.f23042a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        tc0Var2.setItemCount(i12);
        tc0Var.setItemCount(i12);
        tc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f23042a = false;
        int size = View.MeasureSpec.getSize(i10);
        fi0Var.N = size;
        if (size != 0) {
            fi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f23042a) {
            return;
        }
        super.requestLayout();
    }
}
