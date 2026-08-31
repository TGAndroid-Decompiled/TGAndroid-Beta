package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jm;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h01;
import org.telegram.ui.qg1;
public final class h01 extends org.telegram.ui.Cells.y6 {
    public final i01 h;

    public h01(i01 i01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = i01Var;
        this.f24449f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f24445a = textView;
        yh.p(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, k7.c6.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, g6Var);
        this.f24446b = g90Var;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, g6Var));
        g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.K6, g6Var));
        g90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(g90Var, k7.c6.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.c6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
            k7.e6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            b.w(org.telegram.ui.ActionBar.k6.Sh, g6Var, textView2, 1, 14.0f);
            if (i16 == 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            if (i16 == 0) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            linearLayout.addView(textView2, k7.c6.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f24447c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final h01 f24401b;

                    {
                        this.f24401b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h01 h01Var = this.f24401b;
                                AndroidUtilities.runOnUIThread(new jm(h01Var, h01Var.f24448e, 22));
                                return;
                            default:
                                h01 h01Var2 = this.f24401b;
                                int i17 = h01Var2.f24448e;
                                ProfileActivity profileActivity = h01Var2.h.f37715e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new qg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final h01 f24401b;

                    {
                        this.f24401b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h01 h01Var = this.f24401b;
                                AndroidUtilities.runOnUIThread(new jm(h01Var, h01Var.f24448e, 22));
                                return;
                            default:
                                h01 h01Var2 = this.f24401b;
                                int i17 = h01Var2.f24448e;
                                ProfileActivity profileActivity = h01Var2.h.f37715e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new qg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
