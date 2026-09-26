package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class y60 extends wl0 {
    public final d70 f30574c;

    public y60(d70 d70Var) {
        this.f30574c = d70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        d70 d70Var = this.f30574c;
        if (b10 == d70Var.f23607n) {
            long j3 = d70Var.f23593b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
            if (j3 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < d70Var.f23611x || b10 >= d70Var.f23612y) {
            if (b10 >= d70Var.O && b10 < d70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f30574c.S;
    }

    @Override
    public final int j(int i10) {
        d70 d70Var = this.f30574c;
        if (i10 == d70Var.h || i10 == d70Var.N || i10 == d70Var.f23610w || i10 == d70Var.e) {
            return 0;
        }
        if (i10 != d70Var.f23607n) {
            if (i10 < d70Var.O || i10 >= d70Var.P) {
                if (i10 < d70Var.f23611x || i10 >= d70Var.f23612y) {
                    if (i10 != d70Var.f23608r && i10 != d70Var.f23609s) {
                        if (i10 == d70Var.H) {
                            return 3;
                        }
                        if (i10 == d70Var.I) {
                            return 4;
                        }
                        if (i10 == d70Var.J) {
                            return 5;
                        }
                        d70Var.getClass();
                        if (i10 != 0 && i10 != d70Var.K && i10 != d70Var.L) {
                            if (i10 == d70Var.v) {
                                return 7;
                            }
                            if (i10 == d70Var.M) {
                                return 8;
                            }
                            if (i10 != d70Var.f23599f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        v00 v00Var;
        v00 v00Var2;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        d70 d70Var = this.f30574c;
        switch (i10) {
            case 1:
                v00Var2 = new b70(context);
                break;
            case 2:
                v00Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false), 0);
                break;
            case 3:
                u60 u60Var = new u60(this, context, d70Var.U, d70Var, d70Var.f23602h0);
                u60Var.setDelegate(new x60(this));
                u60Var.setLayoutParams(new s4.p0(-1, -2));
                v00Var2 = u60Var;
                break;
            case 4:
                v00Var2 = new c70(d70Var, context);
                break;
            case 5:
                v00 v00Var3 = new v00(context, null);
                v00Var3.setIsSingleCell(true);
                v00Var3.setViewType(10);
                v00Var3.f28952w = false;
                v00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                v00Var = v00Var3;
                v00Var2 = v00Var;
                break;
            case 6:
                v00Var2 = new mn(context, 12);
                break;
            case 7:
                v00Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30804a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19442y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                v00Var = frameLayout;
                v00Var2 = v00Var;
                break;
            case 9:
                v00Var2 = new a70(d70Var, context);
                break;
            default:
                d6Var = ((org.telegram.ui.ActionBar.e3) d70Var).resourcesProvider;
                v00Var2 = new org.telegram.ui.Cells.v3(context, d6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(v00Var2, v00Var2, -1, -2);
    }
}
