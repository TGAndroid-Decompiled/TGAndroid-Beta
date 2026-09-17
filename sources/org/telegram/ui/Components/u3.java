package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends LinearLayout {
    public final int f28263a;
    public boolean f28264b;
    public final uc0 f28265c;
    public final uc0 d;
    public final uc0 e;

    public u3(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, int i10) {
        super(context);
        this.f28263a = i10;
        this.f28265c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.f28264b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f28263a) {
            case 0:
                t3 t3Var = (t3) this.e;
                s3 s3Var = (s3) this.d;
                this.f28264b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                uc0 uc0Var = this.f28265c;
                uc0Var.setItemCount(i12);
                s3Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                x3 x3Var = (x3) this.e;
                v3 v3Var = (v3) this.d;
                this.f28264b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                uc0 uc0Var2 = this.f28265c;
                uc0Var2.setItemCount(i13);
                v3Var.setItemCount(i13);
                x3Var.setItemCount(i13);
                uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                c4 c4Var = (c4) this.e;
                b4 b4Var = (b4) this.d;
                this.f28264b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                uc0 uc0Var3 = this.f28265c;
                uc0Var3.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.f28264b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                uc0 uc0Var4 = this.f28265c;
                uc0Var4.setItemCount(i15);
                e4Var.setItemCount(i15);
                f4Var.setItemCount(i15);
                uc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                j4 j4Var = (j4) this.e;
                i4 i4Var = (i4) this.d;
                this.f28264b = true;
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
                uc0 uc0Var5 = this.f28265c;
                uc0Var5.setItemCount(i16);
                uc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                t4 t4Var = (t4) this.e;
                s4 s4Var = (s4) this.d;
                this.f28264b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                uc0 uc0Var6 = this.f28265c;
                uc0Var6.setItemCount(i17);
                s4Var.setItemCount(i17);
                t4Var.setItemCount(i17);
                uc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                s4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                t4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f28264b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f28263a) {
            case 0:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f28264b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public u3(Activity activity, i4 i4Var, j4 j4Var, uc0 uc0Var) {
        super(activity);
        this.f28263a = 4;
        this.d = i4Var;
        this.e = j4Var;
        this.f28265c = uc0Var;
        this.f28264b = false;
    }
}
