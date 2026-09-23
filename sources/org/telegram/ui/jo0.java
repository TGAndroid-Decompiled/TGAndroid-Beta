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
public final class jo0 extends WebViewClient {
    public final Context f34493a;
    public final qo0 f34494b;

    public jo0(qo0 qo0Var, Context context) {
        this.f34494b = qo0Var;
        this.f34493a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        qo0 qo0Var = this.f34494b;
        qo0Var.f36523z0 = false;
        qo0Var.H0(true, false);
        qo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        qo0 qo0Var = this.f34494b;
        try {
            if (!AndroidUtilities.isSafeToShow(qo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qo0Var.getParentActivity(), 0, qo0Var.Y0);
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new jl0(this, 9));
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
        qo0 qo0Var = this.f34494b;
        qo0Var.f36521y = !str.equals(qo0Var.f36519x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            qo0Var.t0();
            return true;
        }
        if (!qo0.f36482h1.contains(parse.getScheme())) {
            if (!qo0.f36481g1.contains(parse.getScheme())) {
                try {
                    if (qo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        qo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34493a);
                    alertDialog$Builder.f18409a.R = qo0Var.f36508p0;
                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
