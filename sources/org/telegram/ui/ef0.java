package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ef0 extends org.telegram.ui.Components.bk0 {
    public final Context f47215c;
    public final ff0 d;

    public ef0(ff0 ff0Var, Context context) {
        this.d = ff0Var;
        this.f47215c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ff0 ff0Var = this.d;
        if (ff0Var.R != b10 && ff0Var.f47694y != b10) {
            if (b10 < ff0Var.E || b10 >= ff0Var.F) {
                if ((b10 < ff0Var.I || b10 >= ff0Var.J) && b10 != ff0Var.O) {
                    if (b10 >= ff0Var.V && b10 < ff0Var.W) {
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
        ff0 ff0Var = this.d;
        if (i7 == ff0Var.f47686r) {
            return 0;
        }
        if (i7 == ff0Var.f47688s || i7 == ff0Var.M || i7 == ff0Var.T || i7 == ff0Var.Q) {
            return 1;
        }
        if (i7 == ff0Var.f47692w) {
            return 2;
        }
        if (i7 == ff0Var.f47694y) {
            return 3;
        }
        if (i7 != ff0Var.f47693x && i7 != ff0Var.K && i7 != ff0Var.N && i7 != ff0Var.S && i7 != ff0Var.U) {
            if (i7 < ff0Var.E || i7 >= ff0Var.F) {
                if (i7 >= ff0Var.I && i7 < ff0Var.J) {
                    return 5;
                }
                if (i7 == ff0Var.G) {
                    return 6;
                }
                if (i7 == ff0Var.L) {
                    return 7;
                }
                if (i7 == ff0Var.O) {
                    return 8;
                }
                if (i7 == ff0Var.P) {
                    return 9;
                }
                if (i7 != ff0Var.R) {
                    if (i7 < ff0Var.V || i7 >= ff0Var.W) {
                        if (i7 != ff0Var.H) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ef0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.e80 e80Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.wz wzVar;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i10;
        ff0 ff0Var = this.d;
        Context context = this.f47215c;
        switch (i7) {
            case 1:
                e80Var = new org.telegram.ui.Cells.n4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.e80 e80Var2 = new org.telegram.ui.Components.e80(this.f47215c, ff0Var, null, true, ff0Var.h);
                e80Var2.setPermanent(true);
                e80Var2.setDelegate(new df0(this, e80Var2));
                e80Var = e80Var2;
                break;
            case 3:
                i6Var = ((org.telegram.ui.ActionBar.h2) ff0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.i2(64, context, i6Var);
                break;
            case 4:
                e80Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 5:
                e80Var = new cf0(ff0Var, context);
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
                e80Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.gd.M0(2131751564, null), false);
                org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29617p7, null);
                wzVar = w9Var;
                e80Var = wzVar;
                break;
            case 9:
                e80Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                e80Var = new org.telegram.ui.Cells.a5(this.f47215c, 8, 6, false, null);
                break;
            case 11:
                i6Var2 = ((org.telegram.ui.ActionBar.h2) ff0Var).resourceProvider;
                e80Var = new org.telegram.ui.Cells.z8(context, i6Var2);
                break;
            default:
                FrameLayout p2Var = new bi.p2(context, 29);
                p2Var.addView(new ye0(context), c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29454g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ff0Var.h) {
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
