package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends LinearLayout {
    public final int f28658a;
    public boolean f28659b;
    public final xc0 f28660c;
    public final xc0 d;
    public final xc0 e;

    public s3(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, int i10) {
        super(context);
        this.f28658a = i10;
        this.f28660c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.f28659b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f28658a) {
            case 0:
                r3 r3Var = (r3) this.e;
                q3 q3Var = (q3) this.d;
                this.f28659b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                xc0 xc0Var = this.f28660c;
                xc0Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                r3Var.setItemCount(i12);
                xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                v3 v3Var = (v3) this.e;
                t3 t3Var = (t3) this.d;
                this.f28659b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                xc0 xc0Var2 = this.f28660c;
                xc0Var2.setItemCount(i13);
                t3Var.setItemCount(i13);
                v3Var.setItemCount(i13);
                xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                z3 z3Var = (z3) this.e;
                y3 y3Var = (y3) this.d;
                this.f28659b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                xc0 xc0Var3 = this.f28660c;
                xc0Var3.setItemCount(i14);
                y3Var.setItemCount(i14);
                z3Var.setItemCount(i14);
                xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                this.f28659b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                xc0 xc0Var4 = this.f28660c;
                xc0Var4.setItemCount(i15);
                b4Var.setItemCount(i15);
                c4Var.setItemCount(i15);
                xc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.f28659b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                f4Var.setItemCount(i16);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                g4Var.setItemCount(i16);
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                xc0 xc0Var5 = this.f28660c;
                xc0Var5.setItemCount(i16);
                xc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                q4 q4Var = (q4) this.e;
                p4 p4Var = (p4) this.d;
                this.f28659b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                xc0 xc0Var6 = this.f28660c;
                xc0Var6.setItemCount(i17);
                p4Var.setItemCount(i17);
                q4Var.setItemCount(i17);
                xc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                q4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f28659b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f28658a) {
            case 0:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f28659b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public s3(Activity activity, f4 f4Var, g4 g4Var, xc0 xc0Var) {
        super(activity);
        this.f28658a = 4;
        this.d = f4Var;
        this.e = g4Var;
        this.f28660c = xc0Var;
        this.f28659b = false;
    }
}
