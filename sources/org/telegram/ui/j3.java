package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j3 extends org.telegram.ui.web.b1 {
    public final l3 S0;

    public j3(l3 l3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = l3Var;
    }

    @Override
    public final void D(boolean z10, String str) {
        String str2;
        String string;
        l3 l3Var = this.S0;
        if (z10) {
            if (l3Var.f39535r == null) {
                i3 i3Var = l3Var.f39532e;
                c3 c3Var = new c3(l3Var.getContext());
                l3Var.f39535r = c3Var;
                i3Var.addView(c3Var, w7.x5.d(-1.0f, -1));
                l3Var.f39535r.h.setOnClickListener(new a(l3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(l3Var.f39535r, l3Var.f39534n, 1.0f, false);
            }
            c3 c3Var2 = l3Var.f39535r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = c3Var2.f36563e;
            c3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.b1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            c3Var2.f36564f.setText(str);
            c3 c3Var3 = l3Var.f39535r;
            int i10 = org.telegram.ui.ActionBar.h6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            c3Var3.b(z11, false);
            l3Var.f39535r.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        c3 c3Var4 = l3Var.f39535r;
        l3Var.f39534n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(c3Var4, z10, 1.0f, false);
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
        l3 l3Var = this.S0;
        l3Var.f39536s = !z10;
        l3Var.v = !z11;
        h4 h4Var = l3Var.K;
        h4Var.i0(true);
        if (l3Var == h4Var.f38319u0[0]) {
            k0 k0Var = h4Var.f38307h0;
            if (!k0Var.W && !k0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = h4Var.f38305f0;
                if (!articleViewer$WindowView.f21779e && !articleViewer$WindowView.f21780f) {
                    if (!h4Var.J() && h4Var.f38303d0.size() <= 1) {
                        h4Var.f38307h0.setBackButtonCached(false);
                        h4Var.f38307h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.f2 f2Var = h4Var.f38307h0.M;
                        if (!l3Var.f39536s && h4Var.f38303d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        f2Var.c(f7, true);
                        k0 k0Var2 = h4Var.f38307h0;
                        if (!l3Var.f39536s && h4Var.f38303d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        k0Var2.setBackButtonCached(z12);
                        h4Var.f38307h0.P.f();
                    }
                    h4Var.f38307h0.setHasForward(l3Var.v);
                    k0 k0Var3 = h4Var.f38307h0;
                    l3 l3Var2 = h4Var.f38319u0[0];
                    if (l3Var2 != null && l3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    k0Var3.setIsTonsite(z13);
                    k0 k0Var4 = h4Var.f38307h0;
                    l3 l3Var3 = h4Var.f38319u0[0];
                    if (l3Var3 == null || !l3Var3.d()) {
                        z14 = false;
                    }
                    k0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        this.S0.f39532e.setWebView(y0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.g2 g2Var;
        l3 l3Var = this.S0;
        h4 h4Var = l3Var.K;
        if (h4Var.f38307h0 != null && l3Var == h4Var.f38319u0[0] && (g2Var = l3Var.f39539y) != null && g2Var.b() == null) {
            l3Var.f39539y.d(getWebView());
        }
        super.T(str, z10);
    }
}
