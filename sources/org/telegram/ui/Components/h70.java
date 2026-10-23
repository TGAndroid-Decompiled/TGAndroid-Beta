package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class h70 extends lm0 {
    public final m70 f26813c;

    public h70(m70 m70Var) {
        this.f26813c = m70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        m70 m70Var = this.f26813c;
        if (b10 == m70Var.f28590n) {
            long j10 = m70Var.f28576b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < m70Var.f28594x || b10 >= m70Var.f28595y) {
            if (b10 >= m70Var.O && b10 < m70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f26813c.S;
    }

    @Override
    public final int j(int i10) {
        m70 m70Var = this.f26813c;
        if (i10 == m70Var.h || i10 == m70Var.N || i10 == m70Var.f28593w || i10 == m70Var.e) {
            return 0;
        }
        if (i10 != m70Var.f28590n) {
            if (i10 < m70Var.O || i10 >= m70Var.P) {
                if (i10 < m70Var.f28594x || i10 >= m70Var.f28595y) {
                    if (i10 != m70Var.f28591r && i10 != m70Var.f28592s) {
                        if (i10 == m70Var.H) {
                            return 3;
                        }
                        if (i10 == m70Var.I) {
                            return 4;
                        }
                        if (i10 == m70Var.J) {
                            return 5;
                        }
                        m70Var.getClass();
                        if (i10 != 0 && i10 != m70Var.K && i10 != m70Var.L) {
                            if (i10 == m70Var.v) {
                                return 7;
                            }
                            if (i10 == m70Var.M) {
                                return 8;
                            }
                            if (i10 != m70Var.f28582f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h70.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        b10 b10Var;
        d70 d70Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        m70 m70Var = this.f26813c;
        switch (i10) {
            case 1:
                d70Var = new k70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
                View b7Var = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.k6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.r6.i(i11, b7Var, null);
                b10Var = b7Var;
                d70Var = b10Var;
                break;
            case 3:
                d70 d70Var2 = new d70(this, context, m70Var.U, m70Var, m70Var.f28585h0);
                d70Var2.setDelegate(new g70(this));
                d70Var2.setLayoutParams(new s4.o0(-1, -2));
                d70Var = d70Var2;
                break;
            case 4:
                d70Var = new l70(m70Var, context);
                break;
            case 5:
                b10 b10Var2 = new b10(context, null);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(10);
                b10Var2.f24923w = false;
                b10Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                b10Var = b10Var2;
                d70Var = b10Var;
                break;
            case 6:
                d70Var = new un(context, 12);
                break;
            case 7:
                d70Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f27234a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21571y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                d70Var = frameLayout;
                break;
            case 9:
                d70Var = new j70(m70Var, context);
                break;
            default:
                g6Var = ((org.telegram.ui.ActionBar.h3) m70Var).resourcesProvider;
                d70Var = new org.telegram.ui.Cells.u3(context, g6Var);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(d70Var, d70Var, -1, -2);
    }
}
