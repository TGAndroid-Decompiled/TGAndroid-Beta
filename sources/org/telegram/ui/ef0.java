package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ef0 extends org.telegram.ui.Components.dk0 {
    public final Context f47251c;
    public final ff0 d;

    public ef0(ff0 ff0Var, Context context) {
        this.d = ff0Var;
        this.f47251c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59161a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ff0 ff0Var = this.d;
        if (ff0Var.R != b10 && ff0Var.f47715y != b10) {
            if (b10 < ff0Var.E || b10 >= ff0Var.F) {
                if ((b10 < ff0Var.I || b10 >= ff0Var.J) && b10 != ff0Var.O) {
                    if (b10 >= ff0Var.V && b10 < ff0Var.W) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.Y;
    }

    @Override
    public final int d(int i7) {
        ff0 ff0Var = this.d;
        if (i7 == ff0Var.f47707r) {
            return 0;
        }
        if (i7 == ff0Var.f47709s || i7 == ff0Var.M || i7 == ff0Var.T || i7 == ff0Var.Q) {
            return 1;
        }
        if (i7 == ff0Var.f47713w) {
            return 2;
        }
        if (i7 == ff0Var.f47715y) {
            return 3;
        }
        if (i7 != ff0Var.f47714x && i7 != ff0Var.K && i7 != ff0Var.N && i7 != ff0Var.S && i7 != ff0Var.U) {
            if (i7 < ff0Var.E || i7 >= ff0Var.F) {
                if (i7 >= ff0Var.I && i7 < ff0Var.J) {
                    return 5;
                }
                if (i7 == ff0Var.G) {
                    return 6;
                }
                if (i7 == ff0Var.L) {
                    return 7;
                }
                if (i7 == ff0Var.O) {
                    return 8;
                }
                if (i7 == ff0Var.P) {
                    return 9;
                }
                if (i7 != ff0Var.R) {
                    if (i7 < ff0Var.V || i7 >= ff0Var.W) {
                        if (i7 != ff0Var.H) {
                            return 1;
                        }
                        return 11;
                    }
                    return 10;
                }
                return 10;
            }
            return 5;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ef0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.g80 g80Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.Components.yz yzVar;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i10;
        ff0 ff0Var = this.d;
        Context context = this.f47251c;
        switch (i7) {
            case 1:
                g80Var = new org.telegram.ui.Cells.o4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.g80 g80Var2 = new org.telegram.ui.Components.g80(this.f47251c, ff0Var, null, true, ff0Var.h);
                g80Var2.setPermanent(true);
                g80Var2.setDelegate(new df0(this, g80Var2));
                g80Var = g80Var2;
                break;
            case 3:
                h6Var = ((org.telegram.ui.ActionBar.g2) ff0Var).resourceProvider;
                g80Var = new org.telegram.ui.Cells.j2(64, context, h6Var);
                break;
            case 4:
                g80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 5:
                g80Var = new cf0(ff0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.yz yzVar2 = new org.telegram.ui.Components.yz(context, null);
                yzVar2.setIsSingleCell(true);
                yzVar2.setViewType(9);
                yzVar2.f42613x = false;
                yzVar = yzVar2;
                g80Var = yzVar;
                break;
            case 7:
                g80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(org.telegram.messenger.gd.N0(2131751563, null), false);
                org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.f29599p7, null);
                yzVar = x9Var;
                g80Var = yzVar;
                break;
            case 9:
                g80Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                g80Var = new org.telegram.ui.Cells.b5(this.f47251c, 8, 6, false, null);
                break;
            case 11:
                h6Var2 = ((org.telegram.ui.ActionBar.g2) ff0Var).resourceProvider;
                g80Var = new org.telegram.ui.Cells.a9(context, h6Var2);
                break;
            default:
                FrameLayout t2Var = new bi.t2(context, 29);
                t2Var.addView(new ye0(context), c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29436g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ff0Var.h) {
                    i10 = 2131746676;
                } else {
                    i10 = 2131746677;
                }
                textView.setText(org.telegram.messenger.gd.N0(i10, null));
                t2Var.addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                t2Var.setTag(-33024);
                g80Var = t2Var;
                break;
        }
        return i5.c.q(g80Var, g80Var, -1, -2);
    }
}
