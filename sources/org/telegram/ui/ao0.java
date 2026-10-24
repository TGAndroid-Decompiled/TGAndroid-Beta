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
public final class ao0 extends WebViewClient {
    public final Context f35817a;
    public final ho0 f35818b;

    public ao0(ho0 ho0Var, Context context) {
        this.f35818b = ho0Var;
        this.f35817a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ho0 ho0Var = this.f35818b;
        ho0Var.f37954z0 = false;
        ho0Var.H0(true, false);
        ho0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ho0 ho0Var = this.f35818b;
        try {
            if (!AndroidUtilities.isSafeToShow(ho0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ho0Var.getParentActivity(), 0, ho0Var.Y0);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nj0(this, 11));
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
        boolean z10;
        ho0 ho0Var = this.f35818b;
        ho0Var.f37952y = !str.equals(ho0Var.f37950x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            ho0Var.t0();
            return true;
        }
        if (!ho0.f37913h1.contains(parse.getScheme())) {
            if (!ho0.f37912g1.contains(parse.getScheme())) {
                try {
                    if (ho0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ho0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35817a);
                    alertDialog$Builder.f20679a.R = ho0Var.f37939p0;
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.p();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
