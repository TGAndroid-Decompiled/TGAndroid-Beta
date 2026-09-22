package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class x60 extends xl0 {
    public final c70 f30228c;

    public x60(c70 c70Var) {
        this.f30228c = c70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        c70 c70Var = this.f30228c;
        if (b10 == c70Var.f23282n) {
            long j3 = c70Var.f23268b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            if (j3 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < c70Var.f23286x || b10 >= c70Var.f23287y) {
            if (b10 >= c70Var.O && b10 < c70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f30228c.S;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.f30228c;
        if (i10 == c70Var.h || i10 == c70Var.N || i10 == c70Var.f23285w || i10 == c70Var.e) {
            return 0;
        }
        if (i10 != c70Var.f23282n) {
            if (i10 < c70Var.O || i10 >= c70Var.P) {
                if (i10 < c70Var.f23286x || i10 >= c70Var.f23287y) {
                    if (i10 != c70Var.f23283r && i10 != c70Var.f23284s) {
                        if (i10 == c70Var.H) {
                            return 3;
                        }
                        if (i10 == c70Var.I) {
                            return 4;
                        }
                        if (i10 == c70Var.J) {
                            return 5;
                        }
                        c70Var.getClass();
                        if (i10 != 0 && i10 != c70Var.K && i10 != c70Var.L) {
                            if (i10 == c70Var.v) {
                                return 7;
                            }
                            if (i10 == c70Var.M) {
                                return 8;
                            }
                            if (i10 != c70Var.f23274f) {
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
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        t00 t00Var;
        t00 t00Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        c70 c70Var = this.f30228c;
        switch (i10) {
            case 1:
                t00Var2 = new a70(context);
                break;
            case 2:
                t00Var2 = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false), 0);
                break;
            case 3:
                t60 t60Var = new t60(this, context, c70Var.U, c70Var, c70Var.f23277h0);
                t60Var.setDelegate(new w60(this));
                t60Var.setLayoutParams(new s4.p0(-1, -2));
                t00Var2 = t60Var;
                break;
            case 4:
                t00Var2 = new b70(c70Var, context);
                break;
            case 5:
                t00 t00Var3 = new t00(context, null);
                t00Var3.setIsSingleCell(true);
                t00Var3.setViewType(10);
                t00Var3.f28362w = false;
                t00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                t00Var = t00Var3;
                t00Var2 = t00Var;
                break;
            case 6:
                t00Var2 = new kn(context, 12);
                break;
            case 7:
                t00Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30534a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f19492y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t00Var = frameLayout;
                t00Var2 = t00Var;
                break;
            case 9:
                t00Var2 = new z60(c70Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.f3) c70Var).resourcesProvider;
                t00Var2 = new org.telegram.ui.Cells.w3(context, f6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(t00Var2, t00Var2, -1, -2);
    }
}
