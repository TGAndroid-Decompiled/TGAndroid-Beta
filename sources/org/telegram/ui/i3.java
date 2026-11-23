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
        String N0;
        boolean z11;
        k3 k3Var = this.U0;
        if (z10) {
            if (k3Var.f49293r == null) {
                h3 h3Var = k3Var.f49290e;
                b3 b3Var = new b3(k3Var.getContext());
                k3Var.f49293r = b3Var;
                h3Var.addView(b3Var, c8.na.c(-1.0f, -1));
                k3Var.f49293r.h.setOnClickListener(new a(k3Var, 2));
                org.telegram.messenger.g0.X3(k3Var.f49293r, k3Var.f49292n, 1.0f, true, false);
            }
            b3 b3Var2 = k3Var.f49293r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = b3Var2.f45890e;
            b3Var2.d.setText(org.telegram.messenger.gd.N0(2131742651, null));
            String u10 = org.telegram.ui.web.v0.u(str2);
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                N0 = org.telegram.messenger.gd.a0(null, null, 2131742652, Uri.parse(u10).getAuthority());
            } else {
                N0 = org.telegram.messenger.gd.N0(2131742654, null);
            }
            textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(N0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f45891f.setText(str);
            b3 b3Var3 = k3Var.f49293r;
            int i7 = org.telegram.ui.ActionBar.n6.Gl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, i7, false)) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            b3Var3.b(z11, false);
            org.telegram.ui.ActionBar.u6.h(i7, k3Var.f49293r, null);
        }
        b3 b3Var4 = k3Var.f49293r;
        k3Var.f49292n = z10;
        org.telegram.messenger.g0.X3(b3Var4, z10, 1.0f, true, false);
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
        k3Var.f49294s = !z10;
        k3Var.f49295w = !z11;
        g4 g4Var = k3Var.M;
        g4Var.g0(true);
        if (k3Var == g4Var.f48084v0[0]) {
            l0 l0Var = g4Var.f48072i0;
            if (!l0Var.f53410a0 && !l0Var.U) {
                ArticleViewer$WindowView articleViewer$WindowView = g4Var.f48070g0;
                if (!articleViewer$WindowView.f30420e && !articleViewer$WindowView.f30421f) {
                    if (!g4Var.H() && g4Var.f48068e0.size() <= 1) {
                        g4Var.f48072i0.setBackButtonCached(false);
                        g4Var.f48072i0.Q.c();
                    } else {
                        org.telegram.ui.ActionBar.x1 x1Var = g4Var.f48072i0.N;
                        if (!k3Var.f49294s && g4Var.f48068e0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        x1Var.c(true, f10);
                        l0 l0Var2 = g4Var.f48072i0;
                        if (!k3Var.f49294s && g4Var.f48068e0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        l0Var2.setBackButtonCached(z12);
                        g4Var.f48072i0.Q.c();
                    }
                    g4Var.f48072i0.setHasForward(k3Var.f49295w);
                    l0 l0Var3 = g4Var.f48072i0;
                    k3 k3Var2 = g4Var.f48084v0[0];
                    if (k3Var2 != null && k3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var3.setIsTonsite(z13);
                    l0 l0Var4 = g4Var.f48072i0;
                    k3 k3Var3 = g4Var.f48084v0[0];
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
        this.U0.f49290e.setWebView(s0Var);
    }

    @Override
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.u1 u1Var;
        k3 k3Var = this.U0;
        g4 g4Var = k3Var.M;
        if (g4Var.f48072i0 != null && k3Var == g4Var.f48084v0[0] && (u1Var = k3Var.F) != null && u1Var.b() == null) {
            k3Var.F.d(getWebView());
        }
        super.U(str, z10);
    }
}
