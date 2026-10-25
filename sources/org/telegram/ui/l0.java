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
        m3 m3Var = this.B0.f40446u0[0];
        if (!m3Var.f()) {
            org.telegram.ui.web.f2 f2Var = m3Var.E;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = m3Var.E;
                TLRPC.TL_webPage tL_webPage = f2Var2.f45239j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f45239j = null;
                }
                m3Var.E = null;
                return null;
            }
        } else if (m3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = m3Var.E;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = m3Var.E;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f45239j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f45239j = null;
                }
                m3Var.E = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = m3Var.E;
            if (f2Var5 != null && (f2Var5.f45236f != m3Var.getWebView().f45440b || m3Var.E.e != m3Var.getWebView().getProgress())) {
                m3Var.E.d(m3Var.getWebView());
                return m3Var.E;
            } else if (m3Var.E != null && TextUtils.equals(m3Var.getWebView().getUrl(), m3Var.E.d)) {
                return m3Var.E;
            } else {
                org.telegram.ui.web.f2 f2Var6 = m3Var.E;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = m3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f45239j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f45239j = null;
                    }
                    m3Var.E = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(m3Var.L.X);
                m3Var.E = f2Var8;
                org.telegram.ui.web.x0 webView = m3Var.getWebView();
                if (!f2Var8.f45234b) {
                    f2Var8.f45234b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f45236f = webView.f45440b;
                    f2Var8.f45241l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f45240k = ConnectionsManager.getInstance(f2Var8.f45233a).sendRequest(tL_messages_getWebPage, new bi.i0(f2Var8, 23));
                }
                return m3Var.E;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.f45390a0, this.f45417w, this.f45421y);
        org.telegram.ui.ActionBar.j2 j2Var = this.M;
        j2Var.a(f10);
        j2Var.b(i0.a.f(this.f45390a0, this.f45417w, this.f45421y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.l lVar = j4Var.f40435i0;
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
            ValueAnimator valueAnimator = this.f45418w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            bi.t tVar = this.f45392b0;
            if (z10) {
                int i10 = this.f45394c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f45394c0 = i11;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f45329a));
                }
            }
            tVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f45415u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f45390a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f45418w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.e4(this, 18));
            this.f45418w0.addListener(new q40(14, this, z10));
            this.f45418w0.setInterpolator(org.telegram.ui.Components.ds.h);
            this.f45418w0.setDuration(360L);
            this.f45418w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.B0.f40435i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f40435i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
