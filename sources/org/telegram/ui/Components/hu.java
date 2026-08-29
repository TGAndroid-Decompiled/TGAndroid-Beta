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
public final class hu extends WebViewClient {
    public final mu f29230a;

    public hu(mu muVar) {
        this.f29230a = muVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        mu muVar = this.f29230a;
        ImageView imageView = muVar.f30772x;
        if (!muVar.f30773y) {
            muVar.f30768n.setVisibility(4);
            muVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.c6 c6Var;
        mu muVar = this.f29230a;
        try {
            if (!AndroidUtilities.isSafeToShow(muVar.getContext())) {
                return true;
            }
            Context context = muVar.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) muVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new rp(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f29230a.f30773y) {
            ye.d.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
