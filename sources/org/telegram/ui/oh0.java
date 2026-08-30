package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oh0 extends org.telegram.ui.Components.rl0 {
    public final Context f36915c;
    public final ph0 d;

    public oh0(ph0 ph0Var, Context context) {
        this.d = ph0Var;
        this.f36915c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        ph0 ph0Var = this.d;
        if (ph0Var.N != b10 && ph0Var.f37341x != b10) {
            if (b10 < ph0Var.f37342y || b10 >= ph0Var.B) {
                if ((b10 < ph0Var.E || b10 >= ph0Var.F) && b10 != ph0Var.K) {
                    if (b10 >= ph0Var.R && b10 < ph0Var.S) {
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
        ph0 ph0Var = this.d;
        if (i10 == ph0Var.f37338r) {
            return 0;
        }
        if (i10 == ph0Var.f37339s || i10 == ph0Var.I || i10 == ph0Var.P || i10 == ph0Var.M) {
            return 1;
        }
        if (i10 == ph0Var.v) {
            return 2;
        }
        if (i10 == ph0Var.f37341x) {
            return 3;
        }
        if (i10 != ph0Var.f37340w && i10 != ph0Var.G && i10 != ph0Var.J && i10 != ph0Var.O && i10 != ph0Var.Q) {
            if (i10 < ph0Var.f37342y || i10 >= ph0Var.B) {
                if (i10 >= ph0Var.E && i10 < ph0Var.F) {
                    return 5;
                }
                if (i10 == ph0Var.C) {
                    return 6;
                }
                if (i10 == ph0Var.H) {
                    return 7;
                }
                if (i10 == ph0Var.K) {
                    return 8;
                }
                if (i10 == ph0Var.L) {
                    return 9;
                }
                if (i10 != ph0Var.N) {
                    if (i10 < ph0Var.R || i10 >= ph0Var.S) {
                        if (i10 != ph0Var.D) {
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
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oh0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.x80 x80Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        ph0 ph0Var = this.d;
        Context context = this.f36915c;
        switch (i10) {
            case 1:
                x80Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.x80 x80Var2 = new org.telegram.ui.Components.x80(this.f36915c, ph0Var, null, true, ph0Var.h);
                x80Var2.setPermanent(true);
                x80Var2.setDelegate(new nh0(this, x80Var2));
                x80Var = x80Var2;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.p2) ph0Var).resourceProvider;
                x80Var = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                x80Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 5:
                x80Var = new mh0(ph0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.f28855w = false;
                x80Var = t00Var;
                break;
            case 7:
                x80Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
                x80Var = aaVar;
                break;
            case 9:
                x80Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                x80Var = new org.telegram.ui.Cells.b5(8, 6, this.f36915c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) ph0Var).resourceProvider;
                x80Var = new org.telegram.ui.Cells.a9(context, f6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new hh0(context), k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19963g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ph0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                x80Var = frameLayout;
                break;
        }
        return yh.o(x80Var, x80Var, -1, -2);
    }
}
