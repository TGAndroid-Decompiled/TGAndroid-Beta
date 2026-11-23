package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class n90 implements Runnable {
    public final int f50144a;
    public final ProfileActivity f50145b;

    public n90(ProfileActivity profileActivity, int i7) {
        this.f50144a = i7;
        this.f50145b = profileActivity;
    }

    @Override
    public final void run() {
        lw0 lw0Var;
        int i7 = this.f50144a;
        ProfileActivity profileActivity = this.f50145b;
        switch (i7) {
            case 0:
                wv0 wv0Var = profileActivity.O;
                if (wv0Var != null) {
                    wv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 1:
                wv0 wv0Var2 = profileActivity.O;
                if (wv0Var2 != null) {
                    wv0Var2.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new n90(profileActivity, 0), 200L);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new n90(profileActivity, 1), 200L);
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f43675w2;
                if (userFull != null) {
                    org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(userFull.note, false));
                    org.telegram.messenger.o10.t(null, 2131743953, org.telegram.ui.Components.lc.b0(profileActivity));
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.f43550e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new qr(bundle, profileActivity.A0));
                return;
            case 6:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getSendMessagesHelper().r0(org.telegram.messenger.yy.b("/start", profileActivity.f43550e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.Q4(false);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.Q4(true);
                return;
            case 10:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.f1());
                return;
            case 11:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new kg.d1());
                return;
            case 12:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new la(null));
                return;
            case 13:
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 15:
                RectF rectF11 = ProfileActivity.Z6;
                ?? obj = new Object();
                obj.f28871a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF12 = ProfileActivity.Z6;
                profileActivity.B4(true);
                if (profileActivity.f43593k2.isRunning()) {
                    profileActivity.f43593k2.cancel();
                }
                profileActivity.a5(1.0f);
                return;
            case 17:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.H5(false, false);
                return;
            case 18:
                RectF rectF14 = ProfileActivity.Z6;
                profileActivity.U3();
                return;
            case 19:
                wv0 wv0Var3 = profileActivity.O;
                if (wv0Var3 != null) {
                    wv0Var3.P1(true);
                    profileActivity.O.E1();
                    return;
                }
                return;
            case 20:
                if (!profileActivity.f43518a.c0() && (lw0Var = profileActivity.d) != null) {
                    lw0Var.f();
                    return;
                }
                return;
            case 21:
                RectF rectF15 = ProfileActivity.Z6;
                profileActivity.H3();
                return;
            case 22:
                RectF rectF16 = ProfileActivity.Z6;
                profileActivity.H5(false, false);
                return;
            case 23:
                RectF rectF17 = ProfileActivity.Z6;
                profileActivity.getMessagesController().k4(profileActivity.a());
                return;
            case 24:
                profileActivity.E5.setVisibility(8);
                return;
            case 25:
                RectF rectF18 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f43558f1);
                bundle2.putLong("user_id", profileActivity.f43550e1);
                profileActivity.presentFragment(new ci.j0(bundle2));
                return;
            case 26:
                RectF rectF19 = ProfileActivity.Z6;
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
