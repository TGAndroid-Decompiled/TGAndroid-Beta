package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class o3 extends LinearLayout {
    public final int f36466a;
    public boolean f36467b;
    public final Object f36468c;
    public Object d;
    public final hb0 f36469e;

    public o3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        super(context);
        this.f36466a = i7;
        this.f36468c = hb0Var;
        this.d = hb0Var2;
        this.f36469e = hb0Var3;
        this.f36467b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z9;
        String str;
        switch (this.f36466a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                ((my0) this.f36468c).c((getWidth() - ((my0) this.f36468c).f36133c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.id.f23163c0) {
                    if (((n3) this.f36469e).getValue() % 24 < 12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.f36467b != z9 || ((my0) this.d) == null) {
                        this.f36467b = z9;
                        if (z9) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new my0(str, 18.0f, null);
                    }
                    ((my0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), canvas);
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
        switch (this.f36466a) {
            case 1:
                s3 s3Var = (s3) this.f36469e;
                r3 r3Var = (r3) this.d;
                hb0 hb0Var = (hb0) this.f36468c;
                this.f36467b = true;
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                hb0Var.setItemCount(i11);
                r3Var.setItemCount(i11);
                s3Var.setItemCount(i11);
                hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                r3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                s3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 2:
                u3 u3Var = (u3) this.f36469e;
                t3 t3Var = (t3) this.d;
                hb0 hb0Var2 = (hb0) this.f36468c;
                this.f36467b = true;
                Point point2 = org.telegram.messenger.g0.f22567q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                hb0Var2.setItemCount(i12);
                t3Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                t3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                z3 z3Var = (z3) this.f36469e;
                y3 y3Var = (y3) this.d;
                hb0 hb0Var3 = (hb0) this.f36468c;
                this.f36467b = true;
                Point point3 = org.telegram.messenger.g0.f22567q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                hb0Var3.setItemCount(i13);
                y3Var.setItemCount(i13);
                z3Var.setItemCount(i13);
                hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 4:
                c4 c4Var = (c4) this.f36469e;
                b4 b4Var = (b4) this.d;
                hb0 hb0Var4 = (hb0) this.f36468c;
                this.f36467b = true;
                Point point4 = org.telegram.messenger.g0.f22567q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                hb0Var4.setItemCount(i14);
                b4Var.setItemCount(i14);
                c4Var.setItemCount(i14);
                hb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 5:
                g4 g4Var = (g4) this.d;
                f4 f4Var = (f4) this.f36468c;
                this.f36467b = true;
                Point point5 = org.telegram.messenger.g0.f22567q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                f4Var.setItemCount(i15);
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                g4Var.setItemCount(i15);
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                hb0 hb0Var5 = this.f36469e;
                hb0Var5.setItemCount(i15);
                hb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 6:
                hb0 hb0Var6 = (hb0) this.d;
                hb0 hb0Var7 = (hb0) this.f36468c;
                this.f36467b = true;
                Point point6 = org.telegram.messenger.g0.f22567q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                hb0Var7.setItemCount(i16);
                hb0Var6.setItemCount(i16);
                hb0 hb0Var8 = this.f36469e;
                hb0Var8.setItemCount(i16);
                hb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            case 7:
                n4 n4Var = (n4) this.f36469e;
                m4 m4Var = (m4) this.d;
                hb0 hb0Var9 = (hb0) this.f36468c;
                this.f36467b = true;
                Point point7 = org.telegram.messenger.g0.f22567q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                hb0Var9.setItemCount(i17);
                m4Var.setItemCount(i17);
                n4Var.setItemCount(i17);
                hb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f36467b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f36466a) {
            case 1:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f36467b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public o3(Context context, n3 n3Var) {
        super(context);
        this.f36466a = 0;
        this.f36469e = n3Var;
        this.f36468c = new my0(":", 18.0f, null);
    }
}
