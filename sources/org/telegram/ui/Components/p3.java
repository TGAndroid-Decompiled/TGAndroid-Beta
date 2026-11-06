package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class p3 extends LinearLayout {
    public final int f36762a;
    public boolean f36763b;
    public final Object f36764c;
    public Object d;
    public final hb0 f36765e;

    public p3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        super(context);
        this.f36762a = i7;
        this.f36764c = hb0Var;
        this.d = hb0Var2;
        this.f36765e = hb0Var3;
        this.f36763b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z9;
        String str;
        switch (this.f36762a) {
            case 0:
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                ((my0) this.f36764c).c((getWidth() - ((my0) this.f36764c).f36125c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i7, false), canvas);
                if (!org.telegram.messenger.hd.f22880c0) {
                    if (((o3) this.f36765e).getValue() % 24 < 12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.f36763b != z9 || ((my0) this.d) == null) {
                        this.f36763b = z9;
                        if (z9) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new my0(str, 18.0f, null);
                    }
                    ((my0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i7, false), canvas);
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
        switch (this.f36762a) {
            case 1:
                t3 t3Var = (t3) this.f36765e;
                s3 s3Var = (s3) this.d;
                hb0 hb0Var = (hb0) this.f36764c;
                this.f36763b = true;
                Point point = org.telegram.messenger.g0.f22544q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                hb0Var.setItemCount(i11);
                s3Var.setItemCount(i11);
                t3Var.setItemCount(i11);
                hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                s3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                t3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 2:
                v3 v3Var = (v3) this.f36765e;
                u3 u3Var = (u3) this.d;
                hb0 hb0Var2 = (hb0) this.f36764c;
                this.f36763b = true;
                Point point2 = org.telegram.messenger.g0.f22544q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                hb0Var2.setItemCount(i12);
                u3Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                v3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 3:
                a4 a4Var = (a4) this.f36765e;
                z3 z3Var = (z3) this.d;
                hb0 hb0Var3 = (hb0) this.f36764c;
                this.f36763b = true;
                Point point3 = org.telegram.messenger.g0.f22544q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                hb0Var3.setItemCount(i13);
                z3Var.setItemCount(i13);
                a4Var.setItemCount(i13);
                hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                z3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 4:
                d4 d4Var = (d4) this.f36765e;
                c4 c4Var = (c4) this.d;
                hb0 hb0Var4 = (hb0) this.f36764c;
                this.f36763b = true;
                Point point4 = org.telegram.messenger.g0.f22544q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                hb0Var4.setItemCount(i14);
                c4Var.setItemCount(i14);
                d4Var.setItemCount(i14);
                hb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                d4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 5:
                h4 h4Var = (h4) this.d;
                g4 g4Var = (g4) this.f36764c;
                this.f36763b = true;
                Point point5 = org.telegram.messenger.g0.f22544q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                g4Var.setItemCount(i15);
                g4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                h4Var.setItemCount(i15);
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                hb0 hb0Var5 = this.f36765e;
                hb0Var5.setItemCount(i15);
                hb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 6:
                hb0 hb0Var6 = (hb0) this.d;
                hb0 hb0Var7 = (hb0) this.f36764c;
                this.f36763b = true;
                Point point6 = org.telegram.messenger.g0.f22544q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                hb0Var7.setItemCount(i16);
                hb0Var6.setItemCount(i16);
                hb0 hb0Var8 = this.f36765e;
                hb0Var8.setItemCount(i16);
                hb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                hb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            case 7:
                o4 o4Var = (o4) this.f36765e;
                n4 n4Var = (n4) this.d;
                hb0 hb0Var9 = (hb0) this.f36764c;
                this.f36763b = true;
                Point point7 = org.telegram.messenger.g0.f22544q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                hb0Var9.setItemCount(i17);
                n4Var.setItemCount(i17);
                o4Var.setItemCount(i17);
                hb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                n4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                o4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f36763b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f36762a) {
            case 1:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f36763b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public p3(Context context, o3 o3Var) {
        super(context);
        this.f36762a = 0;
        this.f36765e = o3Var;
        this.f36764c = new my0(":", 18.0f, null);
    }
}
