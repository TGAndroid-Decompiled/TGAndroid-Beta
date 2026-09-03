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
public final class o0 extends org.telegram.ui.web.u1 {
    public final n4 f36611y0;

    public o0(n4 n4Var, Activity activity) {
        super(activity);
        this.f36611y0 = n4Var;
    }

    @Override
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        r3 r3Var = this.f36611y0.f36375r0[0];
        if (!r3Var.f()) {
            org.telegram.ui.web.f2 f2Var = r3Var.f37692y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = r3Var.f37692y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f39444j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f39444j = null;
                }
                r3Var.f37692y = null;
                return null;
            }
        } else if (r3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = r3Var.f37692y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = r3Var.f37692y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f39444j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f39444j = null;
                }
                r3Var.f37692y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = r3Var.f37692y;
            if (f2Var5 != null && (f2Var5.f39441f != r3Var.getWebView().f39652b || r3Var.f37692y.e != r3Var.getWebView().getProgress())) {
                r3Var.f37692y.d(r3Var.getWebView());
                return r3Var.f37692y;
            } else if (r3Var.f37692y != null && TextUtils.equals(r3Var.getWebView().getUrl(), r3Var.f37692y.d)) {
                return r3Var.f37692y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = r3Var.f37692y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = r3Var.f37692y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f39444j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f39444j = null;
                    }
                    r3Var.f37692y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(r3Var.H.U);
                r3Var.f37692y = f2Var8;
                org.telegram.ui.web.y0 webView = r3Var.getWebView();
                if (!f2Var8.f39439b) {
                    f2Var8.f39439b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f39441f = webView.f39652b;
                    f2Var8.f39446l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f39445k = ConnectionsManager.getInstance(f2Var8.f39438a).sendRequest(tL_messages_getWebPage, new ff.a(f2Var8, 14));
                }
                return r3Var.f37692y;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int d = i0.a.d(this.U, this.f39621w, this.f39625y);
        org.telegram.ui.ActionBar.i2 i2Var = this.J;
        i2Var.a(d);
        i2Var.b(i0.a.d(this.U, this.f39621w, this.f39625y));
        this.I.invalidate();
        n4 n4Var = this.f36611y0;
        org.telegram.ui.web.k kVar = n4Var.f36364f0;
        if (kVar != null) {
            kVar.setOpenProgress(f10);
        }
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            a4Var.i();
        }
    }

    public final void k(boolean z4) {
        float f10;
        long j10;
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.f39618t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.T = z4;
            lh.n nVar = this.V;
            if (z4) {
                int i10 = this.W;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.W = i11;
                    nVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f39536a));
                }
            }
            nVar.setVisibility(0);
            float f11 = 0.0f;
            if (!this.f39615r0 && !z4) {
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
            this.f39618t0 = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 11));
            this.f39618t0.addListener(new s61(5, this, z4));
            this.f39618t0.setInterpolator(org.telegram.ui.Components.mr.h);
            this.f39618t0.setDuration(360L);
            this.f39618t0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.T) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.f36611y0.f36364f0;
        if (kVar != null) {
            kVar.setOpened(z4);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.f36611y0.f36364f0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
