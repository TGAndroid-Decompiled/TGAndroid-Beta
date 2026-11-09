package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class df0 extends org.telegram.ui.Components.pj0 {
    public final Context f44944c;
    public final ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.f44944c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        ef0 ef0Var = this.d;
        if (ef0Var.Q != b10 && ef0Var.f45434y != b10) {
            if (b10 < ef0Var.D || b10 >= ef0Var.E) {
                if ((b10 < ef0Var.H || b10 >= ef0Var.I) && b10 != ef0Var.N) {
                    if (b10 >= ef0Var.U && b10 < ef0Var.V) {
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
        ef0 ef0Var = this.d;
        if (i7 == ef0Var.f45427r) {
            return 0;
        }
        if (i7 == ef0Var.f45429s || i7 == ef0Var.L || i7 == ef0Var.S || i7 == ef0Var.P) {
            return 1;
        }
        if (i7 == ef0Var.f45432w) {
            return 2;
        }
        if (i7 == ef0Var.f45434y) {
            return 3;
        }
        if (i7 != ef0Var.f45433x && i7 != ef0Var.J && i7 != ef0Var.M && i7 != ef0Var.R && i7 != ef0Var.T) {
            if (i7 < ef0Var.D || i7 >= ef0Var.E) {
                if (i7 >= ef0Var.H && i7 < ef0Var.I) {
                    return 5;
                }
                if (i7 == ef0Var.F) {
                    return 6;
                }
                if (i7 == ef0Var.K) {
                    return 7;
                }
                if (i7 == ef0Var.N) {
                    return 8;
                }
                if (i7 == ef0Var.O) {
                    return 9;
                }
                if (i7 != ef0Var.Q) {
                    if (i7 < ef0Var.U || i7 >= ef0Var.V) {
                        if (i7 != ef0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.df0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.r70 r70Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.mz mzVar;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        ef0 ef0Var = this.d;
        Context context = this.f44944c;
        switch (i7) {
            case 1:
                r70Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r70 r70Var2 = new org.telegram.ui.Components.r70(this.f44944c, ef0Var, null, true, ef0Var.h);
                r70Var2.setPermanent(true);
                r70Var2.setDelegate(new cf0(this, r70Var2));
                r70Var = r70Var2;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.f2) ef0Var).resourceProvider;
                r70Var = new org.telegram.ui.Cells.i2(64, context, g6Var);
                break;
            case 4:
                r70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                r70Var = new bf0(ef0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context, null);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(9);
                mzVar2.f36181x = false;
                mzVar = mzVar2;
                r70Var = mzVar;
                break;
            case 7:
                r70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.id.M0(2131751575, null), false);
                org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.f28086p7, null);
                mzVar = w9Var;
                r70Var = mzVar;
                break;
            case 9:
                r70Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                r70Var = new org.telegram.ui.Cells.a5(this.f44944c, 8, 6, false, null);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.f2) ef0Var).resourceProvider;
                r70Var = new org.telegram.ui.Cells.z8(context, g6Var2);
                break;
            default:
                FrameLayout b4Var = new di.b4(context, 27);
                b4Var.addView(new xe0(context), c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27923g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ef0Var.h) {
                    i10 = 2131746870;
                } else {
                    i10 = 2131746871;
                }
                textView.setText(org.telegram.messenger.id.M0(i10, null));
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                b4Var.setTag(-33024);
                r70Var = b4Var;
                break;
        }
        return jg.g.r(r70Var, r70Var, -1, -2);
    }
}
