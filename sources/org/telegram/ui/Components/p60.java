package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class p60 extends rl0 {
    public final u60 f29993c;

    public p60(u60 u60Var) {
        this.f29993c = u60Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        u60 u60Var = this.f29993c;
        if (b10 == u60Var.f31520n) {
            long j10 = u60Var.f31508b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < u60Var.f31524x || b10 >= u60Var.f31525y) {
            if (b10 >= u60Var.L && b10 < u60Var.M) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29993c.P;
    }

    @Override
    public final int j(int i10) {
        u60 u60Var = this.f29993c;
        if (i10 == u60Var.h || i10 == u60Var.K || i10 == u60Var.f31523w || i10 == u60Var.f31513e) {
            return 0;
        }
        if (i10 != u60Var.f31520n) {
            if (i10 < u60Var.L || i10 >= u60Var.M) {
                if (i10 < u60Var.f31524x || i10 >= u60Var.f31525y) {
                    if (i10 != u60Var.f31521r && i10 != u60Var.f31522s) {
                        if (i10 == u60Var.E) {
                            return 3;
                        }
                        if (i10 == u60Var.F) {
                            return 4;
                        }
                        if (i10 == u60Var.G) {
                            return 5;
                        }
                        u60Var.getClass();
                        if (i10 != 0 && i10 != u60Var.H && i10 != u60Var.I) {
                            if (i10 == u60Var.v) {
                                return 7;
                            }
                            if (i10 == u60Var.J) {
                                return 8;
                            }
                            if (i10 != u60Var.f31515f) {
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
    public final void v(f2.m1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p60.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        u00 u00Var2;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        u60 u60Var = this.f29993c;
        switch (i10) {
            case 1:
                u00Var2 = new s60(context);
                break;
            case 2:
                u00Var2 = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false), 0);
                break;
            case 3:
                l60 l60Var = new l60(this, context, u60Var.R, u60Var, u60Var.f31514e0);
                l60Var.setDelegate(new o60(this));
                l60Var.setLayoutParams(new f2.x0(-1, -2));
                u00Var2 = l60Var;
                break;
            case 4:
                u00Var2 = new t60(u60Var, context);
                break;
            case 5:
                u00 u00Var3 = new u00(context, null);
                u00Var3.setIsSingleCell(true);
                u00Var3.setViewType(10);
                u00Var3.f31465w = false;
                u00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                u00Var = u00Var3;
                u00Var2 = u00Var;
                break;
            case 6:
                u00Var2 = new in(context, 9);
                break;
            case 7:
                u00Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30298a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.yh.t(org.telegram.ui.ActionBar.k6.f22038y6, null, false, textView, 1);
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = frameLayout;
                u00Var2 = u00Var;
                break;
            case 9:
                u00Var2 = new r60(u60Var, context);
                break;
            default:
                g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
                u00Var2 = new org.telegram.ui.Cells.u3(context, g6Var);
                break;
        }
        return org.telegram.ui.yh.o(u00Var2, u00Var2, -1, -2);
    }
}
