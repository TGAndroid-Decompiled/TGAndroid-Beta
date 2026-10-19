package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class cb0 implements Runnable {
    public final int f35915a;
    public final ProfileActivity f35916b;

    public cb0(ProfileActivity profileActivity, int i10) {
        this.f35915a = i10;
        this.f35916b = profileActivity;
    }

    @Override
    public final void run() {
        b01 b01Var;
        switch (this.f35915a) {
            case 0:
                ProfileActivity profileActivity = this.f35916b;
                nz0 nz0Var = profileActivity.O;
                if (nz0Var != null) {
                    nz0Var.a1(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f35916b;
                nz0 nz0Var2 = profileActivity2.O;
                if (nz0Var2 != null) {
                    nz0Var2.a1(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cb0(this.f35916b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb0(this.f35916b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f35916b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f33613f1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f35916b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f35916b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f35916b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f35916b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.f1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f35916b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.d1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f35916b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new sa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f35916b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f35916b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f21553a = true;
                this.f35916b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f35916b;
                profileActivity10.k4(true);
                if (profileActivity10.f33649k2.isRunning()) {
                    profileActivity10.f33649k2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f35916b.e5(false, false);
                return;
            case 16:
                this.f35916b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f35916b;
                nz0 nz0Var3 = profileActivity11.O;
                if (nz0Var3 != null) {
                    nz0Var3.y1(true);
                    profileActivity11.O.p1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f35916b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f35916b;
                if (!profileActivity13.f33574a.b0() && (b01Var = profileActivity13.d) != null) {
                    b01Var.l();
                    return;
                }
                return;
            case 20:
                this.f35916b.e5(false, false);
                return;
            case 21:
                this.f35916b.A5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f35916b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f33620g1);
                bundle.putLong("user_id", profileActivity14.f33613f1);
                profileActivity14.presentFragment(new zh.m0(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f35916b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new sa(null));
                return;
            case 24:
                ProfileActivity.V(this.f35916b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f35916b;
                TLRPC.UserFull userFull = profileActivity16.f33732w2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.kk.p(R.string.TextCopied, org.telegram.ui.Components.xc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f35916b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f33613f1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new fs(bundle2, profileActivity17.A0));
                return;
            default:
                this.f35916b.G4(true);
                return;
        }
    }
}
