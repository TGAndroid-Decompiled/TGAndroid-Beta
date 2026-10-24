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
import org.telegram.ui.ag1;
import org.telegram.ui.d01;
public final class d01 extends org.telegram.ui.Cells.a7 {
    public final e01 h;

    public d01(e01 e01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = e01Var;
        this.f22100f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f22097a = textView;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.L6, g6Var);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.z5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, g6Var);
        this.f22098b = w90Var;
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        w90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.J6, g6Var);
        org.telegram.ui.ActionBar.r6.E(w90Var, org.telegram.ui.ActionBar.k6.K6, g6Var);
        w90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        w90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(w90Var, w7.z5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
            w7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var, 1, 14.0f);
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
                this.f22099c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final d01 f24028b;

                    {
                        this.f24028b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                d01 d01Var = this.f24028b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(d01Var, d01Var.e, 27));
                                return;
                            default:
                                d01 d01Var2 = this.f24028b;
                                int i17 = d01Var2.e;
                                ProfileActivity profileActivity = d01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ag1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final d01 f24028b;

                    {
                        this.f24028b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                d01 d01Var = this.f24028b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(d01Var, d01Var.e, 27));
                                return;
                            default:
                                d01 d01Var2 = this.f24028b;
                                int i17 = d01Var2.e;
                                ProfileActivity profileActivity = d01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.g(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ag1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
