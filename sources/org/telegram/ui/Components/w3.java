package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class w3 extends LinearLayout {
    public final int f41643a;
    public boolean f41644b;
    public final Object f41645c;
    public Object d;
    public final tb0 f41646e;

    public w3(Context context, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, int i7) {
        super(context);
        this.f41643a = i7;
        this.f41645c = tb0Var;
        this.d = tb0Var2;
        this.f41646e = tb0Var3;
        this.f41644b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        switch (this.f41643a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                ((xy0) this.f41645c).c((getWidth() - ((xy0) this.f41645c).f42254c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.gd.f24243c0) {
                    if (((v3) this.f41646e).getValue() % 24 < 12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f41644b != z10 || ((xy0) this.d) == null) {
                        this.f41644b = z10;
                        if (z10) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new xy0(str, 18.0f, null);
                    }
                    ((xy0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f41643a) {
            case 1:
                a4 a4Var = (a4) this.f41646e;
                z3 z3Var = (z3) this.d;
                tb0 tb0Var = (tb0) this.f41645c;
                this.f41644b = true;
                Point point = org.telegram.messenger.g0.f24146q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                tb0Var.setItemCount(i11);
                z3Var.setItemCount(i11);
                a4Var.setItemCount(i11);
                tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 2:
                c4 c4Var = (c4) this.f41646e;
                b4 b4Var = (b4) this.d;
                tb0 tb0Var2 = (tb0) this.f41645c;
                this.f41644b = true;
                Point point2 = org.telegram.messenger.g0.f24146q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                tb0Var2.setItemCount(i12);
                b4Var.setItemCount(i12);
                c4Var.setItemCount(i12);
                tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                h4 h4Var = (h4) this.f41646e;
                g4 g4Var = (g4) this.d;
                tb0 tb0Var3 = (tb0) this.f41645c;
                this.f41644b = true;
                Point point3 = org.telegram.messenger.g0.f24146q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                tb0Var3.setItemCount(i13);
                g4Var.setItemCount(i13);
                h4Var.setItemCount(i13);
                tb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 4:
                k4 k4Var = (k4) this.f41646e;
                j4 j4Var = (j4) this.d;
                tb0 tb0Var4 = (tb0) this.f41645c;
                this.f41644b = true;
                Point point4 = org.telegram.messenger.g0.f24146q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                tb0Var4.setItemCount(i14);
                j4Var.setItemCount(i14);
                k4Var.setItemCount(i14);
                tb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                k4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 5:
                o4 o4Var = (o4) this.d;
                n4 n4Var = (n4) this.f41645c;
                this.f41644b = true;
                Point point5 = org.telegram.messenger.g0.f24146q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                n4Var.setItemCount(i15);
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                o4Var.setItemCount(i15);
                o4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                tb0 tb0Var5 = this.f41646e;
                tb0Var5.setItemCount(i15);
                tb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 6:
                tb0 tb0Var6 = (tb0) this.d;
                tb0 tb0Var7 = (tb0) this.f41645c;
                this.f41644b = true;
                Point point6 = org.telegram.messenger.g0.f24146q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                tb0Var7.setItemCount(i16);
                tb0Var6.setItemCount(i16);
                tb0 tb0Var8 = this.f41646e;
                tb0Var8.setItemCount(i16);
                tb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                tb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                tb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            case 7:
                v4 v4Var = (v4) this.f41646e;
                u4 u4Var = (u4) this.d;
                tb0 tb0Var9 = (tb0) this.f41645c;
                this.f41644b = true;
                Point point7 = org.telegram.messenger.g0.f24146q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                tb0Var9.setItemCount(i17);
                u4Var.setItemCount(i17);
                v4Var.setItemCount(i17);
                tb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                u4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                v4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f41644b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f41643a) {
            case 1:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f41644b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public w3(Context context, v3 v3Var) {
        super(context);
        this.f41643a = 0;
        this.f41646e = v3Var;
        this.f41645c = new xy0(":", 18.0f, null);
    }
}
