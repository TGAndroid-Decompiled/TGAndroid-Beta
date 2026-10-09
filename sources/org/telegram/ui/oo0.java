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
public final class oo0 extends WebViewClient {
    public final Context f40584a;
    public final vo0 f40585b;

    public oo0(vo0 vo0Var, Context context) {
        this.f40585b = vo0Var;
        this.f40584a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        vo0 vo0Var = this.f40585b;
        vo0Var.f42954z0 = false;
        vo0Var.H0(true, false);
        vo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        vo0 vo0Var = this.f40585b;
        try {
            if (!AndroidUtilities.isSafeToShow(vo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vo0Var.getParentActivity(), 0, vo0Var.Y0);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new tk0(this, 10));
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
        boolean z10;
        vo0 vo0Var = this.f40585b;
        vo0Var.f42952y = !str.equals(vo0Var.f42950x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            vo0Var.t0();
            return true;
        }
        if (!vo0.f42912h1.contains(parse.getScheme())) {
            if (!vo0.f42911g1.contains(parse.getScheme())) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40584a);
                    alertDialog$Builder.f20374a.R = vo0Var.f42939p0;
                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
