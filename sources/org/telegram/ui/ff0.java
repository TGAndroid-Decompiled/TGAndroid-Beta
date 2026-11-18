package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ff0 extends org.telegram.ui.Components.bk0 {
    public final Context f47614c;
    public final gf0 d;

    public ff0(gf0 gf0Var, Context context) {
        this.d = gf0Var;
        this.f47614c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        gf0 gf0Var = this.d;
        if (gf0Var.R != b10 && gf0Var.f48028y != b10) {
            if (b10 < gf0Var.E || b10 >= gf0Var.F) {
                if ((b10 < gf0Var.I || b10 >= gf0Var.J) && b10 != gf0Var.O) {
                    if (b10 >= gf0Var.V && b10 < gf0Var.W) {
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
        return this.d.Y;
    }

    @Override
    public final int d(int i7) {
        gf0 gf0Var = this.d;
        if (i7 == gf0Var.f48020r) {
            return 0;
        }
        if (i7 == gf0Var.f48022s || i7 == gf0Var.M || i7 == gf0Var.T || i7 == gf0Var.Q) {
            return 1;
        }
        if (i7 == gf0Var.f48026w) {
            return 2;
        }
        if (i7 == gf0Var.f48028y) {
            return 3;
        }
        if (i7 != gf0Var.f48027x && i7 != gf0Var.K && i7 != gf0Var.N && i7 != gf0Var.S && i7 != gf0Var.U) {
            if (i7 < gf0Var.E || i7 >= gf0Var.F) {
                if (i7 >= gf0Var.I && i7 < gf0Var.J) {
                    return 5;
                }
                if (i7 == gf0Var.G) {
                    return 6;
                }
                if (i7 == gf0Var.L) {
                    return 7;
                }
                if (i7 == gf0Var.O) {
                    return 8;
                }
                if (i7 == gf0Var.P) {
                    return 9;
                }
                if (i7 != gf0Var.R) {
                    if (i7 < gf0Var.V || i7 >= gf0Var.W) {
                        if (i7 != gf0Var.H) {
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
    public final void t(v4.f1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.e80 e80Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.wz wzVar;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i10;
        gf0 gf0Var = this.d;
        Context context = this.f47614c;
        switch (i7) {
            case 1:
                e80Var = new org.telegram.ui.Cells.o4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.e80 e80Var2 = new org.telegram.ui.Components.e80(this.f47614c, gf0Var, null, true, gf0Var.h);
                e80Var2.setPermanent(true);
                e80Var2.setDelegate(new ef0(this, e80Var2));
                e80Var = e80Var2;
                break;
            case 3:
                i6Var = ((org.telegram.ui.ActionBar.h2) gf0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.j2(64, context, i6Var);
                break;
            case 4:
                e80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 5:
                e80Var = new df0(gf0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.wz wzVar2 = new org.telegram.ui.Components.wz(context, null);
                wzVar2.setIsSingleCell(true);
                wzVar2.setViewType(9);
                wzVar2.f41829x = false;
                wzVar = wzVar2;
                e80Var = wzVar;
                break;
            case 7:
                e80Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(org.telegram.messenger.gd.M0(2131751564, null), false);
                org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29615p7, null);
                wzVar = x9Var;
                e80Var = wzVar;
                break;
            case 9:
                e80Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                e80Var = new org.telegram.ui.Cells.b5(this.f47614c, 8, 6, false, null);
                break;
            case 11:
                i6Var2 = ((org.telegram.ui.ActionBar.h2) gf0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.a9(context, i6Var2);
                break;
            default:
                FrameLayout p2Var = new bi.p2(context, 29);
                p2Var.addView(new ze0(context), c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29452g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (gf0Var.h) {
                    i10 = 2131746677;
                } else {
                    i10 = 2131746678;
                }
                textView.setText(org.telegram.messenger.gd.M0(i10, null));
                p2Var.addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                p2Var.setTag(-33024);
                e80Var = p2Var;
                break;
        }
        return i5.c.q(e80Var, e80Var, -1, -2);
    }
}
