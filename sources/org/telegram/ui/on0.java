package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class on0 extends WebViewClient {
    public final Context f39939a;
    public final eo0 f39940b;

    public on0(eo0 eo0Var, Context context) {
        this.f39940b = eo0Var;
        this.f39939a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        eo0 eo0Var = this.f39940b;
        eo0Var.f36739z0 = false;
        eo0Var.H0(true, false);
        eo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        eo0 eo0Var = this.f39940b;
        try {
            if (!AndroidUtilities.isSafeToShow(eo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eo0Var.getParentActivity(), 0, eo0Var.Y0);
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20605a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ck0(this, 8));
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
        Uri parse;
        boolean equals;
        eo0 eo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            eo0Var = this.f39940b;
        } catch (Exception unused) {
        }
        if (equals) {
            eo0Var.t0();
            return true;
        }
        if (!eo0.f36698h1.contains(parse.getScheme())) {
            if (!eo0.f36697g1.contains(parse.getScheme())) {
                try {
                    if (eo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        eo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39939a);
                    alertDialog$Builder.f20605a.R = eo0Var.f36724p0;
                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
