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
public final class k0 extends org.telegram.ui.web.u1 {
    public final h4 B0;

    public k0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        l3 l3Var = this.B0.f38285u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.g2 g2Var = l3Var.f39505y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = l3Var.f39505y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f43507j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f43507j = null;
                }
                l3Var.f39505y = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = l3Var.f39505y;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = l3Var.f39505y;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f43507j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f43507j = null;
                }
                l3Var.f39505y = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = l3Var.f39505y;
            if (g2Var5 != null && (g2Var5.f43504f != l3Var.getWebView().f43730b || l3Var.f39505y.f43503e != l3Var.getWebView().getProgress())) {
                l3Var.f39505y.d(l3Var.getWebView());
                return l3Var.f39505y;
            } else if (l3Var.f39505y != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.f39505y.d)) {
                return l3Var.f39505y;
            } else {
                org.telegram.ui.web.g2 g2Var6 = l3Var.f39505y;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = l3Var.f39505y;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f43507j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f43507j = null;
                    }
                    l3Var.f39505y = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(l3Var.K.X);
                l3Var.f39505y = g2Var8;
                org.telegram.ui.web.y0 webView = l3Var.getWebView();
                if (!g2Var8.f43501b) {
                    g2Var8.f43501b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.f43503e = webView.getProgress();
                    g2Var8.f43504f = webView.f43730b;
                    g2Var8.f43509l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.e2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f43508k = ConnectionsManager.getInstance(g2Var8.f43500a).sendRequest(tL_messages_getWebPage, new ai.o8(g2Var8, 18));
                }
                return l3Var.f39505y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f43665a0, this.f43693w, this.f43697y);
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        f2Var.a(d);
        f2Var.b(i0.a.d(this.f43665a0, this.f43693w, this.f43697y));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.k kVar = h4Var.f38274i0;
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
            ValueAnimator valueAnimator = this.f43694w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f43667b0;
            if (z10) {
                int i10 = this.f43669c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f43669c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f43596a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f43691u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f43665a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43694w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 7));
            this.f43694w0.addListener(new f70(13, this, z10));
            this.f43694w0.setInterpolator(org.telegram.ui.Components.is.h);
            this.f43694w0.setDuration(360L);
            this.f43694w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f38274i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38274i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
