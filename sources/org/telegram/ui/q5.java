package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f51320a;
    public final Object f51321b;

    public q5(Object obj, int i7) {
        this.f51320a = i7;
        this.f51321b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.nh0 nh0Var;
        int i7 = this.f51320a;
        Object obj = this.f51321b;
        switch (i7) {
            case 0:
                ((r5) obj).f51624a.y0(false);
                return;
            case 1:
                ((p9) obj).f50912m1.onFragmentDestroy();
                return;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.f45689x.g()) {
                    adVar.L.P(86);
                    adVar.f45675n.d();
                    return;
                }
                adVar.L.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                if (r1Var != null) {
                    r1Var.h3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.fc fcVar = ((org.telegram.ui.Components.fc[]) obj)[0];
                if (fcVar != null) {
                    fcVar.b();
                    return;
                }
                return;
            case 5:
                rn rnVar = (rn) obj;
                if (!rnVar.f51788s.g()) {
                    rnVar.S0.P(86);
                    rnVar.f51769c0.f31176e.d();
                    return;
                }
                rnVar.S0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f43158y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                e50 e50Var = (e50) obj;
                if (!e50Var.O.g()) {
                    e50Var.S.P(86);
                    e50Var.f47440f.d();
                    return;
                }
                e50Var.S.N(0, false, false);
                return;
            case 8:
                oc0 oc0Var = (oc0) obj;
                org.telegram.ui.Components.nh0 nh0Var2 = oc0Var.K;
                xc xcVar = oc0Var.f50656n;
                if (!oc0Var.N.g()) {
                    xcVar.setAnimation(nh0Var2);
                    nh0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new bb0(oc0Var, 2));
                    xcVar.d();
                    return;
                }
                xcVar.setAnimation(nh0Var2);
                nh0Var2.N(0, false, false);
                oc0Var.M = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).Q1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f43609u0.g()) {
                    privacyControlActivity.f43610v0.P(86);
                    privacyControlActivity.f43612w0.f31176e.d();
                    return;
                }
                privacyControlActivity.f43610v0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f43754r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.sf0 sf0Var = profileActivity.f43635a0;
                    if (sf0Var != null) {
                        org.telegram.ui.Components.pf0 i10 = org.telegram.ui.Components.sf0.i(14, sf0Var.f39591a);
                        if (i10 != null && (nh0Var = i10.f38469k) != null) {
                            nh0Var.start();
                        }
                    } else {
                        profileActivity.f43761s.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = profileActivity.N2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((q11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f43910b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f43911a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f43978r = null;
                themeActivity.h = null;
                themeActivity.f43973n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((fc1) obj).f47790u0.b();
                return;
        }
    }
}
