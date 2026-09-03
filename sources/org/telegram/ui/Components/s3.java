package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends LinearLayout {
    public final int f30978a;
    public boolean f30979b;
    public final yc0 f30980c;
    public final yc0 d;
    public final yc0 f30981e;

    public s3(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, int i10) {
        super(context);
        this.f30978a = i10;
        this.f30980c = yc0Var;
        this.d = yc0Var2;
        this.f30981e = yc0Var3;
        this.f30979b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f30978a) {
            case 0:
                r3 r3Var = (r3) this.f30981e;
                q3 q3Var = (q3) this.d;
                this.f30979b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                yc0 yc0Var = this.f30980c;
                yc0Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                r3Var.setItemCount(i12);
                yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                v3 v3Var = (v3) this.f30981e;
                t3 t3Var = (t3) this.d;
                this.f30979b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                yc0 yc0Var2 = this.f30980c;
                yc0Var2.setItemCount(i13);
                t3Var.setItemCount(i13);
                v3Var.setItemCount(i13);
                yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                z3 z3Var = (z3) this.f30981e;
                y3 y3Var = (y3) this.d;
                this.f30979b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                yc0 yc0Var3 = this.f30980c;
                yc0Var3.setItemCount(i14);
                y3Var.setItemCount(i14);
                z3Var.setItemCount(i14);
                yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                c4 c4Var = (c4) this.f30981e;
                b4 b4Var = (b4) this.d;
                this.f30979b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                yc0 yc0Var4 = this.f30980c;
                yc0Var4.setItemCount(i15);
                b4Var.setItemCount(i15);
                c4Var.setItemCount(i15);
                yc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                g4 g4Var = (g4) this.f30981e;
                f4 f4Var = (f4) this.d;
                this.f30979b = true;
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
                yc0 yc0Var5 = this.f30980c;
                yc0Var5.setItemCount(i16);
                yc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                q4 q4Var = (q4) this.f30981e;
                p4 p4Var = (p4) this.d;
                this.f30979b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                yc0 yc0Var6 = this.f30980c;
                yc0Var6.setItemCount(i17);
                p4Var.setItemCount(i17);
                q4Var.setItemCount(i17);
                yc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                q4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f30979b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f30978a) {
            case 0:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f30979b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public s3(Activity activity, f4 f4Var, g4 g4Var, yc0 yc0Var) {
        super(activity);
        this.f30978a = 4;
        this.d = f4Var;
        this.f30981e = g4Var;
        this.f30980c = yc0Var;
        this.f30979b = false;
    }
}
