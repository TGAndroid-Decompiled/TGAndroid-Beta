package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cj0 extends LinearLayout {
    public boolean f23744a;
    public final fj0 f23745b;

    public cj0(fj0 fj0Var, Activity activity) {
        super(activity);
        this.f23745b = fj0Var;
        this.f23744a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        fj0 fj0Var = this.f23745b;
        ud0 ud0Var = fj0Var.H;
        ud0 ud0Var2 = fj0Var.G;
        this.f23744a = true;
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
        this.f23744a = false;
        int size = View.MeasureSpec.getSize(i10);
        fj0Var.N = size;
        if (size != 0) {
            fj0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f23744a) {
            return;
        }
        super.requestLayout();
    }
}
