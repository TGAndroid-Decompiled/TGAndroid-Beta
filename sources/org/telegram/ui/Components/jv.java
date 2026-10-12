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
public final class jv extends WebViewClient {
    public final ov f27656a;

    public jv(ov ovVar) {
        this.f27656a = ovVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ov ovVar = this.f27656a;
        ImageView imageView = ovVar.f29307x;
        if (!ovVar.f29308y) {
            ovVar.f29303n.setVisibility(4);
            ovVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.c6 c6Var;
        ov ovVar = this.f27656a;
        try {
            if (!AndroidUtilities.isSafeToShow(ovVar.getContext())) {
                return true;
            }
            Context context = ovVar.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) ovVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new pq(this, 10));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f27656a.f29308y) {
            of.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
