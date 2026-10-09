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
public final class l0 extends org.telegram.ui.web.u1 {
    public final i4 B0;

    public l0(i4 i4Var, Activity activity) {
        super(activity);
        this.B0 = i4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        m3 m3Var = this.B0.f38513u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.g2 g2Var = m3Var.f39759y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = m3Var.f39759y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f43317j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f43317j = null;
                }
                m3Var.f39759y = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = m3Var.f39759y;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = m3Var.f39759y;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f43317j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f43317j = null;
                }
                m3Var.f39759y = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = m3Var.f39759y;
            if (g2Var5 != null && (g2Var5.f43314f != m3Var.getWebView().f43538b || m3Var.f39759y.f43313e != m3Var.getWebView().getProgress())) {
                m3Var.f39759y.d(m3Var.getWebView());
                return m3Var.f39759y;
            } else if (m3Var.f39759y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.f39759y.d)) {
                return m3Var.f39759y;
            } else {
                org.telegram.ui.web.g2 g2Var6 = m3Var.f39759y;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = m3Var.f39759y;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f43317j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f43317j = null;
                    }
                    m3Var.f39759y = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(m3Var.K.X);
                m3Var.f39759y = g2Var8;
                org.telegram.ui.web.y0 webView = m3Var.getWebView();
                if (!g2Var8.f43311b) {
                    g2Var8.f43311b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.f43313e = webView.getProgress();
                    g2Var8.f43314f = webView.f43538b;
                    g2Var8.f43319l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f43318k = ConnectionsManager.getInstance(g2Var8.f43310a).sendRequest(tL_messages_getWebPage, new ai.o8(g2Var8, 18));
                }
                return m3Var.f39759y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f43475a0, this.f43503w, this.f43507y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f43475a0, this.f43503w, this.f43507y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.k kVar = i4Var.f38502i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
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
            ValueAnimator valueAnimator = this.f43504w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f43477b0;
            if (z10) {
                int i10 = this.f43479c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f43479c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f43406a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f43501u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f43475a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43504w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f43504w0.addListener(new f70(13, this, z10));
            this.f43504w0.setInterpolator(org.telegram.ui.Components.hs.h);
            this.f43504w0.setDuration(360L);
            this.f43504w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f38502i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38502i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
