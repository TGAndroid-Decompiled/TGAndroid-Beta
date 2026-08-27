package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class gb0 implements Runnable {

    public final int f38386a;

    public final ProfileActivity f38387b;

    public gb0(ProfileActivity profileActivity, int i10) {
        this.f38386a = i10;
        this.f38387b = profileActivity;
    }

    @Override
    public final void run() {
        vz0 vz0Var;
        switch (this.f38386a) {
            case 0:
                ProfileActivity profileActivity = this.f38387b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null) {
                    hz0Var.Y0(14);
                    profileActivity.G4(false);
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.f38387b;
                hz0 hz0Var2 = profileActivity2.K;
                if (hz0Var2 != null) {
                    hz0Var2.Y0(14);
                    profileActivity2.G4(false);
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gb0(this.f38387b, 0), 200L);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gb0(this.f38387b, 1), 200L);
                break;
            case 4:
                ProfileActivity profileActivity3 = this.f38387b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f35923a1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 5:
                this.f38387b.z4(false);
                break;
            case 6:
                ProfileActivity profileActivity4 = this.f38387b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                break;
            case 7:
                this.f38387b.z4(true);
                break;
            case 8:
                ProfileActivity profileActivity5 = this.f38387b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new qf.y0());
                break;
            case 9:
                ProfileActivity profileActivity6 = this.f38387b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new qf.w0());
                break;
            case 10:
                ProfileActivity profileActivity7 = this.f38387b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new na(null));
                break;
            case 11:
                ProfileActivity profileActivity8 = this.f38387b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                break;
            case 12:
                ProfileActivity profileActivity9 = this.f38387b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                break;
            case 13:
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                this.f38387b.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 14:
                ProfileActivity profileActivity10 = this.f38387b;
                profileActivity10.k4(true);
                if (profileActivity10.f35961f2.isRunning()) {
                    profileActivity10.f35961f2.cancel();
                }
                profileActivity10.J4(1.0f);
                break;
            case 15:
                this.f38387b.e5(false, false);
                break;
            case 16:
                this.f38387b.F3();
                break;
            case 17:
                ProfileActivity profileActivity11 = this.f38387b;
                hz0 hz0Var3 = profileActivity11.K;
                if (hz0Var3 != null) {
                    hz0Var3.v1(true);
                    profileActivity11.K.n1();
                }
                break;
            case 18:
                ProfileActivity profileActivity12 = this.f38387b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                break;
            case 19:
                ProfileActivity profileActivity13 = this.f38387b;
                if (!profileActivity13.f35921a.b0() && (vz0Var = profileActivity13.d) != null) {
                    vz0Var.l();
                }
                break;
            case 20:
                this.f38387b.e5(false, false);
                break;
            case 21:
                this.f38387b.f36066u5.setVisibility(8);
                break;
            case 22:
                ProfileActivity profileActivity14 = this.f38387b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f35929b1);
                bundle.putLong("user_id", profileActivity14.f35923a1);
                profileActivity14.presentFragment(new y11(bundle));
                break;
            case 23:
                ProfileActivity profileActivity15 = this.f38387b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new na(null));
                break;
            case 24:
                ProfileActivity.W(this.f38387b);
                break;
            case 25:
                ProfileActivity profileActivity16 = this.f38387b;
                TLRPC.UserFull userFull = profileActivity16.f36043r2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.rl.m(R.string.TextCopied, org.telegram.ui.Components.mc.a0(profileActivity16));
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity17 = this.f38387b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f35923a1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new js(bundle2, profileActivity17.f36067v0));
                break;
            default:
                this.f38387b.G4(true);
                break;
        }
    }
}
