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
import org.telegram.ui.d11;
import org.telegram.ui.oh1;
public final class d11 extends org.telegram.ui.Cells.z6 {
    public final e11 h;

    public d11(e11 e11Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = e11Var;
        this.f22510f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f22507a = textView;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.z5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, c6Var);
        this.f22508b = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.K6, c6Var));
        da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        da0Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(da0Var, w7.z5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
            w7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView2, 1, 14.0f);
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
                this.f22509c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final d11 f22482b;

                    {
                        this.f22482b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                d11 d11Var = this.f22482b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o8(d11Var, d11Var.e, 25));
                                return;
                            default:
                                d11 d11Var2 = this.f22482b;
                                int i17 = d11Var2.e;
                                ProfileActivity profileActivity = d11Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new oh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final d11 f22482b;

                    {
                        this.f22482b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                d11 d11Var = this.f22482b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o8(d11Var, d11Var.e, 25));
                                return;
                            default:
                                d11 d11Var2 = this.f22482b;
                                int i17 = d11Var2.e;
                                ProfileActivity profileActivity = d11Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new oh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
