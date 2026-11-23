package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class df0 extends org.telegram.ui.Components.dk0 {
    public final Context f47087c;
    public final ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.f47087c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ef0 ef0Var = this.d;
        if (ef0Var.R != b10 && ef0Var.f47546y != b10) {
            if (b10 < ef0Var.E || b10 >= ef0Var.F) {
                if ((b10 < ef0Var.I || b10 >= ef0Var.J) && b10 != ef0Var.O) {
                    if (b10 >= ef0Var.V && b10 < ef0Var.W) {
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
        ef0 ef0Var = this.d;
        if (i7 == ef0Var.f47538r) {
            return 0;
        }
        if (i7 == ef0Var.f47540s || i7 == ef0Var.M || i7 == ef0Var.T || i7 == ef0Var.Q) {
            return 1;
        }
        if (i7 == ef0Var.f47544w) {
            return 2;
        }
        if (i7 == ef0Var.f47546y) {
            return 3;
        }
        if (i7 != ef0Var.f47545x && i7 != ef0Var.K && i7 != ef0Var.N && i7 != ef0Var.S && i7 != ef0Var.U) {
            if (i7 < ef0Var.E || i7 >= ef0Var.F) {
                if (i7 >= ef0Var.I && i7 < ef0Var.J) {
                    return 5;
                }
                if (i7 == ef0Var.G) {
                    return 6;
                }
                if (i7 == ef0Var.L) {
                    return 7;
                }
                if (i7 == ef0Var.O) {
                    return 8;
                }
                if (i7 == ef0Var.P) {
                    return 9;
                }
                if (i7 != ef0Var.R) {
                    if (i7 < ef0Var.V || i7 >= ef0Var.W) {
                        if (i7 != ef0Var.H) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.df0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.d80 d80Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.vz vzVar;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i10;
        ef0 ef0Var = this.d;
        Context context = this.f47087c;
        switch (i7) {
            case 1:
                d80Var = new org.telegram.ui.Cells.o4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.d80 d80Var2 = new org.telegram.ui.Components.d80(this.f47087c, ef0Var, null, true, ef0Var.h);
                d80Var2.setPermanent(true);
                d80Var2.setDelegate(new cf0(this, d80Var2));
                d80Var = d80Var2;
                break;
            case 3:
                i6Var = ((org.telegram.ui.ActionBar.g2) ef0Var).resourceProvider;
                d80Var = new org.telegram.ui.Cells.j2(64, context, i6Var);
                break;
            case 4:
                d80Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 5:
                d80Var = new bf0(ef0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.vz vzVar2 = new org.telegram.ui.Components.vz(context, null);
                vzVar2.setIsSingleCell(true);
                vzVar2.setViewType(9);
                vzVar2.f41457x = false;
                vzVar = vzVar2;
                d80Var = vzVar;
                break;
            case 7:
                d80Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                w9Var.b(org.telegram.messenger.gd.N0(2131751563, null), false);
                org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.f29672p7, null);
                vzVar = w9Var;
                d80Var = vzVar;
                break;
            case 9:
                d80Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 10:
                d80Var = new org.telegram.ui.Cells.b5(this.f47087c, 8, 6, false, null);
                break;
            case 11:
                i6Var2 = ((org.telegram.ui.ActionBar.g2) ef0Var).resourceProvider;
                d80Var = new org.telegram.ui.Cells.z8(context, i6Var2);
                break;
            default:
                FrameLayout v2Var = new bi.v2(context, 29);
                v2Var.addView(new xe0(context), c8.na.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29509g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ef0Var.h) {
                    i10 = 2131746676;
                } else {
                    i10 = 2131746677;
                }
                textView.setText(org.telegram.messenger.gd.N0(i10, null));
                v2Var.addView(textView, c8.na.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                v2Var.setTag(-33024);
                d80Var = v2Var;
                break;
        }
        return i5.c.q(d80Var, d80Var, -1, -2);
    }
}
