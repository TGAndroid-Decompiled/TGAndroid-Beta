package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class n60 extends ll0 {
    public final s60 f26353c;

    public n60(s60 s60Var) {
        this.f26353c = s60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        s60 s60Var = this.f26353c;
        if (b10 == s60Var.f27854n) {
            if (s60Var.f27840b.admin_id != UserConfig.getInstance(s60.M(s60Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < s60Var.f27858x || b10 >= s60Var.f27859y) {
            if (b10 >= s60Var.O && b10 < s60Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f26353c.S;
    }

    @Override
    public final int j(int i10) {
        s60 s60Var = this.f26353c;
        if (i10 == s60Var.h || i10 == s60Var.N || i10 == s60Var.f27857w || i10 == s60Var.e) {
            return 0;
        }
        if (i10 != s60Var.f27854n) {
            if (i10 < s60Var.O || i10 >= s60Var.P) {
                if (i10 < s60Var.f27858x || i10 >= s60Var.f27859y) {
                    if (i10 != s60Var.f27855r && i10 != s60Var.f27856s) {
                        if (i10 == s60Var.H) {
                            return 3;
                        }
                        if (i10 == s60Var.I) {
                            return 4;
                        }
                        if (i10 == s60Var.J) {
                            return 5;
                        }
                        s60Var.getClass();
                        if (i10 != 0 && i10 != s60Var.K && i10 != s60Var.L) {
                            if (i10 == s60Var.v) {
                                return 7;
                            }
                            if (i10 == s60Var.M) {
                                return 8;
                            }
                            if (i10 != s60Var.f27846f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        u00 u00Var2;
        Context context = viewGroup.getContext();
        s60 s60Var = this.f26353c;
        switch (i10) {
            case 1:
                u00Var2 = new q60(context);
                break;
            case 2:
                u00Var2 = new org.telegram.ui.Cells.a7(context, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false), 0);
                break;
            case 3:
                j60 j60Var = new j60(this, context, s60Var.U, s60Var, s60Var.f27849h0);
                j60Var.setDelegate(new m60(this));
                j60Var.setLayoutParams(new s4.p0(-1, -2));
                u00Var2 = j60Var;
                break;
            case 4:
                u00Var2 = new r60(s60Var, context);
                break;
            case 5:
                u00 u00Var3 = new u00(context, null);
                u00Var3.setIsSingleCell(true);
                u00Var3.setViewType(10);
                u00Var3.f28353w = false;
                u00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                u00Var = u00Var3;
                u00Var2 = u00Var;
                break;
            case 6:
                u00Var2 = new ln(context, 12);
                break;
            case 7:
                u00Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f26635a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19170y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = frameLayout;
                u00Var2 = u00Var;
                break;
            case 9:
                u00Var2 = new p60(s60Var, context);
                break;
            default:
                u00Var2 = new org.telegram.ui.Cells.v3(context, s60.y(s60Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(u00Var2, u00Var2, -1, -2);
    }
}
