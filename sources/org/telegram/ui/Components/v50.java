package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class v50 extends vk0 {
    public final a60 f33265c;

    public v50(a60 a60Var) {
        this.f33265c = a60Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        a60 a60Var = this.f33265c;
        if (b10 == a60Var.f26688n) {
            if (a60Var.f26677b.admin_id != UserConfig.getInstance(a60.L(a60Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < a60Var.f26692x || b10 >= a60Var.f26693y) {
            if (b10 >= a60Var.K && b10 < a60Var.L) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f33265c.O;
    }

    @Override
    public final int j(int i9) {
        a60 a60Var = this.f33265c;
        if (i9 == a60Var.h || i9 == a60Var.J || i9 == a60Var.f26691w || i9 == a60Var.f26682e) {
            return 0;
        }
        if (i9 != a60Var.f26688n) {
            if (i9 < a60Var.K || i9 >= a60Var.L) {
                if (i9 < a60Var.f26692x || i9 >= a60Var.f26693y) {
                    if (i9 != a60Var.f26689r && i9 != a60Var.f26690s) {
                        if (i9 == a60Var.D) {
                            return 3;
                        }
                        if (i9 == a60Var.E) {
                            return 4;
                        }
                        if (i9 == a60Var.F) {
                            return 5;
                        }
                        a60Var.getClass();
                        if (i9 != 0 && i9 != a60Var.G && i9 != a60Var.H) {
                            if (i9 == a60Var.v) {
                                return 7;
                            }
                            if (i9 == a60Var.I) {
                                return 8;
                            }
                            if (i9 != a60Var.f26684f) {
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
    public final void v(f2.q1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v50.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        e00 e00Var;
        e00 e00Var2;
        Context context = viewGroup.getContext();
        a60 a60Var = this.f33265c;
        switch (i9) {
            case 1:
                e00Var2 = new y50(context);
                break;
            case 2:
                e00Var2 = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false), 0);
                break;
            case 3:
                r50 r50Var = new r50(this, context, a60Var.Q, a60Var, a60Var.f26681d0);
                r50Var.setDelegate(new u50(this));
                r50Var.setLayoutParams(new f2.a1(-1, -2));
                e00Var2 = r50Var;
                break;
            case 4:
                e00Var2 = new z50(a60Var, context);
                break;
            case 5:
                e00 e00Var3 = new e00(context, null);
                e00Var3.setIsSingleCell(true);
                e00Var3.setViewType(10);
                e00Var3.f27885w = false;
                e00Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                e00Var = e00Var3;
                e00Var2 = e00Var;
                break;
            case 6:
                e00Var2 = new an(context, 13);
                break;
            case 7:
                e00Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f34113a = textView;
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.f23369y6, null, false, textView, 1);
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                e00Var = frameLayout;
                e00Var2 = e00Var;
                break;
            case 9:
                e00Var2 = new x50(a60Var, context);
                break;
            default:
                e00Var2 = new org.telegram.ui.Cells.v3(context, a60.y(a60Var));
                break;
        }
        return j3.r0.s(e00Var2, e00Var2, -1, -2);
    }
}
