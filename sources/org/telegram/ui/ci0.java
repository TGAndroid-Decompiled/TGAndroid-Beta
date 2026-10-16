package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ci0 extends org.telegram.ui.Components.lm0 {
    public final Context f34671c;
    public final di0 d;

    public ci0(di0 di0Var, Context context) {
        this.d = di0Var;
        this.f34671c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        di0 di0Var = this.d;
        if (di0Var.Q != b10 && di0Var.f35057x != b10) {
            if (b10 < di0Var.f35058y || b10 >= di0Var.E) {
                if ((b10 < di0Var.H || b10 >= di0Var.I) && b10 != di0Var.N) {
                    if (b10 >= di0Var.U && b10 < di0Var.V) {
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
        di0 di0Var = this.d;
        if (i10 == di0Var.f35051r) {
            return 0;
        }
        if (i10 == di0Var.f35053s || i10 == di0Var.L || i10 == di0Var.S || i10 == di0Var.P) {
            return 1;
        }
        if (i10 == di0Var.v) {
            return 2;
        }
        if (i10 == di0Var.f35057x) {
            return 3;
        }
        if (i10 != di0Var.f35056w && i10 != di0Var.J && i10 != di0Var.M && i10 != di0Var.R && i10 != di0Var.T) {
            if (i10 < di0Var.f35058y || i10 >= di0Var.E) {
                if (i10 >= di0Var.H && i10 < di0Var.I) {
                    return 5;
                }
                if (i10 == di0Var.F) {
                    return 6;
                }
                if (i10 == di0Var.K) {
                    return 7;
                }
                if (i10 == di0Var.N) {
                    return 8;
                }
                if (i10 == di0Var.O) {
                    return 9;
                }
                if (i10 != di0Var.Q) {
                    if (i10 < di0Var.U || i10 >= di0Var.V) {
                        if (i10 != di0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.w90 w90Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        di0 di0Var = this.d;
        Context context = this.f34671c;
        switch (i10) {
            case 1:
                w90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.w90 w90Var2 = new org.telegram.ui.Components.w90(this.f34671c, di0Var, null, true, di0Var.h);
                w90Var2.setPermanent(true);
                w90Var2.setDelegate(new bi0(this, w90Var2));
                w90Var = w90Var2;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.m2) di0Var).resourceProvider;
                w90Var = new org.telegram.ui.Cells.g2(context, 64, c6Var);
                break;
            case 4:
                w90Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                w90Var = new ai0(di0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(9);
                f10Var.f24549w = false;
                w90Var = f10Var;
                break;
            case 7:
                w90Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19822p7, false));
                w90Var = caVar;
                break;
            case 9:
                w90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                w90Var = new org.telegram.ui.Cells.b5(8, 6, this.f34671c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.m2) di0Var).resourceProvider;
                w90Var = new org.telegram.ui.Cells.e9(context, c6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new vh0(context), w7.z5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19657g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (di0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.z5.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                frameLayout.setTag(-33024);
                w90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(w90Var, w90Var, -1, -2);
    }
}
