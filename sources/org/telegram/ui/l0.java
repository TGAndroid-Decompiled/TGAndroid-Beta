package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l0 extends org.telegram.ui.web.j1 {
    public final g4 C0;

    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.C0 = g4Var;
    }

    @Override
    public final org.telegram.ui.web.u1 getInstantViewLoader() {
        k3 k3Var = this.C0.f48084v0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.u1 u1Var = k3Var.F;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = k3Var.F;
                TLRPC.TL_webPage tL_webPage = u1Var2.f53566j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.f53566j = null;
                }
                k3Var.F = null;
                return null;
            }
        } else if (k3Var.getWebView() == null) {
            org.telegram.ui.web.u1 u1Var3 = k3Var.F;
            if (u1Var3 != null) {
                u1Var3.a();
                org.telegram.ui.web.u1 u1Var4 = k3Var.F;
                TLRPC.TL_webPage tL_webPage2 = u1Var4.f53566j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.w1.o(tL_webPage2);
                    u1Var4.f53566j = null;
                }
                k3Var.F = null;
            }
        } else {
            org.telegram.ui.web.u1 u1Var5 = k3Var.F;
            if (u1Var5 != null && (u1Var5.f53563f != k3Var.getWebView().f53532b || k3Var.F.f53562e != k3Var.getWebView().getProgress())) {
                k3Var.F.d(k3Var.getWebView());
                return k3Var.F;
            } else if (k3Var.F != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.F.d)) {
                return k3Var.F;
            } else {
                org.telegram.ui.web.u1 u1Var6 = k3Var.F;
                if (u1Var6 != null) {
                    u1Var6.a();
                    org.telegram.ui.web.u1 u1Var7 = k3Var.F;
                    TLRPC.TL_webPage tL_webPage3 = u1Var7.f53566j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.w1.o(tL_webPage3);
                        u1Var7.f53566j = null;
                    }
                    k3Var.F = null;
                }
                org.telegram.ui.web.u1 u1Var8 = new org.telegram.ui.web.u1(k3Var.M.Y);
                k3Var.F = u1Var8;
                org.telegram.ui.web.s0 webView = k3Var.getWebView();
                if (!u1Var8.f53560b) {
                    u1Var8.f53560b = true;
                    u1Var8.d = webView.getUrl();
                    u1Var8.f53562e = webView.getProgress();
                    u1Var8.f53563f = webView.f53532b;
                    u1Var8.f53568l = org.telegram.ui.web.w1.e(webView, new org.telegram.ui.web.s1(u1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = u1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    u1Var8.f53567k = ConnectionsManager.getInstance(u1Var8.f53559a).sendRequest(tL_messages_getWebPage, new ai.b1(u1Var8, 25));
                }
                return k3Var.F;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f53412b0, this.f53440x, this.E);
        org.telegram.ui.ActionBar.x1 x1Var = this.N;
        x1Var.a(f11);
        x1Var.b(i0.a.f(this.f53412b0, this.f53440x, this.E));
        this.M.invalidate();
        g4 g4Var = this.C0;
        org.telegram.ui.web.k kVar = g4Var.f48073j0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        t3 t3Var = g4Var.L;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void k(boolean z10) {
        float f10;
        long j3;
        if (this.f53410a0 != z10) {
            ValueAnimator valueAnimator = this.f53441x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f53410a0 = z10;
            di.q qVar = this.f53414c0;
            if (z10) {
                int i7 = this.f53415d0;
                int i10 = org.telegram.messenger.bz.f23311p0;
                if (i7 != i10) {
                    this.f53415d0 = i10;
                    qVar.setHint(org.telegram.messenger.gd.a0(null, null, 2131754348, org.telegram.ui.web.e1.a().f53361a));
                }
            }
            qVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f53437v0 && !z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.N.c(true, f10);
            float f12 = this.f53412b0;
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f53441x0 = ofFloat;
            ofFloat.addUpdateListener(new hi.s3(this, 24));
            this.f53441x0.addListener(new b30(14, this, z10));
            this.f53441x0.setInterpolator(org.telegram.ui.Components.kr.h);
            this.f53441x0.setDuration(360L);
            this.f53441x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.g1(this, 1));
            org.telegram.ui.web.g1 g1Var = new org.telegram.ui.web.g1(this, 1);
            if (this.f53410a0) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.h3(g1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.C0.f48073j0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.f48073j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
