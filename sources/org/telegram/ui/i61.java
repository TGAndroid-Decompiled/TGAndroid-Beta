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
public final class i61 extends org.telegram.ui.Components.rm0 {
    public final j71 f38596c;

    public i61(j71 j71Var) {
        this.f38596c = j71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38596c.f38921u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f38596c.f38923v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        j71 j71Var = this.f38596c;
        if (i10 == j71Var.f38875a) {
            return 7;
        }
        if (i10 < j71Var.f38878b || i10 >= j71Var.f38881c) {
            if (i10 < j71Var.d || i10 >= j71Var.f38886e) {
                if (i10 >= j71Var.E && i10 < j71Var.F) {
                    return 1;
                }
                if (i10 >= j71Var.f38913r && i10 < j71Var.f38916s) {
                    return 3;
                }
                if (j71Var.f38932y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (j71Var.f38934z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == j71Var.v) {
                    return 6;
                }
                if (j71Var.f38926w0.indexOfKey(i10) < 0 && i10 != j71Var.f38889f && i10 != j71Var.f38931y && i10 != j71Var.f38904n && i10 != j71Var.h && i10 != j71Var.f38928x) {
                    if (i10 != j71Var.f38925w) {
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
    public final void v(s4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i61.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        fn0 fn0Var;
        int k10;
        j71 j71Var = this.f38596c;
        int i11 = j71Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = j71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = j71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            fn0Var = new o61(j71Var, context, z10);
        } else if (i10 == 2) {
            fn0Var = new ImageView(j71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = j71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f40139a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (j71Var.f38893g1) {
                    k10 = org.telegram.ui.ActionBar.h6.v(j71Var.f38891f1, org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                fn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(j71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f39818b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.is.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f39817a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                frameLayout3.addView(u3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.d(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f39819c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.d(-1.0f, -1));
                fn0Var = frameLayout2;
            } else if (i10 == 6) {
                fn0 fn0Var2 = new fn0(j71Var.getContext(), 2);
                fn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    fn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    fn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    fn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                fn0Var2.setGravity(17);
                fn0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21171y6, d6Var));
                fn0Var = fn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(j71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                fn0Var = t3Var;
            } else {
                fn0Var = new s61(j71Var, j71Var.getContext());
            }
        } else {
            s61 s61Var = new s61(j71Var, j71Var.getContext());
            if (i10 == 8) {
                s61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(s61Var);
                s61Var.h = imageReceiver;
                s61Var.f41606r = imageReceiver;
                imageReceiver.setImageBitmap(j71Var.N);
                j71Var.O = s61Var;
                s61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            fn0Var = s61Var;
        }
        if (j71.c(j71Var)) {
            fn0Var.setScaleX(0.0f);
            fn0Var.setScaleY(0.0f);
        }
        return new s4.d1(fn0Var);
    }
}
