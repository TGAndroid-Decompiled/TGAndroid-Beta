package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x3 extends LinearLayout {
    public final int f32325a;
    public boolean f32326b;
    public final od0 f32327c;
    public final od0 d;
    public final od0 e;

    public x3(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        super(context);
        this.f32325a = i10;
        this.f32327c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f32326b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f32325a) {
            case 0:
                w3 w3Var = (w3) this.e;
                v3 v3Var = (v3) this.d;
                this.f32326b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                od0 od0Var = this.f32327c;
                od0Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                w3Var.setItemCount(i12);
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
            case 1:
                a4 a4Var = (a4) this.e;
                y3 y3Var = (y3) this.d;
                this.f32326b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                od0 od0Var2 = this.f32327c;
                od0Var2.setItemCount(i13);
                y3Var.setItemCount(i13);
                a4Var.setItemCount(i13);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                f4 f4Var = (f4) this.e;
                e4 e4Var = (e4) this.d;
                this.f32326b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                od0 od0Var3 = this.f32327c;
                od0Var3.setItemCount(i14);
                e4Var.setItemCount(i14);
                f4Var.setItemCount(i14);
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                i4 i4Var = (i4) this.e;
                h4 h4Var = (h4) this.d;
                this.f32326b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                od0 od0Var4 = this.f32327c;
                od0Var4.setItemCount(i15);
                h4Var.setItemCount(i15);
                i4Var.setItemCount(i15);
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                m4 m4Var = (m4) this.e;
                l4 l4Var = (l4) this.d;
                this.f32326b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                l4Var.setItemCount(i16);
                l4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                m4Var.setItemCount(i16);
                m4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                od0 od0Var5 = this.f32327c;
                od0Var5.setItemCount(i16);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                w4 w4Var = (w4) this.e;
                v4 v4Var = (v4) this.d;
                this.f32326b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                od0 od0Var6 = this.f32327c;
                od0Var6.setItemCount(i17);
                v4Var.setItemCount(i17);
                w4Var.setItemCount(i17);
                od0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                v4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                w4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f32326b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f32325a) {
            case 0:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f32326b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public x3(Activity activity, l4 l4Var, m4 m4Var, od0 od0Var) {
        super(activity);
        this.f32325a = 4;
        this.d = l4Var;
        this.e = m4Var;
        this.f32327c = od0Var;
        this.f32326b = false;
    }
}
