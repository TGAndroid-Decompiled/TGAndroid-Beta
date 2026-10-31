package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x50 extends sk0 {
    public final c60 f32356c;

    public x50(c60 c60Var) {
        this.f32356c = c60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        c60 c60Var = this.f32356c;
        if (b10 == c60Var.f24998o1) {
            if (c60Var.f24993i1.admin_id != org.telegram.messenger.d20.i(c60Var.f21583a).f15165n) {
                return true;
            }
            return false;
        } else if (b10 < c60Var.f25003t1 || b10 >= c60Var.f25004u1) {
            if (b10 >= c60Var.F1 && b10 < c60Var.G1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f32356c.J1;
    }

    @Override
    public final int d(int i10) {
        c60 c60Var = this.f32356c;
        if (i10 == c60Var.f24997n1 || i10 == c60Var.E1 || i10 == c60Var.f25002s1 || i10 == c60Var.l1) {
            return 0;
        }
        if (i10 != c60Var.f24998o1) {
            if (i10 < c60Var.F1 || i10 >= c60Var.G1) {
                if (i10 < c60Var.f25003t1 || i10 >= c60Var.f25004u1) {
                    if (i10 != c60Var.f24999p1 && i10 != c60Var.f25000q1) {
                        if (i10 == c60Var.f25008y1) {
                            return 3;
                        }
                        if (i10 == c60Var.f25009z1) {
                            return 4;
                        }
                        if (i10 == c60Var.A1) {
                            return 5;
                        }
                        c60Var.getClass();
                        if (i10 != 0 && i10 != c60Var.B1 && i10 != c60Var.C1) {
                            if (i10 == c60Var.f25001r1) {
                                return 7;
                            }
                            if (i10 == c60Var.D1) {
                                return 8;
                            }
                            if (i10 != c60Var.f24996m1) {
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
    public final void t(s4.c1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x50.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zz zzVar;
        t50 t50Var;
        Context context = viewGroup.getContext();
        c60 c60Var = this.f32356c;
        switch (i10) {
            case 1:
                t50Var = new a60(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.t6.f20872a7;
                View c7Var = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.a7.i(i11, c7Var, null);
                zzVar = c7Var;
                t50Var = zzVar;
                break;
            case 3:
                t50 t50Var2 = new t50(this, context, c60Var.L1, c60Var, c60Var.Y1);
                t50Var2.setDelegate(new w50(this));
                t50Var2.setLayoutParams(new s4.o0(-1, -2));
                t50Var = t50Var2;
                break;
            case 4:
                t50Var = new b60(c60Var, context);
                break;
            case 5:
                zz zzVar2 = new zz(context, null);
                zzVar2.setIsSingleCell(true);
                zzVar2.setViewType(10);
                zzVar2.f33274x = false;
                zzVar2.setPaddingLeft(org.telegram.messenger.i0.L(10.0f));
                zzVar = zzVar2;
                t50Var = zzVar;
                break;
            case 6:
                t50Var = new bn(context, 8);
                break;
            case 7:
                t50Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f32639a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21311y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t50Var = frameLayout;
                break;
            case 9:
                t50Var = new z50(c60Var, context);
                break;
            default:
                t50Var = new org.telegram.ui.Cells.z3(context, c60Var.I0);
                break;
        }
        return sc.e.o(t50Var, t50Var, -1, -2);
    }
}
