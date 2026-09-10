package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class v60 extends ul0 {
    public final a70 f27846c;

    public v60(a70 a70Var) {
        this.f27846c = a70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        a70 a70Var = this.f27846c;
        if (b10 == a70Var.f21412n) {
            long j3 = a70Var.f21398b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            if (j3 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < a70Var.f21416x || b10 >= a70Var.f21417y) {
            if (b10 >= a70Var.O && b10 < a70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f27846c.S;
    }

    @Override
    public final int j(int i10) {
        a70 a70Var = this.f27846c;
        if (i10 == a70Var.h || i10 == a70Var.N || i10 == a70Var.f21415w || i10 == a70Var.e) {
            return 0;
        }
        if (i10 != a70Var.f21412n) {
            if (i10 < a70Var.O || i10 >= a70Var.P) {
                if (i10 < a70Var.f21416x || i10 >= a70Var.f21417y) {
                    if (i10 != a70Var.f21413r && i10 != a70Var.f21414s) {
                        if (i10 == a70Var.H) {
                            return 3;
                        }
                        if (i10 == a70Var.I) {
                            return 4;
                        }
                        if (i10 == a70Var.J) {
                            return 5;
                        }
                        a70Var.getClass();
                        if (i10 != 0 && i10 != a70Var.K && i10 != a70Var.L) {
                            if (i10 == a70Var.v) {
                                return 7;
                            }
                            if (i10 == a70Var.M) {
                                return 8;
                            }
                            if (i10 != a70Var.f21404f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a10 a10Var;
        a10 a10Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        a70 a70Var = this.f27846c;
        switch (i10) {
            case 1:
                a10Var2 = new y60(context);
                break;
            case 2:
                a10Var2 = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false), 0);
                break;
            case 3:
                r60 r60Var = new r60(this, context, a70Var.U, a70Var, a70Var.f21407h0);
                r60Var.setDelegate(new u60(this));
                r60Var.setLayoutParams(new s4.p0(-1, -2));
                a10Var2 = r60Var;
                break;
            case 4:
                a10Var2 = new z60(a70Var, context);
                break;
            case 5:
                a10 a10Var3 = new a10(context, null);
                a10Var3.setIsSingleCell(true);
                a10Var3.setViewType(10);
                a10Var3.f21345w = false;
                a10Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                a10Var = a10Var3;
                a10Var2 = a10Var;
                break;
            case 6:
                a10Var2 = new qn(context, 11);
                break;
            case 7:
                a10Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f28666a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f18306y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                a10Var = frameLayout;
                a10Var2 = a10Var;
                break;
            case 9:
                a10Var2 = new x60(a70Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
                a10Var2 = new org.telegram.ui.Cells.u3(context, f6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(a10Var2, a10Var2, -1, -2);
    }
}
