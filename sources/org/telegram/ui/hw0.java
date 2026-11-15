package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.xa1;
public final class hw0 extends org.telegram.ui.Cells.w6 {
    public final iw0 h;

    public hw0(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.h = iw0Var;
        this.f31888f = org.telegram.messenger.m10.f24940t0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f31884a = textView;
        i5.c.v(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.L6, e6Var);
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c8.ja.t(-1, -2, i10 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, e6Var);
        this.f31885b = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, e6Var);
        org.telegram.ui.ActionBar.q6.C(z70Var, org.telegram.ui.ActionBar.j6.K6, e6Var);
        z70Var.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z70Var.setGravity(i11);
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(z70Var, c8.ja.t(-2, -2, i12, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i15 = 0; i15 < 2; i15++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
            c8.na.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, e6Var, 1, 14.0f);
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
            linearLayout.addView(textView2, c8.ja.m(0.5f, 0, 44, i13, i14, 0));
            if (i15 == 0) {
                this.f31886c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final hw0 f31813b;

                    {
                        this.f31813b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                hw0 hw0Var = this.f31813b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(hw0Var, hw0Var.f31887e, 27));
                                return;
                            default:
                                hw0 hw0Var2 = this.f31813b;
                                int i16 = hw0Var2.f31887e;
                                ProfileActivity profileActivity = hw0Var2.h.f48123e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new xa1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final hw0 f31813b;

                    {
                        this.f31813b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                hw0 hw0Var = this.f31813b;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(hw0Var, hw0Var.f31887e, 27));
                                return;
                            default:
                                hw0 hw0Var2 = this.f31813b;
                                int i16 = hw0Var2.f31887e;
                                ProfileActivity profileActivity = hw0Var2.h.f48123e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new xa1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
