package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p3 extends org.telegram.ui.web.c1 {
    public final r3 P0;

    public p3(r3 r3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.P0 = r3Var;
    }

    @Override
    public final void E(String str, boolean z4) {
        String str2;
        String string;
        r3 r3Var = this.P0;
        if (z4) {
            if (r3Var.f37688r == null) {
                o3 o3Var = r3Var.e;
                h3 h3Var = new h3(r3Var.getContext());
                r3Var.f37688r = h3Var;
                o3Var.addView(h3Var, k7.b6.c(-1.0f, -1));
                r3Var.f37688r.h.setOnClickListener(new a(r3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(r3Var.f37688r, r3Var.f37687n, 1.0f, false);
            }
            h3 h3Var2 = r3Var.f37688r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = h3Var2.e;
            h3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.c1.v(str2);
            boolean z10 = true;
            if (v != null && Uri.parse(v) != null && Uri.parse(v).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            h3Var2.f34559f.setText(str);
            h3 h3Var3 = r3Var.f37688r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) > 0.721f) {
                z10 = false;
            }
            h3Var3.b(z10, false);
            r3Var.f37688r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        h3 h3Var4 = r3Var.f37688r;
        r3Var.f37687n = z4;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var4, z4, 1.0f, false);
        invalidate();
    }

    @Override
    public final void I() {
        this.P0.H.i0(true);
    }

    @Override
    public final void J(boolean z4, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        r3 r3Var = this.P0;
        r3Var.f37689s = !z4;
        r3Var.v = !z10;
        n4 n4Var = r3Var.H;
        n4Var.i0(true);
        if (r3Var == n4Var.f36375r0[0]) {
            o0 o0Var = n4Var.f36363e0;
            if (!o0Var.T && !o0Var.Q) {
                ArticleViewer$WindowView articleViewer$WindowView = n4Var.f36361c0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f20767f) {
                    if (!n4Var.J() && n4Var.f36359a0.size() <= 1) {
                        n4Var.f36363e0.setBackButtonCached(false);
                        n4Var.f36363e0.M.f();
                    } else {
                        org.telegram.ui.ActionBar.i2 i2Var = n4Var.f36363e0.J;
                        if (!r3Var.f37689s && n4Var.f36359a0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        i2Var.c(f10, true);
                        o0 o0Var2 = n4Var.f36363e0;
                        if (!r3Var.f37689s && n4Var.f36359a0.size() <= 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        o0Var2.setBackButtonCached(z11);
                        n4Var.f36363e0.M.f();
                    }
                    n4Var.f36363e0.setHasForward(r3Var.v);
                    o0 o0Var3 = n4Var.f36363e0;
                    r3 r3Var2 = n4Var.f36375r0[0];
                    if (r3Var2 != null && r3Var2.e()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o0Var3.setIsTonsite(z12);
                    o0 o0Var4 = n4Var.f36363e0;
                    r3 r3Var3 = n4Var.f36375r0[0];
                    o0Var4.setIsLocal((r3Var3 == null || !r3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.P0.e.setWebView(y0Var);
    }

    @Override
    public final void U(String str, boolean z4) {
        org.telegram.ui.web.f2 f2Var;
        r3 r3Var = this.P0;
        n4 n4Var = r3Var.H;
        if (n4Var.f36363e0 != null && r3Var == n4Var.f36375r0[0] && (f2Var = r3Var.f37692y) != null && f2Var.b() == null) {
            r3Var.f37692y.d(getWebView());
        }
        super.U(str, z4);
    }
}
