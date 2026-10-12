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
public final class m0 extends org.telegram.ui.web.u1 {
    public final k4 B0;

    public m0(k4 k4Var, Activity activity) {
        super(activity);
        this.B0 = k4Var;
    }

    @Override
    public final org.telegram.ui.web.f2 getInstantViewLoader() {
        o3 o3Var = this.B0.f37557u0[0];
        if (!o3Var.f()) {
            org.telegram.ui.web.f2 f2Var = o3Var.f38855y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = o3Var.f38855y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f41352j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f41352j = null;
                }
                o3Var.f38855y = null;
                return null;
            }
        } else if (o3Var.getWebView() == null) {
            org.telegram.ui.web.f2 f2Var3 = o3Var.f38855y;
            if (f2Var3 != null) {
                f2Var3.a();
                org.telegram.ui.web.f2 f2Var4 = o3Var.f38855y;
                TLRPC.TL_webPage tL_webPage2 = f2Var4.f41352j;
                if (tL_webPage2 != null) {
                    org.telegram.ui.web.h2.o(tL_webPage2);
                    f2Var4.f41352j = null;
                }
                o3Var.f38855y = null;
            }
        } else {
            org.telegram.ui.web.f2 f2Var5 = o3Var.f38855y;
            if (f2Var5 != null && (f2Var5.f41349f != o3Var.getWebView().f41561b || o3Var.f38855y.e != o3Var.getWebView().getProgress())) {
                o3Var.f38855y.d(o3Var.getWebView());
                return o3Var.f38855y;
            } else if (o3Var.f38855y != null && TextUtils.equals(o3Var.getWebView().getUrl(), o3Var.f38855y.d)) {
                return o3Var.f38855y;
            } else {
                org.telegram.ui.web.f2 f2Var6 = o3Var.f38855y;
                if (f2Var6 != null) {
                    f2Var6.a();
                    org.telegram.ui.web.f2 f2Var7 = o3Var.f38855y;
                    TLRPC.TL_webPage tL_webPage3 = f2Var7.f41352j;
                    if (tL_webPage3 != null) {
                        org.telegram.ui.web.h2.o(tL_webPage3);
                        f2Var7.f41352j = null;
                    }
                    o3Var.f38855y = null;
                }
                org.telegram.ui.web.f2 f2Var8 = new org.telegram.ui.web.f2(o3Var.K.X);
                o3Var.f38855y = f2Var8;
                org.telegram.ui.web.y0 webView = o3Var.getWebView();
                if (!f2Var8.f41347b) {
                    f2Var8.f41347b = true;
                    f2Var8.d = webView.getUrl();
                    f2Var8.e = webView.getProgress();
                    f2Var8.f41349f = webView.f41561b;
                    f2Var8.f41354l = org.telegram.ui.web.h2.e(webView, new org.telegram.ui.web.e2(f2Var8, 0));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = f2Var8.d;
                    tL_messages_getWebPage.hash = 0;
                    f2Var8.f41353k = ConnectionsManager.getInstance(f2Var8.f41346a).sendRequest(tL_messages_getWebPage, new bi.z7(f2Var8, 18));
                }
                return o3Var.f38855y;
            }
        }
        return null;
    }

    public final void j(float f7) {
        int d = i0.a.d(this.f41501a0, this.f41528w, this.f41532y);
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        f2Var.a(d);
        f2Var.b(i0.a.d(this.f41501a0, this.f41528w, this.f41532y));
        this.L.invalidate();
        k4 k4Var = this.B0;
        org.telegram.ui.web.k kVar = k4Var.f37546i0;
        if (kVar != null) {
            kVar.setOpenProgress(f7);
        }
        x3 x3Var = k4Var.K;
        if (x3Var != null) {
            x3Var.i();
        }
    }

    public final void k(boolean z10) {
        float f7;
        long j10;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f41529w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            gi.o oVar = this.f41503b0;
            if (z10) {
                int i10 = this.f41505c0;
                int i11 = SharedConfig.searchEngineType;
                if (i10 != i11) {
                    this.f41505c0 = i11;
                    oVar.setHint(LocaleController.formatString(R.string.AddressPlaceholder, org.telegram.ui.web.n1.a().f41440a));
                }
            }
            oVar.setVisibility(0);
            float f10 = 0.0f;
            if (!this.f41526u0 && !z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.M.c(f7, true);
            float f11 = this.f41501a0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f41529w0 = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 8));
            this.f41529w0.addListener(new i50(14, this, z10));
            this.f41529w0.setInterpolator(org.telegram.ui.Components.es.h);
            this.f41529w0.setDuration(360L);
            this.f41529w0.start();
            AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.p1(this, 1));
            org.telegram.ui.web.p1 p1Var = new org.telegram.ui.web.p1(this, 1);
            if (this.W) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(p1Var, j10);
        }
        org.telegram.ui.web.k kVar = this.B0.f37546i0;
        if (kVar != null) {
            kVar.setOpened(z10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) this.B0.f37546i0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
