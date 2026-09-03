package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class pb0 implements Runnable {
    public final int f39967a;
    public final ProfileActivity f39968b;

    public pb0(ProfileActivity profileActivity, int i10) {
        this.f39967a = i10;
        this.f39968b = profileActivity;
    }

    @Override
    public final void run() {
        n01 n01Var;
        switch (this.f39967a) {
            case 0:
                ProfileActivity profileActivity = this.f39968b;
                zz0 zz0Var = profileActivity.L;
                if (zz0Var != null) {
                    zz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f39968b;
                zz0 zz0Var2 = profileActivity2.L;
                if (zz0Var2 != null) {
                    zz0Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pb0(this.f39968b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new pb0(this.f39968b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f39968b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f34569b1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f39968b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f39968b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f39968b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f39968b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new vf.x0());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f39968b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new vf.v0());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f39968b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new pa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f39968b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f39968b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new i(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f22158a = true;
                this.f39968b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f39968b;
                profileActivity10.k4(true);
                if (profileActivity10.f34606g2.isRunning()) {
                    profileActivity10.f34606g2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f39968b.e5(false, false);
                return;
            case 16:
                this.f39968b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f39968b;
                zz0 zz0Var3 = profileActivity11.L;
                if (zz0Var3 != null) {
                    zz0Var3.v1(true);
                    profileActivity11.L.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f39968b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f39968b;
                if (!profileActivity13.f34560a.b0() && (n01Var = profileActivity13.d) != null) {
                    n01Var.l();
                    return;
                }
                return;
            case 20:
                this.f39968b.e5(false, false);
                return;
            case 21:
                this.f39968b.f34712v5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f39968b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f34577c1);
                bundle.putLong("user_id", profileActivity14.f34569b1);
                profileActivity14.presentFragment(new u21(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f39968b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new pa(null));
                return;
            case 24:
                ProfileActivity.W(this.f39968b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f39968b;
                TLRPC.UserFull userFull = profileActivity16.f34691s2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    b.m(R.string.TextCopied, org.telegram.ui.Components.qc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f39968b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f34569b1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new os(bundle2, profileActivity17.f34714w0));
                return;
            default:
                this.f39968b.G4(true);
                return;
        }
    }
}
