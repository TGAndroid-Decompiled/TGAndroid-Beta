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
public final class n0 extends org.telegram.ui.web.t1 {
    public final l4 B0;

    public n0(l4 l4Var, Activity activity) {
        super(activity);
        this.B0 = l4Var;
    }

    @Override
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        o3 o3Var = this.B0.f38783u0[0];
        if (!o3Var.f()) {
            org.telegram.ui.web.f2 f2Var = o3Var.f39765y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = o3Var.f39765y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f42648j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f42648j = null;
                }
                o3Var.f39765y = null;
                return null;
            }
        } else if (o3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = o3Var.f39765y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = o3Var.f39765y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f42648j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f42648j = null;
                }
                o3Var.f39765y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = o3Var.f39765y;
            if (f2Var5 != null && (f2Var5.f42645f != o3Var.getWebView().f42850b || o3Var.f39765y.e != o3Var.getWebView().getProgress())) {
                o3Var.f39765y.d(o3Var.getWebView());
                return o3Var.f39765y;
            } else if (o3Var.f39765y != null && TextUtils.equals(o3Var.getWebView().getUrl(), o3Var.f39765y.d)) {
                return o3Var.f39765y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = o3Var.f39765y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = o3Var.f39765y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f42648j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f42648j = null;
                    }
                    o3Var.f39765y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(o3Var.K.X);
                o3Var.f39765y = f2Var8;
                org.telegram.ui.web.x0 webView = o3Var.getWebView();
                if (!f2Var8.f42643b) {
                    f2Var8.f42643b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f42645f = webView.f42850b;
                    f2Var8.f42650l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f42649k = ConnectionsManager.getInstance(f2Var8.f42642a).sendRequest(tL_messages_getWebPage, new ai.h(f2Var8, 24));
                }
                return o3Var.f39765y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.a.f(this.f42790a0, this.f42817w, this.f42821y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(f10);
        g2Var.b(i0.a.f(this.f42790a0, this.f42817w, this.f42821y));
        this.L.invalidate();
        l4 l4Var = this.B0;
        org.telegram.ui.web.k kVar = l4Var.f38772i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
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
            ValueAnimator valueAnimator = this.f42818w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            ai.t tVar = this.f42792b0;
            if (z10) {
                int i10 = this.f42794c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f42794c0 = i11;
                    tVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.m1.a().f42729a));
                }
            }
            tVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f42815u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f42790a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42818w0 = ofFloat;
            ofFloat.addUpdateListener(new ei.i6(this, 15));
            this.f42818w0.addListener(new l40(14, this, z10));
            this.f42818w0.setInterpolator(org.telegram.ui.Components.bs.h);
            this.f42818w0.setDuration(360L);
            this.f42818w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.o1(this, 1));
            org.telegram.ui.web.o1 o1Var = new org.telegram.ui.web.o1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(o1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.B0.f38772i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f38772i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
