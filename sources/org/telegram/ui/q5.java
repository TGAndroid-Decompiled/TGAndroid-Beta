package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f49109a;
    public final Object f49110b;

    public q5(Object obj, int i7) {
        this.f49109a = i7;
        this.f49110b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.zg0 zg0Var;
        int i7 = this.f49109a;
        Object obj = this.f49110b;
        switch (i7) {
            case 0:
                ((r5) obj).f49381a.y0(false);
                return;
            case 1:
                ((o9) obj).f48330i1.onFragmentDestroy();
                return;
            case 2:
                bd bdVar = (bd) obj;
                if (!bdVar.f44284x.g()) {
                    bdVar.K.P(86);
                    bdVar.f44270n.d();
                    return;
                }
                bdVar.K.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.f3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.cc ccVar = ((org.telegram.ui.Components.cc[]) obj)[0];
                if (ccVar != null) {
                    ccVar.b();
                    return;
                }
                return;
            case 5:
                pn pnVar = (pn) obj;
                if (!pnVar.f48883s.g()) {
                    pnVar.R0.P(86);
                    pnVar.f48862b0.f29570e.d();
                    return;
                }
                pnVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f41225y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                d50 d50Var = (d50) obj;
                if (!d50Var.N.g()) {
                    d50Var.R.P(86);
                    d50Var.f44955f.d();
                    return;
                }
                d50Var.R.N(0, false, false);
                return;
            case 8:
                pc0 pc0Var = (pc0) obj;
                org.telegram.ui.Components.zg0 zg0Var2 = pc0Var.J;
                yc ycVar = pc0Var.f48787n;
                if (!pc0Var.M.g()) {
                    ycVar.setAnimation(zg0Var2);
                    zg0Var2.P(86);
                    ycVar.setOnAnimationEndListener(new bb0(pc0Var, 2));
                    ycVar.d();
                    return;
                }
                ycVar.setAnimation(zg0Var2);
                zg0Var2.N(0, false, false);
                pc0Var.L = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                return;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                return;
            case 11:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ((Runnable) obj).run();
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.f41667t0.g()) {
                    privacyControlActivity.f41668u0.P(86);
                    privacyControlActivity.f41669v0.f29570e.d();
                    return;
                }
                privacyControlActivity.f41668u0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f41803q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
                    if (ef0Var != null) {
                        org.telegram.ui.Components.bf0 i10 = org.telegram.ui.Components.ef0.i(14, ef0Var.f33267a);
                        if (i10 != null && (zg0Var = i10.f32178k) != null) {
                            zg0Var.start();
                        }
                    } else {
                        profileActivity.f41818s.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = profileActivity.L2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.U.N(0, false, false);
                profileActivity.V.N(0, false, false);
                return;
            case 14:
                ((q11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f41966b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f41967a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f42033r = null;
                themeActivity.h = null;
                themeActivity.f42028n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((fc1) obj).f45576t0.b();
                return;
        }
    }
}
