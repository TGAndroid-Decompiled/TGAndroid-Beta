package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ld;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p01;
import org.telegram.ui.zg1;
public final class p01 extends org.telegram.ui.Cells.a7 {
    public final q01 h;

    public p01(q01 q01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = q01Var;
        this.f20028f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f20025a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.y5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(context, d6Var);
        this.f20026b = o90Var;
        o90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        o90Var.setTextSize(1, 14.0f);
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        o90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        o90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        o90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(o90Var, w7.y5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.a6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, w7.y5.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f20027c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final p01 f21913b;

                    {
                        this.f21913b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                p01 p01Var = this.f21913b;
                                AndroidUtilities.runOnUIThread(new ld(p01Var, p01Var.e, 24));
                                return;
                            default:
                                p01 p01Var2 = this.f21913b;
                                int i17 = p01Var2.e;
                                ProfileActivity profileActivity = p01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final p01 f21913b;

                    {
                        this.f21913b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                p01 p01Var = this.f21913b;
                                AndroidUtilities.runOnUIThread(new ld(p01Var, p01Var.e, 24));
                                return;
                            default:
                                p01 p01Var2 = this.f21913b;
                                int i17 = p01Var2.e;
                                ProfileActivity profileActivity = p01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
