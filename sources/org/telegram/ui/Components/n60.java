package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class n60 extends rl0 {
    public final s60 f27204c;

    public n60(s60 s60Var) {
        this.f27204c = s60Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        s60 s60Var = this.f27204c;
        if (b10 == s60Var.f28649n) {
            long j10 = s60Var.f28638b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < s60Var.f28653x || b10 >= s60Var.f28654y) {
            if (b10 >= s60Var.L && b10 < s60Var.M) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f27204c.P;
    }

    @Override
    public final int j(int i10) {
        s60 s60Var = this.f27204c;
        if (i10 == s60Var.h || i10 == s60Var.K || i10 == s60Var.f28652w || i10 == s60Var.e) {
            return 0;
        }
        if (i10 != s60Var.f28649n) {
            if (i10 < s60Var.L || i10 >= s60Var.M) {
                if (i10 < s60Var.f28653x || i10 >= s60Var.f28654y) {
                    if (i10 != s60Var.f28650r && i10 != s60Var.f28651s) {
                        if (i10 == s60Var.E) {
                            return 3;
                        }
                        if (i10 == s60Var.F) {
                            return 4;
                        }
                        if (i10 == s60Var.G) {
                            return 5;
                        }
                        s60Var.getClass();
                        if (i10 != 0 && i10 != s60Var.H && i10 != s60Var.I) {
                            if (i10 == s60Var.v) {
                                return 7;
                            }
                            if (i10 == s60Var.J) {
                                return 8;
                            }
                            if (i10 != s60Var.f28644f) {
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
    public final void v(f2.l1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n60.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        t00 t00Var;
        t00 t00Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        s60 s60Var = this.f27204c;
        switch (i10) {
            case 1:
                t00Var2 = new q60(context);
                break;
            case 2:
                t00Var2 = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false), 0);
                break;
            case 3:
                j60 j60Var = new j60(this, context, s60Var.R, s60Var, s60Var.f28643e0);
                j60Var.setDelegate(new m60(this));
                j60Var.setLayoutParams(new f2.w0(-1, -2));
                t00Var2 = j60Var;
                break;
            case 4:
                t00Var2 = new r60(s60Var, context);
                break;
            case 5:
                t00 t00Var3 = new t00(context, null);
                t00Var3.setIsSingleCell(true);
                t00Var3.setViewType(10);
                t00Var3.f28855w = false;
                t00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                t00Var = t00Var3;
                t00Var2 = t00Var;
                break;
            case 6:
                t00Var2 = new hn(context, 9);
                break;
            case 7:
                t00Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f27454a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.yh.t(org.telegram.ui.ActionBar.j6.f20281y6, null, false, textView, 1);
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t00Var = frameLayout;
                t00Var2 = t00Var;
                break;
            case 9:
                t00Var2 = new p60(s60Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.g3) s60Var).resourcesProvider;
                t00Var2 = new org.telegram.ui.Cells.u3(context, f6Var);
                break;
        }
        return org.telegram.ui.yh.o(t00Var2, t00Var2, -1, -2);
    }
}
