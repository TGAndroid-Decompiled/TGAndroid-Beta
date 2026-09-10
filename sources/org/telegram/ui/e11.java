package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.zd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e11;
import org.telegram.ui.mh1;
public final class e11 extends org.telegram.ui.Cells.b7 {
    public final f11 h;

    public e11(f11 f11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = f11Var;
        this.f18937f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f18934a = textView;
        com.google.android.gms.internal.vision.e2.k(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.a6.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, f6Var);
        this.f18935b = m90Var;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        m90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, f6Var));
        m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        m90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(m90Var, w7.a6.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.a6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
            w7.c6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.Sh, f6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, w7.a6.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f18936c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final e11 f18878b;

                    {
                        this.f18878b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                e11 e11Var = this.f18878b;
                                AndroidUtilities.runOnUIThread(new zd(e11Var, e11Var.e, 23));
                                return;
                            default:
                                e11 e11Var2 = this.f18878b;
                                int i17 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new mh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final e11 f18878b;

                    {
                        this.f18878b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                e11 e11Var = this.f18878b;
                                AndroidUtilities.runOnUIThread(new zd(e11Var, e11Var.e, 23));
                                return;
                            default:
                                e11 e11Var2 = this.f18878b;
                                int i17 = e11Var2.e;
                                ProfileActivity profileActivity = e11Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new mh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
