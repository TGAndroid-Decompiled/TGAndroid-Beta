package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class s50 extends bk0 {
    public final x50 f39494c;

    public s50(x50 x50Var) {
        this.f39494c = x50Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        x50 x50Var = this.f39494c;
        if (b10 == x50Var.f41899s1) {
            if (x50Var.f41894m1.admin_id != org.telegram.messenger.j10.i(x50Var.f30187a).f24789n) {
                return true;
            }
            return false;
        } else if (b10 < x50Var.f41904x1 || b10 >= x50Var.f41905y1) {
            if (b10 >= x50Var.J1 && b10 < x50Var.K1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f39494c.N1;
    }

    @Override
    public final int d(int i7) {
        x50 x50Var = this.f39494c;
        if (i7 == x50Var.f41898r1 || i7 == x50Var.I1 || i7 == x50Var.f41903w1 || i7 == x50Var.f41896p1) {
            return 0;
        }
        if (i7 != x50Var.f41899s1) {
            if (i7 < x50Var.J1 || i7 >= x50Var.K1) {
                if (i7 < x50Var.f41904x1 || i7 >= x50Var.f41905y1) {
                    if (i7 != x50Var.f41900t1 && i7 != x50Var.f41901u1) {
                        if (i7 == x50Var.C1) {
                            return 3;
                        }
                        if (i7 == x50Var.D1) {
                            return 4;
                        }
                        if (i7 == x50Var.E1) {
                            return 5;
                        }
                        x50Var.getClass();
                        if (i7 != 0 && i7 != x50Var.F1 && i7 != x50Var.G1) {
                            if (i7 == x50Var.f41902v1) {
                                return 7;
                            }
                            if (i7 == x50Var.H1) {
                                return 8;
                            }
                            if (i7 != x50Var.f41897q1) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s50.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        wz wzVar;
        o50 o50Var;
        Context context = viewGroup.getContext();
        x50 x50Var = this.f39494c;
        switch (i7) {
            case 1:
                o50Var = new v50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.n6.f29337a7;
                View z6Var = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.n6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.u6.h(i10, z6Var, null);
                wzVar = z6Var;
                o50Var = wzVar;
                break;
            case 3:
                o50 o50Var2 = new o50(this, context, x50Var.P1, x50Var, x50Var.f41889c2);
                o50Var2.setDelegate(new r50(this));
                o50Var2.setLayoutParams(new v4.q0(-1, -2));
                o50Var = o50Var2;
                break;
            case 4:
                o50Var = new w50(x50Var, context);
                break;
            case 5:
                wz wzVar2 = new wz(context, null);
                wzVar2.setIsSingleCell(true);
                wzVar2.setViewType(10);
                wzVar2.f41829x = false;
                wzVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                wzVar = wzVar2;
                o50Var = wzVar;
                break;
            case 6:
                o50Var = new jn(context, 11);
                break;
            case 7:
                o50Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f39909a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29786y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                o50Var = frameLayout;
                break;
            case 9:
                o50Var = new u50(x50Var, context);
                break;
            default:
                o50Var = new org.telegram.ui.Cells.y3(context, x50Var.J0);
                break;
        }
        return i5.c.q(o50Var, o50Var, -1, -2);
    }
}
