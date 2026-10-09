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
public final class gv extends WebViewClient {
    public final lv f26884a;

    public gv(lv lvVar) {
        this.f26884a = lvVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lv lvVar = this.f26884a;
        ImageView imageView = lvVar.f28606x;
        if (!lvVar.f28607y) {
            lvVar.f28602n.setVisibility(4);
            lvVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.e6 e6Var;
        lv lvVar = this.f26884a;
        try {
            if (!AndroidUtilities.isSafeToShow(lvVar.getContext())) {
                return true;
            }
            Context context = lvVar.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) lvVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nq(this, 10));
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
        if (this.f26884a.f28607y) {
            of.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
