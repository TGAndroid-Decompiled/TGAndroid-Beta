package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ih0 extends org.telegram.ui.Components.lm0 {
    public final Context f40246c;
    public final jh0 d;

    public ih0(jh0 jh0Var, Context context) {
        this.d = jh0Var;
        this.f40246c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        jh0 jh0Var = this.d;
        if (jh0Var.Q != b10 && jh0Var.f40669x != b10) {
            if (b10 < jh0Var.f40670y || b10 >= jh0Var.E) {
                if ((b10 < jh0Var.H || b10 >= jh0Var.I) && b10 != jh0Var.N) {
                    if (b10 >= jh0Var.U && b10 < jh0Var.V) {
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
    public final int h() {
        return this.d.X;
    }

    @Override
    public final int j(int i10) {
        jh0 jh0Var = this.d;
        if (i10 == jh0Var.f40663r) {
            return 0;
        }
        if (i10 == jh0Var.f40665s || i10 == jh0Var.L || i10 == jh0Var.S || i10 == jh0Var.P) {
            return 1;
        }
        if (i10 == jh0Var.v) {
            return 2;
        }
        if (i10 == jh0Var.f40669x) {
            return 3;
        }
        if (i10 != jh0Var.f40668w && i10 != jh0Var.J && i10 != jh0Var.M && i10 != jh0Var.R && i10 != jh0Var.T) {
            if (i10 < jh0Var.f40670y || i10 >= jh0Var.E) {
                if (i10 >= jh0Var.H && i10 < jh0Var.I) {
                    return 5;
                }
                if (i10 == jh0Var.F) {
                    return 6;
                }
                if (i10 == jh0Var.K) {
                    return 7;
                }
                if (i10 == jh0Var.N) {
                    return 8;
                }
                if (i10 == jh0Var.O) {
                    return 9;
                }
                if (i10 != jh0Var.Q) {
                    if (i10 < jh0Var.U || i10 >= jh0Var.V) {
                        if (i10 != jh0Var.G) {
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
    public final void v(s4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ih0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.r90 r90Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.c10 c10Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i11;
        jh0 jh0Var = this.d;
        Context context = this.f40246c;
        switch (i10) {
            case 1:
                r90Var = new org.telegram.ui.Cells.q4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r90 r90Var2 = new org.telegram.ui.Components.r90(this.f40246c, jh0Var, null, true, jh0Var.h);
                r90Var2.setPermanent(true);
                r90Var2.setDelegate(new hh0(this, r90Var2));
                r90Var = r90Var2;
                break;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.r2) jh0Var).resourceProvider;
                r90Var = new org.telegram.ui.Cells.e2(context, 64, u6Var);
                break;
            case 4:
                r90Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 5:
                r90Var = new gh0(jh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context, null);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(9);
                c10Var2.f27029w = false;
                c10Var = c10Var2;
                r90Var = c10Var;
                break;
            case 7:
                r90Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 8:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.f23579p7, null);
                c10Var = gaVar;
                r90Var = c10Var;
                break;
            case 9:
                r90Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 10:
                r90Var = new org.telegram.ui.Cells.f5(8, 6, this.f40246c, null, false);
                break;
            case 11:
                u6Var2 = ((org.telegram.ui.ActionBar.r2) jh0Var).resourceProvider;
                r90Var = new org.telegram.ui.Cells.i9(context, u6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new bh0(context), org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23412g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (jh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                r90Var = frameLayout;
                break;
        }
        return ic.a.n(r90Var, r90Var, -1, -2);
    }
}
