package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ac0 implements Runnable {
    public final int f31823a;
    public final ProfileActivity f31824b;

    public ac0(ProfileActivity profileActivity, int i10) {
        this.f31823a = i10;
        this.f31824b = profileActivity;
    }

    @Override
    public final void run() {
        b11 b11Var;
        switch (this.f31823a) {
            case 0:
                ProfileActivity profileActivity = this.f31824b;
                n01 n01Var = profileActivity.O;
                if (n01Var != null) {
                    n01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f31824b;
                n01 n01Var2 = profileActivity2.O;
                if (n01Var2 != null) {
                    n01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ac0(this.f31824b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ac0(this.f31824b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f31824b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f31286e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f31824b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f31824b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f31824b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f31824b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new hg.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f31824b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new hg.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f31824b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new sa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f31824b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f31824b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f19398a = true;
                this.f31824b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f31824b;
                profileActivity10.k4(true);
                if (profileActivity10.f31323j2.isRunning()) {
                    profileActivity10.f31323j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f31824b.e5(false, false);
                return;
            case 16:
                this.f31824b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f31824b;
                n01 n01Var3 = profileActivity11.O;
                if (n01Var3 != null) {
                    n01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f31824b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f31824b;
                if (!profileActivity13.f31255a.c0() && (b11Var = profileActivity13.d) != null) {
                    b11Var.l();
                    return;
                }
                return;
            case 20:
                this.f31824b.e5(false, false);
                return;
            case 21:
                this.f31824b.f31428y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f31824b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f31294f1);
                bundle.putLong("user_id", profileActivity14.f31286e1);
                profileActivity14.presentFragment(new g31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f31824b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new sa(null));
                return;
            case 24:
                ProfileActivity.W(this.f31824b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f31824b;
                TLRPC.UserFull userFull = profileActivity16.f31404v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.wl.o(R.string.TextCopied, org.telegram.ui.Components.vc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f31824b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f31286e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new us(bundle2, profileActivity17.f31429z0));
                return;
            default:
                this.f31824b.G4(true);
                return;
        }
    }
}
