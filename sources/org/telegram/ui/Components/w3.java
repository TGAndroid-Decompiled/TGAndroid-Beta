package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends LinearLayout {
    public final int f29836a;
    public boolean f29837b;
    public final fd0 f29838c;
    public final fd0 d;
    public final fd0 e;

    public w3(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, int i10) {
        super(context);
        this.f29836a = i10;
        this.f29838c = fd0Var;
        this.d = fd0Var2;
        this.e = fd0Var3;
        this.f29837b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f29836a) {
            case 0:
                v3 v3Var = (v3) this.e;
                u3 u3Var = (u3) this.d;
                this.f29837b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                fd0 fd0Var = this.f29838c;
                fd0Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                z3 z3Var = (z3) this.e;
                x3 x3Var = (x3) this.d;
                this.f29837b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                fd0 fd0Var2 = this.f29838c;
                fd0Var2.setItemCount(i13);
                x3Var.setItemCount(i13);
                z3Var.setItemCount(i13);
                fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                e4 e4Var = (e4) this.e;
                d4 d4Var = (d4) this.d;
                this.f29837b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                fd0 fd0Var3 = this.f29838c;
                fd0Var3.setItemCount(i14);
                d4Var.setItemCount(i14);
                e4Var.setItemCount(i14);
                fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                h4 h4Var = (h4) this.e;
                g4 g4Var = (g4) this.d;
                this.f29837b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                fd0 fd0Var4 = this.f29838c;
                fd0Var4.setItemCount(i15);
                g4Var.setItemCount(i15);
                h4Var.setItemCount(i15);
                fd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                l4 l4Var = (l4) this.e;
                k4 k4Var = (k4) this.d;
                this.f29837b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                k4Var.setItemCount(i16);
                k4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                l4Var.setItemCount(i16);
                l4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                fd0 fd0Var5 = this.f29838c;
                fd0Var5.setItemCount(i16);
                fd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                v4 v4Var = (v4) this.e;
                u4 u4Var = (u4) this.d;
                this.f29837b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                fd0 fd0Var6 = this.f29838c;
                fd0Var6.setItemCount(i17);
                u4Var.setItemCount(i17);
                v4Var.setItemCount(i17);
                fd0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                u4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                v4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f29837b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f29836a) {
            case 0:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f29837b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public w3(Activity activity, k4 k4Var, l4 l4Var, fd0 fd0Var) {
        super(activity);
        this.f29836a = 4;
        this.d = k4Var;
        this.e = l4Var;
        this.f29838c = fd0Var;
        this.f29837b = false;
    }
}
