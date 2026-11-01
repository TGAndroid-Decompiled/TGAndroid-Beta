package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class hg0 extends org.telegram.ui.Components.tk0 {
    public final Context f37812c;
    public final ig0 d;

    public hg0(ig0 ig0Var, Context context) {
        this.d = ig0Var;
        this.f37812c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ig0 ig0Var = this.d;
        if (ig0Var.Q != b10 && ig0Var.f38054y != b10) {
            if (b10 < ig0Var.D || b10 >= ig0Var.E) {
                if ((b10 < ig0Var.H || b10 >= ig0Var.I) && b10 != ig0Var.N) {
                    if (b10 >= ig0Var.U && b10 < ig0Var.V) {
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
        ig0 ig0Var = this.d;
        if (i10 == ig0Var.f38047r) {
            return 0;
        }
        if (i10 == ig0Var.f38049s || i10 == ig0Var.L || i10 == ig0Var.S || i10 == ig0Var.P) {
            return 1;
        }
        if (i10 == ig0Var.f38052w) {
            return 2;
        }
        if (i10 == ig0Var.f38054y) {
            return 3;
        }
        if (i10 != ig0Var.f38053x && i10 != ig0Var.J && i10 != ig0Var.M && i10 != ig0Var.R && i10 != ig0Var.T) {
            if (i10 < ig0Var.D || i10 >= ig0Var.E) {
                if (i10 >= ig0Var.H && i10 < ig0Var.I) {
                    return 5;
                }
                if (i10 == ig0Var.F) {
                    return 6;
                }
                if (i10 == ig0Var.K) {
                    return 7;
                }
                if (i10 == ig0Var.N) {
                    return 8;
                }
                if (i10 == ig0Var.O) {
                    return 9;
                }
                if (i10 != ig0Var.Q) {
                    if (i10 < ig0Var.U || i10 >= ig0Var.V) {
                        if (i10 != ig0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hg0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.j80 j80Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i11;
        ig0 ig0Var = this.d;
        Context context = this.f37812c;
        switch (i10) {
            case 1:
                j80Var = new org.telegram.ui.Cells.p4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.j80 j80Var2 = new org.telegram.ui.Components.j80(this.f37812c, ig0Var, null, true, ig0Var.h);
                j80Var2.setPermanent(true);
                j80Var2.setDelegate(new gg0(this, j80Var2));
                j80Var = j80Var2;
                break;
            case 3:
                p6Var = ((org.telegram.ui.ActionBar.k2) ig0Var).resourceProvider;
                j80Var = new org.telegram.ui.Cells.i2(64, context, p6Var);
                break;
            case 4:
                j80Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 5:
                j80Var = new fg0(ig0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(9);
                zzVar.f33280x = false;
                j80Var = zzVar;
                break;
            case 7:
                j80Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(org.telegram.messenger.dd.L0(2131751576, null), false);
                org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.f21154p7, null);
                j80Var = x9Var;
                break;
            case 9:
                j80Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 10:
                j80Var = new org.telegram.ui.Cells.e5(8, 6, this.f37812c, null, false);
                break;
            case 11:
                p6Var2 = ((org.telegram.ui.ActionBar.k2) ig0Var).resourceProvider;
                j80Var = new org.telegram.ui.Cells.b9(context, p6Var2);
                break;
            default:
                FrameLayout bg0Var = new bg0(context, 0);
                bg0Var.addView(new ag0(context), w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20989g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ig0Var.h) {
                    i11 = 2131746885;
                } else {
                    i11 = 2131746886;
                }
                textView.setText(org.telegram.messenger.dd.L0(i11, null));
                bg0Var.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                bg0Var.setTag(-33024);
                j80Var = bg0Var;
                break;
        }
        return sc.e.o(j80Var, j80Var, -1, -2);
    }
}
