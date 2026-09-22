package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j3 extends org.telegram.ui.web.d1 {
    public final l3 S0;

    public j3(l3 l3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = l3Var;
    }

    @Override
    public final void E(String str, boolean z10) {
        String str2;
        String string;
        l3 l3Var = this.S0;
        if (z10) {
            if (l3Var.f35309r == null) {
                i3 i3Var = l3Var.e;
                c3 c3Var = new c3(l3Var.getContext());
                l3Var.f35309r = c3Var;
                i3Var.addView(c3Var, w7.y5.c(-1.0f, -1));
                l3Var.f35309r.h.setOnClickListener(new a(l3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(l3Var.f35309r, l3Var.f35308n, 1.0f, false);
            }
            c3 c3Var2 = l3Var.f35309r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = c3Var2.e;
            c3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.d1.v(str2);
            boolean z11 = true;
            if (v != null && Uri.parse(v) != null && Uri.parse(v).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            c3Var2.f32628f.setText(str);
            c3 c3Var3 = l3Var.f35309r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            c3Var3.b(z11, false);
            l3Var.f35309r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        c3 c3Var4 = l3Var.f35309r;
        l3Var.f35308n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(c3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void I() {
        this.S0.K.i0(true);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        float f7;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        l3 l3Var = this.S0;
        l3Var.f35310s = !z10;
        l3Var.v = !z11;
        h4 h4Var = l3Var.K;
        h4Var.i0(true);
        if (l3Var == h4Var.f34130u0[0]) {
            k0 k0Var = h4Var.f34118h0;
            if (!k0Var.W && !k0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34116f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f19990f) {
                    if (!h4Var.J() && h4Var.f34114d0.size() <= 1) {
                        h4Var.f34118h0.setBackButtonCached(false);
                        h4Var.f34118h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.g2 g2Var = h4Var.f34118h0.M;
                        if (!l3Var.f35310s && h4Var.f34114d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        g2Var.c(f7, true);
                        k0 k0Var2 = h4Var.f34118h0;
                        if (!l3Var.f35310s && h4Var.f34114d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        k0Var2.setBackButtonCached(z12);
                        h4Var.f34118h0.P.f();
                    }
                    h4Var.f34118h0.setHasForward(l3Var.v);
                    k0 k0Var3 = h4Var.f34118h0;
                    l3 l3Var2 = h4Var.f34130u0[0];
                    if (l3Var2 != null && l3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    k0Var3.setIsTonsite(z13);
                    k0 k0Var4 = h4Var.f34118h0;
                    l3 l3Var3 = h4Var.f34130u0[0];
                    k0Var4.setIsLocal((l3Var3 == null || !l3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void K(org.telegram.ui.web.z0 z0Var) {
        this.S0.e.setWebView(z0Var);
    }

    @Override
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.h2 h2Var;
        l3 l3Var = this.S0;
        h4 h4Var = l3Var.K;
        if (h4Var.f34118h0 != null && l3Var == h4Var.f34130u0[0] && (h2Var = l3Var.f35313y) != null && h2Var.b() == null) {
            l3Var.f35313y.d(getWebView());
        }
        super.U(str, z10);
    }
}
