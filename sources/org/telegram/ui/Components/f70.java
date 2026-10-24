package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class f70 extends km0 {
    public final k70 f26217c;

    public f70(k70 k70Var) {
        this.f26217c = k70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        k70 k70Var = this.f26217c;
        if (b10 == k70Var.f27924n) {
            long j10 = k70Var.f27910b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < k70Var.f27928x || b10 >= k70Var.f27929y) {
            if (b10 >= k70Var.O && b10 < k70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f26217c.S;
    }

    @Override
    public final int j(int i10) {
        k70 k70Var = this.f26217c;
        if (i10 == k70Var.h || i10 == k70Var.N || i10 == k70Var.f27927w || i10 == k70Var.e) {
            return 0;
        }
        if (i10 != k70Var.f27924n) {
            if (i10 < k70Var.O || i10 >= k70Var.P) {
                if (i10 < k70Var.f27928x || i10 >= k70Var.f27929y) {
                    if (i10 != k70Var.f27925r && i10 != k70Var.f27926s) {
                        if (i10 == k70Var.H) {
                            return 3;
                        }
                        if (i10 == k70Var.I) {
                            return 4;
                        }
                        if (i10 == k70Var.J) {
                            return 5;
                        }
                        k70Var.getClass();
                        if (i10 != 0 && i10 != k70Var.K && i10 != k70Var.L) {
                            if (i10 == k70Var.v) {
                                return 7;
                            }
                            if (i10 == k70Var.M) {
                                return 8;
                            }
                            if (i10 != k70Var.f27916f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f70.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        z00 z00Var;
        b70 b70Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        k70 k70Var = this.f26217c;
        switch (i10) {
            case 1:
                b70Var = new i70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.k6.f21126a7;
                View b7Var = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.k6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.r6.i(i11, b7Var, null);
                z00Var = b7Var;
                b70Var = z00Var;
                break;
            case 3:
                b70 b70Var2 = new b70(this, context, k70Var.U, k70Var, k70Var.f27919h0);
                b70Var2.setDelegate(new e70(this));
                b70Var2.setLayoutParams(new s4.o0(-1, -2));
                b70Var = b70Var2;
                break;
            case 4:
                b70Var = new j70(k70Var, context);
                break;
            case 5:
                z00 z00Var2 = new z00(context, null);
                z00Var2.setIsSingleCell(true);
                z00Var2.setViewType(10);
                z00Var2.f33104w = false;
                z00Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                z00Var = z00Var2;
                b70Var = z00Var;
                break;
            case 6:
                b70Var = new sn(context, 12);
                break;
            case 7:
                b70Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f26583a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21572y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                b70Var = frameLayout;
                break;
            case 9:
                b70Var = new h70(k70Var, context);
                break;
            default:
                g6Var = ((org.telegram.ui.ActionBar.h3) k70Var).resourcesProvider;
                b70Var = new org.telegram.ui.Cells.u3(context, g6Var);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(b70Var, b70Var, -1, -2);
    }
}
