package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class cb0 implements Runnable {
    public final int f37160a;
    public final ProfileActivity f37161b;

    public cb0(ProfileActivity profileActivity, int i9) {
        this.f37160a = i9;
        this.f37161b = profileActivity;
    }

    @Override
    public final void run() {
        vz0 vz0Var;
        switch (this.f37160a) {
            case 0:
                ProfileActivity profileActivity = this.f37161b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null) {
                    hz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f37161b;
                hz0 hz0Var2 = profileActivity2.K;
                if (hz0Var2 != null) {
                    hz0Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cb0(this.f37161b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb0(this.f37161b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f37161b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f35920a1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f37161b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f37161b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f37161b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f37161b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new pf.y0());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f37161b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new pf.w0());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f37161b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new ma(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f37161b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f37161b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f23653a = true;
                this.f37161b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f37161b;
                profileActivity10.k4(true);
                if (profileActivity10.f35958f2.isRunning()) {
                    profileActivity10.f35958f2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f37161b.e5(false, false);
                return;
            case 16:
                this.f37161b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f37161b;
                hz0 hz0Var3 = profileActivity11.K;
                if (hz0Var3 != null) {
                    hz0Var3.v1(true);
                    profileActivity11.K.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f37161b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f37161b;
                if (!profileActivity13.f35918a.b0() && (vz0Var = profileActivity13.d) != null) {
                    vz0Var.l();
                    return;
                }
                return;
            case 20:
                this.f37161b.e5(false, false);
                return;
            case 21:
                this.f37161b.f36063u5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f37161b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f35926b1);
                bundle.putLong("user_id", profileActivity14.f35920a1);
                profileActivity14.presentFragment(new z11(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f37161b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new ma(null));
                return;
            case 24:
                ProfileActivity.V(this.f37161b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f37161b;
                TLRPC.UserFull userFull = profileActivity16.f36040r2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.ll.o(R.string.TextCopied, org.telegram.ui.Components.oc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f37161b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f35920a1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new is(bundle2, profileActivity17.f36064v0));
                return;
            default:
                this.f37161b.G4(true);
                return;
        }
    }
}
