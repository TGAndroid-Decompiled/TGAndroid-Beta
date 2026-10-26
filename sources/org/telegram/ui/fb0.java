package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fb0 implements Runnable {
    public final int f39331a;
    public final ProfileActivity f39332b;

    public fb0(ProfileActivity profileActivity, int i10) {
        this.f39331a = i10;
        this.f39332b = profileActivity;
    }

    @Override
    public final void run() {
        j01 j01Var;
        int i10 = this.f39331a;
        ProfileActivity profileActivity = this.f39332b;
        switch (i10) {
            case 0:
                vz0 vz0Var = profileActivity.N;
                if (vz0Var != null) {
                    vz0Var.e1(14);
                    profileActivity.O4(false);
                    return;
                }
                return;
            case 1:
                vz0 vz0Var2 = profileActivity.N;
                if (vz0Var2 != null) {
                    vz0Var2.e1(14);
                    profileActivity.O4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fb0(profileActivity, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fb0(profileActivity, 1), 200L);
                return;
            case 4:
                int i11 = ProfileActivity.R6;
                profileActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity.f35979e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                int i12 = ProfileActivity.R6;
                profileActivity.H4(false);
                return;
            case 6:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 7:
                int i14 = ProfileActivity.R6;
                profileActivity.H4(true);
                return;
            case 8:
                int i15 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new jg.h1());
                return;
            case 9:
                int i16 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new jg.d1());
                return;
            case 10:
                int i17 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ta(null));
                return;
            case 11:
                int i18 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 12:
                int i19 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                return;
            case 13:
                profileActivity.presentFragment(un.ba(profileActivity.f35979e1));
                return;
            case 14:
                int i20 = ProfileActivity.R6;
                ?? obj = new Object();
                obj.f22928a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 15:
                int i21 = ProfileActivity.R6;
                profileActivity.r4(true);
                if (profileActivity.f36016j2.isRunning()) {
                    profileActivity.f36016j2.cancel();
                }
                profileActivity.R4(1.0f);
                return;
            case 16:
                int i22 = ProfileActivity.R6;
                profileActivity.p5(false, false);
                return;
            case 17:
                int i23 = ProfileActivity.R6;
                profileActivity.N3();
                return;
            case 18:
                vz0 vz0Var3 = profileActivity.N;
                if (vz0Var3 != null) {
                    vz0Var3.J1(true);
                    profileActivity.N.y1();
                    return;
                }
                return;
            case 19:
                if (!profileActivity.f35948a.c0() && (j01Var = profileActivity.d) != null) {
                    j01Var.l();
                    return;
                }
                return;
            case 20:
                int i24 = ProfileActivity.R6;
                profileActivity.getMessagesController().reloadUser(profileActivity.a());
                return;
            case 21:
                int i25 = ProfileActivity.R6;
                profileActivity.p5(false, false);
                return;
            case 22:
                int i26 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f35987f1);
                bundle.putLong("user_id", profileActivity.f35979e1);
                profileActivity.presentFragment(new ai.z0(bundle));
                return;
            case 23:
                int i27 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ta(null));
                return;
            case 24:
                ProfileActivity.W(profileActivity);
                return;
            case 25:
                profileActivity.E5.setVisibility(8);
                return;
            case 26:
                TLRPC.UserFull userFull = profileActivity.f36098v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.vh.m(R.string.TextCopied, org.telegram.ui.Components.wc.b0(profileActivity));
                    return;
                }
                return;
            case 27:
                int i28 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity.f35979e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new js(bundle2, profileActivity.f36126z0));
                return;
            default:
                profileActivity.O4(true);
                return;
        }
    }
}
