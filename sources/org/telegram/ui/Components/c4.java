package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class c4 extends LinearLayout {
    public boolean f33882a;
    public final sb0 f33883b;
    public final sb0 f33884c;
    public final sb0 d;

    public c4(Context context, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        super(context);
        this.f33883b = sb0Var;
        this.f33884c = sb0Var2;
        this.d = sb0Var3;
        this.f33882a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.f33882a = true;
        Point point = org.telegram.messenger.g0.f24118q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        sb0 sb0Var = this.f33883b;
        sb0Var.setItemCount(i11);
        sb0 sb0Var2 = this.f33884c;
        sb0Var2.setItemCount(i11);
        sb0 sb0Var3 = this.d;
        sb0Var3.setItemCount(i11);
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        sb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f33882a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33882a) {
            return;
        }
        super.requestLayout();
    }
}
