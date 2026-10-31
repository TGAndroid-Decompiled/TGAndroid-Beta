package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class jg0 extends org.telegram.ui.Components.sk0 {
    public final Context f38523c;
    public final kg0 d;

    public jg0(kg0 kg0Var, Context context) {
        this.d = kg0Var;
        this.f38523c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        kg0 kg0Var = this.d;
        if (kg0Var.Q != b10 && kg0Var.f38822y != b10) {
            if (b10 < kg0Var.D || b10 >= kg0Var.E) {
                if ((b10 < kg0Var.H || b10 >= kg0Var.I) && b10 != kg0Var.N) {
                    if (b10 >= kg0Var.U && b10 < kg0Var.V) {
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
    public final int d(int i10) {
        kg0 kg0Var = this.d;
        if (i10 == kg0Var.f38815r) {
            return 0;
        }
        if (i10 == kg0Var.f38817s || i10 == kg0Var.L || i10 == kg0Var.S || i10 == kg0Var.P) {
            return 1;
        }
        if (i10 == kg0Var.f38820w) {
            return 2;
        }
        if (i10 == kg0Var.f38822y) {
            return 3;
        }
        if (i10 != kg0Var.f38821x && i10 != kg0Var.J && i10 != kg0Var.M && i10 != kg0Var.R && i10 != kg0Var.T) {
            if (i10 < kg0Var.D || i10 >= kg0Var.E) {
                if (i10 >= kg0Var.H && i10 < kg0Var.I) {
                    return 5;
                }
                if (i10 == kg0Var.F) {
                    return 6;
                }
                if (i10 == kg0Var.K) {
                    return 7;
                }
                if (i10 == kg0Var.N) {
                    return 8;
                }
                if (i10 == kg0Var.O) {
                    return 9;
                }
                if (i10 != kg0Var.Q) {
                    if (i10 < kg0Var.U || i10 >= kg0Var.V) {
                        if (i10 != kg0Var.G) {
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
    public final void t(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.j80 j80Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i11;
        kg0 kg0Var = this.d;
        Context context = this.f38523c;
        switch (i10) {
            case 1:
                j80Var = new org.telegram.ui.Cells.p4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.j80 j80Var2 = new org.telegram.ui.Components.j80(this.f38523c, kg0Var, null, true, kg0Var.h);
                j80Var2.setPermanent(true);
                j80Var2.setDelegate(new ig0(this, j80Var2));
                j80Var = j80Var2;
                break;
            case 3:
                p6Var = ((org.telegram.ui.ActionBar.k2) kg0Var).resourceProvider;
                j80Var = new org.telegram.ui.Cells.i2(64, context, p6Var);
                break;
            case 4:
                j80Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                j80Var = new hg0(kg0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(9);
                zzVar.f33274x = false;
                j80Var = zzVar;
                break;
            case 7:
                j80Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(org.telegram.messenger.cd.L0(2131751576, null), false);
                org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.f21153p7, null);
                j80Var = x9Var;
                break;
            case 9:
                j80Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 10:
                j80Var = new org.telegram.ui.Cells.e5(8, 6, this.f38523c, null, false);
                break;
            case 11:
                p6Var2 = ((org.telegram.ui.ActionBar.k2) kg0Var).resourceProvider;
                j80Var = new org.telegram.ui.Cells.b9(context, p6Var2);
                break;
            default:
                FrameLayout dg0Var = new dg0(context, 0);
                dg0Var.addView(new cg0(context), w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20988g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (kg0Var.h) {
                    i11 = 2131746885;
                } else {
                    i11 = 2131746886;
                }
                textView.setText(org.telegram.messenger.cd.L0(i11, null));
                dg0Var.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                dg0Var.setTag(-33024);
                j80Var = dg0Var;
                break;
        }
        return sc.e.o(j80Var, j80Var, -1, -2);
    }
}
