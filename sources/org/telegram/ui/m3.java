package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m3 extends org.telegram.ui.web.b1 {
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
            if (o3Var.f39650r == null) {
                l3 l3Var = o3Var.e;
                f3 f3Var = new f3(o3Var.getContext());
                o3Var.f39650r = f3Var;
                l3Var.addView(f3Var, w7.z5.c(-1.0f, -1));
                o3Var.f39650r.h.setOnClickListener(new a(o3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(o3Var.f39650r, o3Var.f39649n, 1.0f, false);
            }
            f3 f3Var2 = o3Var.f39650r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = f3Var2.e;
            f3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String u10 = org.telegram.ui.web.b1.u(str2);
            boolean z11 = true;
            if (u10 != null && Uri.parse(u10) != null && Uri.parse(u10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(u10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            f3Var2.f36790f.setText(str);
            f3 f3Var3 = o3Var.f39650r;
            int i10 = org.telegram.ui.ActionBar.h6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            f3Var3.b(z11, false);
            o3Var.f39650r.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        f3 f3Var4 = o3Var.f39650r;
        o3Var.f39649n = z10;
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
        o3Var.f39651s = !z10;
        o3Var.v = !z11;
        l4 l4Var = o3Var.K;
        l4Var.i0(true);
        if (o3Var == l4Var.f38725u0[0]) {
            n0 n0Var = l4Var.f38713h0;
            if (!n0Var.W && !n0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38711f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f21927f) {
                    if (!l4Var.J() && l4Var.f38709d0.size() <= 1) {
                        l4Var.f38713h0.setBackButtonCached(false);
                        l4Var.f38713h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.g2 g2Var = l4Var.f38713h0.M;
                        if (!o3Var.f39651s && l4Var.f38709d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        g2Var.c(f7, true);
                        n0 n0Var2 = l4Var.f38713h0;
                        if (!o3Var.f39651s && l4Var.f38709d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        n0Var2.setBackButtonCached(z12);
                        l4Var.f38713h0.P.f();
                    }
                    l4Var.f38713h0.setHasForward(o3Var.v);
                    n0 n0Var3 = l4Var.f38713h0;
                    o3 o3Var2 = l4Var.f38725u0[0];
                    if (o3Var2 != null && o3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n0Var3.setIsTonsite(z13);
                    n0 n0Var4 = l4Var.f38713h0;
                    o3 o3Var3 = l4Var.f38725u0[0];
                    if (o3Var3 == null || !o3Var3.d()) {
                        z14 = false;
                    }
                    n0Var4.setIsLocal(z14);
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.web.y0 y0Var) {
        this.S0.e.setWebView(y0Var);
    }

    @Override
    public final void T(String str, boolean z10) {
        org.telegram.ui.web.h2 h2Var;
        o3 o3Var = this.S0;
        l4 l4Var = o3Var.K;
        if (l4Var.f38713h0 != null && o3Var == l4Var.f38725u0[0] && (h2Var = o3Var.f39654y) != null && h2Var.b() == null) {
            o3Var.f39654y.d(getWebView());
        }
        super.T(str, z10);
    }
}
