package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class v50 extends dk0 {
    public final a60 f40686c;

    public v50(a60 a60Var) {
        this.f40686c = a60Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        a60 a60Var = this.f40686c;
        if (b10 == a60Var.f33338s1) {
            if (a60Var.f33333m1.admin_id != org.telegram.messenger.k10.i(a60Var.f30173a).f24987n) {
                return true;
            }
            return false;
        } else if (b10 < a60Var.f33343x1 || b10 >= a60Var.f33344y1) {
            if (b10 >= a60Var.J1 && b10 < a60Var.K1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f40686c.N1;
    }

    @Override
    public final int d(int i7) {
        a60 a60Var = this.f40686c;
        if (i7 == a60Var.f33337r1 || i7 == a60Var.I1 || i7 == a60Var.f33342w1 || i7 == a60Var.f33335p1) {
            return 0;
        }
        if (i7 != a60Var.f33338s1) {
            if (i7 < a60Var.J1 || i7 >= a60Var.K1) {
                if (i7 < a60Var.f33343x1 || i7 >= a60Var.f33344y1) {
                    if (i7 != a60Var.f33339t1 && i7 != a60Var.f33340u1) {
                        if (i7 == a60Var.C1) {
                            return 3;
                        }
                        if (i7 == a60Var.D1) {
                            return 4;
                        }
                        if (i7 == a60Var.E1) {
                            return 5;
                        }
                        a60Var.getClass();
                        if (i7 != 0 && i7 != a60Var.F1 && i7 != a60Var.G1) {
                            if (i7 == a60Var.f33341v1) {
                                return 7;
                            }
                            if (i7 == a60Var.H1) {
                                return 8;
                            }
                            if (i7 != a60Var.f33336q1) {
                                return 0;
                            }
                            return 9;
                        }
                        return 6;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v50.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        yz yzVar;
        r50 r50Var;
        Context context = viewGroup.getContext();
        a60 a60Var = this.f40686c;
        switch (i7) {
            case 1:
                r50Var = new y50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.m6.f29324a7;
                View z6Var = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.m6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.t6.h(i10, z6Var, null);
                yzVar = z6Var;
                r50Var = yzVar;
                break;
            case 3:
                r50 r50Var2 = new r50(this, context, a60Var.P1, a60Var, a60Var.f33328c2);
                r50Var2.setDelegate(new u50(this));
                r50Var2.setLayoutParams(new v4.q0(-1, -2));
                r50Var = r50Var2;
                break;
            case 4:
                r50Var = new z50(a60Var, context);
                break;
            case 5:
                yz yzVar2 = new yz(context, null);
                yzVar2.setIsSingleCell(true);
                yzVar2.setViewType(10);
                yzVar2.f42606x = false;
                yzVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                yzVar = yzVar2;
                r50Var = yzVar;
                break;
            case 6:
                r50Var = new ln(context, 11);
                break;
            case 7:
                r50Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f41650a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29773y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                r50Var = frameLayout;
                break;
            case 9:
                r50Var = new x50(a60Var, context);
                break;
            default:
                r50Var = new org.telegram.ui.Cells.y3(context, a60Var.J0);
                break;
        }
        return i5.c.q(r50Var, r50Var, -1, -2);
    }
}
