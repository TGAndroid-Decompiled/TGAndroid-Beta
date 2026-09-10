package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends LinearLayout {
    public final int f27803a;
    public boolean f27804b;
    public final dd0 f27805c;
    public final dd0 d;
    public final dd0 e;

    public v3(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, int i10) {
        super(context);
        this.f27803a = i10;
        this.f27805c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f27804b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f27803a) {
            case 0:
                u3 u3Var = (u3) this.e;
                t3 t3Var = (t3) this.d;
                this.f27804b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                dd0 dd0Var = this.f27805c;
                dd0Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                y3 y3Var = (y3) this.e;
                w3 w3Var = (w3) this.d;
                this.f27804b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                dd0 dd0Var2 = this.f27805c;
                dd0Var2.setItemCount(i13);
                w3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                d4 d4Var = (d4) this.e;
                c4 c4Var = (c4) this.d;
                this.f27804b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                dd0 dd0Var3 = this.f27805c;
                dd0Var3.setItemCount(i14);
                c4Var.setItemCount(i14);
                d4Var.setItemCount(i14);
                dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.f27804b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                dd0 dd0Var4 = this.f27805c;
                dd0Var4.setItemCount(i15);
                f4Var.setItemCount(i15);
                g4Var.setItemCount(i15);
                dd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                k4 k4Var = (k4) this.e;
                j4 j4Var = (j4) this.d;
                this.f27804b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                j4Var.setItemCount(i16);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                k4Var.setItemCount(i16);
                k4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                dd0 dd0Var5 = this.f27805c;
                dd0Var5.setItemCount(i16);
                dd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                u4 u4Var = (u4) this.e;
                t4 t4Var = (t4) this.d;
                this.f27804b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                dd0 dd0Var6 = this.f27805c;
                dd0Var6.setItemCount(i17);
                t4Var.setItemCount(i17);
                u4Var.setItemCount(i17);
                dd0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                t4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                u4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f27804b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27803a) {
            case 0:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27804b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public v3(Activity activity, j4 j4Var, k4 k4Var, dd0 dd0Var) {
        super(activity);
        this.f27803a = 4;
        this.d = j4Var;
        this.e = k4Var;
        this.f27805c = dd0Var;
        this.f27804b = false;
    }
}
