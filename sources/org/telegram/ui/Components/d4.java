package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class d4 extends LinearLayout {
    public final int f33829a;
    public boolean f33830b;
    public final ib0 f33831c;

    public d4(Context context, ib0 ib0Var, int i7) {
        super(context);
        this.f33829a = i7;
        this.f33831c = ib0Var;
        this.f33830b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f33829a) {
            case 0:
                c4 c4Var = (c4) this.f33831c;
                this.f33830b = true;
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                c4Var.setItemCount(i11);
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f33830b = false;
                super.onMeasure(i7, i10);
                return;
            case 1:
                h4 h4Var = (h4) this.f33831c;
                this.f33830b = true;
                Point point2 = org.telegram.messenger.g0.f23611q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f33830b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                this.f33830b = true;
                this.f33831c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.f33830b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f33829a) {
            case 0:
                if (!this.f33830b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f33830b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f33830b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
