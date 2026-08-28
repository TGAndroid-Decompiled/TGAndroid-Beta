package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends LinearLayout {
    public final int f32071a;
    public boolean f32072b;
    public final bc0 f32073c;
    public final bc0 d;
    public final bc0 f32074e;

    public r3(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, int i9) {
        super(context);
        this.f32071a = i9;
        this.f32073c = bc0Var;
        this.d = bc0Var2;
        this.f32074e = bc0Var3;
        this.f32072b = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f32071a) {
            case 0:
                q3 q3Var = (q3) this.f32074e;
                p3 p3Var = (p3) this.d;
                this.f32072b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                bc0 bc0Var = this.f32073c;
                bc0Var.setItemCount(i11);
                p3Var.setItemCount(i11);
                q3Var.setItemCount(i11);
                bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
            case 1:
                u3 u3Var = (u3) this.f32074e;
                s3 s3Var = (s3) this.d;
                this.f32072b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                bc0 bc0Var2 = this.f32073c;
                bc0Var2.setItemCount(i12);
                s3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
            case 2:
                y3 y3Var = (y3) this.f32074e;
                x3 x3Var = (x3) this.d;
                this.f32072b = true;
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                bc0 bc0Var3 = this.f32073c;
                bc0Var3.setItemCount(i13);
                x3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
            case 3:
                b4 b4Var = (b4) this.f32074e;
                a4 a4Var = (a4) this.d;
                this.f32072b = true;
                Point point4 = AndroidUtilities.displaySize;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                bc0 bc0Var4 = this.f32073c;
                bc0Var4.setItemCount(i14);
                a4Var.setItemCount(i14);
                b4Var.setItemCount(i14);
                bc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
            case 4:
                f4 f4Var = (f4) this.f32074e;
                e4 e4Var = (e4) this.d;
                this.f32072b = true;
                Point point5 = AndroidUtilities.displaySize;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                e4Var.setItemCount(i15);
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                f4Var.setItemCount(i15);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                bc0 bc0Var5 = this.f32073c;
                bc0Var5.setItemCount(i15);
                bc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
            default:
                p4 p4Var = (p4) this.f32074e;
                o4 o4Var = (o4) this.d;
                this.f32072b = true;
                Point point6 = AndroidUtilities.displaySize;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                bc0 bc0Var6 = this.f32073c;
                bc0Var6.setItemCount(i16);
                o4Var.setItemCount(i16);
                p4Var.setItemCount(i16);
                bc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f32072b = false;
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f32071a) {
            case 0:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f32072b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public r3(Activity activity, e4 e4Var, f4 f4Var, bc0 bc0Var) {
        super(activity);
        this.f32071a = 4;
        this.d = e4Var;
        this.f32074e = f4Var;
        this.f32073c = bc0Var;
        this.f32072b = false;
    }
}
