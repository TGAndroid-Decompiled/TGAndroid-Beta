package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;
import org.telegram.ui.xf1;
public final class c01 extends org.telegram.ui.Cells.y6 {
    public final d01 h;

    public c01(d01 d01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = d01Var;
        this.f23840f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f23837a = textView;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.z5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, d6Var);
        this.f23838b = x90Var;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        x90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        x90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        x90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(x90Var, w7.z5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, w7.z5.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f23839c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final c01 f23803b;

                    {
                        this.f23803b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                c01 c01Var = this.f23803b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(c01Var, c01Var.e, 26));
                                return;
                            default:
                                c01 c01Var2 = this.f23803b;
                                int i17 = c01Var2.e;
                                ProfileActivity profileActivity = c01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new xf1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final c01 f23803b;

                    {
                        this.f23803b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                c01 c01Var = this.f23803b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(c01Var, c01Var.e, 26));
                                return;
                            default:
                                c01 c01Var2 = this.f23803b;
                                int i17 = c01Var2.e;
                                ProfileActivity profileActivity = c01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new xf1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
