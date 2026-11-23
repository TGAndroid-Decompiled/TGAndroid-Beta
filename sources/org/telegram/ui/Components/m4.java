package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class m4 extends LinearLayout {
    public final int f37412a;
    public boolean f37413b;
    public final tb0 f37414c;

    public m4(Context context, tb0 tb0Var, int i7) {
        super(context);
        this.f37412a = i7;
        this.f37414c = tb0Var;
        this.f37413b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f37412a) {
            case 0:
                l4 l4Var = (l4) this.f37414c;
                this.f37413b = true;
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                l4Var.setItemCount(i11);
                l4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f37413b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                q4 q4Var = (q4) this.f37414c;
                this.f37413b = true;
                Point point2 = org.telegram.messenger.g0.f24046q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                q4Var.setItemCount(i12);
                q4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f37413b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37412a) {
            case 0:
                if (!this.f37413b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37413b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
