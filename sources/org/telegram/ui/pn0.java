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
public final class pn0 extends WebViewClient {
    public final Context f40197a;
    public final fo0 f40198b;

    public pn0(fo0 fo0Var, Context context) {
        this.f40198b = fo0Var;
        this.f40197a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        fo0 fo0Var = this.f40198b;
        fo0Var.f37010z0 = false;
        fo0Var.H0(true, false);
        fo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        fo0 fo0Var = this.f40198b;
        try {
            if (!AndroidUtilities.isSafeToShow(fo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fo0Var.getParentActivity(), 0, fo0Var.Y0);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ek0(this, 8));
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
        fo0 fo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            fo0Var = this.f40198b;
        } catch (Exception unused) {
        }
        if (equals) {
            fo0Var.t0();
            return true;
        }
        if (!fo0.f36969h1.contains(parse.getScheme())) {
            if (!fo0.f36968g1.contains(parse.getScheme())) {
                try {
                    if (fo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40197a);
                    alertDialog$Builder.f20601a.R = fo0Var.f36995p0;
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
