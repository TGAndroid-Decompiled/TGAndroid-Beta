package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f41073a;
    public final Object f41074b;

    public q5(Object obj, int i10) {
        this.f41073a = i10;
        this.f41074b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.dk0 dk0Var;
        int i10 = this.f41073a;
        Object obj = this.f41074b;
        switch (i10) {
            case 0:
                ((r5) obj).f41354a.x0(false);
                return;
            case 1:
                ((p9) obj).f40821b.onFragmentDestroy();
                return;
            case 2:
                ld ldVar = (ld) obj;
                if (!ldVar.v.g()) {
                    ldVar.J.P(86);
                    ldVar.h.d();
                    return;
                }
                ldVar.J.N(0, false, false);
                return;
            case 3:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                if (u1Var != null) {
                    u1Var.F3(-1);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.sc scVar = ((org.telegram.ui.Components.sc[]) obj)[0];
                if (scVar != null) {
                    scVar.b();
                    return;
                }
                return;
            case 5:
                uo uoVar = (uo) obj;
                if (!uoVar.f42712s.g()) {
                    uoVar.R0.P(86);
                    uoVar.f42691b0.f22748e.d();
                    return;
                }
                uoVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f33811x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                j70 j70Var = (j70) obj;
                if (!j70Var.N.g()) {
                    j70Var.R.P(86);
                    j70Var.f38900f.d();
                    return;
                }
                j70Var.R.N(0, false, false);
                return;
            case 8:
                ff0 ff0Var = (ff0) obj;
                org.telegram.ui.Components.dk0 dk0Var2 = ff0Var.I;
                id idVar = ff0Var.f37701n;
                if (!ff0Var.L.g()) {
                    idVar.setAnimation(dk0Var2);
                    dk0Var2.P(86);
                    idVar.setOnAnimationEndListener(new sd0(ff0Var, 2));
                    idVar.d();
                    return;
                }
                idVar.setAnimation(dk0Var2);
                dk0Var2.N(0, false, false);
                ff0Var.K = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
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
                if (!privacyControlActivity.f34248s0.g()) {
                    privacyControlActivity.f34249t0.P(86);
                    privacyControlActivity.f34250u0.f22748e.d();
                    return;
                }
                privacyControlActivity.f34249t0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f34385q0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ji0 ji0Var = profileActivity.f34274a0;
                    if (ji0Var != null) {
                        org.telegram.ui.Components.gi0 j3 = org.telegram.ui.Components.ji0.j(14, ji0Var.f27749a);
                        if (j3 != null && (dk0Var = j3.f26758k) != null) {
                            dk0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.M2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                profileActivity.V.N(0, false, false);
                profileActivity.W.N(0, false, false);
                return;
            case 14:
                ((j71) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f34546b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f34547a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f34613r = null;
                themeActivity.h = null;
                themeActivity.f34608n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((ui1) obj).f42650u0.b();
                return;
        }
    }
}
