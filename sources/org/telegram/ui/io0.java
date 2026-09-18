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
    public final Context f34643a;
    public final yo0 f34644b;

    public io0(yo0 yo0Var, Context context) {
        this.f34644b = yo0Var;
        this.f34643a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        yo0 yo0Var = this.f34644b;
        yo0Var.f39989z0 = false;
        yo0Var.H0(true, false);
        yo0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        yo0 yo0Var = this.f34644b;
        try {
            if (!AndroidUtilities.isSafeToShow(yo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yo0Var.getParentActivity(), 0, yo0Var.Y0);
            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18447a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new sl0(this, 7));
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
        yo0 yo0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            yo0Var = this.f34644b;
        } catch (Exception unused) {
        }
        if (equals) {
            yo0Var.t0();
            return true;
        }
        if (!yo0.f39948h1.contains(parse.getScheme())) {
            if (!yo0.f39947g1.contains(parse.getScheme())) {
                try {
                    if (yo0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        yo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34643a);
                    alertDialog$Builder.f18447a.R = yo0Var.f39974p0;
                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
