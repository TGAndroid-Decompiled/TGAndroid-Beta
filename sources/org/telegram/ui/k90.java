package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class k90 implements Runnable {
    public final int f48604a;
    public final ProfileActivity f48605b;

    public k90(ProfileActivity profileActivity, int i7) {
        this.f48604a = i7;
        this.f48605b = profileActivity;
    }

    @Override
    public final void run() {
        iw0 iw0Var;
        int i7 = this.f48604a;
        ProfileActivity profileActivity = this.f48605b;
        switch (i7) {
            case 0:
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.W4(false);
                    return;
                }
                return;
            case 1:
                uv0 uv0Var2 = profileActivity.O;
                if (uv0Var2 != null) {
                    uv0Var2.k1(14);
                    profileActivity.W4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.i3(new k90(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.g0.i3(new k90(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f43219w2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(userFull.note, false));
                    org.telegram.messenger.i20.s(null, 2131744194, org.telegram.ui.Components.cc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f43094e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new pr(bundle, profileActivity.A0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/start", profileActivity.f43094e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.P4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.X6;
                profileActivity.P4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.c1());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.a1());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.X6;
                ?? obj = new Object();
                obj.f28476a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.X6;
                profileActivity.A4(true);
                if (profileActivity.f43137k2.isRunning()) {
                    profileActivity.f43137k2.cancel();
                }
                profileActivity.Z4(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.X6;
                profileActivity.G5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.X6;
                profileActivity.T3();
                return;
            case 19:
                uv0 uv0Var3 = profileActivity.O;
                if (uv0Var3 != null) {
                    uv0Var3.P1(true);
                    profileActivity.O.E1();
                    return;
                }
                return;
            case 20:
                if (!profileActivity.f43062a.c0() && (iw0Var = profileActivity.d) != null) {
                    iw0Var.f();
                    return;
                }
                return;
            case 21:
                RectF rectF15 = ProfileActivity.X6;
                profileActivity.G3();
                return;
            case 22:
                RectF rectF16 = ProfileActivity.X6;
                profileActivity.G5(false, false);
                return;
            case 23:
                RectF rectF17 = ProfileActivity.X6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                return;
            case 24:
                profileActivity.C5.setVisibility(8);
                return;
            case 25:
                RectF rectF18 = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f43102f1);
                bundle2.putLong("user_id", profileActivity.f43094e1);
                profileActivity.presentFragment(new ci.i0(bundle2));
                return;
            case 26:
                RectF rectF19 = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 27:
                ProfileActivity.f0(profileActivity);
                return;
            default:
                profileActivity.W4(true);
                return;
        }
    }
}
