package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class g90 implements Runnable {
    public final int f45607a;
    public final ProfileActivity f45608b;

    public g90(ProfileActivity profileActivity, int i3) {
        this.f45607a = i3;
        this.f45608b = profileActivity;
    }

    @Override
    public final void run() {
        bw0 bw0Var;
        int i3 = this.f45607a;
        ProfileActivity profileActivity = this.f45608b;
        switch (i3) {
            case 0:
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null) {
                    mv0Var.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 1:
                mv0 mv0Var2 = profileActivity.O;
                if (mv0Var2 != null) {
                    mv0Var2.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.i3(new g90(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.g0.i3(new g90(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41868v2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.zi.h0(userFull.note, false));
                    org.telegram.messenger.camera.q.r(null, 2131744204, org.telegram.ui.Components.fc.a0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f41751e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new lr(bundle, profileActivity.A0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/start", profileActivity.f41751e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.T6;
                profileActivity.N4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.T6;
                profileActivity.N4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new lg.d1());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new lg.b1());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ka(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.T6;
                ?? obj = new Object();
                obj.f27395a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.T6;
                profileActivity.y4(true);
                if (profileActivity.f41787j2.isRunning()) {
                    profileActivity.f41787j2.cancel();
                }
                profileActivity.X4(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.T6;
                profileActivity.D5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.T6;
                profileActivity.U3();
                return;
            case 19:
                mv0 mv0Var3 = profileActivity.O;
                if (mv0Var3 != null) {
                    mv0Var3.N1(true);
                    profileActivity.O.C1();
                    return;
                }
                return;
            case 20:
                RectF rectF15 = ProfileActivity.T6;
                profileActivity.getMessagesController().c4(profileActivity.a());
                return;
            case 21:
                if (!profileActivity.f41719a.c0() && (bw0Var = profileActivity.d) != null) {
                    bw0Var.f();
                    return;
                }
                return;
            case 22:
                RectF rectF16 = ProfileActivity.T6;
                profileActivity.H3();
                return;
            case 23:
                RectF rectF17 = ProfileActivity.T6;
                profileActivity.D5(false, false);
                return;
            case 24:
                RectF rectF18 = ProfileActivity.T6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f41759f1);
                bundle2.putLong("user_id", profileActivity.f41751e1);
                profileActivity.presentFragment(new bi.j0(bundle2));
                return;
            case 25:
                profileActivity.f41902z5.setVisibility(8);
                return;
            case 26:
                RectF rectF19 = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ka(null));
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
