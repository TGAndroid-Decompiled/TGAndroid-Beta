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
public final class mu extends WebViewClient {
    public final ru f29248a;

    public mu(ru ruVar) {
        this.f29248a = ruVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ru ruVar = this.f29248a;
        ImageView imageView = ruVar.f30863x;
        if (!ruVar.f30864y) {
            ruVar.f30859n.setVisibility(4);
            ruVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.g6 g6Var;
        ru ruVar = this.f29248a;
        try {
            if (!AndroidUtilities.isSafeToShow(ruVar.getContext())) {
                return true;
            }
            Context context = ruVar.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) ruVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new xp(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f29248a.f30864y) {
            af.g.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
