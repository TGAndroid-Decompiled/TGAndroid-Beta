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
    public final org.telegram.ui.web.t1 getInstantViewLoader() {
        k3 k3Var = this.C0.f47920v0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.t1 t1Var = k3Var.F;
            if (t1Var != null) {
                t1Var.a();
                org.telegram.ui.web.t1 t1Var2 = k3Var.F;
                TLRPC.TL_webPage tL_webPage = t1Var2.f53288j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.v1.o(tL_webPage);
                    t1Var2.f53288j = null;
                }
                k3Var.F = null;
                return null;
            }
        } else if (k3Var.getWebView() == null) {
            org.telegram.ui.web.t1 t1Var3 = k3Var.F;
            if (t1Var3 != null) {
                t1Var3.a();
                org.telegram.ui.web.t1 t1Var4 = k3Var.F;
                TLRPC.TL_webPage tL_webPage2 = t1Var4.f53288j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.v1.o(tL_webPage2);
                    t1Var4.f53288j = null;
                }
                k3Var.F = null;
            }
        } else {
            org.telegram.ui.web.t1 t1Var5 = k3Var.F;
            if (t1Var5 != null && (t1Var5.f53285f != k3Var.getWebView().f53261b || k3Var.F.f53284e != k3Var.getWebView().getProgress())) {
                k3Var.F.d(k3Var.getWebView());
                return k3Var.F;
            } else if (k3Var.F != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.F.d)) {
                return k3Var.F;
            } else {
                org.telegram.ui.web.t1 t1Var6 = k3Var.F;
                if (t1Var6 != null) {
                    t1Var6.a();
                    org.telegram.ui.web.t1 t1Var7 = k3Var.F;
                    TLRPC.TL_webPage tL_webPage3 = t1Var7.f53288j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.v1.o(tL_webPage3);
                        t1Var7.f53288j = null;
                    }
                    k3Var.F = null;
                }
                org.telegram.ui.web.t1 t1Var8 = new org.telegram.ui.web.t1(k3Var.M.Y);
                k3Var.F = t1Var8;
                org.telegram.ui.web.s0 webView = k3Var.getWebView();
                if (!t1Var8.f53282b) {
                    t1Var8.f53282b = true;
                    t1Var8.d = webView.getUrl();
                    t1Var8.f53284e = webView.getProgress();
                    t1Var8.f53285f = webView.f53261b;
                    t1Var8.f53290l = org.telegram.ui.web.v1.e(webView, new org.telegram.ui.web.s1(t1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = t1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    t1Var8.f53289k = ConnectionsManager.getInstance(t1Var8.f53281a).sendRequest(tL_messages_getWebPage, new ai.a1(t1Var8, 25));
                }
                return k3Var.F;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f53141b0, this.f53169x, this.E);
        org.telegram.ui.ActionBar.x1 x1Var = this.N;
        x1Var.a(f11);
        x1Var.b(i0.a.f(this.f53141b0, this.f53169x, this.E));
        this.M.invalidate();
        g4 g4Var = this.C0;
        org.telegram.ui.web.k kVar = g4Var.f47909j0;
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
        if (this.f53139a0 != z10) {
            ValueAnimator valueAnimator = this.f53170x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f53139a0 = z10;
            di.q qVar = this.f53143c0;
            if (z10) {
                int i7 = this.f53144d0;
                int i10 = org.telegram.messenger.cz.f23395p0;
                if (i7 != i10) {
                    this.f53144d0 = i10;
                    qVar.setHint(org.telegram.messenger.hd.a0(null, null, 2131754348, org.telegram.ui.web.d1.a().f53081a));
                }
            }
            qVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f53166v0 && !z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.N.c(true, f10);
            float f12 = this.f53141b0;
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f53170x0 = ofFloat;
            ofFloat.addUpdateListener(new hi.j3(this, 24));
            this.f53170x0.addListener(new c30(14, this, z10));
            this.f53170x0.setInterpolator(org.telegram.ui.Components.nr.h);
            this.f53170x0.setDuration(360L);
            this.f53170x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.f1(this, 1));
            org.telegram.ui.web.f1 f1Var = new org.telegram.ui.web.f1(this, 1);
            if (this.f53139a0) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.h3(f1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.C0.f47909j0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.f47909j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
