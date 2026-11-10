package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cb1;
import org.telegram.ui.lw0;
public final class lw0 extends org.telegram.ui.Cells.x6 {
    public final mw0 h;

    public lw0(mw0 mw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.h = mw0Var;
        this.f30910f = org.telegram.messenger.p10.f24474s0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f30906a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.L6, h6Var);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c8.ha.t(-1, -2, i10 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, h6Var);
        this.f30907b = w70Var;
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        org.telegram.ui.ActionBar.t6.C(w70Var, org.telegram.ui.ActionBar.m6.K6, h6Var);
        w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        w70Var.setGravity(i11);
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(w70Var, c8.ha.t(-2, -2, i12, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i15 = 0; i15 < 2; i15++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 8.0f));
            c8.ka.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.Gi, h6Var, 1, 14.0f);
            if (i15 == 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            if (i15 == 0) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            linearLayout.addView(textView2, c8.ha.m(0.5f, 0, 44, i13, i14, 0));
            if (i15 == 0) {
                this.f30908c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final lw0 f30749b;

                    {
                        this.f30749b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                lw0 lw0Var = this.f30749b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.q2(lw0Var, lw0Var.f30909e, 24));
                                return;
                            default:
                                lw0 lw0Var2 = this.f30749b;
                                int i16 = lw0Var2.f30909e;
                                ProfileActivity profileActivity = lw0Var2.h.f48065e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new cb1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final lw0 f30749b;

                    {
                        this.f30749b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                lw0 lw0Var = this.f30749b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.q2(lw0Var, lw0Var.f30909e, 24));
                                return;
                            default:
                                lw0 lw0Var2 = this.f30749b;
                                int i16 = lw0Var2.f30909e;
                                ProfileActivity profileActivity = lw0Var2.h.f48065e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new cb1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
