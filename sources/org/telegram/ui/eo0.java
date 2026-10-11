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
public final class eo0 extends WebViewClient {
    public final Context f37411a;
    public final uo0 f37412b;

    public eo0(uo0 uo0Var, Context context) {
        this.f37412b = uo0Var;
        this.f37411a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        uo0 uo0Var = this.f37412b;
        uo0Var.f42733z0 = false;
        uo0Var.H0(true, false);
        uo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        uo0 uo0Var = this.f37412b;
        try {
            if (!AndroidUtilities.isSafeToShow(uo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uo0Var.getParentActivity(), 0, uo0Var.Y0);
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20368a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new sk0(this, 8));
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
        uo0 uo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            uo0Var = this.f37412b;
        } catch (Exception unused) {
        }
        if (equals) {
            uo0Var.t0();
            return true;
        }
        if (!uo0.f42691h1.contains(parse.getScheme())) {
            if (!uo0.f42690g1.contains(parse.getScheme())) {
                try {
                    if (uo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        uo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37411a);
                    alertDialog$Builder.f20368a.R = uo0Var.f42718p0;
                    alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
