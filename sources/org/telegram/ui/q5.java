package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f51100a;
    public final Object f51101b;

    public q5(Object obj, int i7) {
        this.f51100a = i7;
        this.f51101b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.mh0 mh0Var;
        int i7 = this.f51100a;
        Object obj = this.f51101b;
        switch (i7) {
            case 0:
                ((r5) obj).f51497a.y0(false);
                return;
            case 1:
                ((p9) obj).f50826m1.onFragmentDestroy();
                return;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.f45569x.g()) {
                    adVar.L.P(86);
                    adVar.f45555n.d();
                    return;
                }
                adVar.L.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.h3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.gc gcVar = ((org.telegram.ui.Components.gc[]) obj)[0];
                if (gcVar != null) {
                    gcVar.b();
                    return;
                }
                return;
            case 5:
                rn rnVar = (rn) obj;
                if (!rnVar.f51699s.g()) {
                    rnVar.S0.P(86);
                    rnVar.f51680c0.f31082e.d();
                    return;
                }
                rnVar.S0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f43038y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                f50 f50Var = (f50) obj;
                if (!f50Var.O.g()) {
                    f50Var.S.P(86);
                    f50Var.f47569f.d();
                    return;
                }
                f50Var.S.N(0, false, false);
                return;
            case 8:
                oc0 oc0Var = (oc0) obj;
                org.telegram.ui.Components.mh0 mh0Var2 = oc0Var.K;
                xc xcVar = oc0Var.f50581n;
                if (!oc0Var.N.g()) {
                    xcVar.setAnimation(mh0Var2);
                    mh0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new bb0(oc0Var, 2));
                    xcVar.d();
                    return;
                }
                xcVar.setAnimation(mh0Var2);
                mh0Var2.N(0, false, false);
                oc0Var.M = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
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
                if (!privacyControlActivity.f43483u0.g()) {
                    privacyControlActivity.f43484v0.P(86);
                    privacyControlActivity.f43486w0.f31082e.d();
                    return;
                }
                privacyControlActivity.f43484v0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f43628r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.rf0 rf0Var = profileActivity.f43509a0;
                    if (rf0Var != null) {
                        org.telegram.ui.Components.of0 i10 = org.telegram.ui.Components.rf0.i(14, rf0Var.f39117a);
                        if (i10 != null && (mh0Var = i10.f38085k) != null) {
                            mh0Var.start();
                        }
                    } else {
                        profileActivity.f43635s.d();
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
                ((r11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f43784b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f43785a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f43852r = null;
                themeActivity.h = null;
                themeActivity.f43847n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((hc1) obj).f48370u0.b();
                return;
        }
    }
}
