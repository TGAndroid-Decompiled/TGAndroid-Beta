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
public final class fo0 extends WebViewClient {
    public final Context f37651a;
    public final vo0 f37652b;

    public fo0(vo0 vo0Var, Context context) {
        this.f37652b = vo0Var;
        this.f37651a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        vo0 vo0Var = this.f37652b;
        vo0Var.f42952z0 = false;
        vo0Var.H0(true, false);
        vo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        vo0 vo0Var = this.f37652b;
        try {
            if (!AndroidUtilities.isSafeToShow(vo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vo0Var.getParentActivity(), 0, vo0Var.Y0);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new tk0(this, 8));
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
        Uri parse;
        boolean equals;
        vo0 vo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            vo0Var = this.f37652b;
        } catch (Exception unused) {
        }
        if (equals) {
            vo0Var.t0();
            return true;
        }
        if (!vo0.f42910h1.contains(parse.getScheme())) {
            if (!vo0.f42909g1.contains(parse.getScheme())) {
                try {
                    if (vo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        vo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37651a);
                    alertDialog$Builder.f20374a.R = vo0Var.f42937p0;
                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
