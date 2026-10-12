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
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        m3 m3Var = this.B0.f38661u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.f2 f2Var = m3Var.f39901y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = m3Var.f39901y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f43250j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f43250j = null;
                }
                m3Var.f39901y = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = m3Var.f39901y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = m3Var.f39901y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f43250j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f43250j = null;
                }
                m3Var.f39901y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = m3Var.f39901y;
            if (f2Var5 != null && (f2Var5.f43247f != m3Var.getWebView().f43480b || m3Var.f39901y.f43246e != m3Var.getWebView().getProgress())) {
                m3Var.f39901y.d(m3Var.getWebView());
                return m3Var.f39901y;
            } else if (m3Var.f39901y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.f39901y.d)) {
                return m3Var.f39901y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = m3Var.f39901y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = m3Var.f39901y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f43250j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f43250j = null;
                    }
                    m3Var.f39901y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(m3Var.K.X);
                m3Var.f39901y = f2Var8;
                org.telegram.ui.web.y0 webView = m3Var.getWebView();
                if (!f2Var8.f43244b) {
                    f2Var8.f43244b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.f43246e = webView.getProgress();
                    f2Var8.f43247f = webView.f43480b;
                    f2Var8.f43252l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f43251k = ConnectionsManager.getInstance(f2Var8.f43243a).sendRequest(tL_messages_getWebPage, new ai.o8(f2Var8, 18));
                }
                return m3Var.f39901y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f43415a0, this.f43443w, this.f43447y);
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        f2Var.a(d);
        f2Var.b(i0.a.d(this.f43415a0, this.f43443w, this.f43447y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.k kVar = i4Var.f38650i0;
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
            ValueAnimator valueAnimator = this.f43444w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f43417b0;
            if (z10) {
                int i10 = this.f43419c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f43419c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f43350a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f43441u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f43415a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43444w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 7));
            this.f43444w0.addListener(new h70(13, this, z10));
            this.f43444w0.setInterpolator(org.telegram.ui.Components.js.h);
            this.f43444w0.setDuration(360L);
            this.f43444w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f38650i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38650i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
