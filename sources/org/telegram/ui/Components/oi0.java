package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oi0 extends LinearLayout {
    public boolean f29369a;
    public final ri0 f29370b;

    public oi0(ri0 ri0Var, Activity activity) {
        super(activity);
        this.f29370b = ri0Var;
        this.f29369a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ri0 ri0Var = this.f29370b;
        gd0 gd0Var = ri0Var.H;
        gd0 gd0Var2 = ri0Var.G;
        this.f29369a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        gd0Var2.setItemCount(i12);
        gd0Var.setItemCount(i12);
        gd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f29369a = false;
        int size = View.MeasureSpec.getSize(i10);
        ri0Var.N = size;
        if (size != 0) {
            ri0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29369a) {
            return;
        }
        super.requestLayout();
    }
}
