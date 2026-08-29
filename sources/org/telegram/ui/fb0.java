package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fb0 implements Runnable {
    public final int f38090a;
    public final ProfileActivity f38091b;

    public fb0(ProfileActivity profileActivity, int i10) {
        this.f38090a = i10;
        this.f38091b = profileActivity;
    }

    @Override
    public final void run() {
        vz0 vz0Var;
        switch (this.f38090a) {
            case 0:
                ProfileActivity profileActivity = this.f38091b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null) {
                    hz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f38091b;
                hz0 hz0Var2 = profileActivity2.K;
                if (hz0Var2 != null) {
                    hz0Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fb0(this.f38091b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fb0(this.f38091b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f38091b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f35986a1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f38091b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f38091b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f38091b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f38091b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new sf.x0());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f38091b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new sf.v0());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f38091b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new la(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f38091b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f38091b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new i(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f23673a = true;
                this.f38091b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f38091b;
                profileActivity10.k4(true);
                if (profileActivity10.f36023f2.isRunning()) {
                    profileActivity10.f36023f2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f38091b.e5(false, false);
                return;
            case 16:
                this.f38091b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f38091b;
                hz0 hz0Var3 = profileActivity11.K;
                if (hz0Var3 != null) {
                    hz0Var3.v1(true);
                    profileActivity11.K.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f38091b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f38091b;
                if (!profileActivity13.f35984a.b0() && (vz0Var = profileActivity13.d) != null) {
                    vz0Var.l();
                    return;
                }
                return;
            case 20:
                this.f38091b.e5(false, false);
                return;
            case 21:
                this.f38091b.f36128u5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f38091b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f35993b1);
                bundle.putLong("user_id", profileActivity14.f35986a1);
                profileActivity14.presentFragment(new a21(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f38091b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new la(null));
                return;
            case 24:
                ProfileActivity.W(this.f38091b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f38091b;
                TLRPC.UserFull userFull = profileActivity16.f36106r2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    b.n(R.string.TextCopied, org.telegram.ui.Components.tc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f38091b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f35986a1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new hs(bundle2, profileActivity17.f36129v0));
                return;
            default:
                this.f38091b.G4(true);
                return;
        }
    }
}
