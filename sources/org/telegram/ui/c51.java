package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c51 extends org.telegram.ui.Components.il0 {
    public final d61 f37004c;

    public c51(d61 d61Var) {
        this.f37004c = d61Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37004c.f37353q0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f37004c.f37356r0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        d61 d61Var = this.f37004c;
        if (i10 == d61Var.f37317a) {
            return 7;
        }
        if (i10 < d61Var.f37320b || i10 >= d61Var.f37323c) {
            if (i10 < d61Var.d || i10 >= d61Var.f37328e) {
                if (i10 >= d61Var.A && i10 < d61Var.B) {
                    return 1;
                }
                if (i10 >= d61Var.f37355r && i10 < d61Var.f37358s) {
                    return 3;
                }
                if (d61Var.f37363u0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (d61Var.f37365v0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == d61Var.v) {
                    return 6;
                }
                if (d61Var.f37359s0.indexOfKey(i10) < 0 && i10 != d61Var.f37331f && i10 != d61Var.f37373y && i10 != d61Var.f37346n && i10 != d61Var.h && i10 != d61Var.f37370x) {
                    if (i10 != d61Var.f37367w) {
                        return 3;
                    }
                    return 8;
                }
                return 0;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        om0 om0Var;
        int k9;
        d61 d61Var = this.f37004c;
        int i11 = d61Var.S;
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = d61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            om0Var = new i51(d61Var, context, z10);
        } else if (i10 == 2) {
            om0Var = new ImageView(d61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = d61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f38772a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (d61Var.f37325c1) {
                    k9 = org.telegram.ui.ActionBar.g6.v(d61Var.f37322b1, org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)));
                } else {
                    k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), k9));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, i7.f6.e(-2, -2, 17));
                om0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(d61Var.getContext());
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f38467b = r3Var;
                r3Var.b(0.3f, 250L, org.telegram.ui.Components.jr.h);
                r3Var.setTextSize(AndroidUtilities.dp(14.0f));
                r3Var.setTypeface(AndroidUtilities.bold());
                r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
                r3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f38466a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
                frameLayout3.addView(r3Var, i7.f6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, i7.f6.c(-1.0f, -1));
                cg.d1 d1Var = new cg.d1(frameLayout2.getContext(), c6Var, false);
                frameLayout2.f38468c = d1Var;
                d1Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(d1Var, i7.f6.c(-1.0f, -1));
                om0Var = frameLayout2;
            } else if (i10 == 6) {
                om0 om0Var2 = new om0(d61Var.getContext(), 1);
                om0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    om0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    om0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    om0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                om0Var2.setGravity(17);
                om0Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
                om0Var = om0Var2;
            } else if (i10 == 7) {
                View q3Var = new org.telegram.ui.Cells.q3(d61Var.getContext(), 52);
                q3Var.setTag("searchbox");
                om0Var = q3Var;
            } else {
                om0Var = new m51(d61Var, d61Var.getContext());
            }
        } else {
            m51 m51Var = new m51(d61Var, d61Var.getContext());
            if (i10 == 8) {
                m51Var.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(m51Var);
                m51Var.h = imageReceiver;
                m51Var.f40432r = imageReceiver;
                imageReceiver.setImageBitmap(d61Var.J);
                d61Var.K = m51Var;
                m51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            om0Var = m51Var;
        }
        if (d61.c(d61Var)) {
            om0Var.setScaleX(0.0f);
            om0Var.setScaleY(0.0f);
        }
        return new f2.n1(om0Var);
    }
}
