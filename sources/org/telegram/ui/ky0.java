package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ky0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ph0, org.telegram.ui.Components.ol0, FlagSecureReason.FlagSecureCondition, le.d, z60, org.telegram.ui.Components.uw0 {
    public final int f35281a;
    public final ProfileActivity f35282b;

    public ky0(ProfileActivity profileActivity, int i10) {
        this.f35281a = i10;
        this.f35282b = profileActivity;
    }

    @Override
    public void H(int i10, float f7, float f10, le.e eVar) {
        this.f35282b.U4();
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f42175a.f(519).d;
        ProfileActivity profileActivity = this.f35282b;
        profileActivity.f31626l6 = i10;
        FrameLayout frameLayout = profileActivity.f31674s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f31626l6 + profileActivity.f31621k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f31674s5.setLayoutParams(marginLayoutParams);
            }
        }
        l01 l01Var = profileActivity.O;
        if (l01Var != null) {
            l01Var.setPagesPaddingBottom(profileActivity.f31626l6 + profileActivity.f31614j6);
            org.telegram.ui.Components.bs0 bs0Var = profileActivity.O.V;
            if (bs0Var != null) {
                bs0Var.setButtonOffset(profileActivity.f31626l6 + profileActivity.f31621k6);
            }
        }
        return r0.l1.f42174b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f35282b;
        j11 j11Var = profileActivity.e;
        if (j11Var.f34770w || j11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31717z0);
        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ky0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f35282b;
        TLRPC.ChatFull chatFull = profileActivity.f31685u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f31685u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f31685u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new g3(arrayList2, 5), new g3(profileActivity, 6), new rf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35281a) {
            case 0:
                ProfileActivity profileActivity = this.f35282b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f31574e1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                j11 j11Var = this.f35282b.e;
                j11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                j11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f35282b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f35282b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f35282b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18343id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void g(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
