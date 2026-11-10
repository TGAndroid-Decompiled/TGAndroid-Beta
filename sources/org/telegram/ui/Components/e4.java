package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class e4 extends LinearLayout {
    public final int f33154a;
    public boolean f33155b;
    public final hb0 f33156c;

    public e4(Context context, hb0 hb0Var, int i7) {
        super(context);
        this.f33154a = i7;
        this.f33156c = hb0Var;
        this.f33155b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f33154a) {
            case 0:
                d4 d4Var = (d4) this.f33156c;
                this.f33155b = true;
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                d4Var.setItemCount(i11);
                d4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f33155b = false;
                super.onMeasure(i7, i10);
                return;
            case 1:
                i4 i4Var = (i4) this.f33156c;
                this.f33155b = true;
                Point point2 = org.telegram.messenger.g0.f22567q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                i4Var.setItemCount(i12);
                i4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f33155b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                this.f33155b = true;
                this.f33156c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.f33155b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f33154a) {
            case 0:
                if (!this.f33155b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f33155b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f33155b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
