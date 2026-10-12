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
public final class q61 extends org.telegram.ui.Components.lm0 {
    public final r71 f39349c;

    public q61(r71 r71Var) {
        this.f39349c = r71Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39349c.f39664u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f39349c.f39666v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        r71 r71Var = this.f39349c;
        if (i10 == r71Var.f39619a) {
            return 7;
        }
        if (i10 < r71Var.f39622b || i10 >= r71Var.f39625c) {
            if (i10 < r71Var.d || i10 >= r71Var.e) {
                if (i10 >= r71Var.E && i10 < r71Var.F) {
                    return 1;
                }
                if (i10 >= r71Var.f39656r && i10 < r71Var.f39659s) {
                    return 3;
                }
                if (r71Var.f39675y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (r71Var.f39677z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == r71Var.v) {
                    return 6;
                }
                if (r71Var.f39669w0.indexOfKey(i10) < 0 && i10 != r71Var.f39632f && i10 != r71Var.f39674y && i10 != r71Var.f39647n && i10 != r71Var.h && i10 != r71Var.f39671x) {
                    if (i10 != r71Var.f39668w) {
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
    public final void v(s4.b1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q61.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        mn0 mn0Var;
        int k10;
        r71 r71Var = this.f39349c;
        int i11 = r71Var.W;
        org.telegram.ui.ActionBar.c6 c6Var = r71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = r71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            mn0Var = new w61(r71Var, context, z10);
        } else if (i10 == 2) {
            mn0Var = new ImageView(r71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = r71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f40909a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (r71Var.f39636g1) {
                    k10 = org.telegram.ui.ActionBar.g6.v(r71Var.f39634f1, org.telegram.ui.ActionBar.g6.m1(0.4f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.a6.e(-2, -2, 17));
                mn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(r71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f40551b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.es.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f40550a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
                frameLayout3.addView(u3Var, w7.a6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.a6.d(-1.0f, -1));
                sg.q0 q0Var = new sg.q0(frameLayout2.getContext(), c6Var, false);
                frameLayout2.f40552c = q0Var;
                q0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(q0Var, w7.a6.d(-1.0f, -1));
                mn0Var = frameLayout2;
            } else if (i10 == 6) {
                mn0 mn0Var2 = new mn0(r71Var.getContext(), 2);
                mn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    mn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    mn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    mn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                mn0Var2.setGravity(17);
                mn0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, c6Var));
                mn0Var = mn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(r71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                mn0Var = t3Var;
            } else {
                mn0Var = new a71(r71Var, r71Var.getContext());
            }
        } else {
            a71 a71Var = new a71(r71Var, r71Var.getContext());
            if (i10 == 8) {
                a71Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(a71Var);
                a71Var.h = imageReceiver;
                a71Var.f34068r = imageReceiver;
                imageReceiver.setImageBitmap(r71Var.N);
                r71Var.O = a71Var;
                a71Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            mn0Var = a71Var;
        }
        if (r71.c(r71Var)) {
            mn0Var.setScaleX(0.0f);
            mn0Var.setScaleY(0.0f);
        }
        return new s4.b1(mn0Var);
    }
}
