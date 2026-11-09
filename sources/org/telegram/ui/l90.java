package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class l90 implements Runnable {
    public final int f47534a;
    public final ProfileActivity f47535b;

    public l90(ProfileActivity profileActivity, int i7) {
        this.f47534a = i7;
        this.f47535b = profileActivity;
    }

    @Override
    public final void run() {
        lw0 lw0Var;
        int i7 = this.f47534a;
        ProfileActivity profileActivity = this.f47535b;
        switch (i7) {
            case 0:
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null) {
                    xv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 1:
                xv0 xv0Var2 = profileActivity.N;
                if (xv0Var2 != null) {
                    xv0Var2.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.i3(new l90(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.g0.i3(new l90(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41840u2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(userFull.note, false));
                    org.telegram.messenger.camera.q.r(null, 2131744194, org.telegram.ui.Components.hc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f41723d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new pr(bundle, profileActivity.f41876z0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.V6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", profileActivity.f41723d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.V6;
                profileActivity.Q4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.V6;
                profileActivity.Q4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.c1());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.a1());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.V6;
                ?? obj = new Object();
                obj.f27408a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.V6;
                profileActivity.B4(true);
                if (profileActivity.f41760i2.isRunning()) {
                    profileActivity.f41760i2.cancel();
                }
                profileActivity.a5(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.V6;
                profileActivity.G5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.V6;
                profileActivity.U3();
                return;
            case 19:
                xv0 xv0Var3 = profileActivity.N;
                if (xv0Var3 != null) {
                    xv0Var3.P1(true);
                    profileActivity.N.E1();
                    return;
                }
                return;
            case 20:
                if (!profileActivity.f41698a.c0() && (lw0Var = profileActivity.d) != null) {
                    lw0Var.f();
                    return;
                }
                return;
            case 21:
                RectF rectF15 = ProfileActivity.V6;
                profileActivity.H3();
                return;
            case 22:
                RectF rectF16 = ProfileActivity.V6;
                profileActivity.G5(false, false);
                return;
            case 23:
                RectF rectF17 = ProfileActivity.V6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                return;
            case 24:
                profileActivity.A5.setVisibility(8);
                return;
            case 25:
                RectF rectF18 = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f41730e1);
                bundle2.putLong("user_id", profileActivity.f41723d1);
                profileActivity.presentFragment(new ai.s0(bundle2));
                return;
            case 26:
                RectF rectF19 = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 27:
                ProfileActivity.f0(profileActivity);
                return;
            default:
                profileActivity.X4(true);
                return;
        }
    }
}
