package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class g70 extends im0 {
    public final l70 f26523c;

    public g70(l70 l70Var) {
        this.f26523c = l70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        l70 l70Var = this.f26523c;
        if (b10 == l70Var.f28085n) {
            long j10 = l70Var.f28071b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < l70Var.f28089x || b10 >= l70Var.f28090y) {
            if (b10 >= l70Var.O && b10 < l70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f26523c.S;
    }

    @Override
    public final int j(int i10) {
        l70 l70Var = this.f26523c;
        if (i10 == l70Var.h || i10 == l70Var.N || i10 == l70Var.f28088w || i10 == l70Var.e) {
            return 0;
        }
        if (i10 != l70Var.f28085n) {
            if (i10 < l70Var.O || i10 >= l70Var.P) {
                if (i10 < l70Var.f28089x || i10 >= l70Var.f28090y) {
                    if (i10 != l70Var.f28086r && i10 != l70Var.f28087s) {
                        if (i10 == l70Var.H) {
                            return 3;
                        }
                        if (i10 == l70Var.I) {
                            return 4;
                        }
                        if (i10 == l70Var.J) {
                            return 5;
                        }
                        l70Var.getClass();
                        if (i10 != 0 && i10 != l70Var.K && i10 != l70Var.L) {
                            if (i10 == l70Var.v) {
                                return 7;
                            }
                            if (i10 == l70Var.M) {
                                return 8;
                            }
                            if (i10 != l70Var.f28077f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g70.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        b10 b10Var;
        b10 b10Var2;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        l70 l70Var = this.f26523c;
        switch (i10) {
            case 1:
                b10Var2 = new j70(context);
                break;
            case 2:
                b10Var2 = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false), 0);
                break;
            case 3:
                c70 c70Var = new c70(this, context, l70Var.U, l70Var, l70Var.f28080h0);
                c70Var.setDelegate(new f70(this));
                c70Var.setLayoutParams(new s4.o0(-1, -2));
                b10Var2 = c70Var;
                break;
            case 4:
                b10Var2 = new k70(l70Var, context);
                break;
            case 5:
                b10 b10Var3 = new b10(context, null);
                b10Var3.setIsSingleCell(true);
                b10Var3.setViewType(10);
                b10Var3.f24777w = false;
                b10Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                b10Var = b10Var3;
                b10Var2 = b10Var;
                break;
            case 6:
                b10Var2 = new un(context, 12);
                break;
            case 7:
                b10Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f26802a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.f21381y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                b10Var = frameLayout;
                b10Var2 = b10Var;
                break;
            case 9:
                b10Var2 = new i70(l70Var, context);
                break;
            default:
                d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
                b10Var2 = new org.telegram.ui.Cells.u3(context, d6Var);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(b10Var2, b10Var2, -1, -2);
    }
}
