package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ii0 extends LinearLayout {
    public boolean f25728a;
    public final li0 f25729b;

    public ii0(li0 li0Var, Activity activity) {
        super(activity);
        this.f25729b = li0Var;
        this.f25728a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        li0 li0Var = this.f25729b;
        wc0 wc0Var = li0Var.E;
        wc0 wc0Var2 = li0Var.D;
        this.f25728a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        wc0Var2.setItemCount(i12);
        wc0Var.setItemCount(i12);
        wc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.f25728a = false;
        int size = View.MeasureSpec.getSize(i10);
        li0Var.K = size;
        if (size != 0) {
            li0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25728a) {
            return;
        }
        super.requestLayout();
    }
}
