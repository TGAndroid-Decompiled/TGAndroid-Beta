package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class r3 extends LinearLayout {

    public final int f32066a;

    public boolean f32067b;

    public final fc0 f32068c;
    public final fc0 d;

    public final fc0 f32069e;

    public r3(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, int i10) {
        super(context);
        this.f32066a = i10;
        this.f32068c = fc0Var;
        this.d = fc0Var2;
        this.f32069e = fc0Var3;
        this.f32067b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f32066a) {
            case 0:
                q3 q3Var = (q3) this.f32069e;
                p3 p3Var = (p3) this.d;
                this.f32067b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                fc0 fc0Var = this.f32068c;
                fc0Var.setItemCount(i12);
                p3Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                u3 u3Var = (u3) this.f32069e;
                s3 s3Var = (s3) this.d;
                this.f32067b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                fc0 fc0Var2 = this.f32068c;
                fc0Var2.setItemCount(i13);
                s3Var.setItemCount(i13);
                u3Var.setItemCount(i13);
                fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                y3 y3Var = (y3) this.f32069e;
                x3 x3Var = (x3) this.d;
                this.f32067b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                fc0 fc0Var3 = this.f32068c;
                fc0Var3.setItemCount(i14);
                x3Var.setItemCount(i14);
                y3Var.setItemCount(i14);
                fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                y3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                b4 b4Var = (b4) this.f32069e;
                a4 a4Var = (a4) this.d;
                this.f32067b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                fc0 fc0Var4 = this.f32068c;
                fc0Var4.setItemCount(i15);
                a4Var.setItemCount(i15);
                b4Var.setItemCount(i15);
                fc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                a4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                f4 f4Var = (f4) this.f32069e;
                e4 e4Var = (e4) this.d;
                this.f32067b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                e4Var.setItemCount(i16);
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                f4Var.setItemCount(i16);
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                fc0 fc0Var5 = this.f32068c;
                fc0Var5.setItemCount(i16);
                fc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                p4 p4Var = (p4) this.f32069e;
                o4 o4Var = (o4) this.d;
                this.f32067b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                fc0 fc0Var6 = this.f32068c;
                fc0Var6.setItemCount(i17);
                o4Var.setItemCount(i17);
                p4Var.setItemCount(i17);
                fc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                this.f32067b = false;
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f32066a) {
            case 0:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.f32067b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    public r3(Activity activity, e4 e4Var, f4 f4Var, fc0 fc0Var) {
        super(activity);
        this.f32066a = 4;
        this.d = e4Var;
        this.f32069e = f4Var;
        this.f32068c = fc0Var;
        this.f32067b = false;
    }
}
