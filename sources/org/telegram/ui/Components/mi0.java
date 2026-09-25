package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mi0 extends LinearLayout {
    public boolean f26507a;
    public final pi0 f26508b;

    public mi0(pi0 pi0Var, Activity activity) {
        super(activity);
        this.f26508b = pi0Var;
        this.f26507a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        pi0 pi0Var = this.f26508b;
        ed0 ed0Var = pi0Var.H;
        ed0 ed0Var2 = pi0Var.G;
        this.f26507a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ed0Var2.setItemCount(i12);
        ed0Var.setItemCount(i12);
        ed0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26507a = false;
        int size = View.MeasureSpec.getSize(i10);
        pi0Var.N = size;
        if (size != 0) {
            pi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26507a) {
            return;
        }
        super.requestLayout();
    }
}
