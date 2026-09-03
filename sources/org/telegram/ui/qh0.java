package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qh0 extends org.telegram.ui.Components.ql0 {
    public final Context f37419c;
    public final rh0 d;

    public qh0(rh0 rh0Var, Context context) {
        this.d = rh0Var;
        this.f37419c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        rh0 rh0Var = this.d;
        if (rh0Var.N != b10 && rh0Var.f37866x != b10) {
            if (b10 < rh0Var.f37867y || b10 >= rh0Var.B) {
                if ((b10 < rh0Var.E || b10 >= rh0Var.F) && b10 != rh0Var.K) {
                    if (b10 >= rh0Var.R && b10 < rh0Var.S) {
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
        rh0 rh0Var = this.d;
        if (i10 == rh0Var.f37863r) {
            return 0;
        }
        if (i10 == rh0Var.f37864s || i10 == rh0Var.I || i10 == rh0Var.P || i10 == rh0Var.M) {
            return 1;
        }
        if (i10 == rh0Var.v) {
            return 2;
        }
        if (i10 == rh0Var.f37866x) {
            return 3;
        }
        if (i10 != rh0Var.f37865w && i10 != rh0Var.G && i10 != rh0Var.J && i10 != rh0Var.O && i10 != rh0Var.Q) {
            if (i10 < rh0Var.f37867y || i10 >= rh0Var.B) {
                if (i10 >= rh0Var.E && i10 < rh0Var.F) {
                    return 5;
                }
                if (i10 == rh0Var.C) {
                    return 6;
                }
                if (i10 == rh0Var.H) {
                    return 7;
                }
                if (i10 == rh0Var.K) {
                    return 8;
                }
                if (i10 == rh0Var.L) {
                    return 9;
                }
                if (i10 != rh0Var.N) {
                    if (i10 < rh0Var.R || i10 >= rh0Var.S) {
                        if (i10 != rh0Var.D) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.x80 x80Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        rh0 rh0Var = this.d;
        Context context = this.f37419c;
        switch (i10) {
            case 1:
                x80Var = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.x80 x80Var2 = new org.telegram.ui.Components.x80(this.f37419c, rh0Var, null, true, rh0Var.h);
                x80Var2.setPermanent(true);
                x80Var2.setDelegate(new ph0(this, x80Var2));
                x80Var = x80Var2;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.p2) rh0Var).resourceProvider;
                x80Var = new org.telegram.ui.Cells.e2(context, 64, f6Var);
                break;
            case 4:
                x80Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 5:
                x80Var = new oh0(rh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.f29071w = false;
                x80Var = u00Var;
                break;
            case 7:
                x80Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context);
                z9Var.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
                x80Var = z9Var;
                break;
            case 9:
                x80Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                x80Var = new org.telegram.ui.Cells.a5(8, 6, this.f37419c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) rh0Var).resourceProvider;
                x80Var = new org.telegram.ui.Cells.z8(context, f6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new jh0(context), k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19938g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (rh0Var.h) {
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
        return ai.n(x80Var, x80Var, -1, -2);
    }
}
