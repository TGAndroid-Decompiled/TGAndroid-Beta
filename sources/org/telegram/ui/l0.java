package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l0 extends org.telegram.ui.web.l1 {
    public final g4 B0;

    public l0(g4 g4Var, Activity activity) {
        super(activity);
        this.B0 = g4Var;
    }

    @Override
    public final org.telegram.ui.web.v1 getInstantViewLoader() {
        k3 k3Var = this.B0.f45843u0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.v1 v1Var = k3Var.E;
            if (v1Var != null) {
                v1Var.a();
                org.telegram.ui.web.v1 v1Var2 = k3Var.E;
                TLRPC.TL_webPage tL_webPage = v1Var2.f51342j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.x1.o(tL_webPage);
                    v1Var2.f51342j = null;
                }
                k3Var.E = null;
                return null;
            }
        } else if (k3Var.getWebView() == null) {
            org.telegram.ui.web.v1 v1Var3 = k3Var.E;
            if (v1Var3 != null) {
                v1Var3.a();
                org.telegram.ui.web.v1 v1Var4 = k3Var.E;
                TLRPC.TL_webPage tL_webPage2 = v1Var4.f51342j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.x1.o(tL_webPage2);
                    v1Var4.f51342j = null;
                }
                k3Var.E = null;
            }
        } else {
            org.telegram.ui.web.v1 v1Var5 = k3Var.E;
            if (v1Var5 != null && (v1Var5.f51339f != k3Var.getWebView().f51317b || k3Var.E.f51338e != k3Var.getWebView().getProgress())) {
                k3Var.E.d(k3Var.getWebView());
                return k3Var.E;
            } else if (k3Var.E != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.E.d)) {
                return k3Var.E;
            } else {
                org.telegram.ui.web.v1 v1Var6 = k3Var.E;
                if (v1Var6 != null) {
                    v1Var6.a();
                    org.telegram.ui.web.v1 v1Var7 = k3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = v1Var7.f51342j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.x1.o(tL_webPage3);
                        v1Var7.f51342j = null;
                    }
                    k3Var.E = null;
                }
                org.telegram.ui.web.v1 v1Var8 = new org.telegram.ui.web.v1(k3Var.L.X);
                k3Var.E = v1Var8;
                org.telegram.ui.web.u0 webView = k3Var.getWebView();
                if (!v1Var8.f51336b) {
                    v1Var8.f51336b = true;
                    v1Var8.d = webView.getUrl();
                    v1Var8.f51338e = webView.getProgress();
                    v1Var8.f51339f = webView.f51317b;
                    v1Var8.f51344l = org.telegram.ui.web.x1.e(webView, new org.telegram.ui.web.u1(v1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = v1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    v1Var8.f51343k = ConnectionsManager.getInstance(v1Var8.f51335a).sendRequest(tL_messages_getWebPage, new bi.j0(v1Var8, 22));
                }
                return k3Var.E;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f51201a0, this.f51231x, this.D);
        org.telegram.ui.ActionBar.y1 y1Var = this.M;
        y1Var.a(f11);
        y1Var.b(i0.a.f(this.f51201a0, this.f51231x, this.D));
        this.L.invalidate();
        g4 g4Var = this.B0;
        org.telegram.ui.web.j jVar = g4Var.f45832i0;
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
            ValueAnimator valueAnimator = this.f51230w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z9;
            bi.v vVar = this.f51203b0;
            if (z9) {
                int i7 = this.f51205c0;
                int i10 = org.telegram.messenger.iz.f23398p0;
                if (i7 != i10) {
                    this.f51205c0 = i10;
                    vVar.setHint(org.telegram.messenger.hd.a0(null, null, 2131754351, org.telegram.ui.web.g1.a().f51145a));
                }
            }
            vVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f51227u0 && !z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.M.c(true, f10);
            float f12 = this.f51201a0;
            if (z9) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f51230w0 = ofFloat;
            ofFloat.addUpdateListener(new fi.v3(this, 23));
            this.f51230w0.addListener(new z40(13, this, z9));
            this.f51230w0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f51230w0.setDuration(360L);
            this.f51230w0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.i1(this, 1));
            org.telegram.ui.web.i1 i1Var = new org.telegram.ui.web.i1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(i1Var, j3);
        }
        org.telegram.ui.web.j jVar = this.B0.f45832i0;
        if (jVar != null) {
            jVar.setOpened(z9);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.B0.f45832i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
