package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l0 extends org.telegram.ui.web.k1 {
    public final g4 B0;

    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.B0 = g4Var;
    }

    @Override
    public final org.telegram.ui.web.u1 getInstantViewLoader() {
        k3 k3Var = this.B0.f45819u0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.u1 u1Var = k3Var.E;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = k3Var.E;
                TLRPC.TL_webPage tL_webPage = u1Var2.f51333j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.f51333j = null;
                }
                k3Var.E = null;
                return null;
            }
        } else if (k3Var.getWebView() == null) {
            org.telegram.ui.web.u1 u1Var3 = k3Var.E;
            if (u1Var3 != null) {
                u1Var3.a();
                org.telegram.ui.web.u1 u1Var4 = k3Var.E;
                TLRPC.TL_webPage tL_webPage2 = u1Var4.f51333j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.w1.o(tL_webPage2);
                    u1Var4.f51333j = null;
                }
                k3Var.E = null;
            }
        } else {
            org.telegram.ui.web.u1 u1Var5 = k3Var.E;
            if (u1Var5 != null && (u1Var5.f51330f != k3Var.getWebView().f51316b || k3Var.E.f51329e != k3Var.getWebView().getProgress())) {
                k3Var.E.d(k3Var.getWebView());
                return k3Var.E;
            } else if (k3Var.E != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.E.d)) {
                return k3Var.E;
            } else {
                org.telegram.ui.web.u1 u1Var6 = k3Var.E;
                if (u1Var6 != null) {
                    u1Var6.a();
                    org.telegram.ui.web.u1 u1Var7 = k3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = u1Var7.f51333j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.w1.o(tL_webPage3);
                        u1Var7.f51333j = null;
                    }
                    k3Var.E = null;
                }
                org.telegram.ui.web.u1 u1Var8 = new org.telegram.ui.web.u1(k3Var.L.X);
                k3Var.E = u1Var8;
                org.telegram.ui.web.u0 webView = k3Var.getWebView();
                if (!u1Var8.f51327b) {
                    u1Var8.f51327b = true;
                    u1Var8.d = webView.getUrl();
                    u1Var8.f51329e = webView.getProgress();
                    u1Var8.f51330f = webView.f51316b;
                    u1Var8.f51335l = org.telegram.ui.web.w1.e(webView, new org.telegram.ui.web.t1(u1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = u1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    u1Var8.f51334k = ConnectionsManager.getInstance(u1Var8.f51326a).sendRequest(tL_messages_getWebPage, new bi.j0(u1Var8, 22));
                }
                return k3Var.E;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f51187a0, this.f51217x, this.D);
        org.telegram.ui.ActionBar.y1 y1Var = this.M;
        y1Var.a(f11);
        y1Var.b(i0.a.f(this.f51187a0, this.f51217x, this.D));
        this.L.invalidate();
        g4 g4Var = this.B0;
        org.telegram.ui.web.j jVar = g4Var.f45808i0;
        if (jVar != null) {
            jVar.setOpenProgress(f10);
        }
        t3 t3Var = g4Var.K;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void k(boolean z9) {
        float f10;
        long j3;
        if (this.W != z9) {
            ValueAnimator valueAnimator = this.f51216w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z9;
            bi.v vVar = this.f51189b0;
            if (z9) {
                int i7 = this.f51191c0;
                int i10 = org.telegram.messenger.iz.f23426p0;
                if (i7 != i10) {
                    this.f51191c0 = i10;
                    vVar.setHint(org.telegram.messenger.id.a0(null, null, 2131754351, org.telegram.ui.web.f1.a().f51129a));
                }
            }
            vVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f51213u0 && !z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.M.c(true, f10);
            float f12 = this.f51187a0;
            if (z9) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f51216w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.v3(this, 23));
            this.f51216w0.addListener(new z40(13, this, z9));
            this.f51216w0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f51216w0.setDuration(360L);
            this.f51216w0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.h1(this, 1));
            org.telegram.ui.web.h1 h1Var = new org.telegram.ui.web.h1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(h1Var, j3);
        }
        org.telegram.ui.web.j jVar = this.B0.f45808i0;
        if (jVar != null) {
            jVar.setOpened(z9);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.B0.f45808i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
