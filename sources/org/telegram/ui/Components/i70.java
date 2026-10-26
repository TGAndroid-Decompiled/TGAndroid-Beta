package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class i70 extends lm0 {
    public final n70 f29206c;

    public i70(n70 n70Var) {
        this.f29206c = n70Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        n70 n70Var = this.f29206c;
        if (b10 == n70Var.f30900n) {
            if (n70Var.f30886b.admin_id != UserConfig.getInstance(n70.M(n70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < n70Var.f30904x || b10 >= n70Var.f30905y) {
            if (b10 >= n70Var.O && b10 < n70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f29206c.S;
    }

    @Override
    public final int j(int i10) {
        n70 n70Var = this.f29206c;
        if (i10 == n70Var.h || i10 == n70Var.N || i10 == n70Var.f30903w || i10 == n70Var.e) {
            return 0;
        }
        if (i10 != n70Var.f30900n) {
            if (i10 < n70Var.O || i10 >= n70Var.P) {
                if (i10 < n70Var.f30904x || i10 >= n70Var.f30905y) {
                    if (i10 != n70Var.f30901r && i10 != n70Var.f30902s) {
                        if (i10 == n70Var.H) {
                            return 3;
                        }
                        if (i10 == n70Var.I) {
                            return 4;
                        }
                        if (i10 == n70Var.J) {
                            return 5;
                        }
                        n70Var.getClass();
                        if (i10 != 0 && i10 != n70Var.K && i10 != n70Var.L) {
                            if (i10 == n70Var.v) {
                                return 7;
                            }
                            if (i10 == n70Var.M) {
                                return 8;
                            }
                            if (i10 != n70Var.f30892f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i70.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        e70 e70Var;
        Context context = viewGroup.getContext();
        n70 n70Var = this.f29206c;
        switch (i10) {
            case 1:
                e70Var = new l70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.y6.f23299a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, org.telegram.ui.ActionBar.y6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.f7.i(i11, f7Var, null);
                c10Var = f7Var;
                e70Var = c10Var;
                break;
            case 3:
                e70 e70Var2 = new e70(this, context, n70Var.U, n70Var, n70Var.f30895h0);
                e70Var2.setDelegate(new h70(this));
                e70Var2.setLayoutParams(new s4.q0(-1, -2));
                e70Var = e70Var2;
                break;
            case 4:
                e70Var = new m70(n70Var, context);
                break;
            case 5:
                c10 c10Var2 = new c10(context, null);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(10);
                c10Var2.f27031w = false;
                c10Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                c10Var = c10Var2;
                e70Var = c10Var;
                break;
            case 6:
                e70Var = new vn(context, 12);
                break;
            case 7:
                e70Var = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f29504a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23748y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, gb1.h(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                e70Var = frameLayout;
                break;
            case 9:
                e70Var = new k70(n70Var, context);
                break;
            default:
                e70Var = new org.telegram.ui.Cells.z3(context, n70.y(n70Var));
                break;
        }
        return ic.a.n(e70Var, e70Var, -1, -2);
    }
}
