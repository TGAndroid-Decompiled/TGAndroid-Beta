package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mi0 extends LinearLayout {
    public boolean f26420a;
    public final pi0 f26421b;

    public mi0(pi0 pi0Var, Activity activity) {
        super(activity);
        this.f26421b = pi0Var;
        this.f26420a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        pi0 pi0Var = this.f26421b;
        dd0 dd0Var = pi0Var.H;
        dd0 dd0Var2 = pi0Var.G;
        this.f26420a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0Var2.setItemCount(i12);
        dd0Var.setItemCount(i12);
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f26420a = false;
        int size = View.MeasureSpec.getSize(i10);
        pi0Var.N = size;
        if (size != 0) {
            pi0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26420a) {
            return;
        }
        super.requestLayout();
    }
}
