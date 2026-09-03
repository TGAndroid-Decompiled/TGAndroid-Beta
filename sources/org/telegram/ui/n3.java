package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n3 extends org.telegram.ui.web.a1 {
    public final p3 M0;

    public n3(p3 p3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.M0 = p3Var;
    }

    @Override
    public final void A(String str, boolean z4) {
        String str2;
        String string;
        p3 p3Var = this.M0;
        if (z4) {
            if (p3Var.f39867r == null) {
                m3 m3Var = p3Var.f39864e;
                f3 f3Var = new f3(p3Var.getContext());
                p3Var.f39867r = f3Var;
                m3Var.addView(f3Var, k7.c6.c(-1.0f, -1));
                p3Var.f39867r.h.setOnClickListener(new a(p3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(p3Var.f39867r, p3Var.f39866n, 1.0f, false);
            }
            f3 f3Var2 = p3Var.f39867r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = f3Var2.f36642e;
            f3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String s6 = org.telegram.ui.web.a1.s(str2);
            boolean z10 = true;
            if (s6 != null && Uri.parse(s6) != null && Uri.parse(s6).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(s6).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            f3Var2.f36643f.setText(str);
            f3 f3Var3 = p3Var.f39867r;
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, i10, false)) > 0.721f) {
                z10 = false;
            }
            f3Var3.b(z10, false);
            p3Var.f39867r.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        }
        f3 f3Var4 = p3Var.f39867r;
        p3Var.f39866n = z4;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var4, z4, 1.0f, false);
        invalidate();
    }

    @Override
    public final void E() {
        this.M0.H.i0(true);
    }

    @Override
    public final void F(boolean z4, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        p3 p3Var = this.M0;
        p3Var.f39868s = !z4;
        p3Var.v = !z10;
        l4 l4Var = p3Var.H;
        l4Var.i0(true);
        if (p3Var == l4Var.f38524r0[0]) {
            m0 m0Var = l4Var.f38512e0;
            if (!m0Var.T && !m0Var.Q) {
                ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38510c0;
                if (!articleViewer$WindowView.f22512e && !articleViewer$WindowView.f22513f) {
                    if (!l4Var.J() && l4Var.f38508a0.size() <= 1) {
                        l4Var.f38512e0.setBackButtonCached(false);
                        l4Var.f38512e0.M.f();
                    } else {
                        org.telegram.ui.ActionBar.i2 i2Var = l4Var.f38512e0.J;
                        if (!p3Var.f39868s && l4Var.f38508a0.size() <= 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        i2Var.c(f10, true);
                        m0 m0Var2 = l4Var.f38512e0;
                        if (!p3Var.f39868s && l4Var.f38508a0.size() <= 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        m0Var2.setBackButtonCached(z11);
                        l4Var.f38512e0.M.f();
                    }
                    l4Var.f38512e0.setHasForward(p3Var.v);
                    m0 m0Var3 = l4Var.f38512e0;
                    p3 p3Var2 = l4Var.f38524r0[0];
                    if (p3Var2 != null && p3Var2.e()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m0Var3.setIsTonsite(z12);
                    m0 m0Var4 = l4Var.f38512e0;
                    p3 p3Var3 = l4Var.f38524r0[0];
                    m0Var4.setIsLocal((p3Var3 == null || !p3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void G(org.telegram.ui.web.x0 x0Var) {
        this.M0.f39864e.setWebView(x0Var);
    }

    @Override
    public final void O(String str, boolean z4) {
        org.telegram.ui.web.f2 f2Var;
        p3 p3Var = this.M0;
        l4 l4Var = p3Var.H;
        if (l4Var.f38512e0 != null && p3Var == l4Var.f38524r0[0] && (f2Var = p3Var.f39871y) != null && f2Var.b() == null) {
            p3Var.f39871y.d(getWebView());
        }
        super.O(str, z4);
    }
}
