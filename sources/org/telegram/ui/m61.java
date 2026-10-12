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
public final class m61 extends org.telegram.ui.Components.vm0 {
    public final n71 f39931c;

    public m61(n71 n71Var) {
        this.f39931c = n71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39931c.f40299u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f39931c.f40301v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        n71 n71Var = this.f39931c;
        if (i10 == n71Var.f40253a) {
            return 7;
        }
        if (i10 < n71Var.f40256b || i10 >= n71Var.f40259c) {
            if (i10 < n71Var.d || i10 >= n71Var.f40264e) {
                if (i10 >= n71Var.E && i10 < n71Var.F) {
                    return 1;
                }
                if (i10 >= n71Var.f40291r && i10 < n71Var.f40294s) {
                    return 3;
                }
                if (n71Var.f40310y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (n71Var.f40312z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == n71Var.v) {
                    return 6;
                }
                if (n71Var.f40304w0.indexOfKey(i10) < 0 && i10 != n71Var.f40267f && i10 != n71Var.f40309y && i10 != n71Var.f40282n && i10 != n71Var.h && i10 != n71Var.f40306x) {
                    if (i10 != n71Var.f40303w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m61.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        in0 in0Var;
        int k10;
        n71 n71Var = this.f39931c;
        int i11 = n71Var.W;
        org.telegram.ui.ActionBar.c6 c6Var = n71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = n71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            in0Var = new s61(n71Var, context, z10);
        } else if (i10 == 2) {
            in0Var = new ImageView(n71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = n71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f41517a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (n71Var.f40271g1) {
                    k10 = org.telegram.ui.ActionBar.h6.v(n71Var.f40269f1, org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.w5.e(-2, -2, 17));
                in0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(n71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f41195b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.js.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, c6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f41194a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var)));
                frameLayout3.addView(u3Var, w7.w5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.w5.d(-1.0f, -1));
                rg.q0 q0Var = new rg.q0(frameLayout2.getContext(), c6Var, false);
                frameLayout2.f41196c = q0Var;
                q0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(q0Var, w7.w5.d(-1.0f, -1));
                in0Var = frameLayout2;
            } else if (i10 == 6) {
                in0 in0Var2 = new in0(n71Var.getContext(), 2);
                in0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    in0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    in0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    in0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                in0Var2.setGravity(17);
                in0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20945y6, c6Var));
                in0Var = in0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(n71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                in0Var = t3Var;
            } else {
                in0Var = new w61(n71Var, n71Var.getContext());
            }
        } else {
            w61 w61Var = new w61(n71Var, n71Var.getContext());
            if (i10 == 8) {
                w61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(w61Var);
                w61Var.h = imageReceiver;
                w61Var.f43058r = imageReceiver;
                imageReceiver.setImageBitmap(n71Var.N);
                n71Var.O = w61Var;
                w61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            in0Var = w61Var;
        }
        if (n71.c(n71Var)) {
            in0Var.setScaleX(0.0f);
            in0Var.setScaleY(0.0f);
        }
        return new s4.d1(in0Var);
    }
}
