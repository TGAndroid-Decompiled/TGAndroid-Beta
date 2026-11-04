package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m0 extends org.telegram.ui.web.i1 {
    public final i4 C0;

    public m0(i4 i4Var, Activity activity) {
        super(activity);
        this.C0 = i4Var;
    }

    @Override
    public final org.telegram.ui.web.s1 getInstantViewLoader() {
        l3 l3Var = this.C0.f46100v0[0];
        if (!l3Var.f()) {
            org.telegram.ui.web.s1 s1Var = l3Var.F;
            if (s1Var != null) {
                s1Var.a();
                org.telegram.ui.web.s1 s1Var2 = l3Var.F;
                TLRPC.TL_webPage tL_webPage = s1Var2.f51014j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.u1.o(tL_webPage);
                    s1Var2.f51014j = null;
                }
                l3Var.F = null;
                return null;
            }
        } else if (l3Var.getWebView() == null) {
            org.telegram.ui.web.s1 s1Var3 = l3Var.F;
            if (s1Var3 != null) {
                s1Var3.a();
                org.telegram.ui.web.s1 s1Var4 = l3Var.F;
                TLRPC.TL_webPage tL_webPage2 = s1Var4.f51014j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.u1.o(tL_webPage2);
                    s1Var4.f51014j = null;
                }
                l3Var.F = null;
            }
        } else {
            org.telegram.ui.web.s1 s1Var5 = l3Var.F;
            if (s1Var5 != null && (s1Var5.f51011f != l3Var.getWebView().f51022b || l3Var.F.f51010e != l3Var.getWebView().getProgress())) {
                l3Var.F.d(l3Var.getWebView());
                return l3Var.F;
            } else if (l3Var.F != null && TextUtils.equals(l3Var.getWebView().getUrl(), l3Var.F.d)) {
                return l3Var.F;
            } else {
                org.telegram.ui.web.s1 s1Var6 = l3Var.F;
                if (s1Var6 != null) {
                    s1Var6.a();
                    org.telegram.ui.web.s1 s1Var7 = l3Var.F;
                    TLRPC.TL_webPage tL_webPage3 = s1Var7.f51014j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.u1.o(tL_webPage3);
                        s1Var7.f51014j = null;
                    }
                    l3Var.F = null;
                }
                org.telegram.ui.web.s1 s1Var8 = new org.telegram.ui.web.s1(l3Var.M.Y);
                l3Var.F = s1Var8;
                org.telegram.ui.web.t0 webView = l3Var.getWebView();
                if (!s1Var8.f51008b) {
                    s1Var8.f51008b = true;
                    s1Var8.d = webView.getUrl();
                    s1Var8.f51010e = webView.getProgress();
                    s1Var8.f51011f = webView.f51022b;
                    s1Var8.f51016l = org.telegram.ui.web.u1.e(webView, new org.telegram.ui.web.r1(s1Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = s1Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    s1Var8.f51015k = ConnectionsManager.getInstance(s1Var8.f51007a).sendRequest(tL_messages_getWebPage, new ci.d0(s1Var8, 22));
                }
                return l3Var.F;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int f11 = i0.a.f(this.f50873b0, this.f50901x, this.E);
        org.telegram.ui.ActionBar.w1 w1Var = this.N;
        w1Var.a(f11);
        w1Var.b(i0.a.f(this.f50873b0, this.f50901x, this.E));
        this.M.invalidate();
        i4 i4Var = this.C0;
        org.telegram.ui.web.l lVar = i4Var.f46089j0;
        if (lVar != null) {
            lVar.setOpenProgress(f10);
        }
        u3 u3Var = i4Var.L;
        if (u3Var != null) {
            u3Var.u();
        }
    }

    public final void k(boolean z10) {
        float f10;
        long j10;
        if (this.f50871a0 != z10) {
            ValueAnimator valueAnimator = this.f50902x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f50871a0 = z10;
            ci.s sVar = this.f50875c0;
            if (z10) {
                int i3 = this.f50876d0;
                int i10 = org.telegram.messenger.az.f21653p0;
                if (i3 != i10) {
                    this.f50876d0 = i10;
                    sVar.setHint(org.telegram.messenger.bd.a0(null, null, 2131754351, org.telegram.ui.web.d1.a().f50829a));
                }
            }
            sVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f50898v0 && !z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.N.c(true, f10);
            float f12 = this.f50873b0;
            if (z10) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f50902x0 = ofFloat;
            ofFloat.addUpdateListener(new gi.j3(this, 24));
            this.f50902x0.addListener(new u40(13, this, z10));
            this.f50902x0.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f50902x0.setDuration(360L);
            this.f50902x0.start();
            org.telegram.messenger.g0.r(new org.telegram.ui.web.f1(this, 1));
            org.telegram.ui.web.f1 f1Var = new org.telegram.ui.web.f1(this, 1);
            if (this.f50871a0) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.g0.i3(f1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.C0.f46089j0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ((ViewGroup.MarginLayoutParams) this.C0.f46089j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
