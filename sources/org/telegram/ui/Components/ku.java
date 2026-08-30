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
public final class ku extends WebViewClient {
    public final pu f26385a;

    public ku(pu puVar) {
        this.f26385a = puVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        pu puVar = this.f26385a;
        ImageView imageView = puVar.f27991x;
        if (!puVar.f27992y) {
            puVar.f27987n.setVisibility(4);
            puVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.f6 f6Var;
        pu puVar = this.f26385a;
        try {
            if (!AndroidUtilities.isSafeToShow(puVar.getContext())) {
                return true;
            }
            Context context = puVar.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) puVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new vp(this, 10));
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
        if (this.f26385a.f27992y) {
            af.g.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
