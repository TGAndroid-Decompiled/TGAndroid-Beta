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
public final class yu extends WebViewClient {
    public final dv f35139a;

    public yu(dv dvVar) {
        this.f35139a = dvVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        dv dvVar = this.f35139a;
        ImageView imageView = dvVar.f27612x;
        if (!dvVar.f27613y) {
            dvVar.f27608n.setVisibility(4);
            dvVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.u6 u6Var;
        dv dvVar = this.f35139a;
        try {
            if (!AndroidUtilities.isSafeToShow(dvVar.getContext())) {
                return true;
            }
            Context context = dvVar.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) dvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22366a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new bq(this, 11));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f35139a.f27613y) {
            qf.d.r(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
