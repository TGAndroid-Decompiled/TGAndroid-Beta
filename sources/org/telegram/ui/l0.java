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
    public final j4 B0;

    public l0(j4 j4Var, Activity activity) {
        super(activity);
        this.B0 = j4Var;
    }

    @Override
    public final org.telegram.ui.web.i2 getInstantViewLoader() {
        n3 n3Var = this.B0.f33920u0[0];
        if (!n3Var.f()) {
            org.telegram.ui.web.i2 i2Var = n3Var.f35110y;
            if (i2Var != null) {
                i2Var.a();
                org.telegram.ui.web.i2 i2Var2 = n3Var.f35110y;
                TLRPC.TL_webPage tL_webPage = i2Var2.f37968j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.k2.o(tL_webPage);
                    i2Var2.f37968j = null;
                }
                n3Var.f35110y = null;
                return null;
            }
        } else if (n3Var.getWebView() == null) {
            org.telegram.ui.web.i2 i2Var3 = n3Var.f35110y;
            if (i2Var3 != null) {
                i2Var3.a();
                org.telegram.ui.web.i2 i2Var4 = n3Var.f35110y;
                TLRPC.TL_webPage tL_webPage2 = i2Var4.f37968j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.k2.o(tL_webPage2);
                    i2Var4.f37968j = null;
                }
                n3Var.f35110y = null;
            }
        } else {
            org.telegram.ui.web.i2 i2Var5 = n3Var.f35110y;
            if (i2Var5 != null && (i2Var5.f37965f != n3Var.getWebView().f38153b || n3Var.f35110y.e != n3Var.getWebView().getProgress())) {
                n3Var.f35110y.d(n3Var.getWebView());
                return n3Var.f35110y;
            } else if (n3Var.f35110y != null && TextUtils.equals(n3Var.getWebView().getUrl(), n3Var.f35110y.d)) {
                return n3Var.f35110y;
            } else {
                org.telegram.ui.web.i2 i2Var6 = n3Var.f35110y;
                if (i2Var6 != null) {
                    i2Var6.a();
                    org.telegram.ui.web.i2 i2Var7 = n3Var.f35110y;
                    TLRPC.TL_webPage tL_webPage3 = i2Var7.f37968j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.k2.o(tL_webPage3);
                        i2Var7.f37968j = null;
                    }
                    n3Var.f35110y = null;
                }
                org.telegram.ui.web.i2 i2Var8 = new org.telegram.ui.web.i2(n3Var.K.X);
                n3Var.f35110y = i2Var8;
                org.telegram.ui.web.y0 webView = n3Var.getWebView();
                if (!i2Var8.f37963b) {
                    i2Var8.f37963b = true;
                    i2Var8.d = webView.getUrl();
                    i2Var8.e = webView.getProgress();
                    i2Var8.f37965f = webView.f38153b;
                    i2Var8.f37970l = org.telegram.ui.web.k2.e(webView, new org.telegram.ui.web.h2(i2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = i2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    i2Var8.f37969k = ConnectionsManager.getInstance(i2Var8.f37962a).sendRequest(tL_messages_getWebPage, new bi.c2(i2Var8, 15));
                }
                return n3Var.f35110y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f38101a0, this.f38128w, this.f38132y);
        org.telegram.ui.ActionBar.i2 i2Var = this.M;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.f38101a0, this.f38128w, this.f38132y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.l lVar = j4Var.f33909i0;
        if (lVar != null) {
            lVar.setOpenProgress(f7);
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j3;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f38129w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            ei.o oVar = this.f38103b0;
            if (z10) {
                int i10 = this.f38105c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f38105c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f38031a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f38126u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f38101a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f38129w0 = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 23));
            this.f38129w0.addListener(new iw0(9, this, z10));
            this.f38129w0.setInterpolator(org.telegram.ui.Components.wr.h);
            this.f38129w0.setDuration(360L);
            this.f38129w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j3);
        }
        org.telegram.ui.web.l lVar = this.B0.f33909i0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f33909i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
