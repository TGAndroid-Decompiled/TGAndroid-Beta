package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class k70 extends lm0 {
    public final p70 f26233c;

    public k70(p70 p70Var) {
        this.f26233c = p70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        p70 p70Var = this.f26233c;
        if (b10 == p70Var.f27913n) {
            if (p70Var.f27899b.admin_id != UserConfig.getInstance(p70.N(p70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < p70Var.f27917x || b10 >= p70Var.f27918y) {
            if (b10 >= p70Var.O && b10 < p70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f26233c.S;
    }

    @Override
    public final int j(int i10) {
        p70 p70Var = this.f26233c;
        if (i10 == p70Var.h || i10 == p70Var.N || i10 == p70Var.f27916w || i10 == p70Var.e) {
            return 0;
        }
        if (i10 != p70Var.f27913n) {
            if (i10 < p70Var.O || i10 >= p70Var.P) {
                if (i10 < p70Var.f27917x || i10 >= p70Var.f27918y) {
                    if (i10 != p70Var.f27914r && i10 != p70Var.f27915s) {
                        if (i10 == p70Var.H) {
                            return 3;
                        }
                        if (i10 == p70Var.I) {
                            return 4;
                        }
                        if (i10 == p70Var.J) {
                            return 5;
                        }
                        p70Var.getClass();
                        if (i10 != 0 && i10 != p70Var.K && i10 != p70Var.L) {
                            if (i10 == p70Var.v) {
                                return 7;
                            }
                            if (i10 == p70Var.M) {
                                return 8;
                            }
                            if (i10 != p70Var.f27905f) {
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
    public final void v(s4.b1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        f10 f10Var;
        f10 f10Var2;
        Context context = viewGroup.getContext();
        p70 p70Var = this.f26233c;
        switch (i10) {
            case 1:
                f10Var2 = new n70(context);
                break;
            case 2:
                f10Var2 = new org.telegram.ui.Cells.a7(context, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false), 0);
                break;
            case 3:
                g70 g70Var = new g70(this, context, p70Var.U, p70Var, p70Var.f27908h0);
                g70Var.setDelegate(new j70(this));
                g70Var.setLayoutParams(new s4.o0(-1, -2));
                f10Var2 = g70Var;
                break;
            case 4:
                f10Var2 = new o70(p70Var, context);
                break;
            case 5:
                f10 f10Var3 = new f10(context, null);
                f10Var3.setIsSingleCell(true);
                f10Var3.setViewType(10);
                f10Var3.f24549w = false;
                f10Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                f10Var = f10Var3;
                f10Var2 = f10Var;
                break;
            case 6:
                f10Var2 = new xn(context, 12);
                break;
            case 7:
                f10Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f26631a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.f19988y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.z5.a(-2.0f, 60.0f, 0.0f, 60.0f, 0.0f, -1, 16));
                f10Var = frameLayout;
                f10Var2 = f10Var;
                break;
            case 9:
                f10Var2 = new m70(p70Var, context);
                break;
            default:
                f10Var2 = new org.telegram.ui.Cells.v3(context, p70.B(p70Var));
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(f10Var2, f10Var2, -1, -2);
    }
}
