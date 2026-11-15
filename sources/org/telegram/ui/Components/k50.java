package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k50 extends tj0 {
    public final p50 f36278c;

    public k50(p50 p50Var) {
        this.f36278c = p50Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        p50 p50Var = this.f36278c;
        if (b10 == p50Var.f38217s1) {
            if (p50Var.f38212m1.admin_id != org.telegram.messenger.m10.i(p50Var.f29679a).f24959n) {
                return true;
            }
            return false;
        } else if (b10 < p50Var.f38222x1 || b10 >= p50Var.f38223y1) {
            if (b10 >= p50Var.J1 && b10 < p50Var.K1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.f36278c.N1;
    }

    @Override
    public final int d(int i7) {
        p50 p50Var = this.f36278c;
        if (i7 == p50Var.f38216r1 || i7 == p50Var.I1 || i7 == p50Var.f38221w1 || i7 == p50Var.f38214p1) {
            return 0;
        }
        if (i7 != p50Var.f38217s1) {
            if (i7 < p50Var.J1 || i7 >= p50Var.K1) {
                if (i7 < p50Var.f38222x1 || i7 >= p50Var.f38223y1) {
                    if (i7 != p50Var.f38218t1 && i7 != p50Var.f38219u1) {
                        if (i7 == p50Var.C1) {
                            return 3;
                        }
                        if (i7 == p50Var.D1) {
                            return 4;
                        }
                        if (i7 == p50Var.E1) {
                            return 5;
                        }
                        p50Var.getClass();
                        if (i7 != 0 && i7 != p50Var.F1 && i7 != p50Var.G1) {
                            if (i7 == p50Var.f38220v1) {
                                return 7;
                            }
                            if (i7 == p50Var.H1) {
                                return 8;
                            }
                            if (i7 != p50Var.f38215q1) {
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
    public final void t(v4.e1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k50.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        pz pzVar;
        g50 g50Var;
        Context context = viewGroup.getContext();
        p50 p50Var = this.f36278c;
        switch (i7) {
            case 1:
                g50Var = new n50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.j6.f28792a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.j6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.q6.h(i10, x6Var, null);
                pzVar = x6Var;
                g50Var = pzVar;
                break;
            case 3:
                g50 g50Var2 = new g50(this, context, p50Var.P1, p50Var, p50Var.f38207c2);
                g50Var2.setDelegate(new j50(this));
                g50Var2.setLayoutParams(new v4.p0(-1, -2));
                g50Var = g50Var2;
                break;
            case 4:
                g50Var = new o50(p50Var, context);
                break;
            case 5:
                pz pzVar2 = new pz(context, null);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(10);
                pzVar2.f38448x = false;
                pzVar2.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                pzVar = pzVar2;
                g50Var = pzVar;
                break;
            case 6:
                g50Var = new bn(context, 11);
                break;
            case 7:
                g50Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f36717a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                g50Var = frameLayout;
                break;
            case 9:
                g50Var = new m50(p50Var, context);
                break;
            default:
                g50Var = new org.telegram.ui.Cells.x3(context, p50Var.J0);
                break;
        }
        return i5.c.q(g50Var, g50Var, -1, -2);
    }
}
