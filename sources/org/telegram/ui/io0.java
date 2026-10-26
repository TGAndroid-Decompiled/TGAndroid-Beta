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
public final class io0 extends WebViewClient {
    public final Context f40335a;
    public final po0 f40336b;

    public io0(po0 po0Var, Context context) {
        this.f40336b = po0Var;
        this.f40335a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        po0 po0Var = this.f40336b;
        po0Var.f42626z0 = false;
        po0Var.I0(true, false);
        po0Var.L0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        po0 po0Var = this.f40336b;
        try {
            if (!AndroidUtilities.isSafeToShow(po0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(po0Var.getParentActivity(), 0, po0Var.Y0);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22368a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new lj0(this, 11));
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
        po0 po0Var = this.f40336b;
        po0Var.f42624y = !str.equals(po0Var.f42622x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            po0Var.u0();
            return true;
        }
        if (!po0.f42585h1.contains(parse.getScheme())) {
            if (!po0.f42584g1.contains(parse.getScheme())) {
                try {
                    if (po0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        po0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40335a);
                    alertDialog$Builder.f22368a.R = po0Var.f42611p0;
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.p();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
