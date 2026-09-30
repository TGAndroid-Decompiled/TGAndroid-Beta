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
public final class tu extends WebViewClient {
    public final yu f28657a;

    public tu(yu yuVar) {
        this.f28657a = yuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        yu yuVar = this.f28657a;
        ImageView imageView = yuVar.f30816x;
        if (!yuVar.f30817y) {
            yuVar.f30812n.setVisibility(4);
            yuVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.d6 d6Var;
        yu yuVar = this.f28657a;
        try {
            if (!AndroidUtilities.isSafeToShow(yuVar.getContext())) {
                return true;
            }
            Context context = yuVar.getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) yuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18678a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new aq(this, 10));
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
        if (this.f28657a.f30817y) {
            nf.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
