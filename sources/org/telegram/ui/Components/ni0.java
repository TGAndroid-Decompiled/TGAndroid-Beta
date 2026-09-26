package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ni0 extends LinearLayout {
    public boolean f26802a;
    public final qi0 f26803b;

    public ni0(qi0 qi0Var, Activity activity) {
        super(activity);
        this.f26803b = qi0Var;
        this.f26802a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        qi0 qi0Var = this.f26803b;
        fd0 fd0Var = qi0Var.H;
        fd0 fd0Var2 = qi0Var.G;
        this.f26802a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0Var2.setItemCount(i12);
        fd0Var.setItemCount(i12);
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26802a = false;
        int size = View.MeasureSpec.getSize(i10);
        qi0Var.N = size;
        if (size != 0) {
            qi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26802a) {
            return;
        }
        super.requestLayout();
    }
}
