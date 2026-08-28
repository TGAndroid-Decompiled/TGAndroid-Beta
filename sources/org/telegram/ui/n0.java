package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n0 extends org.telegram.ui.web.q1 {
    public final l4 f40563x0;

    public n0(l4 l4Var, Activity activity) {
        super(activity);
        this.f40563x0 = l4Var;
    }

    @Override
    public final org.telegram.ui.web.b2 getInstantViewLoader() {
        p3 p3Var = this.f40563x0.f40026q0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.b2 b2Var = p3Var.f41329y;
            if (b2Var != null) {
                b2Var.a();
                org.telegram.ui.web.b2 b2Var2 = p3Var.f41329y;
                TLRPC.TL_webPage tL_webPage = b2Var2.f43814j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.d2.o(tL_webPage);
                    b2Var2.f43814j = null;
                }
                p3Var.f41329y = null;
                return null;
            }
        } else if (p3Var.getWebView() == null) {
            org.telegram.ui.web.b2 b2Var3 = p3Var.f41329y;
            if (b2Var3 != null) {
                b2Var3.a();
                org.telegram.ui.web.b2 b2Var4 = p3Var.f41329y;
                TLRPC.TL_webPage tL_webPage2 = b2Var4.f43814j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.d2.o(tL_webPage2);
                    b2Var4.f43814j = null;
                }
                p3Var.f41329y = null;
            }
        } else {
            org.telegram.ui.web.b2 b2Var5 = p3Var.f41329y;
            if (b2Var5 != null && (b2Var5.f43811f != p3Var.getWebView().f44037b || p3Var.f41329y.f43810e != p3Var.getWebView().getProgress())) {
                p3Var.f41329y.d(p3Var.getWebView());
                return p3Var.f41329y;
            } else if (p3Var.f41329y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.f41329y.d)) {
                return p3Var.f41329y;
            } else {
                org.telegram.ui.web.b2 b2Var6 = p3Var.f41329y;
                if (b2Var6 != null) {
                    b2Var6.a();
                    org.telegram.ui.web.b2 b2Var7 = p3Var.f41329y;
                    TLRPC.TL_webPage tL_webPage3 = b2Var7.f43814j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.d2.o(tL_webPage3);
                        b2Var7.f43814j = null;
                    }
                    p3Var.f41329y = null;
                }
                org.telegram.ui.web.b2 b2Var8 = new org.telegram.ui.web.b2(p3Var.G.T);
                p3Var.f41329y = b2Var8;
                org.telegram.ui.web.v0 webView = p3Var.getWebView();
                if (!b2Var8.f43808b) {
                    b2Var8.f43808b = true;
                    b2Var8.d = webView.getUrl();
                    b2Var8.f43810e = webView.getProgress();
                    b2Var8.f43811f = webView.f44037b;
                    b2Var8.f43816l = org.telegram.ui.web.d2.e(webView, new org.telegram.ui.web.a2(b2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = b2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    b2Var8.f43815k = ConnectionsManager.getInstance(b2Var8.f43807a).sendRequest(tL_messages_getWebPage, new bf.a(b2Var8, 21));
                }
                return p3Var.f41329y;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.T, this.f43999w, this.f44002y);
        org.telegram.ui.ActionBar.h2 h2Var = this.I;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.T, this.f43999w, this.f44002y));
        this.H.invalidate();
        l4 l4Var = this.f40563x0;
        org.telegram.ui.web.k kVar = l4Var.f40015e0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        y3 y3Var = l4Var.G;
        if (y3Var != null) {
            y3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f10;
        long j10;
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.f43995s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            gh.o oVar = this.U;
            if (z10) {
                int i9 = this.V;
                int i10 = SharedConfig.searchEngineType;
                if (i9 != i10) {
                    this.V = i10;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.j1.a().f43902a));
                }
            }
            oVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f43991q0 && !z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.I.c(f10, true);
            float f12 = this.T;
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f43995s0 = ofFloat;
            ofFloat.addUpdateListener(new kh.g4(this, 14));
            this.f43995s0.addListener(new n60(13, this, z10));
            this.f43995s0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f43995s0.setDuration(360L);
            this.f43995s0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.l1(this, 1));
            org.telegram.ui.web.l1 l1Var = new org.telegram.ui.web.l1(this, 1);
            if (this.S) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(l1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.f40563x0.f40015e0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        ((ViewGroup.MarginLayoutParams) this.f40563x0.f40015e0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
