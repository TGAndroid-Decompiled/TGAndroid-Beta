package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.iw0;
import org.telegram.ui.ya1;
public final class iw0 extends org.telegram.ui.Cells.x6 {
    public final jw0 h;

    public iw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.h = jw0Var;
        this.f30889f = org.telegram.messenger.p10.f24459s0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f30885a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.L6, f6Var);
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c8.ha.t(-1, -2, i10 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, f6Var);
        this.f30886b = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, f6Var);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.K6, f6Var);
        w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        w70Var.setGravity(i11);
        if (org.telegram.messenger.hd.f22871a0) {
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
            textView2.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            c8.ka.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var, 1, 14.0f);
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
                this.f30887c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final iw0 f30729b;

                    {
                        this.f30729b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                iw0 iw0Var = this.f30729b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(iw0Var, iw0Var.f30888e, 24));
                                return;
                            default:
                                iw0 iw0Var2 = this.f30729b;
                                int i16 = iw0Var2.f30888e;
                                ProfileActivity profileActivity = iw0Var2.h.f47050e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ya1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final iw0 f30729b;

                    {
                        this.f30729b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                iw0 iw0Var = this.f30729b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(iw0Var, iw0Var.f30888e, 24));
                                return;
                            default:
                                iw0 iw0Var2 = this.f30729b;
                                int i16 = iw0Var2.f30888e;
                                ProfileActivity profileActivity = iw0Var2.h.f47050e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ya1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
