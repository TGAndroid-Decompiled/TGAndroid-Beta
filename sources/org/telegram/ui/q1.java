package org.telegram.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q1 extends WebViewClient {
    public final t1 f36722a;

    public q1(t1 t1Var) {
        this.f36722a = t1Var;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && launchActivity.isFinishing()) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36722a.getContext(), 0, null);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18662a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new eu0(this, 8));
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
        t1 t1Var = this.f36722a;
        if (t1Var.f37916s) {
            nf.f.s(t1Var.f37918x.L, str);
            return true;
        }
        return false;
    }
}
