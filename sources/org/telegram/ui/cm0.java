package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cm0 extends WebViewClient {
    public final int f36348a;
    public final Context f36349b;
    public final qm0 f36350c;

    public cm0(qm0 qm0Var, Context context, int i10) {
        this.f36348a = i10;
        this.f36350c = qm0Var;
        this.f36349b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f36348a) {
            case 0:
                super.onPageFinished(webView, str);
                qm0 qm0Var = this.f36350c;
                qm0Var.f40852z0 = false;
                qm0Var.N0(true, false);
                qm0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                qm0 qm0Var2 = this.f36350c;
                qm0Var2.f40852z0 = false;
                qm0Var2.N0(true, false);
                qm0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = this.f36348a;
        qm0 qm0Var = this.f36350c;
        switch (i10) {
            case 0:
                try {
                    if (!org.telegram.messenger.i0.M1(qm0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qm0Var.getParentActivity(), qm0Var.Y0);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = org.telegram.messenger.dd.L0(2131752104, null);
                    x1Var.T = org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752105, null), new kg0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.i0.M1(qm0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, qm0Var.getParentActivity(), qm0Var.Y0);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = org.telegram.messenger.dd.L0(2131752104, null);
                    x1Var2.T = org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752105, null), new kg0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                    alertDialog$Builder2.p();
                    return true;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return false;
                }
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z10;
        Uri parse;
        int i10 = this.f36348a;
        Context context = this.f36349b;
        boolean z11 = false;
        qm0 qm0Var = this.f36350c;
        switch (i10) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        qm0Var.z0();
                    } else if (!qm0.f40811h1.contains(parse2.getScheme())) {
                        if (qm0.f40810g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (qm0Var.getParentActivity() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                qm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = qm0Var.f40837p0;
                            x1Var.T = org.telegram.messenger.dd.L0(2131747445, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                qm0Var.D = !str.equals(qm0Var.f40850y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    qm0Var.z0();
                    return true;
                } else if (qm0.f40811h1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!qm0.f40810g1.contains(parse.getScheme())) {
                        try {
                            if (qm0Var.getParentActivity() != null) {
                                z11 = true;
                            }
                            if (!z11) {
                                return true;
                            }
                            qm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                            x1Var2.R = qm0Var.f40837p0;
                            x1Var2.T = org.telegram.messenger.dd.L0(2131747445, null);
                            alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
