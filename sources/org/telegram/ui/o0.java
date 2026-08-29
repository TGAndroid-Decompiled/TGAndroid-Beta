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
public final class o0 extends org.telegram.ui.web.r1 {
    public final m4 f40944x0;

    public o0(m4 m4Var, Activity activity) {
        super(activity);
        this.f40944x0 = m4Var;
    }

    @Override
    public final org.telegram.ui.web.d2 getInstantViewLoader() {
        q3 q3Var = this.f40944x0.f40404q0[0];
        if (!q3Var.f()) {
            org.telegram.ui.web.d2 d2Var = q3Var.f41522y;
            if (d2Var != null) {
                d2Var.a();
                org.telegram.ui.web.d2 d2Var2 = q3Var.f41522y;
                TLRPC.TL_webPage tL_webPage = d2Var2.f44012j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.f2.o(tL_webPage);
                    d2Var2.f44012j = null;
                }
                q3Var.f41522y = null;
                return null;
            }
        } else if (q3Var.getWebView() == null) {
            org.telegram.ui.web.d2 d2Var3 = q3Var.f41522y;
            if (d2Var3 != null) {
                d2Var3.a();
                org.telegram.ui.web.d2 d2Var4 = q3Var.f41522y;
                TLRPC.TL_webPage tL_webPage2 = d2Var4.f44012j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.f2.o(tL_webPage2);
                    d2Var4.f44012j = null;
                }
                q3Var.f41522y = null;
            }
        } else {
            org.telegram.ui.web.d2 d2Var5 = q3Var.f41522y;
            if (d2Var5 != null && (d2Var5.f44009f != q3Var.getWebView().f44226b || q3Var.f41522y.f44008e != q3Var.getWebView().getProgress())) {
                q3Var.f41522y.d(q3Var.getWebView());
                return q3Var.f41522y;
            } else if (q3Var.f41522y != null && TextUtils.equals(q3Var.getWebView().getUrl(), q3Var.f41522y.d)) {
                return q3Var.f41522y;
            } else {
                org.telegram.ui.web.d2 d2Var6 = q3Var.f41522y;
                if (d2Var6 != null) {
                    d2Var6.a();
                    org.telegram.ui.web.d2 d2Var7 = q3Var.f41522y;
                    TLRPC.TL_webPage tL_webPage3 = d2Var7.f44012j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.f2.o(tL_webPage3);
                        d2Var7.f44012j = null;
                    }
                    q3Var.f41522y = null;
                }
                org.telegram.ui.web.d2 d2Var8 = new org.telegram.ui.web.d2(q3Var.G.T);
                q3Var.f41522y = d2Var8;
                org.telegram.ui.web.w0 webView = q3Var.getWebView();
                if (!d2Var8.f44006b) {
                    d2Var8.f44006b = true;
                    d2Var8.d = webView.getUrl();
                    d2Var8.f44008e = webView.getProgress();
                    d2Var8.f44009f = webView.f44226b;
                    d2Var8.f44014l = org.telegram.ui.web.f2.e(webView, new org.telegram.ui.web.c2(d2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = d2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    d2Var8.f44013k = ConnectionsManager.getInstance(d2Var8.f44005a).sendRequest(tL_messages_getWebPage, new ef.a(d2Var8, 18));
                }
                return q3Var.f41522y;
            }
        }
        return null;
    }

    public final void j(float f9) {
        int d = i0.a.d(this.T, this.f44189w, this.f44192y);
        org.telegram.ui.ActionBar.h2 h2Var = this.I;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.T, this.f44189w, this.f44192y));
        this.H.invalidate();
        m4 m4Var = this.f40944x0;
        org.telegram.ui.web.l lVar = m4Var.f40393e0;
        if (lVar != null) {
            lVar.setOpenProgress(f9);
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f9;
        long j10;
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.f44185s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            jh.m mVar = this.U;
            if (z10) {
                int i10 = this.V;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.V = i11;
                    mVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.k1.a().f44088a));
                }
            }
            mVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f44181q0 && !z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.I.c(f9, true);
            float f11 = this.T;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f44185s0 = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 23));
            this.f44185s0.addListener(new p60(13, this, z10));
            this.f44185s0.setInterpolator(org.telegram.ui.Components.jr.h);
            this.f44185s0.setDuration(360L);
            this.f44185s0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.m1(this, 1));
            org.telegram.ui.web.m1 m1Var = new org.telegram.ui.web.m1(this, 1);
            if (this.S) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(m1Var, j10);
        }
        org.telegram.ui.web.l lVar = this.f40944x0.f40393e0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.f40944x0.f40393e0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
