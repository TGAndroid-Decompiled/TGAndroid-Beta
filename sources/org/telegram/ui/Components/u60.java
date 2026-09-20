package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class u60 extends ul0 {
    public final z60 f28601c;

    public u60(z60 z60Var) {
        this.f28601c = z60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        z60 z60Var = this.f28601c;
        if (b10 == z60Var.f30761n) {
            if (z60Var.f30747b.admin_id != UserConfig.getInstance(z60.M(z60Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < z60Var.f30765x || b10 >= z60Var.f30766y) {
            if (b10 >= z60Var.O && b10 < z60Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f28601c.S;
    }

    @Override
    public final int j(int i10) {
        z60 z60Var = this.f28601c;
        if (i10 == z60Var.h || i10 == z60Var.N || i10 == z60Var.f30764w || i10 == z60Var.e) {
            return 0;
        }
        if (i10 != z60Var.f30761n) {
            if (i10 < z60Var.O || i10 >= z60Var.P) {
                if (i10 < z60Var.f30765x || i10 >= z60Var.f30766y) {
                    if (i10 != z60Var.f30762r && i10 != z60Var.f30763s) {
                        if (i10 == z60Var.H) {
                            return 3;
                        }
                        if (i10 == z60Var.I) {
                            return 4;
                        }
                        if (i10 == z60Var.J) {
                            return 5;
                        }
                        z60Var.getClass();
                        if (i10 != 0 && i10 != z60Var.K && i10 != z60Var.L) {
                            if (i10 == z60Var.v) {
                                return 7;
                            }
                            if (i10 == z60Var.M) {
                                return 8;
                            }
                            if (i10 != z60Var.f30753f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        t00 t00Var;
        t00 t00Var2;
        Context context = viewGroup.getContext();
        z60 z60Var = this.f28601c;
        switch (i10) {
            case 1:
                t00Var2 = new x60(context);
                break;
            case 2:
                t00Var2 = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false), 0);
                break;
            case 3:
                q60 q60Var = new q60(this, context, z60Var.U, z60Var, z60Var.f30756h0);
                q60Var.setDelegate(new t60(this));
                q60Var.setLayoutParams(new s4.p0(-1, -2));
                t00Var2 = q60Var;
                break;
            case 4:
                t00Var2 = new y60(z60Var, context);
                break;
            case 5:
                t00 t00Var3 = new t00(context, null);
                t00Var3.setIsSingleCell(true);
                t00Var3.setViewType(10);
                t00Var3.f28252w = false;
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
                frameLayout.f28939a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f19477y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t00Var = frameLayout;
                t00Var2 = t00Var;
                break;
            case 9:
                t00Var2 = new w60(z60Var, context);
                break;
            default:
                t00Var2 = new org.telegram.ui.Cells.w3(context, z60.y(z60Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(t00Var2, t00Var2, -1, -2);
    }
}
