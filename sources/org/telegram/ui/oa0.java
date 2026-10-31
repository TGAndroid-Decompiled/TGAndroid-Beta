package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class oa0 implements Runnable {
    public final int f40215a;
    public final ProfileActivity f40216b;

    public oa0(ProfileActivity profileActivity, int i10) {
        this.f40215a = i10;
        this.f40216b = profileActivity;
    }

    @Override
    public final void run() {
        xx0 xx0Var;
        int i10 = this.f40215a;
        ProfileActivity profileActivity = this.f40216b;
        switch (i10) {
            case 0:
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null) {
                    ix0Var.f1(14);
                    profileActivity.T4(false);
                    return;
                }
                return;
            case 1:
                ix0 ix0Var2 = profileActivity.N;
                if (ix0Var2 != null) {
                    ix0Var2.f1(14);
                    profileActivity.T4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.h3(new oa0(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.i0.h3(new oa0(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f33915u2;
                if (userFull != null) {
                    org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(userFull.note, false));
                    org.telegram.messenger.z20.r(null, 2131744219, org.telegram.ui.Components.cc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f33796d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new ns(bundle, profileActivity.f33950z0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/start", profileActivity.f33796d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.R6;
                profileActivity.M4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.R6;
                profileActivity.M4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.h2());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.f2());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new f(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.R6;
                ?? obj = new Object();
                obj.f20389a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.R6;
                profileActivity.x4(true);
                if (profileActivity.f33833i2.isRunning()) {
                    profileActivity.f33833i2.cancel();
                }
                profileActivity.W4(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.R6;
                profileActivity.C5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.R6;
                profileActivity.T3();
                return;
            case 19:
                ix0 ix0Var3 = profileActivity.N;
                if (ix0Var3 != null) {
                    ix0Var3.K1(true);
                    profileActivity.N.z1();
                    return;
                }
                return;
            case 20:
                RectF rectF15 = ProfileActivity.R6;
                profileActivity.getMessagesController().Z3(profileActivity.a());
                return;
            case 21:
                if (!profileActivity.f33772a.c0() && (xx0Var = profileActivity.d) != null) {
                    xx0Var.f();
                    return;
                }
                return;
            case 22:
                RectF rectF16 = ProfileActivity.R6;
                profileActivity.G3();
                return;
            case 23:
                RectF rectF17 = ProfileActivity.R6;
                profileActivity.C5(false, false);
                return;
            case 24:
                RectF rectF18 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f33803e1);
                bundle2.putLong("user_id", profileActivity.f33796d1);
                profileActivity.presentFragment(new qh.i0(bundle2));
                return;
            case 25:
                profileActivity.f33948y5.setVisibility(8);
                return;
            case 26:
                RectF rectF19 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                return;
            case 27:
                ProfileActivity.f0(profileActivity);
                return;
            default:
                profileActivity.T4(true);
                return;
        }
    }
}
