package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class r70 extends vm0 {
    public final w70 f30067c;

    public r70(w70 w70Var) {
        this.f30067c = w70Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        w70 w70Var = this.f30067c;
        if (b10 == w70Var.f32347n) {
            if (w70Var.f32332b.admin_id != UserConfig.getInstance(w70.N(w70Var)).clientUserId) {
                return true;
            }
            return false;
        } else if (b10 < w70Var.f32351x || b10 >= w70Var.f32352y) {
            if (b10 >= w70Var.O && b10 < w70Var.P) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int h() {
        return this.f30067c.S;
    }

    @Override
    public final int j(int i10) {
        w70 w70Var = this.f30067c;
        if (i10 == w70Var.h || i10 == w70Var.N || i10 == w70Var.f32350w || i10 == w70Var.f32337e) {
            return 0;
        }
        if (i10 != w70Var.f32347n) {
            if (i10 < w70Var.O || i10 >= w70Var.P) {
                if (i10 < w70Var.f32351x || i10 >= w70Var.f32352y) {
                    if (i10 != w70Var.f32348r && i10 != w70Var.f32349s) {
                        if (i10 == w70Var.H) {
                            return 3;
                        }
                        if (i10 == w70Var.I) {
                            return 4;
                        }
                        if (i10 == w70Var.J) {
                            return 5;
                        }
                        w70Var.getClass();
                        if (i10 != 0 && i10 != w70Var.K && i10 != w70Var.L) {
                            if (i10 == w70Var.v) {
                                return 7;
                            }
                            if (i10 == w70Var.M) {
                                return 8;
                            }
                            if (i10 != w70Var.f32339f) {
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
    public final void v(s4.d1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r70.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        m10 m10Var;
        m10 m10Var2;
        Context context = viewGroup.getContext();
        w70 w70Var = this.f30067c;
        switch (i10) {
            case 1:
                m10Var2 = new u70(context);
                break;
            case 2:
                m10Var2 = new org.telegram.ui.Cells.a7(context, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false), 0);
                break;
            case 3:
                n70 n70Var = new n70(this, context, w70Var.U, w70Var, w70Var.f32342h0);
                n70Var.setDelegate(new q70(this));
                n70Var.setLayoutParams(new s4.q0(-1, -2));
                m10Var2 = n70Var;
                break;
            case 4:
                m10Var2 = new v70(w70Var, context);
                break;
            case 5:
                m10 m10Var3 = new m10(context, null);
                m10Var3.setIsSingleCell(true);
                m10Var3.setViewType(10);
                m10Var3.f28355w = false;
                m10Var3.setPaddingLeft(AndroidUtilities.dp(10.0f));
                m10Var = m10Var3;
                m10Var2 = m10Var;
                break;
            case 6:
                m10Var2 = new co(context, 12);
                break;
            case 7:
                m10Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.f30435a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f20945y6, null, false, textView, 1);
                frameLayout.addView(textView, w7.w5.a(-2.0f, 60.0f, 0.0f, 60.0f, 0.0f, -1, 16));
                m10Var = frameLayout;
                m10Var2 = m10Var;
                break;
            case 9:
                m10Var2 = new t70(w70Var, context);
                break;
            default:
                m10Var2 = new org.telegram.ui.Cells.v3(context, w70.A(w70Var));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m10Var2, m10Var2, -1, -2);
    }
}
