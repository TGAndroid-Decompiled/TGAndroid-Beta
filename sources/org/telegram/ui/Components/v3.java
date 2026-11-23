package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class v3 extends LinearLayout {
    public final int f40547a;
    public boolean f40548b;
    public final Object f40549c;
    public Object d;
    public final qb0 f40550e;

    public v3(Context context, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, int i7) {
        super(context);
        this.f40547a = i7;
        this.f40549c = qb0Var;
        this.d = qb0Var2;
        this.f40550e = qb0Var3;
        this.f40548b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        switch (this.f40547a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                ((wy0) this.f40549c).c((getWidth() - ((wy0) this.f40549c).f41763c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.gd.f24316c0) {
                    if (((u3) this.f40550e).getValue() % 24 < 12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f40548b != z10 || ((wy0) this.d) == null) {
                        this.f40548b = z10;
                        if (z10) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new wy0(str, 18.0f, null);
                    }
                    ((wy0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
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
        switch (this.f40547a) {
            case 1:
                z3 z3Var = (z3) this.f40550e;
                y3 y3Var = (y3) this.d;
                qb0 qb0Var = (qb0) this.f40549c;
                this.f40548b = true;
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                qb0Var.setItemCount(i11);
                y3Var.setItemCount(i11);
                z3Var.setItemCount(i11);
                qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 2:
                b4 b4Var = (b4) this.f40550e;
                a4 a4Var = (a4) this.d;
                qb0 qb0Var2 = (qb0) this.f40549c;
                this.f40548b = true;
                Point point2 = org.telegram.messenger.g0.f24226q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                qb0Var2.setItemCount(i12);
                a4Var.setItemCount(i12);
                b4Var.setItemCount(i12);
                qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                g4 g4Var = (g4) this.f40550e;
                f4 f4Var = (f4) this.d;
                qb0 qb0Var3 = (qb0) this.f40549c;
                this.f40548b = true;
                Point point3 = org.telegram.messenger.g0.f24226q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                qb0Var3.setItemCount(i13);
                f4Var.setItemCount(i13);
                g4Var.setItemCount(i13);
                qb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 4:
                j4 j4Var = (j4) this.f40550e;
                i4 i4Var = (i4) this.d;
                qb0 qb0Var4 = (qb0) this.f40549c;
                this.f40548b = true;
                Point point4 = org.telegram.messenger.g0.f24226q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                qb0Var4.setItemCount(i14);
                i4Var.setItemCount(i14);
                j4Var.setItemCount(i14);
                qb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                i4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 5:
                n4 n4Var = (n4) this.d;
                m4 m4Var = (m4) this.f40549c;
                this.f40548b = true;
                Point point5 = org.telegram.messenger.g0.f24226q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                m4Var.setItemCount(i15);
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                n4Var.setItemCount(i15);
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                qb0 qb0Var5 = this.f40550e;
                qb0Var5.setItemCount(i15);
                qb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 6:
                qb0 qb0Var6 = (qb0) this.d;
                qb0 qb0Var7 = (qb0) this.f40549c;
                this.f40548b = true;
                Point point6 = org.telegram.messenger.g0.f24226q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                qb0Var7.setItemCount(i16);
                qb0Var6.setItemCount(i16);
                qb0 qb0Var8 = this.f40550e;
                qb0Var8.setItemCount(i16);
                qb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                qb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                qb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            case 7:
                u4 u4Var = (u4) this.f40550e;
                t4 t4Var = (t4) this.d;
                qb0 qb0Var9 = (qb0) this.f40549c;
                this.f40548b = true;
                Point point7 = org.telegram.messenger.g0.f24226q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                qb0Var9.setItemCount(i17);
                t4Var.setItemCount(i17);
                u4Var.setItemCount(i17);
                qb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                t4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                u4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f40548b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f40547a) {
            case 1:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f40548b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public v3(Context context, u3 u3Var) {
        super(context);
        this.f40547a = 0;
        this.f40550e = u3Var;
        this.f40549c = new wy0(":", 18.0f, null);
    }
}
