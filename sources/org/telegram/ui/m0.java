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
public final class m0 extends org.telegram.ui.web.s1 {
    public final l4 f36159y0;

    public m0(l4 l4Var, Activity activity) {
        super(activity);
        this.f36159y0 = l4Var;
    }

    @Override
    public final org.telegram.ui.web.e2 getInstantViewLoader() {
        p3 p3Var = this.f36159y0.f35945r0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.e2 e2Var = p3Var.f37167y;
            if (e2Var != null) {
                e2Var.a();
                org.telegram.ui.web.e2 e2Var2 = p3Var.f37167y;
                TLRPC.TL_webPage tL_webPage = e2Var2.f39487j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.g2.o(tL_webPage);
                    e2Var2.f39487j = null;
                }
                p3Var.f37167y = null;
                return null;
            }
        } else if (p3Var.getWebView() == null) {
            org.telegram.ui.web.e2 e2Var3 = p3Var.f37167y;
            if (e2Var3 != null) {
                e2Var3.a();
                org.telegram.ui.web.e2 e2Var4 = p3Var.f37167y;
                TLRPC.TL_webPage tL_webPage2 = e2Var4.f39487j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.g2.o(tL_webPage2);
                    e2Var4.f39487j = null;
                }
                p3Var.f37167y = null;
            }
        } else {
            org.telegram.ui.web.e2 e2Var5 = p3Var.f37167y;
            if (e2Var5 != null && (e2Var5.f39484f != p3Var.getWebView().f39683b || p3Var.f37167y.e != p3Var.getWebView().getProgress())) {
                p3Var.f37167y.d(p3Var.getWebView());
                return p3Var.f37167y;
            } else if (p3Var.f37167y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.f37167y.d)) {
                return p3Var.f37167y;
            } else {
                org.telegram.ui.web.e2 e2Var6 = p3Var.f37167y;
                if (e2Var6 != null) {
                    e2Var6.a();
                    org.telegram.ui.web.e2 e2Var7 = p3Var.f37167y;
                    TLRPC.TL_webPage tL_webPage3 = e2Var7.f39487j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.g2.o(tL_webPage3);
                        e2Var7.f39487j = null;
                    }
                    p3Var.f37167y = null;
                }
                org.telegram.ui.web.e2 e2Var8 = new org.telegram.ui.web.e2(p3Var.H.U);
                p3Var.f37167y = e2Var8;
                org.telegram.ui.web.w0 webView = p3Var.getWebView();
                if (!e2Var8.f39482b) {
                    e2Var8.f39482b = true;
                    e2Var8.d = webView.getUrl();
                    e2Var8.e = webView.getProgress();
                    e2Var8.f39484f = webView.f39683b;
                    e2Var8.f39489l = org.telegram.ui.web.g2.e(webView, new org.telegram.ui.web.d2(e2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = e2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    e2Var8.f39488k = ConnectionsManager.getInstance(e2Var8.f39481a).sendRequest(tL_messages_getWebPage, new gf.a(e2Var8, 14));
                }
                return p3Var.f37167y;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.U, this.f39655w, this.f39659y);
        org.telegram.ui.ActionBar.i2 i2Var = this.J;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.U, this.f39655w, this.f39659y));
        this.I.invalidate();
        l4 l4Var = this.f36159y0;
        org.telegram.ui.web.k kVar = l4Var.f35934f0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.i();
        }
    }

    public final void k(boolean z4) {
        float f10;
        long j10;
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.f39652t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            lh.n nVar = this.V;
            if (z4) {
                int i10 = this.W;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.W = i11;
                    nVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.l1.a().f39570a));
                }
            }
            nVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f39649r0 && !z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.J.c(f10, true);
            float f12 = this.U;
            if (z4) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f39652t0 = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 11));
            this.f39652t0.addListener(new l61(5, this, z4));
            this.f39652t0.setInterpolator(org.telegram.ui.Components.nr.h);
            this.f39652t0.setDuration(360L);
            this.f39652t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.n1(this, 1));
            org.telegram.ui.web.n1 n1Var = new org.telegram.ui.web.n1(this, 1);
            if (this.T) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(n1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.f36159y0.f35934f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.f36159y0.f35934f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
