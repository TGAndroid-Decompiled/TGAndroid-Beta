package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f40689a;
    public final Object f40690b;

    public q5(Object obj, int i10) {
        this.f40689a = i10;
        this.f40690b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ci0 ci0Var;
        int i10 = this.f40689a;
        Object obj = this.f40690b;
        switch (i10) {
            case 0:
                ((r5) obj).f40970a.y0(false);
                return;
            case 1:
                ((p9) obj).f40424i1.onFragmentDestroy();
                return;
            case 2:
                kd kdVar = (kd) obj;
                if (!kdVar.f38836x.g()) {
                    kdVar.K.P(86);
                    kdVar.f38822n.d();
                    return;
                }
                kdVar.K.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.b3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.wb wbVar = ((org.telegram.ui.Components.wb[]) obj)[0];
                if (wbVar != null) {
                    wbVar.b();
                    return;
                }
                return;
            case 5:
                oo ooVar = (oo) obj;
                if (!ooVar.f40226s.g()) {
                    ooVar.R0.P(86);
                    ooVar.f40206b0.e.d();
                    return;
                }
                ooVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33328y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                b60 b60Var = (b60) obj;
                if (!b60Var.N.g()) {
                    b60Var.R.P(86);
                    b60Var.f35956f.d();
                    return;
                }
                b60Var.R.N(0, false, false);
                return;
            case 8:
                vd0 vd0Var = (vd0) obj;
                org.telegram.ui.Components.ci0 ci0Var2 = vd0Var.I;
                hd hdVar = vd0Var.f42497n;
                if (!vd0Var.L.g()) {
                    hdVar.setAnimation(ci0Var2);
                    ci0Var2.P(86);
                    hdVar.setOnAnimationEndListener(new jc0(vd0Var, 2));
                    hdVar.d();
                    return;
                }
                hdVar.setAnimation(ci0Var2);
                ci0Var2.N(0, false, false);
                vd0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f33753r0.g()) {
                    privacyControlActivity.f33755s0.P(86);
                    privacyControlActivity.f33756t0.e.d();
                    return;
                }
                privacyControlActivity.f33755s0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f33891q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i11 = org.telegram.ui.Components.hg0.i(14, hg0Var.f26788a);
                        if (i11 != null && (ci0Var = i11.f25819k) != null) {
                            ci0Var.start();
                        }
                    } else {
                        profileActivity.f33905s.d();
                    }
                    org.telegram.ui.Cells.p8 p8Var = profileActivity.L2;
                    if (p8Var != null) {
                        p8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.U.N(0, false, false);
                profileActivity.V.N(0, false, false);
                return;
            case 14:
                ((g31) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i12 = ShareActivity.f34051b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34052a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34115r = null;
                themeActivity.h = null;
                themeActivity.f34110n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((zd1) obj).f43973u0.b();
                return;
        }
    }
}
