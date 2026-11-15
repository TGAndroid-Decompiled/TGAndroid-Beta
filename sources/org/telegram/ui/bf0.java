package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class bf0 extends org.telegram.ui.Components.tj0 {
    public final Context f45702c;
    public final cf0 d;

    public bf0(cf0 cf0Var, Context context) {
        this.d = cf0Var;
        this.f45702c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        cf0 cf0Var = this.d;
        if (cf0Var.R != b10 && cf0Var.f46143y != b10) {
            if (b10 < cf0Var.E || b10 >= cf0Var.F) {
                if ((b10 < cf0Var.I || b10 >= cf0Var.J) && b10 != cf0Var.O) {
                    if (b10 >= cf0Var.V && b10 < cf0Var.W) {
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
        cf0 cf0Var = this.d;
        if (i7 == cf0Var.f46135r) {
            return 0;
        }
        if (i7 == cf0Var.f46137s || i7 == cf0Var.M || i7 == cf0Var.T || i7 == cf0Var.Q) {
            return 1;
        }
        if (i7 == cf0Var.f46141w) {
            return 2;
        }
        if (i7 == cf0Var.f46143y) {
            return 3;
        }
        if (i7 != cf0Var.f46142x && i7 != cf0Var.K && i7 != cf0Var.N && i7 != cf0Var.S && i7 != cf0Var.U) {
            if (i7 < cf0Var.E || i7 >= cf0Var.F) {
                if (i7 >= cf0Var.I && i7 < cf0Var.J) {
                    return 5;
                }
                if (i7 == cf0Var.G) {
                    return 6;
                }
                if (i7 == cf0Var.L) {
                    return 7;
                }
                if (i7 == cf0Var.O) {
                    return 8;
                }
                if (i7 == cf0Var.P) {
                    return 9;
                }
                if (i7 != cf0Var.R) {
                    if (i7 < cf0Var.V || i7 >= cf0Var.W) {
                        if (i7 != cf0Var.H) {
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
    public final void t(v4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.t70 t70Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.pz pzVar;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        cf0 cf0Var = this.d;
        Context context = this.f45702c;
        switch (i7) {
            case 1:
                t70Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.t70 t70Var2 = new org.telegram.ui.Components.t70(this.f45702c, cf0Var, null, true, cf0Var.h);
                t70Var2.setPermanent(true);
                t70Var2.setDelegate(new af0(this, t70Var2));
                t70Var = t70Var2;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.e2) cf0Var).resourceProvider;
                t70Var = new org.telegram.ui.Cells.i2(64, context, e6Var);
                break;
            case 4:
                t70Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 5:
                t70Var = new ze0(cf0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.pz pzVar2 = new org.telegram.ui.Components.pz(context, null);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(9);
                pzVar2.f38448x = false;
                pzVar = pzVar2;
                t70Var = pzVar;
                break;
            case 7:
                t70Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 8:
                org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                v9Var.b(org.telegram.messenger.hd.M0(2131751575, null), false);
                org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.f29070p7, null);
                pzVar = v9Var;
                t70Var = pzVar;
                break;
            case 9:
                t70Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 10:
                t70Var = new org.telegram.ui.Cells.a5(this.f45702c, 8, 6, false, null);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.e2) cf0Var).resourceProvider;
                t70Var = new org.telegram.ui.Cells.y8(context, e6Var2);
                break;
            default:
                FrameLayout v1Var = new bi.v1(context, 29);
                v1Var.addView(new ve0(context), c8.ja.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28907g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (cf0Var.h) {
                    i10 = 2131746870;
                } else {
                    i10 = 2131746871;
                }
                textView.setText(org.telegram.messenger.hd.M0(i10, null));
                v1Var.addView(textView, c8.ja.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                v1Var.setTag(-33024);
                t70Var = v1Var;
                break;
        }
        return i5.c.q(t70Var, t70Var, -1, -2);
    }
}
