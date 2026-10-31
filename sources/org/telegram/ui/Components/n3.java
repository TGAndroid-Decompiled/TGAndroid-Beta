package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class n3 extends LinearLayout {
    public final int f28672a;
    public boolean f28673b;
    public final Object f28674c;
    public Object d;
    public final ac0 e;

    public n3(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, int i10) {
        super(context);
        this.f28672a = i10;
        this.f28674c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f28673b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        switch (this.f28672a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                ((qz0) this.f28674c).c((getWidth() - ((qz0) this.f28674c).f29774c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), canvas);
                if (!org.telegram.messenger.cd.Z) {
                    if (((m3) this.e).getValue() % 24 < 12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f28673b != z10 || ((qz0) this.d) == null) {
                        this.f28673b = z10;
                        if (z10) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new qz0(str, 18.0f, null);
                    }
                    ((qz0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.i0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        switch (this.f28672a) {
            case 1:
                r3 r3Var = (r3) this.e;
                q3 q3Var = (q3) this.d;
                ac0 ac0Var = (ac0) this.f28674c;
                this.f28673b = true;
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ac0Var.setItemCount(i12);
                q3Var.setItemCount(i12);
                r3Var.setItemCount(i12);
                ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                q3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                r3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                t3 t3Var = (t3) this.e;
                s3 s3Var = (s3) this.d;
                ac0 ac0Var2 = (ac0) this.f28674c;
                this.f28673b = true;
                Point point2 = org.telegram.messenger.i0.f16026q;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                ac0Var2.setItemCount(i13);
                s3Var.setItemCount(i13);
                t3Var.setItemCount(i13);
                ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                s3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                t3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 3:
                x3 x3Var = (x3) this.e;
                w3 w3Var = (w3) this.d;
                ac0 ac0Var3 = (ac0) this.f28674c;
                this.f28673b = true;
                Point point3 = org.telegram.messenger.i0.f16026q;
                if (point3.x > point3.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                ac0Var3.setItemCount(i14);
                w3Var.setItemCount(i14);
                x3Var.setItemCount(i14);
                ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                w3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                x3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i14;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 4:
                a4 a4Var = (a4) this.e;
                z3 z3Var = (z3) this.d;
                ac0 ac0Var4 = (ac0) this.f28674c;
                this.f28673b = true;
                Point point4 = org.telegram.messenger.i0.f16026q;
                if (point4.x > point4.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                ac0Var4.setItemCount(i15);
                z3Var.setItemCount(i15);
                a4Var.setItemCount(i15);
                ac0Var4.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                z3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                a4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i15;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 5:
                e4 e4Var = (e4) this.d;
                d4 d4Var = (d4) this.f28674c;
                this.f28673b = true;
                Point point5 = org.telegram.messenger.i0.f16026q;
                if (point5.x > point5.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                d4Var.setItemCount(i16);
                d4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                e4Var.setItemCount(i16);
                e4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                ac0 ac0Var5 = this.e;
                ac0Var5.setItemCount(i16);
                ac0Var5.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i16;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 6:
                ac0 ac0Var6 = (ac0) this.d;
                ac0 ac0Var7 = (ac0) this.f28674c;
                this.f28673b = true;
                Point point6 = org.telegram.messenger.i0.f16026q;
                if (point6.x > point6.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                ac0Var7.setItemCount(i17);
                ac0Var6.setItemCount(i17);
                ac0 ac0Var8 = this.e;
                ac0Var8.setItemCount(i17);
                ac0Var7.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                ac0Var6.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                ac0Var8.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i17;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            case 7:
                l4 l4Var = (l4) this.e;
                k4 k4Var = (k4) this.d;
                ac0 ac0Var9 = (ac0) this.f28674c;
                this.f28673b = true;
                Point point7 = org.telegram.messenger.i0.f16026q;
                if (point7.x > point7.y) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                ac0Var9.setItemCount(i18);
                k4Var.setItemCount(i18);
                l4Var.setItemCount(i18);
                ac0Var9.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                k4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                l4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i18;
                this.f28673b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28672a) {
            case 1:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f28673b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public n3(Context context, m3 m3Var) {
        super(context);
        this.f28672a = 0;
        this.e = m3Var;
        this.f28674c = new qz0(":", 18.0f, null);
    }
}
