package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class di0 extends org.telegram.ui.Components.lm0 {
    public final Context f35267c;
    public final ei0 d;

    public di0(ei0 ei0Var, Context context) {
        this.d = ei0Var;
        this.f35267c = context;
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
        ei0 ei0Var = this.d;
        if (ei0Var.Q != b10 && ei0Var.f35611x != b10) {
            if (b10 < ei0Var.f35612y || b10 >= ei0Var.E) {
                if ((b10 < ei0Var.H || b10 >= ei0Var.I) && b10 != ei0Var.N) {
                    if (b10 >= ei0Var.U && b10 < ei0Var.V) {
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
        ei0 ei0Var = this.d;
        if (i10 == ei0Var.f35605r) {
            return 0;
        }
        if (i10 == ei0Var.f35607s || i10 == ei0Var.L || i10 == ei0Var.S || i10 == ei0Var.P) {
            return 1;
        }
        if (i10 == ei0Var.v) {
            return 2;
        }
        if (i10 == ei0Var.f35611x) {
            return 3;
        }
        if (i10 != ei0Var.f35610w && i10 != ei0Var.J && i10 != ei0Var.M && i10 != ei0Var.R && i10 != ei0Var.T) {
            if (i10 < ei0Var.f35612y || i10 >= ei0Var.E) {
                if (i10 >= ei0Var.H && i10 < ei0Var.I) {
                    return 5;
                }
                if (i10 == ei0Var.F) {
                    return 6;
                }
                if (i10 == ei0Var.K) {
                    return 7;
                }
                if (i10 == ei0Var.N) {
                    return 8;
                }
                if (i10 == ei0Var.O) {
                    return 9;
                }
                if (i10 != ei0Var.Q) {
                    if (i10 < ei0Var.U || i10 >= ei0Var.V) {
                        if (i10 != ei0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.di0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.w90 w90Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        ei0 ei0Var = this.d;
        Context context = this.f35267c;
        switch (i10) {
            case 1:
                w90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.w90 w90Var2 = new org.telegram.ui.Components.w90(this.f35267c, ei0Var, null, true, ei0Var.h);
                w90Var2.setPermanent(true);
                w90Var2.setDelegate(new ci0(this, w90Var2));
                w90Var = w90Var2;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.m2) ei0Var).resourceProvider;
                w90Var = new org.telegram.ui.Cells.g2(context, 64, c6Var);
                break;
            case 4:
                w90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 5:
                w90Var = new bi0(ei0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(9);
                f10Var.f24856w = false;
                w90Var = f10Var;
                break;
            case 7:
                w90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
                w90Var = caVar;
                break;
            case 9:
                w90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                w90Var = new org.telegram.ui.Cells.b5(8, 6, this.f35267c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.m2) ei0Var).resourceProvider;
                w90Var = new org.telegram.ui.Cells.e9(context, c6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new wh0(context), w7.a6.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19957g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ei0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.a6.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                frameLayout.setTag(-33024);
                w90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(w90Var, w90Var, -1, -2);
    }
}
