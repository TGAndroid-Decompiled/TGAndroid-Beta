package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gj0 extends LinearLayout {
    public boolean f26736a;
    public final jj0 f26737b;

    public gj0(jj0 jj0Var, Activity activity) {
        super(activity);
        this.f26737b = jj0Var;
        this.f26736a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        jj0 jj0Var = this.f26737b;
        ud0 ud0Var = jj0Var.H;
        ud0 ud0Var2 = jj0Var.G;
        this.f26736a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ud0Var2.setItemCount(i12);
        ud0Var.setItemCount(i12);
        ud0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26736a = false;
        int size = View.MeasureSpec.getSize(i10);
        jj0Var.N = size;
        if (size != 0) {
            jj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26736a) {
            return;
        }
        super.requestLayout();
    }
}
