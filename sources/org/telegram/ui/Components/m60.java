package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class m60 extends kl0 {
    public final r60 f28420c;

    public m60(r60 r60Var) {
        this.f28420c = r60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        r60 r60Var = this.f28420c;
        if (b10 == r60Var.f29983n) {
            if (r60Var.f29968b.admin_id != UserConfig.getInstance(r60.M(r60Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < r60Var.f29987x || b10 >= r60Var.f29988y) {
            if (b10 >= r60Var.O && b10 < r60Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f28420c.S;
    }

    @Override
    public final int j(int i10) {
        r60 r60Var = this.f28420c;
        if (i10 == r60Var.h || i10 == r60Var.N || i10 == r60Var.f29986w || i10 == r60Var.f29973e) {
            return 0;
        }
        if (i10 != r60Var.f29983n) {
            if (i10 < r60Var.O || i10 >= r60Var.P) {
                if (i10 < r60Var.f29987x || i10 >= r60Var.f29988y) {
                    if (i10 != r60Var.f29984r && i10 != r60Var.f29985s) {
                        if (i10 == r60Var.H) {
                            return 3;
                        }
                        if (i10 == r60Var.I) {
                            return 4;
                        }
                        if (i10 == r60Var.J) {
                            return 5;
                        }
                        r60Var.getClass();
                        if (i10 != 0 && i10 != r60Var.K && i10 != r60Var.L) {
                            if (i10 == r60Var.v) {
                                return 7;
                            }
                            if (i10 == r60Var.M) {
                                return 8;
                            }
                            if (i10 != r60Var.f29975f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        t00 t00Var;
        t00 t00Var2;
        Context context = viewGroup.getContext();
        r60 r60Var = this.f28420c;
        switch (i10) {
            case 1:
                t00Var2 = new p60(context);
                break;
            case 2:
                t00Var2 = new org.telegram.ui.Cells.a7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false), 0);
                break;
            case 3:
                i60 i60Var = new i60(this, context, r60Var.U, r60Var, r60Var.f29978h0);
                i60Var.setDelegate(new l60(this));
                i60Var.setLayoutParams(new s4.p0(-1, -2));
                t00Var2 = i60Var;
                break;
            case 4:
                t00Var2 = new q60(r60Var, context);
                break;
            case 5:
                t00 t00Var3 = new t00(context, null);
                t00Var3.setIsSingleCell(true);
                t00Var3.setViewType(10);
                t00Var3.f30492w = false;
                t00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                t00Var = t00Var3;
                t00Var2 = t00Var;
                break;
            case 6:
                t00Var2 = new jn(context, 12);
                break;
            case 7:
                t00Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f28653a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f21069y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                t00Var = frameLayout;
                t00Var2 = t00Var;
                break;
            case 9:
                t00Var2 = new o60(r60Var, context);
                break;
            default:
                t00Var2 = new org.telegram.ui.Cells.u3(context, r60.y(r60Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(t00Var2, t00Var2, -1, -2);
    }
}
