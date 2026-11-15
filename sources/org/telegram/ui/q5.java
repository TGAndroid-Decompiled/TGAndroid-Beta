package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f50464a;
    public final Object f50465b;

    public q5(Object obj, int i7) {
        this.f50464a = i7;
        this.f50465b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ch0 ch0Var;
        int i7 = this.f50464a;
        Object obj = this.f50465b;
        switch (i7) {
            case 0:
                ((r5) obj).f50845a.y0(false);
                return;
            case 1:
                ((o9) obj).f49867m1.onFragmentDestroy();
                return;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.f45026x.g()) {
                    adVar.L.P(86);
                    adVar.f45012n.d();
                    return;
                }
                adVar.L.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.g3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.xb xbVar = ((org.telegram.ui.Components.xb[]) obj)[0];
                if (xbVar != null) {
                    xbVar.b();
                    return;
                }
                return;
            case 5:
                qn qnVar = (qn) obj;
                if (!qnVar.f50684s.g()) {
                    qnVar.S0.P(86);
                    qnVar.f50665c0.f30656e.d();
                    return;
                }
                qnVar.S0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f42593y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                c50 c50Var = (c50) obj;
                if (!c50Var.O.g()) {
                    c50Var.S.P(86);
                    c50Var.f46010f.d();
                    return;
                }
                c50Var.S.N(0, false, false);
                return;
            case 8:
                oc0 oc0Var = (oc0) obj;
                org.telegram.ui.Components.ch0 ch0Var2 = oc0Var.K;
                xc xcVar = oc0Var.f49911n;
                if (!oc0Var.N.g()) {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new bb0(oc0Var, 2));
                    xcVar.d();
                    return;
                }
                xcVar.setAnimation(ch0Var2);
                ch0Var2.N(0, false, false);
                oc0Var.M = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.u2) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).Q1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.Z8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f43038u0.g()) {
                    privacyControlActivity.f43039v0.P(86);
                    privacyControlActivity.f43041w0.f30656e.d();
                    return;
                }
                privacyControlActivity.f43039v0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f43182r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.hf0 hf0Var = profileActivity.f43063a0;
                    if (hf0Var != null) {
                        org.telegram.ui.Components.ef0 i10 = org.telegram.ui.Components.hf0.i(14, hf0Var.f35225a);
                        if (i10 != null && (ch0Var = i10.f34293k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        profileActivity.f43189s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = profileActivity.N2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((n11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f43338b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f43339a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f43406r = null;
                themeActivity.h = null;
                themeActivity.f43401n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ec1) obj).f46709u0.b();
                return;
        }
    }
}
