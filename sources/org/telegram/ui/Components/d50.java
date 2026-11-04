package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class d50 extends sj0 {
    public final i50 f32935c;

    public d50(i50 i50Var) {
        this.f32935c = i50Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        i50 i50Var = this.f32935c;
        if (b10 == i50Var.f34607p1) {
            if (i50Var.f34603j1.admin_id != org.telegram.messenger.h10.i(i50Var.f28583a).f22848n) {
                return true;
            }
            return false;
        } else if (b10 < i50Var.f34612u1 || b10 >= i50Var.f34613v1) {
            if (b10 >= i50Var.G1 && b10 < i50Var.H1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f32935c.K1;
    }

    @Override
    public final int d(int i3) {
        i50 i50Var = this.f32935c;
        if (i3 == i50Var.f34606o1 || i3 == i50Var.F1 || i3 == i50Var.f34611t1 || i3 == i50Var.m1) {
            return 0;
        }
        if (i3 != i50Var.f34607p1) {
            if (i3 < i50Var.G1 || i3 >= i50Var.H1) {
                if (i3 < i50Var.f34612u1 || i3 >= i50Var.f34613v1) {
                    if (i3 != i50Var.f34608q1 && i3 != i50Var.f34609r1) {
                        if (i3 == i50Var.f34617z1) {
                            return 3;
                        }
                        if (i3 == i50Var.A1) {
                            return 4;
                        }
                        if (i3 == i50Var.B1) {
                            return 5;
                        }
                        i50Var.getClass();
                        if (i3 != 0 && i3 != i50Var.C1 && i3 != i50Var.D1) {
                            if (i3 == i50Var.f34610s1) {
                                return 7;
                            }
                            if (i3 == i50Var.E1) {
                                return 8;
                            }
                            if (i3 != i50Var.f34605n1) {
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
    public final void t(u4.d1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d50.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        iz izVar;
        z40 z40Var;
        Context context = viewGroup.getContext();
        i50 i50Var = this.f32935c;
        switch (i3) {
            case 1:
                z40Var = new g50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.r6.i(i10, x6Var, null);
                izVar = x6Var;
                z40Var = izVar;
                break;
            case 3:
                z40 z40Var2 = new z40(this, context, i50Var.M1, i50Var, i50Var.Z1);
                z40Var2.setDelegate(new c50(this));
                z40Var2.setLayoutParams(new u4.p0(-1, -2));
                z40Var = z40Var2;
                break;
            case 4:
                z40Var = new h50(i50Var, context);
                break;
            case 5:
                iz izVar2 = new iz(context, null);
                izVar2.setIsSingleCell(true);
                izVar2.setViewType(10);
                izVar2.f34869x = false;
                izVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                izVar = izVar2;
                z40Var = izVar;
                break;
            case 6:
                z40Var = new sm(context, 12);
                break;
            case 7:
                z40Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f33293a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                z40Var = frameLayout;
                break;
            case 9:
                z40Var = new f50(i50Var, context);
                break;
            default:
                z40Var = new org.telegram.ui.Cells.x3(context, i50Var.J0);
                break;
        }
        return k2.p1.p(z40Var, z40Var, -1, -2);
    }
}
