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
public final class uu extends WebViewClient {
    public final zu f27748a;

    public uu(zu zuVar) {
        this.f27748a = zuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        zu zuVar = this.f27748a;
        ImageView imageView = zuVar.f29817x;
        if (!zuVar.f29818y) {
            zuVar.f29813n.setVisibility(4);
            zuVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.f6 f6Var;
        zu zuVar = this.f27748a;
        try {
            if (!AndroidUtilities.isSafeToShow(zuVar.getContext())) {
                return true;
            }
            Context context = zuVar.getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) zuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new dq(this, 10));
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
        if (this.f27748a.f29818y) {
            nf.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
