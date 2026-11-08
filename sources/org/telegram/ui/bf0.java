package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class bf0 extends org.telegram.ui.Components.oj0 {
    public final Context f44314c;
    public final cf0 d;

    public bf0(cf0 cf0Var, Context context) {
        this.d = cf0Var;
        this.f44314c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        cf0 cf0Var = this.d;
        if (cf0Var.Q != b10 && cf0Var.f44826y != b10) {
            if (b10 < cf0Var.D || b10 >= cf0Var.E) {
                if ((b10 < cf0Var.H || b10 >= cf0Var.I) && b10 != cf0Var.N) {
                    if (b10 >= cf0Var.U && b10 < cf0Var.V) {
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
    public final int b() {
        return this.d.X;
    }

    @Override
    public final int d(int i7) {
        cf0 cf0Var = this.d;
        if (i7 == cf0Var.f44819r) {
            return 0;
        }
        if (i7 == cf0Var.f44821s || i7 == cf0Var.L || i7 == cf0Var.S || i7 == cf0Var.P) {
            return 1;
        }
        if (i7 == cf0Var.f44824w) {
            return 2;
        }
        if (i7 == cf0Var.f44826y) {
            return 3;
        }
        if (i7 != cf0Var.f44825x && i7 != cf0Var.J && i7 != cf0Var.M && i7 != cf0Var.R && i7 != cf0Var.T) {
            if (i7 < cf0Var.D || i7 >= cf0Var.E) {
                if (i7 >= cf0Var.H && i7 < cf0Var.I) {
                    return 5;
                }
                if (i7 == cf0Var.F) {
                    return 6;
                }
                if (i7 == cf0Var.K) {
                    return 7;
                }
                if (i7 == cf0Var.N) {
                    return 8;
                }
                if (i7 == cf0Var.O) {
                    return 9;
                }
                if (i7 != cf0Var.Q) {
                    if (i7 < cf0Var.U || i7 >= cf0Var.V) {
                        if (i7 != cf0Var.G) {
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
    public final void t(v4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.q70 q70Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.mz mzVar;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        cf0 cf0Var = this.d;
        Context context = this.f44314c;
        switch (i7) {
            case 1:
                q70Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.q70 q70Var2 = new org.telegram.ui.Components.q70(this.f44314c, cf0Var, null, true, cf0Var.h);
                q70Var2.setPermanent(true);
                q70Var2.setDelegate(new af0(this, q70Var2));
                q70Var = q70Var2;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.f2) cf0Var).resourceProvider;
                q70Var = new org.telegram.ui.Cells.i2(64, context, f6Var);
                break;
            case 4:
                q70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                q70Var = new ze0(cf0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context, null);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(9);
                mzVar2.f36172x = false;
                mzVar = mzVar2;
                q70Var = mzVar;
                break;
            case 7:
                q70Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.id.M0(2131751576, null), false);
                org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28073p7, null);
                mzVar = w9Var;
                q70Var = mzVar;
                break;
            case 9:
                q70Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                q70Var = new org.telegram.ui.Cells.a5(this.f44314c, 8, 6, false, null);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.f2) cf0Var).resourceProvider;
                q70Var = new org.telegram.ui.Cells.z8(context, f6Var2);
                break;
            default:
                FrameLayout a4Var = new di.a4(context, 27);
                a4Var.addView(new ve0(context), c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27910g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (cf0Var.h) {
                    i10 = 2131746871;
                } else {
                    i10 = 2131746872;
                }
                textView.setText(org.telegram.messenger.id.M0(i10, null));
                a4Var.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                a4Var.setTag(-33024);
                q70Var = a4Var;
                break;
        }
        return jg.g.r(q70Var, q70Var, -1, -2);
    }
}
