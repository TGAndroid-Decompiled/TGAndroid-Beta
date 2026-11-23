package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f51002a;
    public final Object f51003b;

    public q5(Object obj, int i7) {
        this.f51002a = i7;
        this.f51003b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.oh0 oh0Var;
        int i7 = this.f51002a;
        Object obj = this.f51003b;
        switch (i7) {
            case 0:
                ((r5) obj).f51481a.y0(false);
                return;
            case 1:
                ((p9) obj).f50793m1.onFragmentDestroy();
                return;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.f45573x.g()) {
                    adVar.L.P(86);
                    adVar.f45559n.d();
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
                    rnVar.f51680c0.f31134e.d();
                    return;
                }
                rnVar.S0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f43048y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                f50 f50Var = (f50) obj;
                if (!f50Var.O.g()) {
                    f50Var.S.P(86);
                    f50Var.f47559f.d();
                    return;
                }
                f50Var.S.N(0, false, false);
                return;
            case 8:
                pc0 pc0Var = (pc0) obj;
                org.telegram.ui.Components.oh0 oh0Var2 = pc0Var.K;
                xc xcVar = pc0Var.f50826n;
                if (!pc0Var.N.g()) {
                    xcVar.setAnimation(oh0Var2);
                    oh0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new cb0(pc0Var, 2));
                    xcVar.d();
                    return;
                }
                xcVar.setAnimation(oh0Var2);
                oh0Var2.N(0, false, false);
                pc0Var.M = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
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
                if (!privacyControlActivity.f43493u0.g()) {
                    privacyControlActivity.f43494v0.P(86);
                    privacyControlActivity.f43496w0.f31134e.d();
                    return;
                }
                privacyControlActivity.f43494v0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f43638r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.tf0 tf0Var = profileActivity.f43519a0;
                    if (tf0Var != null) {
                        org.telegram.ui.Components.qf0 i10 = org.telegram.ui.Components.tf0.i(14, tf0Var.f39837a);
                        if (i10 != null && (oh0Var = i10.f38857k) != null) {
                            oh0Var.start();
                        }
                    } else {
                        profileActivity.f43645s.d();
                    }
                    org.telegram.ui.Cells.n8 n8Var = profileActivity.N2;
                    if (n8Var != null) {
                        n8Var.getImageView().d();
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
                int i11 = ShareActivity.f43794b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f43795a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f43862r = null;
                themeActivity.h = null;
                themeActivity.f43857n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((hc1) obj).f48333u0.b();
                return;
        }
    }
}
