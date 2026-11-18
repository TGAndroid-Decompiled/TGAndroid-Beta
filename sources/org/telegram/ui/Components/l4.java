package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class l4 extends LinearLayout {
    public final int f36996a;
    public boolean f36997b;
    public final sb0 f36998c;

    public l4(Context context, sb0 sb0Var, int i7) {
        super(context);
        this.f36996a = i7;
        this.f36998c = sb0Var;
        this.f36997b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f36996a) {
            case 0:
                k4 k4Var = (k4) this.f36998c;
                this.f36997b = true;
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                k4Var.setItemCount(i11);
                k4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f36997b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                p4 p4Var = (p4) this.f36998c;
                this.f36997b = true;
                Point point2 = org.telegram.messenger.g0.f24121q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                p4Var.setItemCount(i12);
                p4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f36997b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f36996a) {
            case 0:
                if (!this.f36997b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f36997b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
