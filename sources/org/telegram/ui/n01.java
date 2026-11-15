package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class n01 extends org.telegram.ui.Components.tj0 {
    public final n11 f49356c;

    public n01(n11 n11Var) {
        this.f49356c = n11Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49356c.f49412v0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f49356c.f49415w0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        n11 n11Var = this.f49356c;
        if (i7 == n11Var.f49364a) {
            return 7;
        }
        if (i7 < n11Var.f49368b || i7 >= n11Var.f49371c) {
            if (i7 < n11Var.d || i7 >= n11Var.f49376e) {
                if (i7 >= n11Var.F && i7 < n11Var.G) {
                    return 1;
                }
                if (i7 >= n11Var.f49402r && i7 < n11Var.f49405s) {
                    return 3;
                }
                if (n11Var.f49423z0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (n11Var.A0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == n11Var.f49414w) {
                    return 6;
                }
                if (n11Var.f49418x0.indexOfKey(i7) < 0 && i7 != n11Var.f49379f && i7 != n11Var.E && i7 != n11Var.f49394n && i7 != n11Var.h && i7 != n11Var.f49420y) {
                    if (i7 != n11Var.f49417x) {
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
    public final void t(v4.e1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n01.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        mb0 mb0Var;
        int o4;
        n11 n11Var = this.f49356c;
        int i10 = n11Var.f49365a0;
        org.telegram.ui.ActionBar.e6 e6Var = n11Var.f49366a1;
        boolean z10 = false;
        if (i7 == 0) {
            Context context = n11Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            mb0Var = new t01(n11Var, context, z10);
        } else if (i7 == 2) {
            mb0Var = new ImageView(n11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = n11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f51064a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (n11Var.f49385h1) {
                    o4 = org.telegram.ui.ActionBar.j6.w(n11Var.f49383g1, org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Lf), 99);
                }
                if (n11Var.f49385h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(org.telegram.ui.ActionBar.j6.Lf, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.q6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ja.e(-2, -2, 17));
                mb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(n11Var.getContext());
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f50818b = w3Var;
                w3Var.b(0.3f, 250L, org.telegram.ui.Components.er.h);
                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                w3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.q6.Y(w3Var, org.telegram.ui.ActionBar.j6.Ji, e6Var);
                w3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f50817a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.j6.Fi;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 8.0f);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.q6.j(frameLayout3, e10, M, e11, e6Var);
                frameLayout3.addView(w3Var, c8.ja.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ja.c(-1.0f, -1));
                ug.q0 q0Var = new ug.q0(frameLayout2.getContext(), e6Var, false);
                frameLayout2.f50819c = q0Var;
                q0Var.setIcon(2131624315);
                frameLayout2.addView(q0Var, c8.ja.c(-1.0f, -1));
                mb0Var = frameLayout2;
            } else if (i7 == 6) {
                mb0 mb0Var2 = new mb0(n11Var.getContext(), 4);
                mb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    mb0Var2.setText(org.telegram.messenger.hd.M0(2131745648, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    mb0Var2.setText(org.telegram.messenger.hd.M0(2131746380, null));
                } else {
                    mb0Var2.setText(org.telegram.messenger.hd.M0(2131751176, null));
                }
                mb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.q6.U(mb0Var2, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
                mb0Var = mb0Var2;
            } else if (i7 == 7) {
                View v3Var = new org.telegram.ui.Cells.v3(n11Var.getContext(), 52);
                v3Var.setTag("searchbox");
                mb0Var = v3Var;
            } else {
                mb0Var = new x01(n11Var, n11Var.getContext());
            }
        } else {
            x01 x01Var = new x01(n11Var, n11Var.getContext());
            if (i7 == 8) {
                x01Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(x01Var);
                x01Var.h = imageReceiver;
                x01Var.f53060r = imageReceiver;
                imageReceiver.w0(n11Var.O);
                n11Var.P = x01Var;
                x01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            mb0Var = x01Var;
        }
        if (n11.c(n11Var)) {
            mb0Var.setScaleX(0.0f);
            mb0Var.setScaleY(0.0f);
        }
        return new v4.e1(mb0Var);
    }
}
