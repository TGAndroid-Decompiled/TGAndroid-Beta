package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class o60 extends ql0 {
    public final t60 f27469c;

    public o60(t60 t60Var) {
        this.f27469c = t60Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        t60 t60Var = this.f27469c;
        if (b10 == t60Var.f28918n) {
            long j10 = t60Var.f28907b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            if (j10 != UserConfig.getInstance(i10).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < t60Var.f28922x || b10 >= t60Var.f28923y) {
            if (b10 >= t60Var.L && b10 < t60Var.M) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f27469c.P;
    }

    @Override
    public final int j(int i10) {
        t60 t60Var = this.f27469c;
        if (i10 == t60Var.h || i10 == t60Var.K || i10 == t60Var.f28921w || i10 == t60Var.e) {
            return 0;
        }
        if (i10 != t60Var.f28918n) {
            if (i10 < t60Var.L || i10 >= t60Var.M) {
                if (i10 < t60Var.f28922x || i10 >= t60Var.f28923y) {
                    if (i10 != t60Var.f28919r && i10 != t60Var.f28920s) {
                        if (i10 == t60Var.E) {
                            return 3;
                        }
                        if (i10 == t60Var.F) {
                            return 4;
                        }
                        if (i10 == t60Var.G) {
                            return 5;
                        }
                        t60Var.getClass();
                        if (i10 != 0 && i10 != t60Var.H && i10 != t60Var.I) {
                            if (i10 == t60Var.v) {
                                return 7;
                            }
                            if (i10 == t60Var.J) {
                                return 8;
                            }
                            if (i10 != t60Var.f28913f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o60.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        u00 u00Var2;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        t60 t60Var = this.f27469c;
        switch (i10) {
            case 1:
                u00Var2 = new r60(context);
                break;
            case 2:
                u00Var2 = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false), 0);
                break;
            case 3:
                k60 k60Var = new k60(this, context, t60Var.R, t60Var, t60Var.f28912e0);
                k60Var.setDelegate(new n60(this));
                k60Var.setLayoutParams(new f2.w0(-1, -2));
                u00Var2 = k60Var;
                break;
            case 4:
                u00Var2 = new s60(t60Var, context);
                break;
            case 5:
                u00 u00Var3 = new u00(context, null);
                u00Var3.setIsSingleCell(true);
                u00Var3.setViewType(10);
                u00Var3.f29071w = false;
                u00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                u00Var = u00Var3;
                u00Var2 = u00Var;
                break;
            case 6:
                u00Var2 = new gn(context, 9);
                break;
            case 7:
                u00Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f27745a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.f20256y6, null, false, textView, 1);
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = frameLayout;
                u00Var2 = u00Var;
                break;
            case 9:
                u00Var2 = new q60(t60Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.g3) t60Var).resourcesProvider;
                u00Var2 = new org.telegram.ui.Cells.t3(context, f6Var);
                break;
        }
        return org.telegram.ui.ai.n(u00Var2, u00Var2, -1, -2);
    }
}
