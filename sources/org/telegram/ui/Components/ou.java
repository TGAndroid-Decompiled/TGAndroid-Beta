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
public final class ou extends WebViewClient {
    public final tu f29187a;

    public ou(tu tuVar) {
        this.f29187a = tuVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        tu tuVar = this.f29187a;
        ImageView imageView = tuVar.f30715x;
        if (!tuVar.f30716y) {
            tuVar.f30711n.setVisibility(4);
            tuVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.f6 f6Var;
        tu tuVar = this.f29187a;
        try {
            if (!AndroidUtilities.isSafeToShow(tuVar.getContext())) {
                return true;
            }
            Context context = tuVar.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) tuVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20198a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new wp(this, 10));
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
        if (this.f29187a.f30716y) {
            of.f.s(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
