package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class c4 extends LinearLayout {
    public final int f24997a;
    public boolean f24998b;
    public final ac0 f24999c;

    public c4(Context context, ac0 ac0Var, int i10) {
        super(context);
        this.f24997a = i10;
        this.f24999c = ac0Var;
        this.f24998b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f24997a) {
            case 0:
                b4 b4Var = (b4) this.f24999c;
                this.f24998b = true;
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                b4Var.setItemCount(i12);
                b4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.f24998b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                g4 g4Var = (g4) this.f24999c;
                this.f24998b = true;
                Point point2 = org.telegram.messenger.i0.f16172q;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                g4Var.setItemCount(i13);
                g4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                this.f24998b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                this.f24998b = true;
                this.f24999c.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * 8;
                this.f24998b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24997a) {
            case 0:
                if (!this.f24998b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f24998b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24998b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
