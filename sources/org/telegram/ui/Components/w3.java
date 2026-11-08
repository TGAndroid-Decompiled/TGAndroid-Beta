package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class w3 extends LinearLayout {
    public boolean f39790a;
    public final hb0 f39791b;
    public final hb0 f39792c;
    public final hb0 d;

    public w3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        super(context);
        this.f39791b = hb0Var;
        this.f39792c = hb0Var2;
        this.d = hb0Var3;
        this.f39790a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.f39790a = true;
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        hb0 hb0Var = this.f39791b;
        hb0Var.setItemCount(i11);
        hb0 hb0Var2 = this.f39792c;
        hb0Var2.setItemCount(i11);
        hb0 hb0Var3 = this.d;
        hb0Var3.setItemCount(i11);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f39790a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f39790a) {
            return;
        }
        super.requestLayout();
    }
}
