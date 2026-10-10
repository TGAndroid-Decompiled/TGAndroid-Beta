package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class p70 extends qm0 {
    public final u70 f29713c;

    public p70(u70 u70Var) {
        this.f29713c = u70Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        u70 u70Var = this.f29713c;
        if (b10 == u70Var.f31403n) {
            if (u70Var.f31388b.admin_id != UserConfig.getInstance(u70.N(u70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < u70Var.f31407x || b10 >= u70Var.f31408y) {
            if (b10 >= u70Var.O && b10 < u70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29713c.S;
    }

    @Override
    public final int j(int i10) {
        u70 u70Var = this.f29713c;
        if (i10 == u70Var.h || i10 == u70Var.N || i10 == u70Var.f31406w || i10 == u70Var.f31393e) {
            return 0;
        }
        if (i10 != u70Var.f31403n) {
            if (i10 < u70Var.O || i10 >= u70Var.P) {
                if (i10 < u70Var.f31407x || i10 >= u70Var.f31408y) {
                    if (i10 != u70Var.f31404r && i10 != u70Var.f31405s) {
                        if (i10 == u70Var.H) {
                            return 3;
                        }
                        if (i10 == u70Var.I) {
                            return 4;
                        }
                        if (i10 == u70Var.J) {
                            return 5;
                        }
                        u70Var.getClass();
                        if (i10 != 0 && i10 != u70Var.K && i10 != u70Var.L) {
                            if (i10 == u70Var.v) {
                                return 7;
                            }
                            if (i10 == u70Var.M) {
                                return 8;
                            }
                            if (i10 != u70Var.f31395f) {
                                return 0;
                            }
                            return 9;
                        }
                        return 6;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        k10 k10Var;
        k10 k10Var2;
        Context context = viewGroup.getContext();
        u70 u70Var = this.f29713c;
        switch (i10) {
            case 1:
                k10Var2 = new s70(context);
                break;
            case 2:
                k10Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false), 0);
                break;
            case 3:
                l70 l70Var = new l70(this, context, u70Var.U, u70Var, u70Var.f31398h0);
                l70Var.setDelegate(new o70(this));
                l70Var.setLayoutParams(new s4.q0(-1, -2));
                k10Var2 = l70Var;
                break;
            case 4:
                k10Var2 = new t70(u70Var, context);
                break;
            case 5:
                k10 k10Var3 = new k10(context, null);
                k10Var3.setIsSingleCell(true);
                k10Var3.setViewType(10);
                k10Var3.f27857w = false;
                k10Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                k10Var = k10Var3;
                k10Var2 = k10Var;
                break;
            case 6:
                k10Var2 = new ao(context, 12);
                break;
            case 7:
                k10Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30078a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f21185y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.x5.a(-2.0f, 60.0f, 0.0f, 60.0f, 0.0f, -1, 16));
                k10Var = frameLayout;
                k10Var2 = k10Var;
                break;
            case 9:
                k10Var2 = new r70(u70Var, context);
                break;
            default:
                k10Var2 = new org.telegram.ui.Cells.v3(context, u70.B(u70Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(k10Var2, k10Var2, -1, -2);
    }
}
