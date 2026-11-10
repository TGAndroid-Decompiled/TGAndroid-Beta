package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q5 implements DialogInterface.OnDismissListener {
    public final int f48961a;
    public final Object f48962b;

    public q5(Object obj, int i7) {
        this.f48961a = i7;
        this.f48962b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.zg0 zg0Var;
        int i7 = this.f48961a;
        Object obj = this.f48962b;
        switch (i7) {
            case 0:
                ((r5) obj).f49248a.y0(false);
                return;
            case 1:
                ((o9) obj).l1.onFragmentDestroy();
                return;
            case 2:
                bd bdVar = (bd) obj;
                if (!bdVar.f44039x.g()) {
                    bdVar.K.P(86);
                    bdVar.f44025n.d();
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
                org.telegram.ui.Components.bc bcVar = ((org.telegram.ui.Components.bc[]) obj)[0];
                if (bcVar != null) {
                    bcVar.b();
                    return;
                }
                return;
            case 5:
                rn rnVar = (rn) obj;
                if (!rnVar.f49471s.g()) {
                    rnVar.R0.P(86);
                    rnVar.f49450b0.f29585e.d();
                    return;
                }
                rnVar.R0.N(0, false, false);
                return;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.f41223y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 7:
                g50 g50Var = (g50) obj;
                if (!g50Var.N.g()) {
                    g50Var.R.P(86);
                    g50Var.f45982f.d();
                    return;
                }
                g50Var.R.N(0, false, false);
                return;
            case 8:
                sc0 sc0Var = (sc0) obj;
                org.telegram.ui.Components.zg0 zg0Var2 = sc0Var.J;
                yc ycVar = sc0Var.f49824n;
                if (!sc0Var.M.g()) {
                    ycVar.setAnimation(zg0Var2);
                    zg0Var2.P(86);
                    ycVar.setOnAnimationEndListener(new eb0(sc0Var, 2));
                    ycVar.d();
                    return;
                }
                ycVar.setAnimation(zg0Var2);
                zg0Var2.N(0, false, false);
                sc0Var.L = true;
                return;
            case 9:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
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
                if (!privacyControlActivity.f41665t0.g()) {
                    privacyControlActivity.f41666u0.P(86);
                    privacyControlActivity.f41667v0.f29585e.d();
                    return;
                }
                privacyControlActivity.f41666u0.N(0, false, false);
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.f41801q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
                    if (ef0Var != null) {
                        org.telegram.ui.Components.bf0 i10 = org.telegram.ui.Components.ef0.i(14, ef0Var.f33234a);
                        if (i10 != null && (zg0Var = i10.f32237k) != null) {
                            zg0Var.start();
                        }
                    } else {
                        profileActivity.f41816s.d();
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
                ((t11) obj).w(0.0f);
                return;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.f41964b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.f41965a = null;
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.f42031r = null;
                themeActivity.h = null;
                themeActivity.f42026n = null;
                return;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            default:
                ((jc1) obj).f46944t0.b();
                return;
        }
    }
}
