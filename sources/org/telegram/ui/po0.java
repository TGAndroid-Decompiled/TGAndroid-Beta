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
public final class po0 extends WebViewClient {
    public final Context f36626a;
    public final wo0 f36627b;

    public po0(wo0 wo0Var, Context context) {
        this.f36627b = wo0Var;
        this.f36626a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        wo0 wo0Var = this.f36627b;
        wo0Var.f39346z0 = false;
        wo0Var.H0(true, false);
        wo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        wo0 wo0Var = this.f36627b;
        try {
            if (!AndroidUtilities.isSafeToShow(wo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity(), 0, wo0Var.Y0);
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18437a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new pl0(this, 9));
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
        wo0 wo0Var = this.f36627b;
        wo0Var.f39344y = !str.equals(wo0Var.f39342x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            wo0Var.t0();
            return true;
        }
        if (!wo0.f39305h1.contains(parse.getScheme())) {
            if (!wo0.f39304g1.contains(parse.getScheme())) {
                try {
                    if (wo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        wo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36626a);
                    alertDialog$Builder.f18437a.R = wo0Var.f39331p0;
                    alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
