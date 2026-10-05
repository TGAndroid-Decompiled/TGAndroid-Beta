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
public final class co0 extends WebViewClient {
    public final Context f35511a;
    public final so0 f35512b;

    public co0(so0 so0Var, Context context) {
        this.f35512b = so0Var;
        this.f35511a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        so0 so0Var = this.f35512b;
        so0Var.f40599z0 = false;
        so0Var.H0(true, false);
        so0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        so0 so0Var = this.f35512b;
        try {
            if (!AndroidUtilities.isSafeToShow(so0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(so0Var.getParentActivity(), 0, so0Var.Y0);
            alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nl0(this, 7));
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
        so0 so0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            so0Var = this.f35512b;
        } catch (Exception unused) {
        }
        if (equals) {
            so0Var.t0();
            return true;
        }
        if (!so0.f40557h1.contains(parse.getScheme())) {
            if (!so0.f40556g1.contains(parse.getScheme())) {
                try {
                    if (so0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        so0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35511a);
                    alertDialog$Builder.f20377a.R = so0Var.f40584p0;
                    alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
