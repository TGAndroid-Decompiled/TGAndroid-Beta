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
    public final Context f36534a;
    public final lo0 f36535b;

    public eo0(lo0 lo0Var, Context context) {
        this.f36535b = lo0Var;
        this.f36534a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lo0 lo0Var = this.f36535b;
        lo0Var.f38740w0 = false;
        lo0Var.H0(true, false);
        lo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        lo0 lo0Var = this.f36535b;
        try {
            if (!AndroidUtilities.isSafeToShow(lo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity(), 0, lo0Var.V0);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new gl0(this, 9));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean z4;
        lo0 lo0Var = this.f36535b;
        lo0Var.f38743y = !str.equals(lo0Var.f38741x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            lo0Var.t0();
            return true;
        }
        if (!lo0.f38706e1.contains(parse.getScheme())) {
            if (!lo0.f38705d1.contains(parse.getScheme())) {
                try {
                    if (lo0Var.getParentActivity() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        lo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36534a);
                    alertDialog$Builder.f21168a.O = lo0Var.m0;
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
