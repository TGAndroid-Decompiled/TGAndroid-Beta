package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class j3 extends org.telegram.ui.web.z0 {
    public final l3 T0;

    public j3(l3 l3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = l3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String L0;
        boolean z11;
        l3 l3Var = this.T0;
        if (z10) {
            if (l3Var.f39042r == null) {
                i3 i3Var = l3Var.e;
                b3 b3Var = new b3(l3Var.getContext());
                l3Var.f39042r = b3Var;
                i3Var.addView(b3Var, w7.b6.c(-1.0f, -1));
                l3Var.f39042r.h.setOnClickListener(new a(l3Var, 2));
                org.telegram.messenger.i0.Y3(l3Var.f39042r, l3Var.f39041n, 1.0f, true, false);
            }
            b3 b3Var2 = l3Var.f39042r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = b3Var2.e;
            b3Var2.d.setText(org.telegram.messenger.cd.L0(2131742948, null));
            String u10 = org.telegram.ui.web.z0.u(str2);
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                L0 = org.telegram.messenger.cd.a0(null, null, 2131742949, Uri.parse(u10).getAuthority());
            } else {
                L0 = org.telegram.messenger.cd.L0(2131742951, null);
            }
            textView.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2(L0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            b3Var2.f35968f.setText(str);
            b3 b3Var3 = l3Var.f39042r;
            int i10 = org.telegram.ui.ActionBar.t6.Dl;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i10, false)) <= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            b3Var3.b(z11, false);
            org.telegram.ui.ActionBar.a7.i(i10, l3Var.f39042r, null);
        }
        b3 b3Var4 = l3Var.f39042r;
        l3Var.f39041n = z10;
        org.telegram.messenger.i0.Y3(b3Var4, z10, 1.0f, true, false);
        invalidate();
    }

    @Override
    public final void H() {
        this.T0.L.g0(true);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        float f7;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        l3 l3Var = this.T0;
        l3Var.f39043s = !z10;
        l3Var.f39044w = !z11;
        h4 h4Var = l3Var.L;
        h4Var.g0(true);
        if (l3Var == h4Var.f37746u0[0]) {
            m0 m0Var = h4Var.f37734h0;
            if (!m0Var.W && !m0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37732f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f21633f) {
                    if (!h4Var.H() && h4Var.f37730d0.size() <= 1) {
                        h4Var.f37734h0.setBackButtonCached(false);
                        h4Var.f37734h0.P.c();
                    } else {
                        org.telegram.ui.ActionBar.c2 c2Var = h4Var.f37734h0.M;
                        if (!l3Var.f39043s && h4Var.f37730d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        c2Var.c(true, f7);
                        m0 m0Var2 = h4Var.f37734h0;
                        if (!l3Var.f39043s && h4Var.f37730d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        m0Var2.setBackButtonCached(z12);
                        h4Var.f37734h0.P.c();
                    }
                    h4Var.f37734h0.setHasForward(l3Var.f39044w);
                    m0 m0Var3 = h4Var.f37734h0;
                    l3 l3Var2 = h4Var.f37746u0[0];
                    if (l3Var2 != null && l3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var3.setIsTonsite(z13);
                    m0 m0Var4 = h4Var.f37734h0;
                    l3 l3Var3 = h4Var.f37746u0[0];
                    if (l3Var3 == null || !l3Var3.d()) {
                        z14 = false;
                    }
                    m0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.v0 v0Var) {
        this.T0.e.setWebView(v0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.w1 w1Var;
        l3 l3Var = this.T0;
        h4 h4Var = l3Var.L;
        if (h4Var.f37734h0 != null && l3Var == h4Var.f37746u0[0] && (w1Var = l3Var.E) != null && w1Var.b() == null) {
            l3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
