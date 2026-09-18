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
public final class k0 extends org.telegram.ui.web.w1 {
    public final h4 B0;

    public k0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        l3 l3Var = this.B0.f34074u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.h2 h2Var = l3Var.f35232y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = l3Var.f35232y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f38927j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f38927j = null;
                }
                l3Var.f35232y = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.h2 h2Var3 = l3Var.f35232y;
            if (h2Var3 != null) {
                h2Var3.a();
                org.telegram.ui.web.h2 h2Var4 = l3Var.f35232y;
                TLRPC.TL_webPage tL_webPage2 = h2Var4.f38927j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage2);
                    h2Var4.f38927j = null;
                }
                l3Var.f35232y = null;
            }
        } else {
            org.telegram.ui.web.h2 h2Var5 = l3Var.f35232y;
            if (h2Var5 != null && (h2Var5.f38924f != l3Var.getWebView().f39124b || l3Var.f35232y.e != l3Var.getWebView().getProgress())) {
                l3Var.f35232y.d(l3Var.getWebView());
                return l3Var.f35232y;
            } else if (l3Var.f35232y != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.f35232y.d)) {
                return l3Var.f35232y;
            } else {
                org.telegram.ui.web.h2 h2Var6 = l3Var.f35232y;
                if (h2Var6 != null) {
                    h2Var6.a();
                    org.telegram.ui.web.h2 h2Var7 = l3Var.f35232y;
                    TLRPC.TL_webPage tL_webPage3 = h2Var7.f38927j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage3);
                        h2Var7.f38927j = null;
                    }
                    l3Var.f35232y = null;
                }
                org.telegram.ui.web.h2 h2Var8 = new org.telegram.ui.web.h2(l3Var.K.X);
                l3Var.f35232y = h2Var8;
                org.telegram.ui.web.z0 webView = l3Var.getWebView();
                if (!h2Var8.f38922b) {
                    h2Var8.f38922b = true;
                    h2Var8.d = webView.getUrl();
                    h2Var8.e = webView.getProgress();
                    h2Var8.f38924f = webView.f39124b;
                    h2Var8.f38929l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.g2(h2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var8.f38928k = ConnectionsManager.getInstance(h2Var8.f38921a).sendRequest(tL_messages_getWebPage, new ai.m8(h2Var8, 18));
                }
                return l3Var.f35232y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f39075a0, this.f39102w, this.f39106y);
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        g2Var.a(d);
        g2Var.b(i0.a.d(this.f39075a0, this.f39102w, this.f39106y));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.k kVar = h4Var.f34063i0;
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
            ValueAnimator valueAnimator = this.f39103w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f39077b0;
            if (z10) {
                int i10 = this.f39079c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f39079c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f39001a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f39100u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f39075a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39103w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f39103w0.addListener(new h70(13, this, z10));
            this.f39103w0.setInterpolator(org.telegram.ui.Components.qr.h);
            this.f39103w0.setDuration(360L);
            this.f39103w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.r1(this, 1));
            org.telegram.ui.web.r1 r1Var = new org.telegram.ui.web.r1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(r1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f34063i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f34063i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
