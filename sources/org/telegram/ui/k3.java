package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k3 extends org.telegram.ui.web.b1 {
    public final m3 S0;

    public k3(m3 m3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = m3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String string;
        m3 m3Var = this.S0;
        if (z10) {
            if (m3Var.f39755r == null) {
                j3 j3Var = m3Var.f39752e;
                d3 d3Var = new d3(m3Var.getContext());
                m3Var.f39755r = d3Var;
                j3Var.addView(d3Var, w7.x5.d(-1.0f, -1));
                m3Var.f39755r.h.setOnClickListener(new a(m3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(m3Var.f39755r, m3Var.f39754n, 1.0f, false);
            }
            d3 d3Var2 = m3Var.f39755r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = d3Var2.f36811e;
            d3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.b1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            d3Var2.f36812f.setText(str);
            d3 d3Var3 = m3Var.f39755r;
            int i10 = org.telegram.ui.ActionBar.i6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            d3Var3.b(z11, false);
            m3Var.f39755r.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        }
        d3 d3Var4 = m3Var.f39755r;
        m3Var.f39754n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(d3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void H() {
        this.S0.K.i0(true);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        float f7;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        m3 m3Var = this.S0;
        m3Var.f39756s = !z10;
        m3Var.v = !z11;
        i4 i4Var = m3Var.K;
        i4Var.i0(true);
        if (m3Var == i4Var.f38513u0[0]) {
            l0 l0Var = i4Var.f38501h0;
            if (!l0Var.W && !l0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38499f0;
                if (!articleViewer$WindowView.f21751e && !articleViewer$WindowView.f21752f) {
                    if (!i4Var.J() && i4Var.f38497d0.size() <= 1) {
                        i4Var.f38501h0.setBackButtonCached(false);
                        i4Var.f38501h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.g2 g2Var = i4Var.f38501h0.M;
                        if (!m3Var.f39756s && i4Var.f38497d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        g2Var.c(f7, true);
                        l0 l0Var2 = i4Var.f38501h0;
                        if (!m3Var.f39756s && i4Var.f38497d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        l0Var2.setBackButtonCached(z12);
                        i4Var.f38501h0.P.f();
                    }
                    i4Var.f38501h0.setHasForward(m3Var.v);
                    l0 l0Var3 = i4Var.f38501h0;
                    m3 m3Var2 = i4Var.f38513u0[0];
                    if (m3Var2 != null && m3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var3.setIsTonsite(z13);
                    l0 l0Var4 = i4Var.f38501h0;
                    m3 m3Var3 = i4Var.f38513u0[0];
                    if (m3Var3 == null || !m3Var3.d()) {
                        z14 = false;
                    }
                    l0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        this.S0.f39752e.setWebView(y0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        m3 m3Var = this.S0;
        i4 i4Var = m3Var.K;
        if (i4Var.f38501h0 != null && m3Var == i4Var.f38513u0[0] && (g2Var = m3Var.f39759y) != null && g2Var.b() == null) {
            m3Var.f39759y.d(getWebView());
        }
        super.T(str, z10);
    }
}
