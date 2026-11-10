package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ef0 extends org.telegram.ui.Components.oj0 {
    public final Context f45264c;
    public final ff0 d;

    public ef0(ff0 ff0Var, Context context) {
        this.d = ff0Var;
        this.f45264c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        ff0 ff0Var = this.d;
        if (ff0Var.Q != b10 && ff0Var.f45758y != b10) {
            if (b10 < ff0Var.D || b10 >= ff0Var.E) {
                if ((b10 < ff0Var.H || b10 >= ff0Var.I) && b10 != ff0Var.N) {
                    if (b10 >= ff0Var.U && b10 < ff0Var.V) {
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
        return this.d.X;
    }

    @Override
    public final int d(int i7) {
        ff0 ff0Var = this.d;
        if (i7 == ff0Var.f45751r) {
            return 0;
        }
        if (i7 == ff0Var.f45753s || i7 == ff0Var.L || i7 == ff0Var.S || i7 == ff0Var.P) {
            return 1;
        }
        if (i7 == ff0Var.f45756w) {
            return 2;
        }
        if (i7 == ff0Var.f45758y) {
            return 3;
        }
        if (i7 != ff0Var.f45757x && i7 != ff0Var.J && i7 != ff0Var.M && i7 != ff0Var.R && i7 != ff0Var.T) {
            if (i7 < ff0Var.D || i7 >= ff0Var.E) {
                if (i7 >= ff0Var.H && i7 < ff0Var.I) {
                    return 5;
                }
                if (i7 == ff0Var.F) {
                    return 6;
                }
                if (i7 == ff0Var.K) {
                    return 7;
                }
                if (i7 == ff0Var.N) {
                    return 8;
                }
                if (i7 == ff0Var.O) {
                    return 9;
                }
                if (i7 != ff0Var.Q) {
                    if (i7 < ff0Var.U || i7 >= ff0Var.V) {
                        if (i7 != ff0Var.G) {
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
    public final void t(v4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ef0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.q70 q70Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.Components.lz lzVar;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i10;
        ff0 ff0Var = this.d;
        Context context = this.f45264c;
        switch (i7) {
            case 1:
                q70Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.q70 q70Var2 = new org.telegram.ui.Components.q70(this.f45264c, ff0Var, null, true, ff0Var.h);
                q70Var2.setPermanent(true);
                q70Var2.setDelegate(new df0(this, q70Var2));
                q70Var = q70Var2;
                break;
            case 3:
                h6Var = ((org.telegram.ui.ActionBar.f2) ff0Var).resourceProvider;
                q70Var = new org.telegram.ui.Cells.i2(64, context, h6Var);
                break;
            case 4:
                q70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                q70Var = new cf0(ff0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.lz lzVar2 = new org.telegram.ui.Components.lz(context, null);
                lzVar2.setIsSingleCell(true);
                lzVar2.setViewType(9);
                lzVar2.f35774x = false;
                lzVar = lzVar2;
                q70Var = lzVar;
                break;
            case 7:
                q70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.id.M0(2131751575, null), false);
                org.telegram.ui.ActionBar.t6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.m6.f28111p7, null);
                lzVar = w9Var;
                q70Var = lzVar;
                break;
            case 9:
                q70Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                q70Var = new org.telegram.ui.Cells.a5(this.f45264c, 8, 6, false, null);
                break;
            case 11:
                h6Var2 = ((org.telegram.ui.ActionBar.f2) ff0Var).resourceProvider;
                q70Var = new org.telegram.ui.Cells.z8(context, h6Var2);
                break;
            default:
                FrameLayout b4Var = new di.b4(context, 27);
                b4Var.addView(new ye0(context), c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27948g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ff0Var.h) {
                    i10 = 2131746870;
                } else {
                    i10 = 2131746871;
                }
                textView.setText(org.telegram.messenger.id.M0(i10, null));
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                b4Var.setTag(-33024);
                q70Var = b4Var;
                break;
        }
        return jg.g.r(q70Var, q70Var, -1, -2);
    }
}
