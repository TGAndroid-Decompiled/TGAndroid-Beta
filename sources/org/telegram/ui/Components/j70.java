package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class j70 extends mm0 {
    public final o70 f29532c;

    public j70(o70 o70Var) {
        this.f29532c = o70Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        o70 o70Var = this.f29532c;
        if (b10 == o70Var.f31223n) {
            if (o70Var.f31209b.admin_id != UserConfig.getInstance(o70.M(o70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < o70Var.f31227x || b10 >= o70Var.f31228y) {
            if (b10 >= o70Var.O && b10 < o70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29532c.S;
    }

    @Override
    public final int j(int i10) {
        o70 o70Var = this.f29532c;
        if (i10 == o70Var.h || i10 == o70Var.N || i10 == o70Var.f31226w || i10 == o70Var.e) {
            return 0;
        }
        if (i10 != o70Var.f31223n) {
            if (i10 < o70Var.O || i10 >= o70Var.P) {
                if (i10 < o70Var.f31227x || i10 >= o70Var.f31228y) {
                    if (i10 != o70Var.f31224r && i10 != o70Var.f31225s) {
                        if (i10 == o70Var.H) {
                            return 3;
                        }
                        if (i10 == o70Var.I) {
                            return 4;
                        }
                        if (i10 == o70Var.J) {
                            return 5;
                        }
                        o70Var.getClass();
                        if (i10 != 0 && i10 != o70Var.K && i10 != o70Var.L) {
                            if (i10 == o70Var.v) {
                                return 7;
                            }
                            if (i10 == o70Var.M) {
                                return 8;
                            }
                            if (i10 != o70Var.f31215f) {
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
    public final void v(s4.e1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j70.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        f70 f70Var;
        Context context = viewGroup.getContext();
        o70 o70Var = this.f29532c;
        switch (i10) {
            case 1:
                f70Var = new m70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.y6.f23300a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, org.telegram.ui.ActionBar.y6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.f7.i(i11, f7Var, null);
                c10Var = f7Var;
                f70Var = c10Var;
                break;
            case 3:
                f70 f70Var2 = new f70(this, context, o70Var.U, o70Var, o70Var.f31218h0);
                f70Var2.setDelegate(new i70(this));
                f70Var2.setLayoutParams(new s4.q0(-1, -2));
                f70Var = f70Var2;
                break;
            case 4:
                f70Var = new n70(o70Var, context);
                break;
            case 5:
                c10 c10Var2 = new c10(context, null);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(10);
                c10Var2.f27026w = false;
                c10Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                c10Var = c10Var2;
                f70Var = c10Var;
                break;
            case 6:
                f70Var = new vn(context, 12);
                break;
            case 7:
                f70Var = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f29875a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23749y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, kb1.h(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                f70Var = frameLayout;
                break;
            case 9:
                f70Var = new l70(o70Var, context);
                break;
            default:
                f70Var = new org.telegram.ui.Cells.z3(context, o70.y(o70Var));
                break;
        }
        return ic.a.n(f70Var, f70Var, -1, -2);
    }
}
