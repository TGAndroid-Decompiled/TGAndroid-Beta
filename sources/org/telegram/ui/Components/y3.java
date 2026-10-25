package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y3 extends LinearLayout {
    public final int f34914a;
    public boolean f34915b;
    public final md0 f34916c;
    public final md0 d;
    public final md0 e;

    public y3(Context context, md0 md0Var, md0 md0Var2, md0 md0Var3, int i10) {
        super(context);
        this.f34914a = i10;
        this.f34916c = md0Var;
        this.d = md0Var2;
        this.e = md0Var3;
        this.f34915b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f34914a) {
            case 0:
                x3 x3Var = (x3) this.e;
                w3 w3Var = (w3) this.d;
                this.f34915b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                md0 md0Var = this.f34916c;
                md0Var.setItemCount(i12);
                w3Var.setItemCount(i12);
                x3Var.setItemCount(i12);
                md0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                b4 b4Var = (b4) this.e;
                z3 z3Var = (z3) this.d;
                this.f34915b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                md0 md0Var2 = this.f34916c;
                md0Var2.setItemCount(i13);
                z3Var.setItemCount(i13);
                b4Var.setItemCount(i13);
                md0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.f34915b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                md0 md0Var3 = this.f34916c;
                md0Var3.setItemCount(i14);
                f4Var.setItemCount(i14);
                g4Var.setItemCount(i14);
                md0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                j4 j4Var = (j4) this.e;
                i4 i4Var = (i4) this.d;
                this.f34915b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                md0 md0Var4 = this.f34916c;
                md0Var4.setItemCount(i15);
                i4Var.setItemCount(i15);
                j4Var.setItemCount(i15);
                md0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                n4 n4Var = (n4) this.e;
                m4 m4Var = (m4) this.d;
                this.f34915b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                m4Var.setItemCount(i16);
                m4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                n4Var.setItemCount(i16);
                n4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                md0 md0Var5 = this.f34916c;
                md0Var5.setItemCount(i16);
                md0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                w4 w4Var = (w4) this.e;
                v4 v4Var = (v4) this.d;
                this.f34915b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                md0 md0Var6 = this.f34916c;
                md0Var6.setItemCount(i17);
                v4Var.setItemCount(i17);
                w4Var.setItemCount(i17);
                md0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                v4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                w4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f34915b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f34914a) {
            case 0:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f34915b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public y3(Activity activity, m4 m4Var, n4 n4Var, md0 md0Var) {
        super(activity);
        this.f34914a = 4;
        this.d = m4Var;
        this.e = n4Var;
        this.f34916c = md0Var;
        this.f34915b = false;
    }
}
