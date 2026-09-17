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
public final class k0 extends org.telegram.ui.web.v1 {
    public final h4 B0;

    public k0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override
    public final org.telegram.ui.web.g2 getInstantViewLoader() {
        l3 l3Var = this.B0.f34168u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.g2 g2Var = l3Var.f35438y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = l3Var.f35438y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f38798j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f38798j = null;
                }
                l3Var.f35438y = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.g2 g2Var3 = l3Var.f35438y;
            if (g2Var3 != null) {
                g2Var3.a();
                org.telegram.ui.web.g2 g2Var4 = l3Var.f35438y;
                TLRPC.TL_webPage tL_webPage2 = g2Var4.f38798j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.i2.o(tL_webPage2);
                    g2Var4.f38798j = null;
                }
                l3Var.f35438y = null;
            }
        } else {
            org.telegram.ui.web.g2 g2Var5 = l3Var.f35438y;
            if (g2Var5 != null && (g2Var5.f38795f != l3Var.getWebView().f39010b || l3Var.f35438y.e != l3Var.getWebView().getProgress())) {
                l3Var.f35438y.d(l3Var.getWebView());
                return l3Var.f35438y;
            } else if (l3Var.f35438y != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.f35438y.d)) {
                return l3Var.f35438y;
            } else {
                org.telegram.ui.web.g2 g2Var6 = l3Var.f35438y;
                if (g2Var6 != null) {
                    g2Var6.a();
                    org.telegram.ui.web.g2 g2Var7 = l3Var.f35438y;
                    TLRPC.TL_webPage tL_webPage3 = g2Var7.f38798j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.i2.o(tL_webPage3);
                        g2Var7.f38798j = null;
                    }
                    l3Var.f35438y = null;
                }
                org.telegram.ui.web.g2 g2Var8 = new org.telegram.ui.web.g2(l3Var.K.X);
                l3Var.f35438y = g2Var8;
                org.telegram.ui.web.z0 webView = l3Var.getWebView();
                if (!g2Var8.f38793b) {
                    g2Var8.f38793b = true;
                    g2Var8.d = webView.getUrl();
                    g2Var8.e = webView.getProgress();
                    g2Var8.f38795f = webView.f39010b;
                    g2Var8.f38800l = org.telegram.ui.web.i2.e(webView, new org.telegram.ui.web.f2(g2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = g2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    g2Var8.f38799k = ConnectionsManager.getInstance(g2Var8.f38792a).sendRequest(tL_messages_getWebPage, new ai.m8(g2Var8, 18));
                }
                return l3Var.f35438y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f38950a0, this.f38977w, this.f38981y);
        org.telegram.ui.ActionBar.h2 h2Var = this.M;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.f38950a0, this.f38977w, this.f38981y));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.k kVar = h4Var.f34157i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j3;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f38978w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f38952b0;
            if (z10) {
                int i10 = this.f38954c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f38954c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f38889a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f38975u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f38950a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f38978w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f38978w0.addListener(new j70(13, this, z10));
            this.f38978w0.setInterpolator(org.telegram.ui.Components.qr.h);
            this.f38978w0.setDuration(360L);
            this.f38978w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f34157i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f34157i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
