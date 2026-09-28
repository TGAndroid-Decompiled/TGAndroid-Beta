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
    public final Context f34266a;
    public final oo0 f34267b;

    public ho0(oo0 oo0Var, Context context) {
        this.f34267b = oo0Var;
        this.f34266a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        oo0 oo0Var = this.f34267b;
        oo0Var.f36318z0 = false;
        oo0Var.H0(true, false);
        oo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        oo0 oo0Var = this.f34267b;
        try {
            if (!AndroidUtilities.isSafeToShow(oo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity(), 0, oo0Var.Y0);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18662a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new il0(this, 9));
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
        oo0 oo0Var = this.f34267b;
        oo0Var.f36316y = !str.equals(oo0Var.f36314x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            oo0Var.t0();
            return true;
        }
        if (!oo0.f36277h1.contains(parse.getScheme())) {
            if (!oo0.f36276g1.contains(parse.getScheme())) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34266a);
                    alertDialog$Builder.f18662a.R = oo0Var.f36303p0;
                    alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
