package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class l4 extends LinearLayout {
    public final int f37019a;
    public boolean f37020b;
    public final qb0 f37021c;

    public l4(Context context, qb0 qb0Var, int i7) {
        super(context);
        this.f37019a = i7;
        this.f37021c = qb0Var;
        this.f37020b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f37019a) {
            case 0:
                k4 k4Var = (k4) this.f37021c;
                this.f37020b = true;
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                k4Var.setItemCount(i11);
                k4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f37020b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                p4 p4Var = (p4) this.f37021c;
                this.f37020b = true;
                Point point2 = org.telegram.messenger.g0.f24226q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                p4Var.setItemCount(i12);
                p4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f37020b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37019a) {
            case 0:
                if (!this.f37020b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37020b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
