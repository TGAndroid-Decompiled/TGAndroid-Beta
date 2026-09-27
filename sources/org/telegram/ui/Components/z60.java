package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class z60 extends xl0 {
    public final e70 f30861c;

    public z60(e70 e70Var) {
        this.f30861c = e70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        e70 e70Var = this.f30861c;
        if (b10 == e70Var.f23954n) {
            long j3 = e70Var.f23940b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
            if (j3 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < e70Var.f23958x || b10 >= e70Var.f23959y) {
            if (b10 >= e70Var.O && b10 < e70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f30861c.S;
    }

    @Override
    public final int j(int i10) {
        e70 e70Var = this.f30861c;
        if (i10 == e70Var.h || i10 == e70Var.N || i10 == e70Var.f23957w || i10 == e70Var.e) {
            return 0;
        }
        if (i10 != e70Var.f23954n) {
            if (i10 < e70Var.O || i10 >= e70Var.P) {
                if (i10 < e70Var.f23958x || i10 >= e70Var.f23959y) {
                    if (i10 != e70Var.f23955r && i10 != e70Var.f23956s) {
                        if (i10 == e70Var.H) {
                            return 3;
                        }
                        if (i10 == e70Var.I) {
                            return 4;
                        }
                        if (i10 == e70Var.J) {
                            return 5;
                        }
                        e70Var.getClass();
                        if (i10 != 0 && i10 != e70Var.K && i10 != e70Var.L) {
                            if (i10 == e70Var.v) {
                                return 7;
                            }
                            if (i10 == e70Var.M) {
                                return 8;
                            }
                            if (i10 != e70Var.f23946f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        v00 v00Var;
        v00 v00Var2;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        e70 e70Var = this.f30861c;
        switch (i10) {
            case 1:
                v00Var2 = new c70(context);
                break;
            case 2:
                v00Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false), 0);
                break;
            case 3:
                v60 v60Var = new v60(this, context, e70Var.U, e70Var, e70Var.f23949h0);
                v60Var.setDelegate(new y60(this));
                v60Var.setLayoutParams(new s4.p0(-1, -2));
                v00Var2 = v60Var;
                break;
            case 4:
                v00Var2 = new d70(e70Var, context);
                break;
            case 5:
                v00 v00Var3 = new v00(context, null);
                v00Var3.setIsSingleCell(true);
                v00Var3.setViewType(10);
                v00Var3.f28982w = false;
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
                frameLayout.f22569a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f19442y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                v00Var = frameLayout;
                v00Var2 = v00Var;
                break;
            case 9:
                v00Var2 = new b70(e70Var, context);
                break;
            default:
                e6Var = ((org.telegram.ui.ActionBar.g3) e70Var).resourcesProvider;
                v00Var2 = new org.telegram.ui.Cells.v3(context, e6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(v00Var2, v00Var2, -1, -2);
    }
}
