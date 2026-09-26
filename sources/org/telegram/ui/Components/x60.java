package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class x60 extends vl0 {
    public final c70 f30271c;

    public x60(c70 c70Var) {
        this.f30271c = c70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        c70 c70Var = this.f30271c;
        if (b10 == c70Var.f23269n) {
            long j3 = c70Var.f23255b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            if (j3 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < c70Var.f23273x || b10 >= c70Var.f23274y) {
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
        return this.f30271c.S;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.f30271c;
        if (i10 == c70Var.h || i10 == c70Var.N || i10 == c70Var.f23272w || i10 == c70Var.e) {
            return 0;
        }
        if (i10 != c70Var.f23269n) {
            if (i10 < c70Var.O || i10 >= c70Var.P) {
                if (i10 < c70Var.f23273x || i10 >= c70Var.f23274y) {
                    if (i10 != c70Var.f23270r && i10 != c70Var.f23271s) {
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
                            if (i10 != c70Var.f23261f) {
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
        u00 u00Var;
        u00 u00Var2;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        c70 c70Var = this.f30271c;
        switch (i10) {
            case 1:
                u00Var2 = new a70(context);
                break;
            case 2:
                u00Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false), 0);
                break;
            case 3:
                t60 t60Var = new t60(this, context, c70Var.U, c70Var, c70Var.f23264h0);
                t60Var.setDelegate(new w60(this));
                t60Var.setLayoutParams(new s4.p0(-1, -2));
                u00Var2 = t60Var;
                break;
            case 4:
                u00Var2 = new b70(c70Var, context);
                break;
            case 5:
                u00 u00Var3 = new u00(context, null);
                u00Var3.setIsSingleCell(true);
                u00Var3.setViewType(10);
                u00Var3.f28661w = false;
                u00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                u00Var = u00Var3;
                u00Var2 = u00Var;
                break;
            case 6:
                u00Var2 = new ln(context, 12);
                break;
            case 7:
                u00Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30517a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19442y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = frameLayout;
                u00Var2 = u00Var;
                break;
            case 9:
                u00Var2 = new z60(c70Var, context);
                break;
            default:
                d6Var = ((org.telegram.ui.ActionBar.e3) c70Var).resourcesProvider;
                u00Var2 = new org.telegram.ui.Cells.v3(context, d6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(u00Var2, u00Var2, -1, -2);
    }
}
