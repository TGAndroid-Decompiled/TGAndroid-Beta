package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qk0 extends WebViewClient {
    public final int f48905a;
    public final Context f48906b;
    public final dl0 f48907c;

    public qk0(dl0 dl0Var, Context context, int i3) {
        this.f48905a = i3;
        this.f48907c = dl0Var;
        this.f48906b = context;
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f48905a) {
            case 0:
                super.onPageFinished(webView, str);
                dl0 dl0Var = this.f48907c;
                dl0Var.A0 = false;
                dl0Var.N0(true, false);
                dl0Var.Q0();
                return;
            default:
                super.onPageFinished(webView, str);
                dl0 dl0Var2 = this.f48907c;
                dl0Var2.A0 = false;
                dl0Var2.N0(true, false);
                dl0Var2.Q0();
                return;
        }
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i3 = this.f48905a;
        dl0 dl0Var = this.f48907c;
        switch (i3) {
            case 0:
                try {
                    if (!org.telegram.messenger.g0.M1(dl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dl0Var.getParentActivity(), dl0Var.Z0);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = org.telegram.messenger.bd.M0(2131752104, null);
                    s1Var.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new sg0(this, 9));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    alertDialog$Builder.p();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return false;
                }
            default:
                try {
                    if (!org.telegram.messenger.g0.M1(dl0Var.getParentActivity())) {
                        return true;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, dl0Var.getParentActivity(), dl0Var.Z0);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = org.telegram.messenger.bd.M0(2131752104, null);
                    s1Var2.U = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752105, null), new sg0(this, 11));
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    alertDialog$Builder2.p();
                    return true;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return false;
                }
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z10;
        Uri parse;
        int i3 = this.f48905a;
        Context context = this.f48906b;
        boolean z11 = false;
        dl0 dl0Var = this.f48907c;
        switch (i3) {
            case 0:
                try {
                    Uri parse2 = Uri.parse(str);
                    if ("t.me".equals(parse2.getHost())) {
                        dl0Var.z0();
                    } else if (!dl0.f44735i1.contains(parse2.getScheme())) {
                        if (dl0.f44734h1.contains(parse2.getScheme())) {
                            return false;
                        }
                        try {
                            if (dl0Var.getParentActivity() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                dl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse2), 210);
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = dl0Var.f44764q0;
                            s1Var.U = org.telegram.messenger.bd.M0(2131747437, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            alertDialog$Builder.p();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            default:
                dl0Var.E = !str.equals(dl0Var.f44776y);
                try {
                    parse = Uri.parse(str);
                } catch (Exception unused3) {
                }
                if ("t.me".equals(parse.getHost())) {
                    dl0Var.z0();
                    return true;
                } else if (dl0.f44735i1.contains(parse.getScheme())) {
                    return true;
                } else {
                    if (!dl0.f44734h1.contains(parse.getScheme())) {
                        try {
                            if (dl0Var.getParentActivity() != null) {
                                z11 = true;
                            }
                            if (!z11) {
                                return true;
                            }
                            dl0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                            s1Var2.S = dl0Var.f44764q0;
                            s1Var2.U = org.telegram.messenger.bd.M0(2131747437, null);
                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                            alertDialog$Builder2.p();
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
        }
    }
}
