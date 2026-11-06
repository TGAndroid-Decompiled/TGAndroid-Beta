package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
public final class eg0 extends LinearLayout {
    public boolean f33253a;
    public final hg0 f33254b;

    public eg0(hg0 hg0Var, Activity activity) {
        super(activity);
        this.f33254b = hg0Var;
        this.f33253a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        hg0 hg0Var = this.f33254b;
        hb0 hb0Var = hg0Var.H;
        hb0 hb0Var2 = hg0Var.G;
        this.f33253a = true;
        Point point = org.telegram.messenger.g0.f22544q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        hb0Var2.setItemCount(i11);
        hb0Var.setItemCount(i11);
        hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.f33253a = false;
        int size = View.MeasureSpec.getSize(i7);
        hg0Var.N = size;
        if (size != 0) {
            hg0Var.c(false);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33253a) {
            return;
        }
        super.requestLayout();
    }
}
