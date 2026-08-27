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

public final class on0 extends WebViewClient {

    public final Context f41142a;

    public final do0 f41143b;

    public on0(do0 do0Var, Context context) {
        this.f41143b = do0Var;
        this.f41142a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        do0 do0Var = this.f41143b;
        do0Var.f37481v0 = false;
        do0Var.H0(true, false);
        do0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        do0 do0Var = this.f41143b;
        try {
            if (!AndroidUtilities.isSafeToShow(do0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(do0Var.getParentActivity(), 0, do0Var.U0);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new zk0(this, 7));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "t.me".equals(uri.getHost());
            do0 do0Var = this.f41143b;
            if (zEquals) {
                do0Var.t0();
                return true;
            }
            if (!do0.f37450d1.contains(uri.getScheme())) {
                if (!do0.f37449c1.contains(uri.getScheme())) {
                    try {
                        if (do0Var.getParentActivity() != null) {
                            do0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                            return true;
                        }
                    } catch (ActivityNotFoundException unused) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41142a);
                        alertDialog$Builder.f22702a.N = do0Var.f37469l0;
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.o();
                    }
                }
                return false;
            }
            return true;
        } catch (Exception unused2) {
        }
    }
}
