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
public final class m0 extends org.telegram.ui.web.v1 {
    public final j4 B0;

    public m0(j4 j4Var, Activity activity) {
        super(activity);
        this.B0 = j4Var;
    }

    @Override
    public final org.telegram.ui.web.h2 getInstantViewLoader() {
        n3 n3Var = this.B0.f34627u0[0];
        if (!n3Var.f()) {
            org.telegram.ui.web.h2 h2Var = n3Var.f35803y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = n3Var.f35803y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f39041j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f39041j = null;
                }
                n3Var.f35803y = null;
                return null;
            }
        } else if (n3Var.getWebView() == null) {
            org.telegram.ui.web.h2 h2Var3 = n3Var.f35803y;
            if (h2Var3 != null) {
                h2Var3.a();
                org.telegram.ui.web.h2 h2Var4 = n3Var.f35803y;
                TLRPC.TL_webPage tL_webPage2 = h2Var4.f39041j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.j2.o(tL_webPage2);
                    h2Var4.f39041j = null;
                }
                n3Var.f35803y = null;
            }
        } else {
            org.telegram.ui.web.h2 h2Var5 = n3Var.f35803y;
            if (h2Var5 != null && (h2Var5.f39038f != n3Var.getWebView().f39242b || n3Var.f35803y.e != n3Var.getWebView().getProgress())) {
                n3Var.f35803y.d(n3Var.getWebView());
                return n3Var.f35803y;
            } else if (n3Var.f35803y != null && TextUtils.equals(n3Var.getWebView().getUrl(), n3Var.f35803y.d)) {
                return n3Var.f35803y;
            } else {
                org.telegram.ui.web.h2 h2Var6 = n3Var.f35803y;
                if (h2Var6 != null) {
                    h2Var6.a();
                    org.telegram.ui.web.h2 h2Var7 = n3Var.f35803y;
                    TLRPC.TL_webPage tL_webPage3 = h2Var7.f39041j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.j2.o(tL_webPage3);
                        h2Var7.f39041j = null;
                    }
                    n3Var.f35803y = null;
                }
                org.telegram.ui.web.h2 h2Var8 = new org.telegram.ui.web.h2(n3Var.K.X);
                n3Var.f35803y = h2Var8;
                org.telegram.ui.web.z0 webView = n3Var.getWebView();
                if (!h2Var8.f39036b) {
                    h2Var8.f39036b = true;
                    h2Var8.d = webView.getUrl();
                    h2Var8.e = webView.getProgress();
                    h2Var8.f39038f = webView.f39242b;
                    h2Var8.f39043l = org.telegram.ui.web.j2.e(webView, new org.telegram.ui.web.f2(h2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = h2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    h2Var8.f39042k = ConnectionsManager.getInstance(h2Var8.f39035a).sendRequest(tL_messages_getWebPage, new ai.n8(h2Var8, 18));
                }
                return n3Var.f35803y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f39182a0, this.f39209w, this.f39213y);
        org.telegram.ui.ActionBar.h2 h2Var = this.M;
        h2Var.a(d);
        h2Var.b(i0.a.d(this.f39182a0, this.f39209w, this.f39213y));
        this.L.invalidate();
        j4 j4Var = this.B0;
        org.telegram.ui.web.k kVar = j4Var.f34616i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j3;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f39210w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            fi.o oVar = this.f39184b0;
            if (z10) {
                int i10 = this.f39186c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f39186c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.o1.a().f39121a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f39207u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f39182a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39210w0 = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 7));
            this.f39210w0.addListener(new f70(13, this, z10));
            this.f39210w0.setInterpolator(org.telegram.ui.Components.sr.h);
            this.f39210w0.setDuration(360L);
            this.f39210w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.q1(this, 1));
            org.telegram.ui.web.q1 q1Var = new org.telegram.ui.web.q1(this, 1);
            if (this.W) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(q1Var, j3);
        }
        org.telegram.ui.web.k kVar = this.B0.f34616i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f34616i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
