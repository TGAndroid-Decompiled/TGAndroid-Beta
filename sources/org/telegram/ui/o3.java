package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o3 extends org.telegram.ui.web.z0 {
    public final q3 L0;

    public o3(q3 q3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.L0 = q3Var;
    }

    @Override
    public final void A(String str, boolean z10) {
        String str2;
        String string;
        q3 q3Var = this.L0;
        if (z10) {
            if (q3Var.f41518r == null) {
                n3 n3Var = q3Var.f41515e;
                h3 h3Var = new h3(q3Var.getContext());
                q3Var.f41518r = h3Var;
                n3Var.addView(h3Var, i7.f6.c(-1.0f, -1));
                q3Var.f41518r.h.setOnClickListener(new a(q3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(q3Var.f41518r, q3Var.f41517n, 1.0f, false);
            }
            h3 h3Var2 = q3Var.f41518r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = h3Var2.f38751e;
            h3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String s10 = org.telegram.ui.web.z0.s(str2);
            boolean z11 = true;
            if (s10 != null && Uri.parse(s10) != null && Uri.parse(s10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(s10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            h3Var2.f38752f.setText(str);
            h3 h3Var3 = q3Var.f41518r;
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            h3Var3.b(z11, false);
            q3Var.f41518r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        h3 h3Var4 = q3Var.f41518r;
        q3Var.f41517n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void E() {
        this.L0.G.i0(true);
    }

    @Override
    public final void F(boolean z10, boolean z11) {
        float f9;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        q3 q3Var = this.L0;
        q3Var.f41519s = !z10;
        q3Var.v = !z11;
        m4 m4Var = q3Var.G;
        m4Var.i0(true);
        if (q3Var == m4Var.f40404q0[0]) {
            o0 o0Var = m4Var.f40392d0;
            if (!o0Var.S && !o0Var.P) {
                ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40390b0;
                if (!articleViewer$WindowView.f24040e && !articleViewer$WindowView.f24041f) {
                    if (!m4Var.J() && m4Var.Z.size() <= 1) {
                        m4Var.f40392d0.setBackButtonCached(false);
                        m4Var.f40392d0.L.f();
                    } else {
                        org.telegram.ui.ActionBar.h2 h2Var = m4Var.f40392d0.I;
                        if (!q3Var.f41519s && m4Var.Z.size() <= 1) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        h2Var.c(f9, true);
                        o0 o0Var2 = m4Var.f40392d0;
                        if (!q3Var.f41519s && m4Var.Z.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        o0Var2.setBackButtonCached(z12);
                        m4Var.f40392d0.L.f();
                    }
                    m4Var.f40392d0.setHasForward(q3Var.v);
                    o0 o0Var3 = m4Var.f40392d0;
                    q3 q3Var2 = m4Var.f40404q0[0];
                    if (q3Var2 != null && q3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o0Var3.setIsTonsite(z13);
                    o0 o0Var4 = m4Var.f40392d0;
                    q3 q3Var3 = m4Var.f40404q0[0];
                    o0Var4.setIsLocal((q3Var3 == null || !q3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.f41515e.setWebView(w0Var);
    }

    @Override
    public final void O(String str, boolean z10) {
        org.telegram.ui.web.d2 d2Var;
        q3 q3Var = this.L0;
        m4 m4Var = q3Var.G;
        if (m4Var.f40392d0 != null && q3Var == m4Var.f40404q0[0] && (d2Var = q3Var.f41522y) != null && d2Var.b() == null) {
            q3Var.f41522y.d(getWebView());
        }
        super.O(str, z10);
    }
}
