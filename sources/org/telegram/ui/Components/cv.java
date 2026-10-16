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
public final class cv extends WebViewClient {
    public final hv f23899a;

    public cv(hv hvVar) {
        this.f23899a = hvVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        hv hvVar = this.f23899a;
        ImageView imageView = hvVar.f25412x;
        if (!hvVar.f25413y) {
            hvVar.f25408n.setVisibility(4);
            hvVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.c6 c6Var;
        hv hvVar = this.f23899a;
        try {
            if (!AndroidUtilities.isSafeToShow(hvVar.getContext())) {
                return true;
            }
            Context context = hvVar.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) hvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new kq(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f23899a.f25413y) {
            pf.d.r(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
