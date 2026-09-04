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
public final class k0 extends org.telegram.ui.web.w1 {
    public final i4 B0;

    public k0(i4 i4Var, Activity activity) {
        super(activity);
        this.B0 = i4Var;
    }

    @Override
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        m3 m3Var = this.B0.f37232u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.h2 h2Var = m3Var.f38560y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = m3Var.f38560y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f42109j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f42109j = null;
                }
                m3Var.f38560y = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.h2 h2Var3 = m3Var.f38560y;
            if (h2Var3 != null) {
                h2Var3.a();
                org.telegram.ui.web.h2 h2Var4 = m3Var.f38560y;
                TLRPC.TL_webPage tL_webPage2 = h2Var4.f42109j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage2);
                    h2Var4.f42109j = null;
                }
                m3Var.f38560y = null;
            }
        } else {
            org.telegram.ui.web.h2 h2Var5 = m3Var.f38560y;
            if (h2Var5 != null && (h2Var5.f42106f != m3Var.getWebView().f42328b || m3Var.f38560y.f42105e != m3Var.getWebView().getProgress())) {
                m3Var.f38560y.d(m3Var.getWebView());
                return m3Var.f38560y;
            } else if (m3Var.f38560y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.f38560y.d)) {
                return m3Var.f38560y;
            } else {
                org.telegram.ui.web.h2 h2Var6 = m3Var.f38560y;
                if (h2Var6 != null) {
                    h2Var6.a();
                    org.telegram.ui.web.h2 h2Var7 = m3Var.f38560y;
                    TLRPC.TL_webPage tL_webPage3 = h2Var7.f42109j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage3);
                        h2Var7.f42109j = null;
                    }
                    m3Var.f38560y = null;
                }
                org.telegram.ui.web.h2 h2Var8 = new org.telegram.ui.web.h2(m3Var.K.X);
                m3Var.f38560y = h2Var8;
                org.telegram.ui.web.z0 webView = m3Var.getWebView();
                if (!h2Var8.f42103b) {
                    h2Var8.f42103b = true;
                    h2Var8.d = webView.getUrl();
                    h2Var8.f42105e = webView.getProgress();
                    h2Var8.f42106f = webView.f42328b;
                    h2Var8.f42111l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.g2(h2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var8.f42110k = ConnectionsManager.getInstance(h2Var8.f42102a).sendRequest(tL_messages_getWebPage, new bi.v7(h2Var8, 18));
                }
                return m3Var.f38560y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f42275a0, this.f42303w, this.f42307y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f42275a0, this.f42303w, this.f42307y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.l lVar = i4Var.f37221i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            v3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j3;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f42304w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            gi.o oVar = this.f42277b0;
            if (z10) {
                int i10 = this.f42279c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f42279c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.p1.a().f42208a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f42301u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f42275a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42304w0 = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 8));
            this.f42304w0.addListener(new e50(14, this, z10));
            this.f42304w0.setInterpolator(org.telegram.ui.Components.pr.h);
            this.f42304w0.setDuration(360L);
            this.f42304w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.r1(this, 1));
            org.telegram.ui.web.r1 r1Var = new org.telegram.ui.web.r1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(r1Var, j3);
        }
        org.telegram.ui.web.l lVar = this.B0.f37221i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f37221i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
