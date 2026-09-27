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
public final class bo0 extends WebViewClient {
    public final Context f32398a;
    public final ro0 f32399b;

    public bo0(ro0 ro0Var, Context context) {
        this.f32399b = ro0Var;
        this.f32398a = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ro0 ro0Var = this.f32399b;
        ro0Var.f37207z0 = false;
        ro0Var.H0(true, false);
        ro0Var.K0();
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ro0 ro0Var = this.f32399b;
        try {
            if (!AndroidUtilities.isSafeToShow(ro0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity(), 0, ro0Var.Y0);
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18655a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ml0(this, 7));
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
        ro0 ro0Var;
        boolean z10;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            ro0Var = this.f32399b;
        } catch (Exception unused) {
        }
        if (equals) {
            ro0Var.t0();
            return true;
        }
        if (!ro0.f37166h1.contains(parse.getScheme())) {
            if (!ro0.f37165g1.contains(parse.getScheme())) {
                try {
                    if (ro0Var.getParentActivity() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ro0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f32398a);
                    alertDialog$Builder.f18655a.R = ro0Var.f37192p0;
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
