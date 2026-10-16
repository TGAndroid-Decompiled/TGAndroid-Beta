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
public final class m0 extends org.telegram.ui.web.v1 {
    public final k4 B0;

    public m0(k4 k4Var, Activity activity) {
        super(activity);
        this.B0 = k4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        o3 o3Var = this.B0.f37278u0[0];
        if (!o3Var.f()) {
            org.telegram.ui.web.g2 g2Var = o3Var.f38537y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = o3Var.f38537y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f41048j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f41048j = null;
                }
                o3Var.f38537y = null;
                return null;
            }
        } else if (o3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = o3Var.f38537y;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = o3Var.f38537y;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f41048j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f41048j = null;
                }
                o3Var.f38537y = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = o3Var.f38537y;
            if (g2Var5 != null && (g2Var5.f41045f != o3Var.getWebView().f41262b || o3Var.f38537y.e != o3Var.getWebView().getProgress())) {
                o3Var.f38537y.d(o3Var.getWebView());
                return o3Var.f38537y;
            } else if (o3Var.f38537y != null && TextUtils.equals(o3Var.getWebView().getUrl(), o3Var.f38537y.d)) {
                return o3Var.f38537y;
            } else {
                org.telegram.ui.web.g2 g2Var6 = o3Var.f38537y;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = o3Var.f38537y;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f41048j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f41048j = null;
                    }
                    o3Var.f38537y = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(o3Var.K.X);
                o3Var.f38537y = g2Var8;
                org.telegram.ui.web.z0 webView = o3Var.getWebView();
                if (!g2Var8.f41043b) {
                    g2Var8.f41043b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.e = webView.getProgress();
                    g2Var8.f41045f = webView.f41262b;
                    g2Var8.f41050l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f41049k = ConnectionsManager.getInstance(g2Var8.f41042a).sendRequest(tL_messages_getWebPage, new bi.z7(g2Var8, 18));
                }
                return o3Var.f38537y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f41202a0, this.f41229w, this.f41233y);
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        f2Var.a(d);
        f2Var.b(i0.a.d(this.f41202a0, this.f41229w, this.f41233y));
        this.L.invalidate();
        k4 k4Var = this.B0;
        org.telegram.ui.web.k kVar = k4Var.f37267i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        x3 x3Var = k4Var.K;
        if (x3Var != null) {
            x3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f41230w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            gi.o oVar = this.f41204b0;
            if (z10) {
                int i10 = this.f41206c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f41206c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f41144a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f41227u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f41202a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f41230w0 = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 8));
            this.f41230w0.addListener(new i50(14, this, z10));
            this.f41230w0.setInterpolator(org.telegram.ui.Components.es.h);
            this.f41230w0.setDuration(360L);
            this.f41230w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.B0.f37267i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f37267i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
