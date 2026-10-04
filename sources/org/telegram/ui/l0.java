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
public final class l0 extends org.telegram.ui.web.v1 {
    public final i4 B0;

    public l0(i4 i4Var, Activity activity) {
        super(activity);
        this.B0 = i4Var;
    }

    @Override
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        m3 m3Var = this.B0.f37280u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.h2 h2Var = m3Var.f38408y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = m3Var.f38408y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f42219j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f42219j = null;
                }
                m3Var.f38408y = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.h2 h2Var3 = m3Var.f38408y;
            if (h2Var3 != null) {
                h2Var3.a();
                org.telegram.ui.web.h2 h2Var4 = m3Var.f38408y;
                TLRPC.TL_webPage tL_webPage2 = h2Var4.f42219j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage2);
                    h2Var4.f42219j = null;
                }
                m3Var.f38408y = null;
            }
        } else {
            org.telegram.ui.web.h2 h2Var5 = m3Var.f38408y;
            if (h2Var5 != null && (h2Var5.f42216f != m3Var.getWebView().f42432b || m3Var.f38408y.f42215e != m3Var.getWebView().getProgress())) {
                m3Var.f38408y.d(m3Var.getWebView());
                return m3Var.f38408y;
            } else if (m3Var.f38408y != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.f38408y.d)) {
                return m3Var.f38408y;
            } else {
                org.telegram.ui.web.h2 h2Var6 = m3Var.f38408y;
                if (h2Var6 != null) {
                    h2Var6.a();
                    org.telegram.ui.web.h2 h2Var7 = m3Var.f38408y;
                    TLRPC.TL_webPage tL_webPage3 = h2Var7.f42219j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage3);
                        h2Var7.f42219j = null;
                    }
                    m3Var.f38408y = null;
                }
                org.telegram.ui.web.h2 h2Var8 = new org.telegram.ui.web.h2(m3Var.K.X);
                m3Var.f38408y = h2Var8;
                org.telegram.ui.web.z0 webView = m3Var.getWebView();
                if (!h2Var8.f42213b) {
                    h2Var8.f42213b = true;
                    h2Var8.d = webView.getUrl();
                    h2Var8.f42215e = webView.getProgress();
                    h2Var8.f42216f = webView.f42432b;
                    h2Var8.f42221l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.g2(h2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var8.f42220k = ConnectionsManager.getInstance(h2Var8.f42212a).sendRequest(tL_messages_getWebPage, new ai.n8(h2Var8, 18));
                }
                return m3Var.f38408y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f42373a0, this.f42401w, this.f42405y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f42373a0, this.f42401w, this.f42405y));
        this.L.invalidate();
        i4 i4Var = this.B0;
        org.telegram.ui.web.k kVar = i4Var.f37269i0;
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
            ValueAnimator valueAnimator = this.f42402w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f42375b0;
            if (z10) {
                int i10 = this.f42377c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f42377c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f42306a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f42399u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f42373a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42402w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f42402w0.addListener(new g70(13, this, z10));
            this.f42402w0.setInterpolator(org.telegram.ui.Components.tr.h);
            this.f42402w0.setDuration(360L);
            this.f42402w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f37269i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f37269i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
