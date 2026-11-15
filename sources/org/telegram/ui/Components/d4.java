package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class d4 extends LinearLayout {
    public final int f33827a;
    public boolean f33828b;
    public final ib0 f33829c;

    public d4(Context context, ib0 ib0Var, int i7) {
        super(context);
        this.f33827a = i7;
        this.f33829c = ib0Var;
        this.f33828b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f33827a) {
            case 0:
                c4 c4Var = (c4) this.f33829c;
                this.f33828b = true;
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                c4Var.setItemCount(i11);
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f33828b = false;
                super.onMeasure(i7, i10);
                return;
            case 1:
                h4 h4Var = (h4) this.f33829c;
                this.f33828b = true;
                Point point2 = org.telegram.messenger.g0.f23609q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f33828b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                this.f33828b = true;
                this.f33829c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.f33828b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f33827a) {
            case 0:
                if (!this.f33828b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f33828b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f33828b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
