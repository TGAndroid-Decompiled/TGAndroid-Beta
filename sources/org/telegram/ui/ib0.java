package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ib0 implements Runnable {
    public final int f38222a;
    public final ProfileActivity f38223b;

    public ib0(ProfileActivity profileActivity, int i10) {
        this.f38222a = i10;
        this.f38223b = profileActivity;
    }

    @Override
    public final void run() {
        e01 e01Var;
        switch (this.f38222a) {
            case 0:
                ProfileActivity profileActivity = this.f38223b;
                qz0 qz0Var = profileActivity.O;
                if (qz0Var != null) {
                    qz0Var.b1(14);
                    profileActivity.I4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f38223b;
                qz0 qz0Var2 = profileActivity2.O;
                if (qz0Var2 != null) {
                    qz0Var2.b1(14);
                    profileActivity2.I4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ib0(this.f38223b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ib0(this.f38223b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f38223b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f33923f1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f38223b.B4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f38223b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f38223b.B4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f38223b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.e1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f38223b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.c1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f38223b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new sa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f38223b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f38223b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new g(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f21637a = true;
                this.f38223b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f38223b;
                profileActivity10.m4(true);
                if (profileActivity10.f33959k2.isRunning()) {
                    profileActivity10.f33959k2.cancel();
                }
                profileActivity10.L4(1.0f);
                return;
            case 15:
                this.f38223b.i5(false, false);
                return;
            case 16:
                this.f38223b.H3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f38223b;
                qz0 qz0Var3 = profileActivity11.O;
                if (qz0Var3 != null) {
                    qz0Var3.A1(true);
                    profileActivity11.O.r1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f38223b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f38223b;
                if (!profileActivity13.f33884a.b0() && (e01Var = profileActivity13.d) != null) {
                    e01Var.l();
                    return;
                }
                return;
            case 20:
                this.f38223b.i5(false, false);
                return;
            case 21:
                this.f38223b.A5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f38223b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f33930g1);
                bundle.putLong("user_id", profileActivity14.f33923f1);
                profileActivity14.presentFragment(new zh.n0(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f38223b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new sa(null));
                return;
            case 24:
                ProfileActivity.V(this.f38223b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f38223b;
                TLRPC.UserFull userFull = profileActivity16.f34042w2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.tl.p(R.string.TextCopied, org.telegram.ui.Components.vc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f38223b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f33923f1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new hs(bundle2, profileActivity17.A0));
                return;
            default:
                this.f38223b.I4(true);
                return;
        }
    }
}
