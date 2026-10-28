package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kh0 extends org.telegram.ui.Components.mm0 {
    public final Context f40804c;
    public final lh0 d;

    public kh0(lh0 lh0Var, Context context) {
        this.d = lh0Var;
        this.f40804c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        lh0 lh0Var = this.d;
        if (lh0Var.Q != b10 && lh0Var.f41188x != b10) {
            if (b10 < lh0Var.f41189y || b10 >= lh0Var.E) {
                if ((b10 < lh0Var.H || b10 >= lh0Var.I) && b10 != lh0Var.N) {
                    if (b10 >= lh0Var.U && b10 < lh0Var.V) {
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
        lh0 lh0Var = this.d;
        if (i10 == lh0Var.f41182r) {
            return 0;
        }
        if (i10 == lh0Var.f41184s || i10 == lh0Var.L || i10 == lh0Var.S || i10 == lh0Var.P) {
            return 1;
        }
        if (i10 == lh0Var.v) {
            return 2;
        }
        if (i10 == lh0Var.f41188x) {
            return 3;
        }
        if (i10 != lh0Var.f41187w && i10 != lh0Var.J && i10 != lh0Var.M && i10 != lh0Var.R && i10 != lh0Var.T) {
            if (i10 < lh0Var.f41189y || i10 >= lh0Var.E) {
                if (i10 >= lh0Var.H && i10 < lh0Var.I) {
                    return 5;
                }
                if (i10 == lh0Var.F) {
                    return 6;
                }
                if (i10 == lh0Var.K) {
                    return 7;
                }
                if (i10 == lh0Var.N) {
                    return 8;
                }
                if (i10 == lh0Var.O) {
                    return 9;
                }
                if (i10 != lh0Var.Q) {
                    if (i10 < lh0Var.U || i10 >= lh0Var.V) {
                        if (i10 != lh0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.s90 s90Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.c10 c10Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i11;
        lh0 lh0Var = this.d;
        Context context = this.f40804c;
        switch (i10) {
            case 1:
                s90Var = new org.telegram.ui.Cells.q4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.s90 s90Var2 = new org.telegram.ui.Components.s90(this.f40804c, lh0Var, null, true, lh0Var.h);
                s90Var2.setPermanent(true);
                s90Var2.setDelegate(new jh0(this, s90Var2));
                s90Var = s90Var2;
                break;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.r2) lh0Var).resourceProvider;
                s90Var = new org.telegram.ui.Cells.e2(context, 64, u6Var);
                break;
            case 4:
                s90Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 5:
                s90Var = new ih0(lh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context, null);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(9);
                c10Var2.f27026w = false;
                c10Var = c10Var2;
                s90Var = c10Var;
                break;
            case 7:
                s90Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 8:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.f23582p7, null);
                c10Var = gaVar;
                s90Var = c10Var;
                break;
            case 9:
                s90Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 10:
                s90Var = new org.telegram.ui.Cells.f5(8, 6, this.f40804c, null, false);
                break;
            case 11:
                u6Var2 = ((org.telegram.ui.ActionBar.r2) lh0Var).resourceProvider;
                s90Var = new org.telegram.ui.Cells.i9(context, u6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new dh0(context), org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23415g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (lh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                s90Var = frameLayout;
                break;
        }
        return ic.a.n(s90Var, s90Var, -1, -2);
    }
}
