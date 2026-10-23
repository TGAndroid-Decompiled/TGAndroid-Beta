package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l3 extends org.telegram.ui.web.b1 {
    public final n3 T0;

    public l3(n3 n3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.T0 = n3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String string;
        n3 n3Var = this.T0;
        if (z10) {
            if (n3Var.f39756r == null) {
                k3 k3Var = n3Var.e;
                e3 e3Var = new e3(n3Var.getContext());
                n3Var.f39756r = e3Var;
                k3Var.addView(e3Var, w7.z5.c(-1.0f, -1));
                n3Var.f39756r.h.setOnClickListener(new a(n3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(n3Var.f39756r, n3Var.f39755n, 1.0f, false);
            }
            e3 e3Var2 = n3Var.f39756r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = e3Var2.e;
            e3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.b1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            e3Var2.f36807f.setText(str);
            e3 e3Var3 = n3Var.f39756r;
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            e3Var3.b(z11, false);
            org.telegram.ui.ActionBar.r6.i(i10, n3Var.f39756r, null);
        }
        e3 e3Var4 = n3Var.f39756r;
        n3Var.f39755n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(e3Var4, z10, 1.0f, false);
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
        n3 n3Var = this.T0;
        n3Var.f39757s = !z10;
        n3Var.v = !z11;
        k4 k4Var = n3Var.L;
        k4Var.i0(true);
        if (n3Var == k4Var.f38805u0[0]) {
            m0 m0Var = k4Var.f38793h0;
            if (!m0Var.W && !m0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38791f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f22049f) {
                    if (!k4Var.J() && k4Var.f38789d0.size() <= 1) {
                        k4Var.f38793h0.setBackButtonCached(false);
                        k4Var.f38793h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.h2 h2Var = k4Var.f38793h0.M;
                        if (!n3Var.f39757s && k4Var.f38789d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        h2Var.c(f7, true);
                        m0 m0Var2 = k4Var.f38793h0;
                        if (!n3Var.f39757s && k4Var.f38789d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        m0Var2.setBackButtonCached(z12);
                        k4Var.f38793h0.P.f();
                    }
                    k4Var.f38793h0.setHasForward(n3Var.v);
                    m0 m0Var3 = k4Var.f38793h0;
                    n3 n3Var2 = k4Var.f38805u0[0];
                    if (n3Var2 != null && n3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var3.setIsTonsite(z13);
                    m0 m0Var4 = k4Var.f38793h0;
                    n3 n3Var3 = k4Var.f38805u0[0];
                    if (n3Var3 == null || !n3Var3.d()) {
                        z14 = false;
                    }
                    m0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        this.T0.e.setWebView(y0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        n3 n3Var = this.T0;
        k4 k4Var = n3Var.L;
        if (k4Var.f38793h0 != null && n3Var == k4Var.f38805u0[0] && (g2Var = n3Var.E) != null && g2Var.b() == null) {
            n3Var.E.d(getWebView());
        }
        super.T(str, z10);
    }
}
