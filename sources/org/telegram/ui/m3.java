package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m3 extends org.telegram.ui.web.c1 {
    public final o3 S0;

    public m3(o3 o3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = o3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String string;
        o3 o3Var = this.S0;
        if (z10) {
            if (o3Var.f38533r == null) {
                l3 l3Var = o3Var.e;
                f3 f3Var = new f3(o3Var.getContext());
                o3Var.f38533r = f3Var;
                l3Var.addView(f3Var, w7.z5.d(-1.0f, -1));
                o3Var.f38533r.h.setOnClickListener(new a(o3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(o3Var.f38533r, o3Var.f38532n, 1.0f, false);
            }
            f3 f3Var2 = o3Var.f38533r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = f3Var2.e;
            f3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.c1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            f3Var2.f35450f.setText(str);
            f3 f3Var3 = o3Var.f38533r;
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            f3Var3.b(z11, false);
            o3Var.f38533r.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
        f3 f3Var4 = o3Var.f38533r;
        o3Var.f38532n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var4, z10, 1.0f, false);
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
        o3 o3Var = this.S0;
        o3Var.f38534s = !z10;
        o3Var.v = !z11;
        k4 k4Var = o3Var.K;
        k4Var.i0(true);
        if (o3Var == k4Var.f37278u0[0]) {
            m0 m0Var = k4Var.f37266h0;
            if (!m0Var.W && !m0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = k4Var.f37264f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f20568f) {
                    if (!k4Var.J() && k4Var.f37262d0.size() <= 1) {
                        k4Var.f37266h0.setBackButtonCached(false);
                        k4Var.f37266h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.f2 f2Var = k4Var.f37266h0.M;
                        if (!o3Var.f38534s && k4Var.f37262d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        f2Var.c(f7, true);
                        m0 m0Var2 = k4Var.f37266h0;
                        if (!o3Var.f38534s && k4Var.f37262d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        m0Var2.setBackButtonCached(z12);
                        k4Var.f37266h0.P.f();
                    }
                    k4Var.f37266h0.setHasForward(o3Var.v);
                    m0 m0Var3 = k4Var.f37266h0;
                    o3 o3Var2 = k4Var.f37278u0[0];
                    if (o3Var2 != null && o3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var3.setIsTonsite(z13);
                    m0 m0Var4 = k4Var.f37266h0;
                    o3 o3Var3 = k4Var.f37278u0[0];
                    if (o3Var3 == null || !o3Var3.d()) {
                        z14 = false;
                    }
                    m0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.z0 z0Var) {
        this.S0.e.setWebView(z0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        o3 o3Var = this.S0;
        k4 k4Var = o3Var.K;
        if (k4Var.f37266h0 != null && o3Var == k4Var.f37278u0[0] && (g2Var = o3Var.f38537y) != null && g2Var.b() == null) {
            o3Var.f38537y.d(getWebView());
        }
        super.T(str, z10);
    }
}
