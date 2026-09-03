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
public final class ju extends WebViewClient {
    public final ou f26052a;

    public ju(ou ouVar) {
        this.f26052a = ouVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ou ouVar = this.f26052a;
        ImageView imageView = ouVar.f27658x;
        if (!ouVar.f27659y) {
            ouVar.f27654n.setVisibility(4);
            ouVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.f6 f6Var;
        ou ouVar = this.f26052a;
        try {
            if (!AndroidUtilities.isSafeToShow(ouVar.getContext())) {
                return true;
            }
            Context context = ouVar.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) ouVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new up(this, 10));
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
        if (this.f26052a.f27659y) {
            ze.d.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
