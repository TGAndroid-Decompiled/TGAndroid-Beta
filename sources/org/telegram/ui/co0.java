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
    public final Context f33399a;
    public final jo0 f33400b;

    public co0(jo0 jo0Var, Context context) {
        this.f33400b = jo0Var;
        this.f33399a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        jo0 jo0Var = this.f33400b;
        jo0Var.f35420w0 = false;
        jo0Var.H0(true, false);
        jo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        jo0 jo0Var = this.f33400b;
        try {
            if (!AndroidUtilities.isSafeToShow(jo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jo0Var.getParentActivity(), 0, jo0Var.V0);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new el0(this, 9));
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
        boolean z4;
        jo0 jo0Var = this.f33400b;
        jo0Var.f35423y = !str.equals(jo0Var.f35421x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            jo0Var.t0();
            return true;
        }
        if (!jo0.f35387e1.contains(parse.getScheme())) {
            if (!jo0.f35386d1.contains(parse.getScheme())) {
                try {
                    if (jo0Var.getParentActivity() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        jo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f33399a);
                    alertDialog$Builder.f19503a.O = jo0Var.m0;
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
