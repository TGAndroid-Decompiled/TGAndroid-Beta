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

    public final m4 f40965x0;

    public o0(m4 m4Var, Activity activity) {
        super(activity);
        this.f40965x0 = m4Var;
    }

    @Override
    public final org.telegram.ui.web.c2 getInstantViewLoader() {
        q3 q3Var = this.f40965x0.f40347q0[0];
        if (!q3Var.f()) {
            org.telegram.ui.web.c2 c2Var = q3Var.f41505y;
            if (c2Var != null) {
                c2Var.a();
                org.telegram.ui.web.c2 c2Var2 = q3Var.f41505y;
                TLRPC.TL_webPage tL_webPage = c2Var2.f43801j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.e2.o(tL_webPage);
                    c2Var2.f43801j = null;
                }
                q3Var.f41505y = null;
                return null;
            }
        } else {
            if (q3Var.getWebView() != null) {
                org.telegram.ui.web.c2 c2Var3 = q3Var.f41505y;
                if (c2Var3 != null && (c2Var3.f43798f != q3Var.getWebView().f44024b || q3Var.f41505y.f43797e != q3Var.getWebView().getProgress())) {
                    q3Var.f41505y.d(q3Var.getWebView());
                    return q3Var.f41505y;
                }
                if (q3Var.f41505y != null && TextUtils.equals(q3Var.getWebView().getUrl(), q3Var.f41505y.d)) {
                    return q3Var.f41505y;
                }
                org.telegram.ui.web.c2 c2Var4 = q3Var.f41505y;
                if (c2Var4 != null) {
                    c2Var4.a();
                    org.telegram.ui.web.c2 c2Var5 = q3Var.f41505y;
                    TLRPC.TL_webPage tL_webPage2 = c2Var5.f43801j;
                    if (tL_webPage2 != null) {
                        org.telegram.ui.web.e2.o(tL_webPage2);
                        c2Var5.f43801j = null;
                    }
                    q3Var.f41505y = null;
                }
                org.telegram.ui.web.c2 c2Var6 = new org.telegram.ui.web.c2(q3Var.G.T);
                q3Var.f41505y = c2Var6;
                org.telegram.ui.web.w0 webView = q3Var.getWebView();
                if (!c2Var6.f43795b) {
                    c2Var6.f43795b = true;
                    c2Var6.d = webView.getUrl();
                    c2Var6.f43797e = webView.getProgress();
                    c2Var6.f43798f = webView.f44024b;
                    c2Var6.f43803l = org.telegram.ui.web.e2.e(webView, new org.telegram.ui.web.b2(c2Var6, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = c2Var6.d;
                    tL_messages_getWebPage.hash = 0;
                    c2Var6.f43802k = ConnectionsManager.getInstance(c2Var6.f43794a).sendRequest(tL_messages_getWebPage, new cf.a(c2Var6, 19));
                }
                return q3Var.f41505y;
            }
            org.telegram.ui.web.c2 c2Var7 = q3Var.f41505y;
            if (c2Var7 != null) {
                c2Var7.a();
                org.telegram.ui.web.c2 c2Var8 = q3Var.f41505y;
                TLRPC.TL_webPage tL_webPage3 = c2Var8.f43801j;
                if (tL_webPage3 != null) {
                    org.telegram.ui.web.e2.o(tL_webPage3);
                    c2Var8.f43801j = null;
                }
                q3Var.f41505y = null;
            }
        }
        return null;
    }

    public final void j(float f10) {
        int iD = i0.b.d(this.T, this.f43986w, this.f43989y);
        org.telegram.ui.ActionBar.g2 g2Var = this.I;
        g2Var.a(iD);
        g2Var.b(i0.b.d(this.T, this.f43986w, this.f43989y));
        this.H.invalidate();
        m4 m4Var = this.f40965x0;
        org.telegram.ui.web.l lVar = m4Var.f40336e0;
        if (lVar != null) {
            lVar.setOpenProgress(f10);
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.i();
        }
    }

    public final void k(boolean z10) {
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.f43982s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.S = z10;
            int i10 = 1;
            hh.o oVar = this.U;
            if (z10) {
                int i11 = this.V;
                int i12 = SharedConfig.searchEngineType;
                if (i11 != i12) {
                    this.V = i12;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.k1.a().f43889a));
                }
            }
            oVar.setVisibility(0);
            this.I.c((this.f43978q0 || z10) ? 0.0f : 1.0f, true);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.T, z10 ? 1.0f : 0.0f);
            this.f43982s0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new lh.m2(this, 17));
            this.f43982s0.addListener(new n40(14, this, z10));
            this.f43982s0.setInterpolator(org.telegram.ui.Components.er.h);
            this.f43982s0.setDuration(360L);
            this.f43982s0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.m1(this, i10));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.m1(this, i10), this.S ? 100L : 0L);
        }
        org.telegram.ui.web.l lVar = this.f40965x0.f40336e0;
        if (lVar != null) {
            lVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.f40965x0.f40336e0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
