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
public final class m0 extends org.telegram.ui.web.t1 {
    public final l4 f38927y0;

    public m0(l4 l4Var, Activity activity) {
        super(activity);
        this.f38927y0 = l4Var;
    }

    @Override
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        p3 p3Var = this.f38927y0.f38619r0[0];
        if (!p3Var.f()) {
            org.telegram.ui.web.f2 f2Var = p3Var.f39913y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = p3Var.f39913y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f42548j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f42548j = null;
                }
                p3Var.f39913y = null;
                return null;
            }
        } else if (p3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = p3Var.f39913y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = p3Var.f39913y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f42548j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f42548j = null;
                }
                p3Var.f39913y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = p3Var.f39913y;
            if (f2Var5 != null && (f2Var5.f42545f != p3Var.getWebView().f42758b || p3Var.f39913y.f42544e != p3Var.getWebView().getProgress())) {
                p3Var.f39913y.d(p3Var.getWebView());
                return p3Var.f39913y;
            } else if (p3Var.f39913y != null && TextUtils.equals(p3Var.getWebView().getUrl(), p3Var.f39913y.d)) {
                return p3Var.f39913y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = p3Var.f39913y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = p3Var.f39913y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f42548j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f42548j = null;
                    }
                    p3Var.f39913y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(p3Var.H.U);
                p3Var.f39913y = f2Var8;
                org.telegram.ui.web.x0 webView = p3Var.getWebView();
                if (!f2Var8.f42542b) {
                    f2Var8.f42542b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.f42544e = webView.getProgress();
                    f2Var8.f42545f = webView.f42758b;
                    f2Var8.f42550l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f42549k = ConnectionsManager.getInstance(f2Var8.f42541a).sendRequest(tL_messages_getWebPage, new gf.a(f2Var8, 14));
                }
                return p3Var.f39913y;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.U, this.f42728w, this.f42732y);
        org.telegram.ui.ActionBar.i2 i2Var = this.J;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.U, this.f42728w, this.f42732y));
        this.I.invalidate();
        l4 l4Var = this.f38927y0;
        org.telegram.ui.web.k kVar = l4Var.f38608f0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.i();
        }
    }

    public final void k(boolean z4) {
        float f10;
        long j10;
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.f42725t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            mh.m mVar = this.V;
            if (z4) {
                int i10 = this.W;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.W = i11;
                    mVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.m1.a().f42638a));
                }
            }
            mVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f42722r0 && !z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.J.c(f10, true);
            float f12 = this.U;
            if (z4) {
                f11 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f42725t0 = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 10));
            this.f42725t0.addListener(new qd1(3, this, z4));
            this.f42725t0.setInterpolator(org.telegram.ui.Components.pr.h);
            this.f42725t0.setDuration(360L);
            this.f42725t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.o1(this, 1));
            org.telegram.ui.web.o1 o1Var = new org.telegram.ui.web.o1(this, 1);
            if (this.T) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(o1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.f38927y0.f38608f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.f38927y0.f38608f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
