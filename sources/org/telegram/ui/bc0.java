package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements Runnable {
    public final int f34295a;
    public final ProfileActivity f34296b;

    public bc0(ProfileActivity profileActivity, int i10) {
        this.f34295a = i10;
        this.f34296b = profileActivity;
    }

    @Override
    public final void run() {
        e11 e11Var;
        switch (this.f34295a) {
            case 0:
                ProfileActivity profileActivity = this.f34296b;
                q01 q01Var = profileActivity.O;
                if (q01Var != null) {
                    q01Var.Z0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f34296b;
                q01 q01Var2 = profileActivity2.O;
                if (q01Var2 != null) {
                    q01Var2.Z0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bc0(this.f34296b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bc0(this.f34296b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f34296b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f32261e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f34296b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f34296b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f34296b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f34296b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f34296b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f34296b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new va(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f34296b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f34296b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f20169a = true;
                this.f34296b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f34296b;
                profileActivity10.k4(true);
                if (profileActivity10.f32298j2.isRunning()) {
                    profileActivity10.f32298j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f34296b.e5(false, false);
                return;
            case 16:
                this.f34296b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f34296b;
                q01 q01Var3 = profileActivity11.O;
                if (q01Var3 != null) {
                    q01Var3.w1(true);
                    profileActivity11.O.o1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f34296b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f34296b;
                if (!profileActivity13.f32230a.b0() && (e11Var = profileActivity13.d) != null) {
                    e11Var.l();
                    return;
                }
                return;
            case 20:
                this.f34296b.e5(false, false);
                return;
            case 21:
                this.f34296b.f32404y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f34296b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f32269f1);
                bundle.putLong("user_id", profileActivity14.f32261e1);
                profileActivity14.presentFragment(new l31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f34296b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new va(null));
                return;
            case 24:
                ProfileActivity.W(this.f34296b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f34296b;
                TLRPC.UserFull userFull = profileActivity16.f32380v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.sk.p(R.string.TextCopied, org.telegram.ui.Components.zc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f34296b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f32261e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ws(bundle2, profileActivity17.f32405z0));
                return;
            default:
                this.f34296b.G4(true);
                return;
        }
    }
}
