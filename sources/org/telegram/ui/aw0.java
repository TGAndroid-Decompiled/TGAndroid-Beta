package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;
import org.telegram.ui.ra1;
public final class aw0 extends org.telegram.ui.Cells.w6 {
    public final bw0 h;

    public aw0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.h = bw0Var;
        this.f30812f = org.telegram.messenger.h10.f22829t0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f30808a = textView;
        k2.p1.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.L6, e6Var);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, b8.mf.t(-1, -2, i10 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, e6Var);
        this.f30809b = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.K6, e6Var);
        s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        s70Var.setGravity(i11);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(s70Var, b8.mf.t(-2, -2, i12, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i15 = 0; i15 < 2; i15++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            b8.pf.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var, 1, 14.0f);
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
            linearLayout.addView(textView2, b8.mf.m(0.5f, 0, 44, i13, i14, 0));
            if (i15 == 0) {
                this.f30810c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final aw0 f30737b;

                    {
                        this.f30737b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                aw0 aw0Var = this.f30737b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(aw0Var, aw0Var.f30811e, 24));
                                return;
                            default:
                                aw0 aw0Var2 = this.f30737b;
                                int i16 = aw0Var2.f30811e;
                                ProfileActivity profileActivity = aw0Var2.h.f44157e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ra1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final aw0 f30737b;

                    {
                        this.f30737b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                aw0 aw0Var = this.f30737b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(aw0Var, aw0Var.f30811e, 24));
                                return;
                            default:
                                aw0 aw0Var2 = this.f30737b;
                                int i16 = aw0Var2.f30811e;
                                ProfileActivity profileActivity = aw0Var2.h.f44157e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ra1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
