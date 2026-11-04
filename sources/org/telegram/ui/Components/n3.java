package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class n3 extends LinearLayout {
    public final int f36348a;
    public boolean f36349b;
    public final Object f36350c;
    public Object d;
    public final cb0 f36351e;

    public n3(Context context, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, int i3) {
        super(context);
        this.f36348a = i3;
        this.f36350c = cb0Var;
        this.d = cb0Var2;
        this.f36351e = cb0Var3;
        this.f36349b = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        String str;
        switch (this.f36348a) {
            case 0:
                int i3 = org.telegram.ui.ActionBar.k6.G6;
                ((ly0) this.f36350c).c((getWidth() - ((ly0) this.f36350c).f35918c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i3, false), canvas);
                if (!org.telegram.messenger.bd.f21786c0) {
                    if (((m3) this.f36351e).getValue() % 24 < 12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f36349b != z10 || ((ly0) this.d) == null) {
                        this.f36349b = z10;
                        if (z10) {
                            str = "AM";
                        } else {
                            str = "PM";
                        }
                        this.d = new ly0(str, 18.0f, null);
                    }
                    ((ly0) this.d).c((getWidth() / 2.0f) + org.telegram.messenger.g0.L(43.0f), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i3, false), canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f36348a) {
            case 1:
                r3 r3Var = (r3) this.f36351e;
                q3 q3Var = (q3) this.d;
                cb0 cb0Var = (cb0) this.f36350c;
                this.f36349b = true;
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                cb0Var.setItemCount(i11);
                q3Var.setItemCount(i11);
                r3Var.setItemCount(i11);
                cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                q3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                r3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 2:
                t3 t3Var = (t3) this.f36351e;
                s3 s3Var = (s3) this.d;
                cb0 cb0Var2 = (cb0) this.f36350c;
                this.f36349b = true;
                Point point2 = org.telegram.messenger.g0.f22608q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                cb0Var2.setItemCount(i12);
                s3Var.setItemCount(i12);
                t3Var.setItemCount(i12);
                cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                s3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                t3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 3:
                y3 y3Var = (y3) this.f36351e;
                x3 x3Var = (x3) this.d;
                cb0 cb0Var3 = (cb0) this.f36350c;
                this.f36349b = true;
                Point point3 = org.telegram.messenger.g0.f22608q;
                if (point3.x > point3.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                cb0Var3.setItemCount(i13);
                x3Var.setItemCount(i13);
                y3Var.setItemCount(i13);
                cb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                x3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                y3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i13;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 4:
                b4 b4Var = (b4) this.f36351e;
                a4 a4Var = (a4) this.d;
                cb0 cb0Var4 = (cb0) this.f36350c;
                this.f36349b = true;
                Point point4 = org.telegram.messenger.g0.f22608q;
                if (point4.x > point4.y) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                cb0Var4.setItemCount(i14);
                a4Var.setItemCount(i14);
                b4Var.setItemCount(i14);
                cb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                a4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                b4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i14;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 5:
                f4 f4Var = (f4) this.d;
                e4 e4Var = (e4) this.f36350c;
                this.f36349b = true;
                Point point5 = org.telegram.messenger.g0.f22608q;
                if (point5.x > point5.y) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                e4Var.setItemCount(i15);
                e4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                f4Var.setItemCount(i15);
                f4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                cb0 cb0Var5 = this.f36351e;
                cb0Var5.setItemCount(i15);
                cb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i15;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 6:
                cb0 cb0Var6 = (cb0) this.d;
                cb0 cb0Var7 = (cb0) this.f36350c;
                this.f36349b = true;
                Point point6 = org.telegram.messenger.g0.f22608q;
                if (point6.x > point6.y) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                cb0Var7.setItemCount(i16);
                cb0Var6.setItemCount(i16);
                cb0 cb0Var8 = this.f36351e;
                cb0Var8.setItemCount(i16);
                cb0Var7.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                cb0Var6.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                cb0Var8.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i16;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            case 7:
                m4 m4Var = (m4) this.f36351e;
                l4 l4Var = (l4) this.d;
                cb0 cb0Var9 = (cb0) this.f36350c;
                this.f36349b = true;
                Point point7 = org.telegram.messenger.g0.f22608q;
                if (point7.x > point7.y) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                cb0Var9.setItemCount(i17);
                l4Var.setItemCount(i17);
                m4Var.setItemCount(i17);
                cb0Var9.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                l4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                m4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i17;
                this.f36349b = false;
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f36348a) {
            case 1:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 3:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 5:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 6:
                if (!this.f36349b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 7:
                if (!this.f36349b) {
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
        this.f36348a = 0;
        this.f36351e = m3Var;
        this.f36350c = new ly0(":", 18.0f, null);
    }
}
