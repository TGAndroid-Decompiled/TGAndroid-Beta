package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class g01 extends org.telegram.ui.Components.sj0 {
    public final g11 f45427c;

    public g01(g11 g11Var) {
        this.f45427c = g11Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 2 || i3 == 1 || i3 == 3 || i3 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45427c.f45482v0;
    }

    @Override
    public final long c(int i3) {
        return Math.abs(((Long) this.f45427c.f45485w0.get(i3)).longValue());
    }

    @Override
    public final int d(int i3) {
        g11 g11Var = this.f45427c;
        if (i3 == g11Var.f45434a) {
            return 7;
        }
        if (i3 < g11Var.f45438b || i3 >= g11Var.f45441c) {
            if (i3 < g11Var.d || i3 >= g11Var.f45446e) {
                if (i3 >= g11Var.F && i3 < g11Var.G) {
                    return 1;
                }
                if (i3 >= g11Var.f45472r && i3 < g11Var.f45475s) {
                    return 3;
                }
                if (g11Var.f45493z0.indexOfKey(i3) >= 0) {
                    return 4;
                }
                if (g11Var.A0.indexOfKey(i3) >= 0) {
                    return 5;
                }
                if (i3 == g11Var.f45484w) {
                    return 6;
                }
                if (g11Var.f45488x0.indexOfKey(i3) < 0 && i3 != g11Var.f45449f && i3 != g11Var.E && i3 != g11Var.f45463n && i3 != g11Var.h && i3 != g11Var.f45490y) {
                    if (i3 != g11Var.f45487x) {
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
    public final void t(u4.d1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g01.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        jb0 jb0Var;
        int o10;
        g11 g11Var = this.f45427c;
        int i10 = g11Var.f45435a0;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.f45436a1;
        boolean z10 = false;
        if (i3 == 0) {
            Context context = g11Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            jb0Var = new m01(g11Var, context, z10);
        } else if (i3 == 2) {
            jb0Var = new ImageView(g11Var.getContext());
        } else if (i3 != 3 && i3 != 1 && i3 != 8) {
            if (i3 == 4) {
                Context context2 = g11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f47072a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (g11Var.f45455h1) {
                    o10 = org.telegram.ui.ActionBar.k6.w(g11Var.f45453g1, org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.If), 99);
                }
                if (g11Var.f45455h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), o10));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), o10);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.If, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, b8.mf.e(-2, -2, 17));
                jb0Var = frameLayout;
            } else if (i3 == 5) {
                ?? frameLayout2 = new FrameLayout(g11Var.getContext());
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f46731b = w3Var;
                w3Var.b(0.3f, 250L, org.telegram.ui.Components.xq.h);
                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                w3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.r6.Z(w3Var, org.telegram.ui.ActionBar.k6.Gi, e6Var);
                w3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f46730a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 8.0f);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.r6.k(frameLayout3, e10, N, f10, e6Var);
                frameLayout3.addView(w3Var, b8.mf.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, b8.mf.c(-1.0f, -1));
                vg.o0 o0Var = new vg.o0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f46732c = o0Var;
                o0Var.setIcon(2131624314);
                frameLayout2.addView(o0Var, b8.mf.c(-1.0f, -1));
                jb0Var = frameLayout2;
            } else if (i3 == 6) {
                jb0 jb0Var2 = new jb0(g11Var.getContext(), 4);
                jb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    jb0Var2.setText(org.telegram.messenger.bd.M0(2131745658, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    jb0Var2.setText(org.telegram.messenger.bd.M0(2131746388, null));
                } else {
                    jb0Var2.setText(org.telegram.messenger.bd.M0(2131751177, null));
                }
                jb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(jb0Var2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
                jb0Var = jb0Var2;
            } else if (i3 == 7) {
                View v3Var = new org.telegram.ui.Cells.v3(g11Var.getContext(), 52);
                v3Var.setTag("searchbox");
                jb0Var = v3Var;
            } else {
                jb0Var = new q01(g11Var, g11Var.getContext());
            }
        } else {
            q01 q01Var = new q01(g11Var, g11Var.getContext());
            if (i3 == 8) {
                q01Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(q01Var);
                q01Var.h = imageReceiver;
                q01Var.f48723r = imageReceiver;
                imageReceiver.w0(g11Var.O);
                g11Var.P = q01Var;
                q01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            jb0Var = q01Var;
        }
        if (g11.c(g11Var)) {
            jb0Var.setScaleX(0.0f);
            jb0Var.setScaleY(0.0f);
        }
        return new u4.d1(jb0Var);
    }
}
