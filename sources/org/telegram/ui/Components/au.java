package org.telegram.ui.Components;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class au extends WebViewClient {

    public final fu f26826a;

    public au(fu fuVar) {
        this.f26826a = fuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        fu fuVar = this.f26826a;
        ImageView imageView = fuVar.f28458x;
        if (fuVar.f28459y) {
            return;
        }
        fuVar.f28454n.setVisibility(4);
        fuVar.h.setVisibility(4);
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        fu fuVar = this.f26826a;
        try {
            if (!AndroidUtilities.isSafeToShow(fuVar.getContext())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fuVar.getContext(), 0, ((org.telegram.ui.ActionBar.e3) fuVar).resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new lp(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.f26826a.f28459y) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        we.e.s(webView.getContext(), str);
        return true;
    }
}
