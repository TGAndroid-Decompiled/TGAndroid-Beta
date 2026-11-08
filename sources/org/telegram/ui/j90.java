package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class j90 implements Runnable {
    public final int f46907a;
    public final ProfileActivity f46908b;

    public j90(ProfileActivity profileActivity, int i7) {
        this.f46907a = i7;
        this.f46908b = profileActivity;
    }

    @Override
    public final void run() {
        jw0 jw0Var;
        int i7 = this.f46907a;
        ProfileActivity profileActivity = this.f46908b;
        switch (i7) {
            case 0:
                vv0 vv0Var = profileActivity.N;
                if (vv0Var != null) {
                    vv0Var.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 1:
                vv0 vv0Var2 = profileActivity.N;
                if (vv0Var2 != null) {
                    vv0Var2.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.i3(new j90(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.g0.i3(new j90(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41833u2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(userFull.note, false));
                    org.telegram.messenger.camera.q.r(null, 2131744197, org.telegram.ui.Components.hc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f41716d1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new nr(bundle, profileActivity.f41869z0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", profileActivity.f41716d1, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                profileActivity.presentFragment(new kg.c1());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.a1());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.S6;
                ?? obj = new Object();
                obj.f27424a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.S6;
                profileActivity.y4(true);
                if (profileActivity.f41753i2.isRunning()) {
                    profileActivity.f41753i2.cancel();
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
                vv0 vv0Var3 = profileActivity.N;
                if (vv0Var3 != null) {
                    vv0Var3.N1(true);
                    profileActivity.N.C1();
                    return;
                }
                return;
            case 20:
                RectF rectF15 = ProfileActivity.S6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                return;
            case 21:
                if (!profileActivity.f41691a.c0() && (jw0Var = profileActivity.d) != null) {
                    jw0Var.f();
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
                bundle2.putLong("chat_id", profileActivity.f41723e1);
                bundle2.putLong("user_id", profileActivity.f41716d1);
                profileActivity.presentFragment(new ai.s0(bundle2));
                return;
            case 25:
                profileActivity.f41867y5.setVisibility(8);
                return;
            case 26:
                RectF rectF19 = ProfileActivity.S6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
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
