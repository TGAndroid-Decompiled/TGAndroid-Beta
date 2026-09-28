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
public final class ho0 extends WebViewClient {
    public final Context f34265a;
    public final oo0 f34266b;

    public ho0(oo0 oo0Var, Context context) {
        this.f34266b = oo0Var;
        this.f34265a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        oo0 oo0Var = this.f34266b;
        oo0Var.f36317z0 = false;
        oo0Var.H0(true, false);
        oo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        oo0 oo0Var = this.f34266b;
        try {
            if (!AndroidUtilities.isSafeToShow(oo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity(), 0, oo0Var.Y0);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new il0(this, 9));
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
        boolean z10;
        oo0 oo0Var = this.f34266b;
        oo0Var.f36315y = !str.equals(oo0Var.f36313x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            oo0Var.t0();
            return true;
        }
        if (!oo0.f36276h1.contains(parse.getScheme())) {
            if (!oo0.f36275g1.contains(parse.getScheme())) {
                try {
                    if (oo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        oo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34265a);
                    alertDialog$Builder.f18661a.R = oo0Var.f36302p0;
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
