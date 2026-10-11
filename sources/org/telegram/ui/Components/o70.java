package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class o70 extends qm0 {
    public final t70 f29405c;

    public o70(t70 t70Var) {
        this.f29405c = t70Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        t70 t70Var = this.f29405c;
        if (b10 == t70Var.f31150n) {
            if (t70Var.f31135b.admin_id != UserConfig.getInstance(t70.N(t70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < t70Var.f31154x || b10 >= t70Var.f31155y) {
            if (b10 >= t70Var.O && b10 < t70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29405c.S;
    }

    @Override
    public final int j(int i10) {
        t70 t70Var = this.f29405c;
        if (i10 == t70Var.h || i10 == t70Var.N || i10 == t70Var.f31153w || i10 == t70Var.f31140e) {
            return 0;
        }
        if (i10 != t70Var.f31150n) {
            if (i10 < t70Var.O || i10 >= t70Var.P) {
                if (i10 < t70Var.f31154x || i10 >= t70Var.f31155y) {
                    if (i10 != t70Var.f31151r && i10 != t70Var.f31152s) {
                        if (i10 == t70Var.H) {
                            return 3;
                        }
                        if (i10 == t70Var.I) {
                            return 4;
                        }
                        if (i10 == t70Var.J) {
                            return 5;
                        }
                        t70Var.getClass();
                        if (i10 != 0 && i10 != t70Var.K && i10 != t70Var.L) {
                            if (i10 == t70Var.v) {
                                return 7;
                            }
                            if (i10 == t70Var.M) {
                                return 8;
                            }
                            if (i10 != t70Var.f31142f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o70.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        k10 k10Var;
        k10 k10Var2;
        Context context = viewGroup.getContext();
        t70 t70Var = this.f29405c;
        switch (i10) {
            case 1:
                k10Var2 = new r70(context);
                break;
            case 2:
                k10Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false), 0);
                break;
            case 3:
                k70 k70Var = new k70(this, context, t70Var.U, t70Var, t70Var.f31145h0);
                k70Var.setDelegate(new n70(this));
                k70Var.setLayoutParams(new s4.q0(-1, -2));
                k10Var2 = k70Var;
                break;
            case 4:
                k10Var2 = new s70(t70Var, context);
                break;
            case 5:
                k10 k10Var3 = new k10(context, null);
                k10Var3.setIsSingleCell(true);
                k10Var3.setViewType(10);
                k10Var3.f27916w = false;
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
                frameLayout.f29745a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f21207y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.x5.a(-2.0f, 60.0f, 0.0f, 60.0f, 0.0f, -1, 16));
                k10Var = frameLayout;
                k10Var2 = k10Var;
                break;
            case 9:
                k10Var2 = new q70(t70Var, context);
                break;
            default:
                k10Var2 = new org.telegram.ui.Cells.v3(context, t70.B(t70Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(k10Var2, k10Var2, -1, -2);
    }
}
