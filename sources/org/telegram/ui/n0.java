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
public final class n0 extends org.telegram.ui.web.u1 {
    public final l4 B0;

    public n0(l4 l4Var, Activity activity) {
        super(activity);
        this.B0 = l4Var;
    }

    @Override
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        o3 o3Var = this.B0.f38725u0[0];
        if (!o3Var.f()) {
            org.telegram.ui.web.h2 h2Var = o3Var.f39654y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = o3Var.f39654y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f42609j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f42609j = null;
                }
                o3Var.f39654y = null;
                return null;
            }
        } else if (o3Var.getWebView() == null) {
            org.telegram.ui.web.h2 h2Var3 = o3Var.f39654y;
            if (h2Var3 != null) {
                h2Var3.a();
                org.telegram.ui.web.h2 h2Var4 = o3Var.f39654y;
                TLRPC.TL_webPage tL_webPage2 = h2Var4.f42609j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage2);
                    h2Var4.f42609j = null;
                }
                o3Var.f39654y = null;
            }
        } else {
            org.telegram.ui.web.h2 h2Var5 = o3Var.f39654y;
            if (h2Var5 != null && (h2Var5.f42606f != o3Var.getWebView().f42807b || o3Var.f39654y.e != o3Var.getWebView().getProgress())) {
                o3Var.f39654y.d(o3Var.getWebView());
                return o3Var.f39654y;
            } else if (o3Var.f39654y != null && TextUtils.equals(o3Var.getWebView().getUrl(), o3Var.f39654y.d)) {
                return o3Var.f39654y;
            } else {
                org.telegram.ui.web.h2 h2Var6 = o3Var.f39654y;
                if (h2Var6 != null) {
                    h2Var6.a();
                    org.telegram.ui.web.h2 h2Var7 = o3Var.f39654y;
                    TLRPC.TL_webPage tL_webPage3 = h2Var7.f42609j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage3);
                        h2Var7.f42609j = null;
                    }
                    o3Var.f39654y = null;
                }
                org.telegram.ui.web.h2 h2Var8 = new org.telegram.ui.web.h2(o3Var.K.X);
                o3Var.f39654y = h2Var8;
                org.telegram.ui.web.y0 webView = o3Var.getWebView();
                if (!h2Var8.f42604b) {
                    h2Var8.f42604b = true;
                    h2Var8.d = webView.getUrl();
                    h2Var8.e = webView.getProgress();
                    h2Var8.f42606f = webView.f42807b;
                    h2Var8.f42611l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.f2(h2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var8.f42610k = ConnectionsManager.getInstance(h2Var8.f42603a).sendRequest(tL_messages_getWebPage, new ai.h(h2Var8, 24));
                }
                return o3Var.f39654y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.f42747a0, this.f42774w, this.f42778y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(f10);
        g2Var.b(i0.a.f(this.f42747a0, this.f42774w, this.f42778y));
        this.L.invalidate();
        l4 l4Var = this.B0;
        org.telegram.ui.web.l lVar = l4Var.f38714i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        x3 x3Var = l4Var.K;
        if (x3Var != null) {
            x3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f42775w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            ai.t tVar = this.f42749b0;
            if (z10) {
                int i10 = this.f42751c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f42751c0 = i11;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f42680a));
                }
            }
            tVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f42772u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f42747a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42775w0 = ofFloat;
            ofFloat.addUpdateListener(new ei.i6(this, 15));
            this.f42775w0.addListener(new n40(14, this, z10));
            this.f42775w0.setInterpolator(org.telegram.ui.Components.bs.h);
            this.f42775w0.setDuration(360L);
            this.f42775w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.B0.f38714i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38714i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
