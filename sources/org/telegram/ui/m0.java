package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m0 extends org.telegram.ui.web.l1 {
    public final h4 B0;

    public m0(h4 h4Var, Activity activity) {
        super(activity);
        this.B0 = h4Var;
    }

    @Override
    public final org.telegram.ui.web.w1 getInstantViewLoader() {
        l3 l3Var = this.B0.f37691u0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.w1 w1Var = l3Var.E;
            if (w1Var != null) {
                w1Var.a();
                org.telegram.ui.web.w1 w1Var2 = l3Var.E;
                TLRPC.TL_webPage tL_webPage = w1Var2.f43035j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.y1.o(tL_webPage);
                    w1Var2.f43035j = null;
                }
                l3Var.E = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.w1 w1Var3 = l3Var.E;
            if (w1Var3 != null) {
                w1Var3.a();
                org.telegram.ui.web.w1 w1Var4 = l3Var.E;
                TLRPC.TL_webPage tL_webPage2 = w1Var4.f43035j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.y1.o(tL_webPage2);
                    w1Var4.f43035j = null;
                }
                l3Var.E = null;
            }
        } else {
            org.telegram.ui.web.w1 w1Var5 = l3Var.E;
            if (w1Var5 != null && (w1Var5.f43032f != l3Var.getWebView().f43011b || l3Var.E.e != l3Var.getWebView().getProgress())) {
                l3Var.E.d(l3Var.getWebView());
                return l3Var.E;
            } else if (l3Var.E != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.E.d)) {
                return l3Var.E;
            } else {
                org.telegram.ui.web.w1 w1Var6 = l3Var.E;
                if (w1Var6 != null) {
                    w1Var6.a();
                    org.telegram.ui.web.w1 w1Var7 = l3Var.E;
                    TLRPC.TL_webPage tL_webPage3 = w1Var7.f43035j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.y1.o(tL_webPage3);
                        w1Var7.f43035j = null;
                    }
                    l3Var.E = null;
                }
                org.telegram.ui.web.w1 w1Var8 = new org.telegram.ui.web.w1(l3Var.L.X);
                l3Var.E = w1Var8;
                org.telegram.ui.web.v0 webView = l3Var.getWebView();
                if (!w1Var8.f43030b) {
                    w1Var8.f43030b = true;
                    w1Var8.d = webView.getUrl();
                    w1Var8.e = webView.getProgress();
                    w1Var8.f43032f = webView.f43011b;
                    w1Var8.f43037l = org.telegram.ui.web.y1.e(webView, new org.telegram.ui.web.u1(w1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = w1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    w1Var8.f43036k = ConnectionsManager.getInstance(w1Var8.f43029a).sendRequest(tL_messages_getWebPage, new ag.c(w1Var8, 13));
                }
                return l3Var.E;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int f10 = i0.b.f(this.f42895a0, this.f42924x, this.D);
        org.telegram.ui.ActionBar.c2 c2Var = this.M;
        c2Var.a(f10);
        c2Var.b(i0.b.f(this.f42895a0, this.f42924x, this.D));
        this.L.invalidate();
        h4 h4Var = this.B0;
        org.telegram.ui.web.j jVar = h4Var.f37680i0;
        if (jVar != null) {
            jVar.setOpenProgress(f7);
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.u();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f42923w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            zd zdVar = this.f42897b0;
            if (z10) {
                int i10 = this.f42899c0;
                int i11 = org.telegram.messenger.uz.f18541p0;
                if (i10 != i11) {
                    this.f42899c0 = i11;
                    zdVar.setHint(org.telegram.messenger.dd.a0(null, null, 2131754351, org.telegram.ui.web.g1.a().f42847a));
                }
            }
            zdVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f42920u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(true, f7);
            float f11 = this.f42895a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42923w0 = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 27));
            this.f42923w0.addListener(new org.telegram.ui.Components.ha0(29, this, z10));
            this.f42923w0.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f42923w0.setDuration(360L);
            this.f42923w0.start();
            org.telegram.messenger.i0.r(new org.telegram.ui.web.i1(this, 1));
            org.telegram.ui.web.i1 i1Var = new org.telegram.ui.web.i1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.i0.h3(i1Var, j10);
        }
        org.telegram.ui.web.j jVar = this.B0.f37680i0;
        if (jVar != null) {
            jVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f37680i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
