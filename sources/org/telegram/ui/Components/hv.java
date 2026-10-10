package org.telegram.ui.Components;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hv extends WebViewClient {
    public final mv f27152a;

    public hv(mv mvVar) {
        this.f27152a = mvVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        mv mvVar = this.f27152a;
        ImageView imageView = mvVar.f28910x;
        if (!mvVar.f28911y) {
            mvVar.f28906n.setVisibility(4);
            mvVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.e6 e6Var;
        mv mvVar = this.f27152a;
        try {
            if (!AndroidUtilities.isSafeToShow(mvVar.getContext())) {
                return true;
            }
            Context context = mvVar.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) mvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20378a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nq(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f27152a.f28911y) {
            of.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
