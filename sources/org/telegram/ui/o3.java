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
        q3 q3Var = this.L0;
        if (z10) {
            if (q3Var.f41501r == null) {
                n3 n3Var = q3Var.f41498e;
                h3 h3Var = new h3(q3Var.getContext());
                q3Var.f41501r = h3Var;
                n3Var.addView(h3Var, h7.z5.c(-1.0f, -1));
                q3Var.f41501r.h.setOnClickListener(new a(q3Var, 2));
                AndroidUtilities.updateViewVisibilityAnimated(q3Var.f41501r, q3Var.f41500n, 1.0f, false);
            }
            h3 h3Var2 = q3Var.f41501r;
            String url = getWebView() != null ? getWebView().getUrl() : null;
            TextView textView = h3Var2.f38670e;
            h3Var2.d.setText(LocaleController.getString(R.string.WebErrorTitle));
            String strS = org.telegram.ui.web.z0.s(url);
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((strS == null || Uri.parse(strS) == null || Uri.parse(strS).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(strS).getAuthority())), textView.getPaint().getFontMetricsInt(), false));
            h3Var2.f38671f.setText(str);
            h3 h3Var3 = q3Var.f41501r;
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            h3Var3.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i10, false)) <= 0.721f, false);
            q3Var.f41501r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        h3 h3Var4 = q3Var.f41501r;
        q3Var.f41500n = z10;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var4, z10, 1.0f, false);
        invalidate();
    }

    @Override
    public final void E() {
        this.L0.G.i0(true);
    }

    @Override
    public final void F(boolean z10, boolean z11) {
        q3 q3Var = this.L0;
        q3Var.f41502s = !z10;
        q3Var.v = !z11;
        m4 m4Var = q3Var.G;
        m4Var.i0(true);
        if (q3Var == m4Var.f40347q0[0]) {
            o0 o0Var = m4Var.f40335d0;
            if (o0Var.S || o0Var.P) {
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40333b0;
            if (articleViewer$WindowView.f24027e || articleViewer$WindowView.f24028f) {
                return;
            }
            if (m4Var.J() || m4Var.Z.size() > 1) {
                m4Var.f40335d0.I.c((q3Var.f41502s || m4Var.Z.size() > 1) ? 0.0f : 1.0f, true);
                m4Var.f40335d0.setBackButtonCached(q3Var.f41502s || m4Var.Z.size() > 1);
                m4Var.f40335d0.L.f();
            } else {
                m4Var.f40335d0.setBackButtonCached(false);
                m4Var.f40335d0.L.f();
            }
            m4Var.f40335d0.setHasForward(q3Var.v);
            o0 o0Var2 = m4Var.f40335d0;
            q3 q3Var2 = m4Var.f40347q0[0];
            o0Var2.setIsTonsite(q3Var2 != null && q3Var2.e());
            o0 o0Var3 = m4Var.f40335d0;
            q3 q3Var3 = m4Var.f40347q0[0];
            o0Var3.setIsLocal(q3Var3 != null && q3Var3.d());
        }
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.f41498e.setWebView(w0Var);
    }

    @Override
    public final void O(String str, boolean z10) {
        org.telegram.ui.web.c2 c2Var;
        q3 q3Var = this.L0;
        m4 m4Var = q3Var.G;
        if (m4Var.f40335d0 != null && q3Var == m4Var.f40347q0[0] && (c2Var = q3Var.f41505y) != null && c2Var.b() == null) {
            q3Var.f41505y.d(getWebView());
        }
        super.O(str, z10);
    }
}
