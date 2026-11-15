package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class i3 extends org.telegram.ui.web.v0 {
    public final k3 U0;

    public i3(k3 k3Var, Context context, int i7) {
        super(i7, context, null, false);
        this.U0 = k3Var;
    }

    @Override
    public final void E(boolean z10, String str) {
        String str2;
        String M0;
        boolean z11;
        k3 k3Var = this.U0;
        if (z10) {
            if (k3Var.f48554r == null) {
                h3 h3Var = k3Var.f48551e;
                b3 b3Var = new b3(k3Var.getContext());
                k3Var.f48554r = b3Var;
                h3Var.addView(b3Var, c8.ja.c(-1.0f, -1));
                k3Var.f48554r.h.setOnClickListener(new a(k3Var, 2));
                org.telegram.messenger.g0.Y3(k3Var.f48554r, k3Var.f48553n, 1.0f, true, false);
            }
            b3 b3Var2 = k3Var.f48554r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = b3Var2.f45571e;
            b3Var2.d.setText(org.telegram.messenger.hd.M0(2131742922, null));
            String u10 = org.telegram.ui.web.v0.u(str2);
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                M0 = org.telegram.messenger.hd.a0(null, null, 2131742923, Uri.parse(u10).getAuthority());
            } else {
                M0 = org.telegram.messenger.hd.M0(2131742925, null);
            }
            textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f45572f.setText(str);
            b3 b3Var3 = k3Var.f48554r;
            int i7 = org.telegram.ui.ActionBar.j6.Gl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, i7, false)) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            b3Var3.b(z11, false);
            org.telegram.ui.ActionBar.q6.h(i7, k3Var.f48554r, null);
        }
        b3 b3Var4 = k3Var.f48554r;
        k3Var.f48553n = z10;
        org.telegram.messenger.g0.Y3(b3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override
    public final void I() {
        this.U0.M.g0(true);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        float f10;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        k3 k3Var = this.U0;
        k3Var.f48555s = !z10;
        k3Var.f48556w = !z11;
        g4 g4Var = k3Var.M;
        g4Var.g0(true);
        if (k3Var == g4Var.f47336v0[0]) {
            l0 l0Var = g4Var.f47324i0;
            if (!l0Var.f52645a0 && !l0Var.U) {
                ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47322g0;
                if (!articleViewer$WindowView.f29955e && !articleViewer$WindowView.f29956f) {
                    if (!g4Var.H() && g4Var.f47320e0.size() <= 1) {
                        g4Var.f47324i0.setBackButtonCached(false);
                        g4Var.f47324i0.Q.c();
                    } else {
                        org.telegram.ui.ActionBar.x1 x1Var = g4Var.f47324i0.N;
                        if (!k3Var.f48555s && g4Var.f47320e0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        x1Var.c(true, f10);
                        l0 l0Var2 = g4Var.f47324i0;
                        if (!k3Var.f48555s && g4Var.f47320e0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        l0Var2.setBackButtonCached(z12);
                        g4Var.f47324i0.Q.c();
                    }
                    g4Var.f47324i0.setHasForward(k3Var.f48556w);
                    l0 l0Var3 = g4Var.f47324i0;
                    k3 k3Var2 = g4Var.f47336v0[0];
                    if (k3Var2 != null && k3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var3.setIsTonsite(z13);
                    l0 l0Var4 = g4Var.f47324i0;
                    k3 k3Var3 = g4Var.f47336v0[0];
                    if (k3Var3 == null || !k3Var3.d()) {
                        z14 = false;
                    }
                    l0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void K(org.telegram.ui.web.s0 s0Var) {
        this.U0.f48551e.setWebView(s0Var);
    }

    @Override
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.t1 t1Var;
        k3 k3Var = this.U0;
        g4 g4Var = k3Var.M;
        if (g4Var.f47324i0 != null && k3Var == g4Var.f47336v0[0] && (t1Var = k3Var.F) != null && t1Var.b() == null) {
            k3Var.F.d(getWebView());
        }
        super.U(str, z10);
    }
}
