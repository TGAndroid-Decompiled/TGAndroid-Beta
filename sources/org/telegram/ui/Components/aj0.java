package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class aj0 extends LinearLayout {
    public boolean f26512a;
    public final dj0 f26513b;

    public aj0(dj0 dj0Var, Activity activity) {
        super(activity);
        this.f26513b = dj0Var;
        this.f26512a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        dj0 dj0Var = this.f26513b;
        md0 md0Var = dj0Var.H;
        md0 md0Var2 = dj0Var.G;
        this.f26512a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        md0Var2.setItemCount(i12);
        md0Var.setItemCount(i12);
        md0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        md0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26512a = false;
        int size = View.MeasureSpec.getSize(i10);
        dj0Var.N = size;
        if (size != 0) {
            dj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26512a) {
            return;
        }
        super.requestLayout();
    }
}
