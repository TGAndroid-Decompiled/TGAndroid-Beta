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
public final class su extends WebViewClient {
    public final xu f28369a;

    public su(xu xuVar) {
        this.f28369a = xuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xu xuVar = this.f28369a;
        ImageView imageView = xuVar.f30487x;
        if (!xuVar.f30488y) {
            xuVar.f30483n.setVisibility(4);
            xuVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.d6 d6Var;
        xu xuVar = this.f28369a;
        try {
            if (!AndroidUtilities.isSafeToShow(xuVar.getContext())) {
                return true;
            }
            Context context = xuVar.getContext();
            d6Var = ((org.telegram.ui.ActionBar.e3) xuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new zp(this, 10));
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
        if (this.f28369a.f30488y) {
            nf.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
