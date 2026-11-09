package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f48915a;
    public final Object f48916b;

    public q5(Object obj, int i7) {
        this.f48915a = i7;
        this.f48916b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ah0 ah0Var;
        int i7 = this.f48915a;
        Object obj = this.f48916b;
        switch (i7) {
            case 0:
                ((r5) obj).f49277a.y0(false);
                return;
            case 1:
                ((o9) obj).f48410i1.onFragmentDestroy();
                return;
            case 2:
                bd bdVar = (bd) obj;
                if (!bdVar.f44010x.g()) {
                    bdVar.K.P(86);
                    bdVar.f43996n.d();
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
                rn rnVar = (rn) obj;
                if (!rnVar.f49533s.g()) {
                    rnVar.R0.P(86);
                    rnVar.f49512b0.f29574e.d();
                    return;
                }
                rnVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f41232y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                f50 f50Var = (f50) obj;
                if (!f50Var.N.g()) {
                    f50Var.R.P(86);
                    f50Var.f45588f.d();
                    return;
                }
                f50Var.R.N(0, false, false);
                return;
            case 8:
                rc0 rc0Var = (rc0) obj;
                org.telegram.ui.Components.ah0 ah0Var2 = rc0Var.J;
                yc ycVar = rc0Var.f49446n;
                if (!rc0Var.M.g()) {
                    ycVar.setAnimation(ah0Var2);
                    ah0Var2.P(86);
                    ycVar.setOnAnimationEndListener(new db0(rc0Var, 2));
                    ycVar.d();
                    return;
                }
                ycVar.setAnimation(ah0Var2);
                ah0Var2.N(0, false, false);
                rc0Var.L = true;
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
                if (!privacyControlActivity.f41674t0.g()) {
                    privacyControlActivity.f41675u0.P(86);
                    privacyControlActivity.f41676v0.f29574e.d();
                    return;
                }
                privacyControlActivity.f41675u0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f41810q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ff0 ff0Var = profileActivity.Z;
                    if (ff0Var != null) {
                        org.telegram.ui.Components.cf0 i10 = org.telegram.ui.Components.ff0.i(14, ff0Var.f33648a);
                        if (i10 != null && (ah0Var = i10.f32661k) != null) {
                            ah0Var.start();
                        }
                    } else {
                        profileActivity.f41825s.d();
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
                ((s11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f41973b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f41974a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f42040r = null;
                themeActivity.h = null;
                themeActivity.f42035n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ic1) obj).f46608t0.b();
                return;
        }
    }
}
