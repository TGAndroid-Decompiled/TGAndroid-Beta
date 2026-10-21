package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hh0 extends org.telegram.ui.Components.im0 {
    public final Context f37629c;
    public final ih0 d;

    public hh0(ih0 ih0Var, Context context) {
        this.d = ih0Var;
        this.f37629c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45917a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        ih0 ih0Var = this.d;
        if (ih0Var.Q != b10 && ih0Var.f38004x != b10) {
            if (b10 < ih0Var.f38005y || b10 >= ih0Var.E) {
                if ((b10 < ih0Var.H || b10 >= ih0Var.I) && b10 != ih0Var.N) {
                    if (b10 >= ih0Var.U && b10 < ih0Var.V) {
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
        ih0 ih0Var = this.d;
        if (i10 == ih0Var.f37998r) {
            return 0;
        }
        if (i10 == ih0Var.f38000s || i10 == ih0Var.L || i10 == ih0Var.S || i10 == ih0Var.P) {
            return 1;
        }
        if (i10 == ih0Var.v) {
            return 2;
        }
        if (i10 == ih0Var.f38004x) {
            return 3;
        }
        if (i10 != ih0Var.f38003w && i10 != ih0Var.J && i10 != ih0Var.M && i10 != ih0Var.R && i10 != ih0Var.T) {
            if (i10 < ih0Var.f38005y || i10 >= ih0Var.E) {
                if (i10 >= ih0Var.H && i10 < ih0Var.I) {
                    return 5;
                }
                if (i10 == ih0Var.F) {
                    return 6;
                }
                if (i10 == ih0Var.K) {
                    return 7;
                }
                if (i10 == ih0Var.N) {
                    return 8;
                }
                if (i10 == ih0Var.O) {
                    return 9;
                }
                if (i10 != ih0Var.Q) {
                    if (i10 < ih0Var.U || i10 >= ih0Var.V) {
                        if (i10 != ih0Var.G) {
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
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.q90 q90Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        ih0 ih0Var = this.d;
        Context context = this.f37629c;
        switch (i10) {
            case 1:
                q90Var = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.q90 q90Var2 = new org.telegram.ui.Components.q90(this.f37629c, ih0Var, null, true, ih0Var.h);
                q90Var2.setPermanent(true);
                q90Var2.setDelegate(new gh0(this, q90Var2));
                q90Var = q90Var2;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.n2) ih0Var).resourceProvider;
                q90Var = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                q90Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                q90Var = new fh0(ih0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(9);
                b10Var.f24774w = false;
                q90Var = b10Var;
                break;
            case 7:
                q90Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                q90Var = baVar;
                break;
            case 9:
                q90Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 10:
                q90Var = new org.telegram.ui.Cells.a5(8, 6, this.f37629c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.n2) ih0Var).resourceProvider;
                q90Var = new org.telegram.ui.Cells.d9(context, d6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new ah0(context), w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21046g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ih0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                q90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(q90Var, q90Var, -1, -2);
    }
}
