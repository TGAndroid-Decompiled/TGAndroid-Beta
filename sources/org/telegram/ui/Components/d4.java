package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class d4 extends LinearLayout {
    public boolean f34374a;
    public final tb0 f34375b;
    public final tb0 f34376c;
    public final tb0 d;

    public d4(Context context, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
        super(context);
        this.f34375b = tb0Var;
        this.f34376c = tb0Var2;
        this.d = tb0Var3;
        this.f34374a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.f34374a = true;
        Point point = org.telegram.messenger.g0.f24146q;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        tb0 tb0Var = this.f34375b;
        tb0Var.setItemCount(i11);
        tb0 tb0Var2 = this.f34376c;
        tb0Var2.setItemCount(i11);
        tb0 tb0Var3 = this.d;
        tb0Var3.setItemCount(i11);
        tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        tb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.f34374a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f34374a) {
            return;
        }
        super.requestLayout();
    }
}
