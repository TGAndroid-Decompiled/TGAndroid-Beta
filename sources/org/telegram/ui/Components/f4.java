package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class f4 extends LinearLayout {
    public final int f33452a;
    public boolean f33453b;
    public final hb0 f33454c;

    public f4(Context context, hb0 hb0Var, int i7) {
        super(context);
        this.f33452a = i7;
        this.f33454c = hb0Var;
        this.f33453b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f33452a) {
            case 0:
                e4 e4Var = (e4) this.f33454c;
                this.f33453b = true;
                Point point = org.telegram.messenger.g0.f22537q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                e4Var.setItemCount(i11);
                e4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f33453b = false;
                super.onMeasure(i7, i10);
                return;
            case 1:
                j4 j4Var = (j4) this.f33454c;
                this.f33453b = true;
                Point point2 = org.telegram.messenger.g0.f22537q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                j4Var.setItemCount(i12);
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f33453b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                this.f33453b = true;
                this.f33454c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.f33453b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f33452a) {
            case 0:
                if (!this.f33453b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f33453b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f33453b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
