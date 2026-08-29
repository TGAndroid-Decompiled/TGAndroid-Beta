package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends LinearLayout {
    public final int f33440a;
    public boolean f33441b;
    public final qc0 f33442c;
    public final qc0 d;
    public final qc0 f33443e;

    public v3(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, int i10) {
        super(context);
        this.f33440a = i10;
        this.f33442c = qc0Var;
        this.d = qc0Var2;
        this.f33443e = qc0Var3;
        this.f33441b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f33440a) {
            case 0:
                u3 u3Var = (u3) this.f33443e;
                t3 t3Var = (t3) this.d;
                this.f33441b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                qc0 qc0Var = this.f33442c;
                qc0Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                y3 y3Var = (y3) this.f33443e;
                w3 w3Var = (w3) this.d;
                this.f33441b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                qc0 qc0Var2 = this.f33442c;
                qc0Var2.setItemCount(i13);
                w3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                c4 c4Var = (c4) this.f33443e;
                b4 b4Var = (b4) this.d;
                this.f33441b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                qc0 qc0Var3 = this.f33442c;
                qc0Var3.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                f4 f4Var = (f4) this.f33443e;
                e4 e4Var = (e4) this.d;
                this.f33441b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                qc0 qc0Var4 = this.f33442c;
                qc0Var4.setItemCount(i15);
                e4Var.setItemCount(i15);
                f4Var.setItemCount(i15);
                qc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                j4 j4Var = (j4) this.f33443e;
                i4 i4Var = (i4) this.d;
                this.f33441b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                i4Var.setItemCount(i16);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                j4Var.setItemCount(i16);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                qc0 qc0Var5 = this.f33442c;
                qc0Var5.setItemCount(i16);
                qc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                t4 t4Var = (t4) this.f33443e;
                s4 s4Var = (s4) this.d;
                this.f33441b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                qc0 qc0Var6 = this.f33442c;
                qc0Var6.setItemCount(i17);
                s4Var.setItemCount(i17);
                t4Var.setItemCount(i17);
                qc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                s4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                t4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f33441b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f33440a) {
            case 0:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f33441b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public v3(Activity activity, i4 i4Var, j4 j4Var, qc0 qc0Var) {
        super(activity);
        this.f33440a = 4;
        this.d = i4Var;
        this.f33443e = j4Var;
        this.f33442c = qc0Var;
        this.f33441b = false;
    }
}
