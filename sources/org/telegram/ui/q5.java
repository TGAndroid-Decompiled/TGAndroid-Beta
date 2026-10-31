package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f40870a;
    public final Object f40871b;

    public q5(Object obj, int i10) {
        this.f40870a = i10;
        this.f40871b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.bi0 bi0Var;
        int i10 = this.f40870a;
        Object obj = this.f40871b;
        switch (i10) {
            case 0:
                ((r5) obj).f41134a.x0(false);
                return;
            case 1:
                ((p9) obj).f40537i1.onFragmentDestroy();
                return;
            case 2:
                kd kdVar = (kd) obj;
                if (!kdVar.f38773x.g()) {
                    kdVar.K.P(86);
                    kdVar.f38759n.d();
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
                if (!ooVar.f40337s.g()) {
                    ooVar.R0.P(86);
                    ooVar.f40317b0.e.d();
                    return;
                }
                ooVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33321y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                c60 c60Var = (c60) obj;
                if (!c60Var.N.g()) {
                    c60Var.R.P(86);
                    c60Var.f36394f.d();
                    return;
                }
                c60Var.R.N(0, false, false);
                return;
            case 8:
                wd0 wd0Var = (wd0) obj;
                org.telegram.ui.Components.bi0 bi0Var2 = wd0Var.I;
                hd hdVar = wd0Var.f42946n;
                if (!wd0Var.L.g()) {
                    hdVar.setAnimation(bi0Var2);
                    bi0Var2.P(86);
                    hdVar.setOnAnimationEndListener(new kc0(wd0Var, 2));
                    hdVar.d();
                    return;
                }
                hdVar.setAnimation(bi0Var2);
                bi0Var2.N(0, false, false);
                wd0Var.K = true;
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
                if (!privacyControlActivity.f33746r0.g()) {
                    privacyControlActivity.f33748s0.P(86);
                    privacyControlActivity.f33749t0.e.d();
                    return;
                }
                privacyControlActivity.f33748s0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f33884q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i11 = org.telegram.ui.Components.hg0.i(14, hg0Var.f26730a);
                        if (i11 != null && (bi0Var = i11.f25785k) != null) {
                            bi0Var.start();
                        }
                    } else {
                        profileActivity.f33898s.d();
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
                ((i31) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i12 = ShareActivity.f34044b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34045a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34108r = null;
                themeActivity.h = null;
                themeActivity.f34103n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((be1) obj).f36234u0.b();
                return;
        }
    }
}
