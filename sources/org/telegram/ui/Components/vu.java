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
public final class vu extends WebViewClient {
    public final av f32048a;

    public vu(av avVar) {
        this.f32048a = avVar;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        av avVar = this.f32048a;
        ImageView imageView = avVar.f24817x;
        if (!avVar.f24818y) {
            avVar.f24813n.setVisibility(4);
            avVar.h.setVisibility(4);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        org.telegram.ui.ActionBar.g6 g6Var;
        av avVar = this.f32048a;
        try {
            if (!AndroidUtilities.isSafeToShow(avVar.getContext())) {
                return true;
            }
            Context context = avVar.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) avVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new xp(this, 11));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f32048a.f24818y) {
            pf.d.r(webView.getContext(), str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
