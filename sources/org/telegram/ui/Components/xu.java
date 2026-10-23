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
public final class xu extends WebViewClient {
    public final cv f32648a;

    public xu(cv cvVar) {
        this.f32648a = cvVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        cv cvVar = this.f32648a;
        ImageView imageView = cvVar.f25435x;
        if (!cvVar.f25436y) {
            cvVar.f25431n.setVisibility(4);
            cvVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.g6 g6Var;
        cv cvVar = this.f32648a;
        try {
            if (!AndroidUtilities.isSafeToShow(cvVar.getContext())) {
                return true;
            }
            Context context = cvVar.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) cvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new zp(this, 11));
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
        if (this.f32648a.f25436y) {
            pf.d.r(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
