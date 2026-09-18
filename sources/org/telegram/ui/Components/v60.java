package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class v60 extends vl0 {
    public final a70 f28942c;

    public v60(a70 a70Var) {
        this.f28942c = a70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        a70 a70Var = this.f28942c;
        if (b10 == a70Var.f22550n) {
            if (a70Var.f22536b.admin_id != UserConfig.getInstance(a70.M(a70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < a70Var.f22554x || b10 >= a70Var.f22555y) {
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
        return this.f28942c.S;
    }

    @Override
    public final int j(int i10) {
        a70 a70Var = this.f28942c;
        if (i10 == a70Var.h || i10 == a70Var.N || i10 == a70Var.f22553w || i10 == a70Var.e) {
            return 0;
        }
        if (i10 != a70Var.f22550n) {
            if (i10 < a70Var.O || i10 >= a70Var.P) {
                if (i10 < a70Var.f22554x || i10 >= a70Var.f22555y) {
                    if (i10 != a70Var.f22551r && i10 != a70Var.f22552s) {
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
                            if (i10 != a70Var.f22542f) {
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
        t00 t00Var;
        t00 t00Var2;
        Context context = viewGroup.getContext();
        a70 a70Var = this.f28942c;
        switch (i10) {
            case 1:
                t00Var2 = new y60(context);
                break;
            case 2:
                t00Var2 = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false), 0);
                break;
            case 3:
                r60 r60Var = new r60(this, context, a70Var.U, a70Var, a70Var.f22545h0);
                r60Var.setDelegate(new u60(this));
                r60Var.setLayoutParams(new s4.p0(-1, -2));
                t00Var2 = r60Var;
                break;
            case 4:
                t00Var2 = new z60(a70Var, context);
                break;
            case 5:
                t00 t00Var3 = new t00(context, null);
                t00Var3.setIsSingleCell(true);
                t00Var3.setViewType(10);
                t00Var3.f28272w = false;
                t00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                t00Var = t00Var3;
                t00Var2 = t00Var;
                break;
            case 6:
                t00Var2 = new kn(context, 12);
                break;
            case 7:
                t00Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f29869a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f19445y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t00Var = frameLayout;
                t00Var2 = t00Var;
                break;
            case 9:
                t00Var2 = new x60(a70Var, context);
                break;
            default:
                t00Var2 = new org.telegram.ui.Cells.v3(context, a70.y(a70Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(t00Var2, t00Var2, -1, -2);
    }
}
