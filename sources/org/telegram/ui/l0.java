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
        m3 m3Var = this.B0.f34021u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.f2 f2Var = m3Var.f35138y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = m3Var.f35138y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f38696j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f38696j = null;
                }
                m3Var.f35138y = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = m3Var.f35138y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = m3Var.f35138y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f38696j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f38696j = null;
                }
                m3Var.f35138y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = m3Var.f35138y;
            if (f2Var5 != null && (f2Var5.f38693f != m3Var.getWebView().f38906b || m3Var.f35138y.e != m3Var.getWebView().getProgress())) {
                m3Var.f35138y.d(m3Var.getWebView());
                return m3Var.f35138y;
            } else if (m3Var.f35138y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.f35138y.d)) {
                return m3Var.f35138y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = m3Var.f35138y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = m3Var.f35138y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f38696j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f38696j = null;
                    }
                    m3Var.f35138y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(m3Var.K.X);
                m3Var.f35138y = f2Var8;
                org.telegram.ui.web.y0 webView = m3Var.getWebView();
                if (!f2Var8.f38691b) {
                    f2Var8.f38691b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f38693f = webView.f38906b;
                    f2Var8.f38698l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f38697k = ConnectionsManager.getInstance(f2Var8.f38690a).sendRequest(tL_messages_getWebPage, new ai.n8(f2Var8, 18));
                }
                return m3Var.f35138y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f38846a0, this.f38873w, this.f38877y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f38846a0, this.f38873w, this.f38877y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.k kVar = i4Var.f34010i0;
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
            ValueAnimator valueAnimator = this.f38874w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f38848b0;
            if (z10) {
                int i10 = this.f38850c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f38850c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f38786a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f38871u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f38846a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f38874w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f38874w0.addListener(new e70(13, this, z10));
            this.f38874w0.setInterpolator(org.telegram.ui.Components.rr.h);
            this.f38874w0.setDuration(360L);
            this.f38874w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f34010i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f34010i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
