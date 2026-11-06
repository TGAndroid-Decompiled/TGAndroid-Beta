package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class i3 extends org.telegram.ui.web.x0 {
    public final k3 T0;

    public i3(k3 k3Var, Context context, int i7) {
        super(i7, context, null, false);
        this.T0 = k3Var;
    }

    @Override
    public final void E(boolean z9, String str) {
        String str2;
        String M0;
        boolean z10;
        k3 k3Var = this.T0;
        if (z9) {
            if (k3Var.f47093r == null) {
                h3 h3Var = k3Var.f47090e;
                b3 b3Var = new b3(k3Var.getContext());
                k3Var.f47093r = b3Var;
                h3Var.addView(b3Var, c8.ha.c(-1.0f, -1));
                k3Var.f47093r.h.setOnClickListener(new a(k3Var, 2));
                org.telegram.messenger.g0.Z3(k3Var.f47093r, k3Var.f47092n, 1.0f, true, false);
            }
            b3 b3Var2 = k3Var.f47093r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = b3Var2.f44165e;
            b3Var2.d.setText(org.telegram.messenger.hd.M0(2131742923, null));
            String u10 = org.telegram.ui.web.x0.u(str2);
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                M0 = org.telegram.messenger.hd.a0(null, null, 2131742924, Uri.parse(u10).getAuthority());
            } else {
                M0 = org.telegram.messenger.hd.M0(2131742926, null);
            }
            textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f44166f.setText(str);
            b3 b3Var3 = k3Var.f47093r;
            int i7 = org.telegram.ui.ActionBar.k6.Dl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i7, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var3.b(z10, false);
            org.telegram.ui.ActionBar.r6.i(i7, k3Var.f47093r, null);
        }
        b3 b3Var4 = k3Var.f47093r;
        k3Var.f47092n = z9;
        org.telegram.messenger.g0.Z3(b3Var4, z9, 1.0f, true, false);
        invalidate();
    }

    @Override
    public final void I() {
        this.T0.L.g0(true);
    }

    @Override
    public final void J(boolean z9, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        k3 k3Var = this.T0;
        k3Var.f47094s = !z9;
        k3Var.f47095w = !z10;
        g4 g4Var = k3Var.L;
        g4Var.g0(true);
        if (k3Var == g4Var.f45843u0[0]) {
            l0 l0Var = g4Var.f45831h0;
            if (!l0Var.W && !l0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45829f0;
                if (!articleViewer$WindowView.f28838e && !articleViewer$WindowView.f28839f) {
                    if (!g4Var.H() && g4Var.f45827d0.size() <= 1) {
                        g4Var.f45831h0.setBackButtonCached(false);
                        g4Var.f45831h0.P.c();
                    } else {
                        org.telegram.ui.ActionBar.y1 y1Var = g4Var.f45831h0.M;
                        if (!k3Var.f47094s && g4Var.f45827d0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        y1Var.c(true, f10);
                        l0 l0Var2 = g4Var.f45831h0;
                        if (!k3Var.f47094s && g4Var.f45827d0.size() <= 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        l0Var2.setBackButtonCached(z11);
                        g4Var.f45831h0.P.c();
                    }
                    g4Var.f45831h0.setHasForward(k3Var.f47095w);
                    l0 l0Var3 = g4Var.f45831h0;
                    k3 k3Var2 = g4Var.f45843u0[0];
                    if (k3Var2 != null && k3Var2.e()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l0Var3.setIsTonsite(z12);
                    l0 l0Var4 = g4Var.f45831h0;
                    k3 k3Var3 = g4Var.f45843u0[0];
                    if (k3Var3 == null || !k3Var3.d()) {
                        z13 = false;
                    }
                    l0Var4.setIsLocal(z13);
                }
            }
        }
    }

    @Override
    public final void K(org.telegram.ui.web.u0 u0Var) {
        this.T0.f47090e.setWebView(u0Var);
    }

    @Override
    public final void U(String str, boolean z9) {
        org.telegram.ui.web.v1 v1Var;
        k3 k3Var = this.T0;
        g4 g4Var = k3Var.L;
        if (g4Var.f45831h0 != null && k3Var == g4Var.f45843u0[0] && (v1Var = k3Var.E) != null && v1Var.b() == null) {
            k3Var.E.d(getWebView());
        }
        super.U(str, z9);
    }
}
