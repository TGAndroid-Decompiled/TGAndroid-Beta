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
import org.telegram.ui.fg1;
import org.telegram.ui.k01;
public final class k01 extends org.telegram.ui.Cells.e7 {
    public final l01 h;

    public k01(l01 l01Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = l01Var;
        this.f24037f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f24034a = textView;
        ic.a.o(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.L6, u6Var);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, org.telegram.ui.Components.kb1.x(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context, u6Var);
        this.f24035b = aa0Var;
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, u6Var);
        org.telegram.ui.ActionBar.f7.D(aa0Var, org.telegram.ui.ActionBar.y6.K6, u6Var);
        aa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        aa0Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(aa0Var, org.telegram.ui.Components.kb1.x(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, org.telegram.ui.Components.kb1.o(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
            org.telegram.ui.Components.kb1.c(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.Sh, u6Var, 1, 14.0f);
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
            linearLayout.addView(textView2, org.telegram.ui.Components.kb1.q(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f24036c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final k01 f24016b;

                    {
                        this.f24016b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k01 k01Var = this.f24016b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(k01Var, k01Var.e, 27));
                                return;
                            default:
                                k01 k01Var2 = this.f24016b;
                                int i17 = k01Var2.e;
                                ProfileActivity profileActivity = k01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new fg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final k01 f24016b;

                    {
                        this.f24016b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k01 k01Var = this.f24016b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(k01Var, k01Var.e, 27));
                                return;
                            default:
                                k01 k01Var2 = this.f24016b;
                                int i17 = k01Var2.e;
                                ProfileActivity profileActivity = k01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new fg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
