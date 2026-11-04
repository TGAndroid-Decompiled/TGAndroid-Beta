package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class j3 extends org.telegram.ui.web.w0 {
    public final l3 U0;

    public j3(l3 l3Var, Context context, int i3) {
        super(i3, context, null, false);
        this.U0 = l3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String M0;
        boolean z11;
        l3 l3Var = this.U0;
        if (z10) {
            if (l3Var.f47088r == null) {
                i3 i3Var = l3Var.f47085e;
                c3 c3Var = new c3(l3Var.getContext());
                l3Var.f47088r = c3Var;
                i3Var.addView(c3Var, b8.mf.c(-1.0f, -1));
                l3Var.f47088r.h.setOnClickListener(new a(l3Var, 2));
                org.telegram.messenger.g0.Z3(l3Var.f47088r, l3Var.f47087n, 1.0f, true, false);
            }
            c3 c3Var2 = l3Var.f47088r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = c3Var2.f44208e;
            c3Var2.d.setText(org.telegram.messenger.bd.M0(2131742932, null));
            String u10 = org.telegram.ui.web.w0.u(str2);
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                M0 = org.telegram.messenger.bd.a0(null, null, 2131742933, Uri.parse(u10).getAuthority());
            } else {
                M0 = org.telegram.messenger.bd.M0(2131742935, null);
            }
            textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            c3Var2.f44209f.setText(str);
            c3 c3Var3 = l3Var.f47088r;
            int i3 = org.telegram.ui.ActionBar.k6.Dl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i3, false)) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            c3Var3.b(z11, false);
            org.telegram.ui.ActionBar.r6.i(i3, l3Var.f47088r, null);
        }
        c3 c3Var4 = l3Var.f47088r;
        l3Var.f47087n = z10;
        org.telegram.messenger.g0.Z3(c3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override
    public final void H() {
        this.U0.M.g0(true);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        float f10;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        l3 l3Var = this.U0;
        l3Var.f47089s = !z10;
        l3Var.f47090w = !z11;
        i4 i4Var = l3Var.M;
        i4Var.g0(true);
        if (l3Var == i4Var.f46100v0[0]) {
            m0 m0Var = i4Var.f46088i0;
            if (!m0Var.f50871a0 && !m0Var.U) {
                ArticleViewer$WindowView articleViewer$WindowView = i4Var.f46086g0;
                if (!articleViewer$WindowView.f28899e && !articleViewer$WindowView.f28900f) {
                    if (!i4Var.H() && i4Var.f46084e0.size() <= 1) {
                        i4Var.f46088i0.setBackButtonCached(false);
                        i4Var.f46088i0.Q.c();
                    } else {
                        org.telegram.ui.ActionBar.w1 w1Var = i4Var.f46088i0.N;
                        if (!l3Var.f47089s && i4Var.f46084e0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        w1Var.c(true, f10);
                        m0 m0Var2 = i4Var.f46088i0;
                        if (!l3Var.f47089s && i4Var.f46084e0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        m0Var2.setBackButtonCached(z12);
                        i4Var.f46088i0.Q.c();
                    }
                    i4Var.f46088i0.setHasForward(l3Var.f47090w);
                    m0 m0Var3 = i4Var.f46088i0;
                    l3 l3Var2 = i4Var.f46100v0[0];
                    if (l3Var2 != null && l3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var3.setIsTonsite(z13);
                    m0 m0Var4 = i4Var.f46088i0;
                    l3 l3Var3 = i4Var.f46100v0[0];
                    if (l3Var3 == null || !l3Var3.d()) {
                        z14 = false;
                    }
                    m0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.t0 t0Var) {
        this.U0.f47085e.setWebView(t0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.s1 s1Var;
        l3 l3Var = this.U0;
        i4 i4Var = l3Var.M;
        if (i4Var.f46088i0 != null && l3Var == i4Var.f46100v0[0] && (s1Var = l3Var.F) != null && s1Var.b() == null) {
            l3Var.F.d(getWebView());
        }
        super.T(str, z10);
    }
}
