package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l3 extends org.telegram.ui.web.c1 {
    public final n3 S0;

    public l3(n3 n3Var, Context context, int i10) {
        super(i10, context, null, false);
        this.S0 = n3Var;
    }

    @Override
    public final void E(String str, boolean z10) {
        String str2;
        String string;
        n3 n3Var = this.S0;
        if (z10) {
            if (n3Var.f35106r == null) {
                k3 k3Var = n3Var.e;
                e3 e3Var = new e3(n3Var.getContext());
                n3Var.f35106r = e3Var;
                k3Var.addView(e3Var, w7.a6.c(-1.0f, -1));
                n3Var.f35106r.h.setOnClickListener(new a(n3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(n3Var.f35106r, n3Var.f35105n, 1.0f, false);
            }
            e3 e3Var2 = n3Var.f35106r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = e3Var2.e;
            e3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String v = org.telegram.ui.web.c1.v(str2);
            boolean z11 = true;
            if (v != null && Uri.parse(v) != null && Uri.parse(v).getAuthority() != null) {
                string = LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(v).getAuthority());
            } else {
                string = LocaleController.getString(R.string.WebErrorInfo);
            }
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), false));
            e3Var2.f32042f.setText(str);
            e3 e3Var3 = n3Var.f35106r;
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) > 0.721f) {
                z11 = false;
            }
            e3Var3.b(z11, false);
            n3Var.f35106r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        e3 e3Var4 = n3Var.f35106r;
        n3Var.f35105n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(e3Var4, z10, 1.0f, false);
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
        n3 n3Var = this.S0;
        n3Var.f35107s = !z10;
        n3Var.v = !z11;
        j4 j4Var = n3Var.K;
        j4Var.i0(true);
        if (n3Var == j4Var.f33920u0[0]) {
            l0 l0Var = j4Var.f33908h0;
            if (!l0Var.W && !l0Var.T) {
                ArticleViewer$WindowView articleViewer$WindowView = j4Var.f33906f0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f18842f) {
                    if (!j4Var.J() && j4Var.f33904d0.size() <= 1) {
                        j4Var.f33908h0.setBackButtonCached(false);
                        j4Var.f33908h0.P.f();
                    } else {
                        org.telegram.ui.ActionBar.i2 i2Var = j4Var.f33908h0.M;
                        if (!n3Var.f35107s && j4Var.f33904d0.size() <= 1) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        i2Var.c(f7, true);
                        l0 l0Var2 = j4Var.f33908h0;
                        if (!n3Var.f35107s && j4Var.f33904d0.size() <= 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        l0Var2.setBackButtonCached(z12);
                        j4Var.f33908h0.P.f();
                    }
                    j4Var.f33908h0.setHasForward(n3Var.v);
                    l0 l0Var3 = j4Var.f33908h0;
                    n3 n3Var2 = j4Var.f33920u0[0];
                    if (n3Var2 != null && n3Var2.e()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var3.setIsTonsite(z13);
                    l0 l0Var4 = j4Var.f33908h0;
                    n3 n3Var3 = j4Var.f33920u0[0];
                    l0Var4.setIsLocal((n3Var3 == null || !n3Var3.d()) ? false : false);
                }
            }
        }
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.S0.e.setWebView(y0Var);
    }

    @Override
    public final void U(String str, boolean z10) {
        org.telegram.ui.web.i2 i2Var;
        n3 n3Var = this.S0;
        j4 j4Var = n3Var.K;
        if (j4Var.f33908h0 != null && n3Var == j4Var.f33920u0[0] && (i2Var = n3Var.f35110y) != null && i2Var.b() == null) {
            n3Var.f35110y.d(getWebView());
        }
        super.U(str, z10);
    }
}
