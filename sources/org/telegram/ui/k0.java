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
public final class k0 extends org.telegram.ui.web.v1 {
    public final h4 B0;

    public k0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        l3 l3Var = this.B0.f34090u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.g2 g2Var = l3Var.f35315y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = l3Var.f35315y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f38961j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f38961j = null;
                }
                l3Var.f35315y = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = l3Var.f35315y;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = l3Var.f35315y;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f38961j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f38961j = null;
                }
                l3Var.f35315y = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = l3Var.f35315y;
            if (g2Var5 != null && (g2Var5.f38958f != l3Var.getWebView().f39171b || l3Var.f35315y.e != l3Var.getWebView().getProgress())) {
                l3Var.f35315y.d(l3Var.getWebView());
                return l3Var.f35315y;
            } else if (l3Var.f35315y != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.f35315y.d)) {
                return l3Var.f35315y;
            } else {
                org.telegram.ui.web.g2 g2Var6 = l3Var.f35315y;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = l3Var.f35315y;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f38961j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f38961j = null;
                    }
                    l3Var.f35315y = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(l3Var.K.X);
                l3Var.f35315y = g2Var8;
                org.telegram.ui.web.z0 webView = l3Var.getWebView();
                if (!g2Var8.f38956b) {
                    g2Var8.f38956b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.e = webView.getProgress();
                    g2Var8.f38958f = webView.f39171b;
                    g2Var8.f38963l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f38962k = ConnectionsManager.getInstance(g2Var8.f38955a).sendRequest(tL_messages_getWebPage, new ai.m8(g2Var8, 18));
                }
                return l3Var.f35315y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f39111a0, this.f39138w, this.f39142y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f39111a0, this.f39138w, this.f39142y));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.k kVar = h4Var.f34079i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j3;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f39139w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f39113b0;
            if (z10) {
                int i10 = this.f39115c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f39115c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f39051a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f39136u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f39111a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39139w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f39139w0.addListener(new h70(13, this, z10));
            this.f39139w0.setInterpolator(org.telegram.ui.Components.qr.h);
            this.f39139w0.setDuration(360L);
            this.f39139w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f34079i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f34079i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
