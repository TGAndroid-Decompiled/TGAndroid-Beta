package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ph0 extends org.telegram.ui.Components.sl0 {
    public final Context f40043c;
    public final qh0 d;

    public ph0(qh0 qh0Var, Context context) {
        this.d = qh0Var;
        this.f40043c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        qh0 qh0Var = this.d;
        if (qh0Var.N != b10 && qh0Var.f40525x != b10) {
            if (b10 < qh0Var.f40526y || b10 >= qh0Var.B) {
                if ((b10 < qh0Var.E || b10 >= qh0Var.F) && b10 != qh0Var.K) {
                    if (b10 >= qh0Var.R && b10 < qh0Var.S) {
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
        return this.d.U;
    }

    @Override
    public final int j(int i10) {
        qh0 qh0Var = this.d;
        if (i10 == qh0Var.f40522r) {
            return 0;
        }
        if (i10 == qh0Var.f40523s || i10 == qh0Var.I || i10 == qh0Var.P || i10 == qh0Var.M) {
            return 1;
        }
        if (i10 == qh0Var.v) {
            return 2;
        }
        if (i10 == qh0Var.f40525x) {
            return 3;
        }
        if (i10 != qh0Var.f40524w && i10 != qh0Var.G && i10 != qh0Var.J && i10 != qh0Var.O && i10 != qh0Var.Q) {
            if (i10 < qh0Var.f40526y || i10 >= qh0Var.B) {
                if (i10 >= qh0Var.E && i10 < qh0Var.F) {
                    return 5;
                }
                if (i10 == qh0Var.C) {
                    return 6;
                }
                if (i10 == qh0Var.H) {
                    return 7;
                }
                if (i10 == qh0Var.K) {
                    return 8;
                }
                if (i10 == qh0Var.L) {
                    return 9;
                }
                if (i10 != qh0Var.N) {
                    if (i10 < qh0Var.R || i10 >= qh0Var.S) {
                        if (i10 != qh0Var.D) {
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
    public final void v(f2.m1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.y80 y80Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        qh0 qh0Var = this.d;
        Context context = this.f40043c;
        switch (i10) {
            case 1:
                y80Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.y80 y80Var2 = new org.telegram.ui.Components.y80(this.f40043c, qh0Var, null, true, qh0Var.h);
                y80Var2.setPermanent(true);
                y80Var2.setDelegate(new oh0(this, y80Var2));
                y80Var = y80Var2;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.p2) qh0Var).resourceProvider;
                y80Var = new org.telegram.ui.Cells.f2(context, 64, g6Var);
                break;
            case 4:
                y80Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 5:
                y80Var = new nh0(qh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.f31509w = false;
                y80Var = u00Var;
                break;
            case 7:
                y80Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                y80Var = aaVar;
                break;
            case 9:
                y80Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                y80Var = new org.telegram.ui.Cells.b5(8, 6, this.f40043c, null, false);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.p2) qh0Var).resourceProvider;
                y80Var = new org.telegram.ui.Cells.a9(context, g6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new ih0(context), k7.c6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21717g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (qh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                y80Var = frameLayout;
                break;
        }
        return yh.o(y80Var, y80Var, -1, -2);
    }
}
