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
public final class ru extends WebViewClient {
    public final wu f28051a;

    public ru(wu wuVar) {
        this.f28051a = wuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        wu wuVar = this.f28051a;
        ImageView imageView = wuVar.f30191x;
        if (!wuVar.f30192y) {
            wuVar.f30187n.setVisibility(4);
            wuVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.d6 d6Var;
        wu wuVar = this.f28051a;
        try {
            if (!AndroidUtilities.isSafeToShow(wuVar.getContext())) {
                return true;
            }
            Context context = wuVar.getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) wuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18662a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new yp(this, 10));
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
        if (this.f28051a.f30192y) {
            nf.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
