package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k3 extends org.telegram.ui.web.a1 {
    public final m3 T0;

    public k3(m3 m3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = m3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String string;
        m3 m3Var = this.T0;
        if (z10) {
            if (m3Var.f41444r == null) {
                j3 j3Var = m3Var.e;
                c3 c3Var = new c3(m3Var.getContext());
                m3Var.f41444r = c3Var;
                j3Var.addView(c3Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                m3Var.f41444r.h.setOnClickListener(new a(m3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(m3Var.f41444r, m3Var.f41443n, 1.0f, false);
            }
            c3 c3Var2 = m3Var.f41444r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = c3Var2.e;
            c3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.a1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            c3Var2.f38235f.setText(str);
            c3 c3Var3 = m3Var.f41444r;
            int i10 = org.telegram.ui.ActionBar.y6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            c3Var3.b(z11, false);
            org.telegram.ui.ActionBar.f7.i(i10, m3Var.f41444r, null);
        }
        c3 c3Var4 = m3Var.f41444r;
        m3Var.f41443n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(c3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void H() {
        this.T0.L.i0(true);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        float f7;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        m3 m3Var = this.T0;
        m3Var.f41445s = !z10;
        m3Var.v = !z11;
        j4 j4Var = m3Var.L;
        j4Var.i0(true);
        if (m3Var == j4Var.f40446u0[0]) {
            l0 l0Var = j4Var.f40434h0;
            if (!l0Var.W && !l0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40432f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f23813f) {
                    if (!j4Var.J() && j4Var.f40430d0.size() <= 1) {
                        j4Var.f40434h0.setBackButtonCached(false);
                        j4Var.f40434h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.j2 j2Var = j4Var.f40434h0.M;
                        if (!m3Var.f41445s && j4Var.f40430d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        j2Var.c(f7, true);
                        l0 l0Var2 = j4Var.f40434h0;
                        if (!m3Var.f41445s && j4Var.f40430d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        l0Var2.setBackButtonCached(z12);
                        j4Var.f40434h0.P.f();
                    }
                    j4Var.f40434h0.setHasForward(m3Var.v);
                    l0 l0Var3 = j4Var.f40434h0;
                    m3 m3Var2 = j4Var.f40446u0[0];
                    if (m3Var2 != null && m3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var3.setIsTonsite(z13);
                    l0 l0Var4 = j4Var.f40434h0;
                    m3 m3Var3 = j4Var.f40446u0[0];
                    if (m3Var3 == null || !m3Var3.d()) {
                        z14 = false;
                    }
                    l0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.x0 x0Var) {
        this.T0.e.setWebView(x0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.f2 f2Var;
        m3 m3Var = this.T0;
        j4 j4Var = m3Var.L;
        if (j4Var.f40434h0 != null && m3Var == j4Var.f40446u0[0] && (f2Var = m3Var.E) != null && f2Var.b() == null) {
            m3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
