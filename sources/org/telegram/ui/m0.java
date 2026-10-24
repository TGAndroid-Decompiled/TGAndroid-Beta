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
public final class m0 extends org.telegram.ui.web.u1 {
    public final k4 B0;

    public m0(k4 k4Var, Activity activity) {
        super(activity);
        this.B0 = k4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        n3 n3Var = this.B0.f38774u0[0];
        if (!n3Var.f()) {
            org.telegram.ui.web.g2 g2Var = n3Var.E;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = n3Var.E;
                TLRPC.TL_webPage tL_webPage = g2Var2.f43116j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f43116j = null;
                }
                n3Var.E = null;
                return null;
            }
        } else if (n3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = n3Var.E;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = n3Var.E;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f43116j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f43116j = null;
                }
                n3Var.E = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = n3Var.E;
            if (g2Var5 != null && (g2Var5.f43113f != n3Var.getWebView().f43318b || n3Var.E.e != n3Var.getWebView().getProgress())) {
                n3Var.E.d(n3Var.getWebView());
                return n3Var.E;
            } else if (n3Var.E != null && TextUtils.equals(n3Var.getWebView().getUrl(), n3Var.E.d)) {
                return n3Var.E;
            } else {
                org.telegram.ui.web.g2 g2Var6 = n3Var.E;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = n3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f43116j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f43116j = null;
                    }
                    n3Var.E = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(n3Var.L.X);
                n3Var.E = g2Var8;
                org.telegram.ui.web.y0 webView = n3Var.getWebView();
                if (!g2Var8.f43111b) {
                    g2Var8.f43111b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.e = webView.getProgress();
                    g2Var8.f43113f = webView.f43318b;
                    g2Var8.f43118l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f43117k = ConnectionsManager.getInstance(g2Var8.f43110a).sendRequest(tL_messages_getWebPage, new ai.h(g2Var8, 24));
                }
                return n3Var.E;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.f43258a0, this.f43285w, this.f43289y);
        org.telegram.ui.ActionBar.h2 h2Var = this.M;
        h2Var.a(f10);
        h2Var.b(i0.a.f(this.f43258a0, this.f43285w, this.f43289y));
        this.L.invalidate();
        k4 k4Var = this.B0;
        org.telegram.ui.web.l lVar = k4Var.f38763i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        w3 w3Var = k4Var.K;
        if (w3Var != null) {
            w3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f43286w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            ai.t tVar = this.f43260b0;
            if (z10) {
                int i10 = this.f43262c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f43262c0 = i11;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f43195a));
                }
            }
            tVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f43283u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f43258a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43286w0 = ofFloat;
            ofFloat.addUpdateListener(new ei.i6(this, 15));
            this.f43286w0.addListener(new o40(14, this, z10));
            this.f43286w0.setInterpolator(org.telegram.ui.Components.zr.h);
            this.f43286w0.setDuration(360L);
            this.f43286w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.B0.f38763i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38763i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
