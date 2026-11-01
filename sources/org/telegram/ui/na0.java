package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class na0 implements Runnable {
    public final int f39789a;
    public final ProfileActivity f39790b;

    public na0(ProfileActivity profileActivity, int i10) {
        this.f39789a = i10;
        this.f39790b = profileActivity;
    }

    @Override
    public final void run() {
        wx0 wx0Var;
        int i10 = this.f39789a;
        ProfileActivity profileActivity = this.f39790b;
        switch (i10) {
            case 0:
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null) {
                    hx0Var.g1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 1:
                hx0 hx0Var2 = profileActivity.N;
                if (hx0Var2 != null) {
                    hx0Var2.g1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.h3(new na0(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.i0.h3(new na0(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f33922u2;
                if (userFull != null) {
                    org.telegram.messenger.i0.g(org.telegram.messenger.kj.h0(userFull.note, false));
                    org.telegram.messenger.a30.r(null, 2131744219, org.telegram.ui.Components.cc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f33803d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new ns(bundle, profileActivity.f33957z0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.pz.b("/start", profileActivity.f33803d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.N4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.N4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.h2());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ag.f2());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new f(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.S6;
                ?? obj = new Object();
                obj.f20390a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.S6;
                profileActivity.y4(true);
                if (profileActivity.f33840i2.isRunning()) {
                    profileActivity.f33840i2.cancel();
                }
                profileActivity.X4(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.S6;
                profileActivity.D5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.S6;
                profileActivity.U3();
                return;
            case 19:
                hx0 hx0Var3 = profileActivity.N;
                if (hx0Var3 != null) {
                    hx0Var3.L1(true);
                    profileActivity.N.A1();
                    return;
                }
                return;
            case 20:
                RectF rectF15 = ProfileActivity.S6;
                profileActivity.getMessagesController().Z3(profileActivity.a());
                return;
            case 21:
                if (!profileActivity.f33779a.c0() && (wx0Var = profileActivity.d) != null) {
                    wx0Var.f();
                    return;
                }
                return;
            case 22:
                RectF rectF16 = ProfileActivity.S6;
                profileActivity.H3();
                return;
            case 23:
                RectF rectF17 = ProfileActivity.S6;
                profileActivity.D5(false, false);
                return;
            case 24:
                RectF rectF18 = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f33810e1);
                bundle2.putLong("user_id", profileActivity.f33803d1);
                profileActivity.presentFragment(new qh.i0(bundle2));
                return;
            case 25:
                profileActivity.f33955y5.setVisibility(8);
                return;
            case 26:
                RectF rectF19 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new oa(null));
                return;
            case 27:
                ProfileActivity.g0(profileActivity);
                return;
            default:
                profileActivity.U4(true);
                return;
        }
    }
}
