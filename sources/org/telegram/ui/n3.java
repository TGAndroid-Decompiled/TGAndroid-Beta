package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n3 extends org.telegram.ui.web.y0 {
    public final p3 L0;

    public n3(p3 p3Var, Context context, int i9) {
        super(i9, context, null, false);
        this.L0 = p3Var;
    }

    @Override
    public final void A(String str, boolean z10) {
        String str2;
        String string;
        p3 p3Var = this.L0;
        if (z10) {
            if (p3Var.f41325r == null) {
                m3 m3Var = p3Var.f41322e;
                g3 g3Var = new g3(p3Var.getContext());
                p3Var.f41325r = g3Var;
                m3Var.addView(g3Var, g7.e6.c(-1.0f, -1));
                p3Var.f41325r.h.setOnClickListener(new a(p3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(p3Var.f41325r, p3Var.f41324n, 1.0f, false);
            }
            g3 g3Var2 = p3Var.f41325r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = g3Var2.f38419e;
            g3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String s10 = org.telegram.ui.web.y0.s(str2);
            boolean z11 = true;
            if (s10 != null && Uri.parse(s10) != null && Uri.parse(s10).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(s10).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            g3Var2.f38420f.setText(str);
            g3 g3Var3 = p3Var.f41325r;
            int i9 = org.telegram.ui.ActionBar.f6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, i9, false)) > 0.721f) {
                z11 = false;
            }
            g3Var3.b(z11, false);
            p3Var.f41325r.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        g3 g3Var4 = p3Var.f41325r;
        p3Var.f41324n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(g3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void E() {
        this.L0.G.i0(true);
    }

    @Override
    public final void F(boolean z10, boolean z11) {
        float f10;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        p3 p3Var = this.L0;
        p3Var.f41326s = !z10;
        p3Var.v = !z11;
        l4 l4Var = p3Var.G;
        l4Var.i0(true);
        if (p3Var == l4Var.f40026q0[0]) {
            n0 n0Var = l4Var.f40014d0;
            if (!n0Var.S && !n0Var.P) {
                ArticleViewer$WindowView articleViewer$WindowView = l4Var.f40012b0;
                if (!articleViewer$WindowView.f24020e && !articleViewer$WindowView.f24021f) {
                    if (!l4Var.J() && l4Var.Z.size() <= 1) {
                        l4Var.f40014d0.setBackButtonCached(false);
                        l4Var.f40014d0.L.f();
                    } else {
                        org.telegram.ui.ActionBar.h2 h2Var = l4Var.f40014d0.I;
                        if (!p3Var.f41326s && l4Var.Z.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        h2Var.c(f10, true);
                        n0 n0Var2 = l4Var.f40014d0;
                        if (!p3Var.f41326s && l4Var.Z.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        n0Var2.setBackButtonCached(z12);
                        l4Var.f40014d0.L.f();
                    }
                    l4Var.f40014d0.setHasForward(p3Var.v);
                    n0 n0Var3 = l4Var.f40014d0;
                    p3 p3Var2 = l4Var.f40026q0[0];
                    if (p3Var2 != null && p3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n0Var3.setIsTonsite(z13);
                    n0 n0Var4 = l4Var.f40014d0;
                    p3 p3Var3 = l4Var.f40026q0[0];
                    n0Var4.setIsLocal((p3Var3 == null || !p3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void G(org.telegram.ui.web.v0 v0Var) {
        this.L0.f41322e.setWebView(v0Var);
    }

    @Override
    public final void O(String str, boolean z10) {
        org.telegram.ui.web.b2 b2Var;
        p3 p3Var = this.L0;
        l4 l4Var = p3Var.G;
        if (l4Var.f40014d0 != null && p3Var == l4Var.f40026q0[0] && (b2Var = p3Var.f41329y) != null && b2Var.b() == null) {
            p3Var.f41329y.d(getWebView());
        }
        super.O(str, z10);
    }
}
