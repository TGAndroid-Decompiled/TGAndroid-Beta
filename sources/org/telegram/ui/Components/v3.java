package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class v3 extends LinearLayout {
    public final int f40483a;
    public boolean f40484b;
    public final Object f40485c;
    public Object d;
    public final sb0 f40486e;

    public v3(Context context, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, int i7) {
        super(context);
        this.f40483a = i7;
        this.f40485c = sb0Var;
        this.d = sb0Var2;
        this.f40486e = sb0Var3;
        this.f40484b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        switch (this.f40483a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                ((vy0) this.f40485c).c((getWidth() - ((vy0) this.f40485c).f41482c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.gd.f24218c0) {
                    if (((u3) this.f40486e).getValue() % 24 < 12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f40484b != z10 || ((vy0) this.d) == null) {
                        this.f40484b = z10;
                        if (z10) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new vy0(str, 18.0f, null);
                    }
                    ((vy0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i7, false), canvas);
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
        switch (this.f40483a) {
            case 1:
                z3 z3Var = (z3) this.f40486e;
                y3 y3Var = (y3) this.d;
                sb0 sb0Var = (sb0) this.f40485c;
                this.f40484b = true;
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                sb0Var.setItemCount(i11);
                y3Var.setItemCount(i11);
                z3Var.setItemCount(i11);
                sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 2:
                b4 b4Var = (b4) this.f40486e;
                a4 a4Var = (a4) this.d;
                sb0 sb0Var2 = (sb0) this.f40485c;
                this.f40484b = true;
                Point point2 = org.telegram.messenger.g0.f24121q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                sb0Var2.setItemCount(i12);
                a4Var.setItemCount(i12);
                b4Var.setItemCount(i12);
                sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                g4 g4Var = (g4) this.f40486e;
                f4 f4Var = (f4) this.d;
                sb0 sb0Var3 = (sb0) this.f40485c;
                this.f40484b = true;
                Point point3 = org.telegram.messenger.g0.f24121q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                sb0Var3.setItemCount(i13);
                f4Var.setItemCount(i13);
                g4Var.setItemCount(i13);
                sb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 4:
                j4 j4Var = (j4) this.f40486e;
                i4 i4Var = (i4) this.d;
                sb0 sb0Var4 = (sb0) this.f40485c;
                this.f40484b = true;
                Point point4 = org.telegram.messenger.g0.f24121q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                sb0Var4.setItemCount(i14);
                i4Var.setItemCount(i14);
                j4Var.setItemCount(i14);
                sb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                i4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 5:
                n4 n4Var = (n4) this.d;
                m4 m4Var = (m4) this.f40485c;
                this.f40484b = true;
                Point point5 = org.telegram.messenger.g0.f24121q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                m4Var.setItemCount(i15);
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                n4Var.setItemCount(i15);
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                sb0 sb0Var5 = this.f40486e;
                sb0Var5.setItemCount(i15);
                sb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 6:
                sb0 sb0Var6 = (sb0) this.d;
                sb0 sb0Var7 = (sb0) this.f40485c;
                this.f40484b = true;
                Point point6 = org.telegram.messenger.g0.f24121q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                sb0Var7.setItemCount(i16);
                sb0Var6.setItemCount(i16);
                sb0 sb0Var8 = this.f40486e;
                sb0Var8.setItemCount(i16);
                sb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                sb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                sb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            case 7:
                u4 u4Var = (u4) this.f40486e;
                t4 t4Var = (t4) this.d;
                sb0 sb0Var9 = (sb0) this.f40485c;
                this.f40484b = true;
                Point point7 = org.telegram.messenger.g0.f24121q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                sb0Var9.setItemCount(i17);
                t4Var.setItemCount(i17);
                u4Var.setItemCount(i17);
                sb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                t4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                u4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f40483a) {
            case 1:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f40484b) {
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
        this.f40483a = 0;
        this.f40486e = u3Var;
        this.f40485c = new vy0(":", 18.0f, null);
    }
}
