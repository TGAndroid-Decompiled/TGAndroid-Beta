package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class em0 extends WebViewClient {
    public final int f37084a;
    public final Context f37085b;
    public final sm0 f37086c;

    public em0(sm0 sm0Var, Context context, int i10) {
        this.f37084a = i10;
        this.f37086c = sm0Var;
        this.f37085b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f37084a) {
            case 0:
                super.onPageFinished(webView, str);
                sm0 sm0Var = this.f37086c;
                sm0Var.f41586z0 = false;
                sm0Var.M0(true, false);
                sm0Var.P0();
                return;
            default:
                super.onPageFinished(webView, str);
                sm0 sm0Var2 = this.f37086c;
                sm0Var2.f41586z0 = false;
                sm0Var2.M0(true, false);
                sm0Var2.P0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = this.f37084a;
        sm0 sm0Var = this.f37086c;
        switch (i10) {
            case 0:
                try {
                    if (!org.telegram.messenger.i0.M1(sm0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sm0Var.getParentActivity(), sm0Var.Y0);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = org.telegram.messenger.cd.L0(2131752104, null);
                    x1Var.T = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752105, null), new mg0(this, 10));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.i0.M1(sm0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, sm0Var.getParentActivity(), sm0Var.Y0);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = org.telegram.messenger.cd.L0(2131752104, null);
                    x1Var2.T = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752105, null), new mg0(this, 12));
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
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
        int i10 = this.f37084a;
        Context context = this.f37085b;
        boolean z11 = false;
        sm0 sm0Var = this.f37086c;
        switch (i10) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        sm0Var.y0();
                    } else if (!sm0.f41545h1.contains(parse2.getScheme())) {
                        if (sm0.f41544g1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (sm0Var.getParentActivity() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                sm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = sm0Var.f41571p0;
                            x1Var.T = org.telegram.messenger.cd.L0(2131747445, null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                sm0Var.D = !str.equals(sm0Var.f41584y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    sm0Var.y0();
                    return true;
                } else if (sm0.f41545h1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!sm0.f41544g1.contains(parse.getScheme())) {
                        try {
                            if (sm0Var.getParentActivity() != null) {
                                z11 = true;
                            }
                            if (!z11) {
                                return true;
                            }
                            sm0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                            x1Var2.R = sm0Var.f41571p0;
                            x1Var2.T = org.telegram.messenger.cd.L0(2131747445, null);
                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
