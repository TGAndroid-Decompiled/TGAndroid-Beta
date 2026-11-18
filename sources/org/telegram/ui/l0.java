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
        k3 k3Var = this.C0.f47935v0[0];
        if (!k3Var.f()) {
            org.telegram.ui.web.t1 t1Var = k3Var.F;
            if (t1Var != null) {
                t1Var.a();
                org.telegram.ui.web.t1 t1Var2 = k3Var.F;
                TLRPC.TL_webPage tL_webPage = t1Var2.f53326j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.v1.o(tL_webPage);
                    t1Var2.f53326j = null;
                }
                k3Var.F = null;
                return null;
            }
        } else if (k3Var.getWebView() == null) {
            org.telegram.ui.web.t1 t1Var3 = k3Var.F;
            if (t1Var3 != null) {
                t1Var3.a();
                org.telegram.ui.web.t1 t1Var4 = k3Var.F;
                TLRPC.TL_webPage tL_webPage2 = t1Var4.f53326j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.v1.o(tL_webPage2);
                    t1Var4.f53326j = null;
                }
                k3Var.F = null;
            }
        } else {
            org.telegram.ui.web.t1 t1Var5 = k3Var.F;
            if (t1Var5 != null && (t1Var5.f53323f != k3Var.getWebView().f53299b || k3Var.F.f53322e != k3Var.getWebView().getProgress())) {
                k3Var.F.d(k3Var.getWebView());
                return k3Var.F;
            } else if (k3Var.F != null && TextUtils.equals(k3Var.getWebView().getUrl(), k3Var.F.d)) {
                return k3Var.F;
            } else {
                org.telegram.ui.web.t1 t1Var6 = k3Var.F;
                if (t1Var6 != null) {
                    t1Var6.a();
                    org.telegram.ui.web.t1 t1Var7 = k3Var.F;
                    TLRPC.TL_webPage tL_webPage3 = t1Var7.f53326j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.v1.o(tL_webPage3);
                        t1Var7.f53326j = null;
                    }
                    k3Var.F = null;
                }
                org.telegram.ui.web.t1 t1Var8 = new org.telegram.ui.web.t1(k3Var.M.Y);
                k3Var.F = t1Var8;
                org.telegram.ui.web.s0 webView = k3Var.getWebView();
                if (!t1Var8.f53320b) {
                    t1Var8.f53320b = true;
                    t1Var8.d = webView.getUrl();
                    t1Var8.f53322e = webView.getProgress();
                    t1Var8.f53323f = webView.f53299b;
                    t1Var8.f53328l = org.telegram.ui.web.v1.e(webView, new org.telegram.ui.web.s1(t1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = t1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    t1Var8.f53327k = ConnectionsManager.getInstance(t1Var8.f53319a).sendRequest(tL_messages_getWebPage, new ai.e1(t1Var8, 25));
                }
                return k3Var.F;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f53179b0, this.f53207x, this.E);
        org.telegram.ui.ActionBar.y1 y1Var = this.N;
        y1Var.a(f11);
        y1Var.b(i0.a.f(this.f53179b0, this.f53207x, this.E));
        this.M.invalidate();
        g4 g4Var = this.C0;
        org.telegram.ui.web.k kVar = g4Var.f47924j0;
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
        if (this.f53177a0 != z10) {
            ValueAnimator valueAnimator = this.f53208x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f53177a0 = z10;
            di.q qVar = this.f53181c0;
            if (z10) {
                int i7 = this.f53182d0;
                int i10 = org.telegram.messenger.bz.f23189p0;
                if (i7 != i10) {
                    this.f53182d0 = i10;
                    qVar.setHint(org.telegram.messenger.gd.a0(null, null, 2131754349, org.telegram.ui.web.e1.a().f53128a));
                }
            }
            qVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f53204v0 && !z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.N.c(true, f10);
            float f12 = this.f53179b0;
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f53208x0 = ofFloat;
            ofFloat.addUpdateListener(new hi.k3(this, 24));
            this.f53208x0.addListener(new c30(14, this, z10));
            this.f53208x0.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f53208x0.setDuration(360L);
            this.f53208x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.g1(this, 1));
            org.telegram.ui.web.g1 g1Var = new org.telegram.ui.web.g1(this, 1);
            if (this.f53177a0) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.h3(g1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.C0.f47924j0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.f47924j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
