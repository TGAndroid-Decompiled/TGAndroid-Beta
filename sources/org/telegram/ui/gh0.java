package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gh0 extends org.telegram.ui.Components.il0 {
    public final Context f38594c;
    public final hh0 d;

    public gh0(hh0 hh0Var, Context context) {
        this.d = hh0Var;
        this.f38594c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        hh0 hh0Var = this.d;
        if (hh0Var.M != b10 && hh0Var.f38936x != b10) {
            if (b10 < hh0Var.f38937y || b10 >= hh0Var.A) {
                if ((b10 < hh0Var.D || b10 >= hh0Var.E) && b10 != hh0Var.J) {
                    if (b10 >= hh0Var.Q && b10 < hh0Var.R) {
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
        return this.d.T;
    }

    @Override
    public final int j(int i10) {
        hh0 hh0Var = this.d;
        if (i10 == hh0Var.f38933r) {
            return 0;
        }
        if (i10 == hh0Var.f38934s || i10 == hh0Var.H || i10 == hh0Var.O || i10 == hh0Var.L) {
            return 1;
        }
        if (i10 == hh0Var.v) {
            return 2;
        }
        if (i10 == hh0Var.f38936x) {
            return 3;
        }
        if (i10 != hh0Var.f38935w && i10 != hh0Var.F && i10 != hh0Var.I && i10 != hh0Var.N && i10 != hh0Var.P) {
            if (i10 < hh0Var.f38937y || i10 >= hh0Var.A) {
                if (i10 >= hh0Var.D && i10 < hh0Var.E) {
                    return 5;
                }
                if (i10 == hh0Var.B) {
                    return 6;
                }
                if (i10 == hh0Var.G) {
                    return 7;
                }
                if (i10 == hh0Var.J) {
                    return 8;
                }
                if (i10 == hh0Var.K) {
                    return 9;
                }
                if (i10 != hh0Var.M) {
                    if (i10 < hh0Var.Q || i10 >= hh0Var.R) {
                        if (i10 != hh0Var.C) {
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
    public final void v(f2.n1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gh0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.r80 r80Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        hh0 hh0Var = this.d;
        Context context = this.f38594c;
        switch (i10) {
            case 1:
                r80Var = new org.telegram.ui.Cells.k4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r80 r80Var2 = new org.telegram.ui.Components.r80(this.f38594c, hh0Var, null, true, hh0Var.h);
                r80Var2.setPermanent(true);
                r80Var2.setDelegate(new fh0(this, r80Var2));
                r80Var = r80Var2;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                r80Var = new org.telegram.ui.Cells.e2(context, 64, c6Var);
                break;
            case 4:
                r80Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 5:
                r80Var = new eh0(hh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(9);
                p00Var.f31529w = false;
                r80Var = p00Var;
                break;
            case 7:
                r80Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
                y9Var.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                r80Var = y9Var;
                break;
            case 9:
                r80Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 10:
                r80Var = new org.telegram.ui.Cells.z4(8, 6, this.f38594c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                r80Var = new org.telegram.ui.Cells.y8(context, c6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new zg0(context), i7.f6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23120g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (hh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                r80Var = frameLayout;
                break;
        }
        return th.m(r80Var, r80Var, -1, -2);
    }
}
