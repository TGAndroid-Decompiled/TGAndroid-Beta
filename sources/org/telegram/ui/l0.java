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
    public final j4 B0;

    public l0(j4 j4Var, Activity activity) {
        super(activity);
        this.B0 = j4Var;
    }

    @Override
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        m3 m3Var = this.B0.f40414u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.f2 f2Var = m3Var.E;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = m3Var.E;
                TLRPC.TL_webPage tL_webPage = f2Var2.f44753j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f44753j = null;
                }
                m3Var.E = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = m3Var.E;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = m3Var.E;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f44753j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f44753j = null;
                }
                m3Var.E = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = m3Var.E;
            if (f2Var5 != null && (f2Var5.f44750f != m3Var.getWebView().f44954b || m3Var.E.e != m3Var.getWebView().getProgress())) {
                m3Var.E.d(m3Var.getWebView());
                return m3Var.E;
            } else if (m3Var.E != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.E.d)) {
                return m3Var.E;
            } else {
                org.telegram.ui.web.f2 f2Var6 = m3Var.E;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = m3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f44753j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f44753j = null;
                    }
                    m3Var.E = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(m3Var.L.X);
                m3Var.E = f2Var8;
                org.telegram.ui.web.x0 webView = m3Var.getWebView();
                if (!f2Var8.f44748b) {
                    f2Var8.f44748b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f44750f = webView.f44954b;
                    f2Var8.f44755l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f44754k = ConnectionsManager.getInstance(f2Var8.f44747a).sendRequest(tL_messages_getWebPage, new bi.i0(f2Var8, 23));
                }
                return m3Var.E;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.f44904a0, this.f44931w, this.f44935y);
        org.telegram.ui.ActionBar.j2 j2Var = this.M;
        j2Var.a(f10);
        j2Var.b(i0.a.f(this.f44904a0, this.f44931w, this.f44935y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.l lVar = j4Var.f40403i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        v3 v3Var = j4Var.K;
        if (v3Var != null) {
            v3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f44932w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            bi.t tVar = this.f44906b0;
            if (z10) {
                int i10 = this.f44908c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f44908c0 = i11;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f44843a));
                }
            }
            tVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f44929u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f44904a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f44932w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.e4(this, 18));
            this.f44932w0.addListener(new s40(14, this, z10));
            this.f44932w0.setInterpolator(org.telegram.ui.Components.ds.h);
            this.f44932w0.setDuration(360L);
            this.f44932w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.B0.f40403i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f40403i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
