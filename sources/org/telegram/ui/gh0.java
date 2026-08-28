package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gh0 extends org.telegram.ui.Components.vk0 {
    public final Context f38552c;
    public final hh0 d;

    public gh0(hh0 hh0Var, Context context) {
        this.d = hh0Var;
        this.f38552c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        hh0 hh0Var = this.d;
        if (hh0Var.M != b10 && hh0Var.f38815x != b10) {
            if (b10 < hh0Var.f38816y || b10 >= hh0Var.A) {
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
    public final int j(int i9) {
        hh0 hh0Var = this.d;
        if (i9 == hh0Var.f38812r) {
            return 0;
        }
        if (i9 == hh0Var.f38813s || i9 == hh0Var.H || i9 == hh0Var.O || i9 == hh0Var.L) {
            return 1;
        }
        if (i9 == hh0Var.v) {
            return 2;
        }
        if (i9 == hh0Var.f38815x) {
            return 3;
        }
        if (i9 != hh0Var.f38814w && i9 != hh0Var.F && i9 != hh0Var.I && i9 != hh0Var.N && i9 != hh0Var.P) {
            if (i9 < hh0Var.f38816y || i9 >= hh0Var.A) {
                if (i9 >= hh0Var.D && i9 < hh0Var.E) {
                    return 5;
                }
                if (i9 == hh0Var.B) {
                    return 6;
                }
                if (i9 == hh0Var.G) {
                    return 7;
                }
                if (i9 == hh0Var.J) {
                    return 8;
                }
                if (i9 == hh0Var.K) {
                    return 9;
                }
                if (i9 != hh0Var.M) {
                    if (i9 < hh0Var.Q || i9 >= hh0Var.R) {
                        if (i9 != hh0Var.C) {
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
    public final void v(f2.q1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gh0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Components.e80 e80Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i10;
        hh0 hh0Var = this.d;
        Context context = this.f38552c;
        switch (i9) {
            case 1:
                e80Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.e80 e80Var2 = new org.telegram.ui.Components.e80(this.f38552c, hh0Var, null, true, hh0Var.h);
                e80Var2.setPermanent(true);
                e80Var2.setDelegate(new fh0(this, e80Var2));
                e80Var = e80Var2;
                break;
            case 3:
                b6Var = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.f2(context, 64, b6Var);
                break;
            case 4:
                e80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 5:
                e80Var = new eh0(hh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(9);
                e00Var.f27885w = false;
                e80Var = e00Var;
                break;
            case 7:
                e80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                e80Var = baVar;
                break;
            case 9:
                e80Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 10:
                e80Var = new org.telegram.ui.Cells.b5(8, 6, this.f38552c, null, false);
                break;
            case 11:
                b6Var2 = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.b9(context, b6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new zg0(context), g7.e6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23058g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (hh0Var.h) {
                    i10 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i10 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i10));
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                e80Var = frameLayout;
                break;
        }
        return j3.r0.s(e80Var, e80Var, -1, -2);
    }
}
