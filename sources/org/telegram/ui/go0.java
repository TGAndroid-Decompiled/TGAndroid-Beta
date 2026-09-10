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
public final class go0 extends WebViewClient {
    public final Context f33145a;
    public final wo0 f33146b;

    public go0(wo0 wo0Var, Context context) {
        this.f33146b = wo0Var;
        this.f33145a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        wo0 wo0Var = this.f33146b;
        wo0Var.f38294z0 = false;
        wo0Var.H0(true, false);
        wo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        wo0 wo0Var = this.f33146b;
        try {
            if (!AndroidUtilities.isSafeToShow(wo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity(), 0, wo0Var.Y0);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ql0(this, 7));
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
        boolean equals;
        wo0 wo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            wo0Var = this.f33146b;
        } catch (Exception unused) {
        }
        if (equals) {
            wo0Var.t0();
            return true;
        }
        if (!wo0.f38253h1.contains(parse.getScheme())) {
            if (!wo0.f38252g1.contains(parse.getScheme())) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f33145a);
                    alertDialog$Builder.f17528a.R = wo0Var.f38279p0;
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
