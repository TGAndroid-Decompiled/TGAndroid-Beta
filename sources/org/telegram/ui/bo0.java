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
public final class bo0 extends WebViewClient {
    public final Context f38077a;
    public final ro0 f38078b;

    public bo0(ro0 ro0Var, Context context) {
        this.f38078b = ro0Var;
        this.f38077a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ro0 ro0Var = this.f38078b;
        ro0Var.f43137z0 = false;
        ro0Var.I0(true, false);
        ro0Var.L0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ro0 ro0Var = this.f38078b;
        try {
            if (!AndroidUtilities.isSafeToShow(ro0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity(), 0, ro0Var.Y0);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nj0(this, 9));
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
        Uri parse;
        boolean equals;
        ro0 ro0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            ro0Var = this.f38078b;
        } catch (Exception unused) {
        }
        if (equals) {
            ro0Var.u0();
            return true;
        }
        if (!ro0.f43096h1.contains(parse.getScheme())) {
            if (!ro0.f43095g1.contains(parse.getScheme())) {
                try {
                    if (ro0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ro0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f38077a);
                    alertDialog$Builder.f22369a.R = ro0Var.f43122p0;
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.p();
                }
            }
            return false;
        }
        return true;
    }
}
