package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class i60 extends il0 {
    public final n60 f29327c;

    public i60(n60 n60Var) {
        this.f29327c = n60Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int b10 = n1Var.b();
        n60 n60Var = this.f29327c;
        if (b10 == n60Var.f30896n) {
            long j10 = n60Var.f30885b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < n60Var.f30900x || b10 >= n60Var.f30901y) {
            if (b10 >= n60Var.K && b10 < n60Var.L) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29327c.O;
    }

    @Override
    public final int j(int i10) {
        n60 n60Var = this.f29327c;
        if (i10 == n60Var.h || i10 == n60Var.J || i10 == n60Var.f30899w || i10 == n60Var.f30890e) {
            return 0;
        }
        if (i10 != n60Var.f30896n) {
            if (i10 < n60Var.K || i10 >= n60Var.L) {
                if (i10 < n60Var.f30900x || i10 >= n60Var.f30901y) {
                    if (i10 != n60Var.f30897r && i10 != n60Var.f30898s) {
                        if (i10 == n60Var.D) {
                            return 3;
                        }
                        if (i10 == n60Var.E) {
                            return 4;
                        }
                        if (i10 == n60Var.F) {
                            return 5;
                        }
                        n60Var.getClass();
                        if (i10 != 0 && i10 != n60Var.G && i10 != n60Var.H) {
                            if (i10 == n60Var.v) {
                                return 7;
                            }
                            if (i10 == n60Var.I) {
                                return 8;
                            }
                            if (i10 != n60Var.f30892f) {
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
    public final void v(f2.n1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i60.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        p00 p00Var;
        p00 p00Var2;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        n60 n60Var = this.f29327c;
        switch (i10) {
            case 1:
                p00Var2 = new l60(context);
                break;
            case 2:
                p00Var2 = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false), 0);
                break;
            case 3:
                e60 e60Var = new e60(this, context, n60Var.Q, n60Var, n60Var.f30889d0);
                e60Var.setDelegate(new h60(this));
                e60Var.setLayoutParams(new f2.x0(-1, -2));
                p00Var2 = e60Var;
                break;
            case 4:
                p00Var2 = new m60(n60Var, context);
                break;
            case 5:
                p00 p00Var3 = new p00(context, null);
                p00Var3.setIsSingleCell(true);
                p00Var3.setViewType(10);
                p00Var3.f31529w = false;
                p00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                p00Var = p00Var3;
                p00Var2 = p00Var;
                break;
            case 6:
                p00Var2 = new fn(context, 10);
                break;
            case 7:
                p00Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f29559a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.f23433y6, null, false, textView, 1);
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                p00Var = frameLayout;
                p00Var2 = p00Var;
                break;
            case 9:
                p00Var2 = new k60(n60Var, context);
                break;
            default:
                c6Var = ((org.telegram.ui.ActionBar.f3) n60Var).resourcesProvider;
                p00Var2 = new org.telegram.ui.Cells.s3(context, c6Var);
                break;
        }
        return org.telegram.ui.th.m(p00Var2, p00Var2, -1, -2);
    }
}
