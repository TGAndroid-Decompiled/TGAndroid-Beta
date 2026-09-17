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
public final class my0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.dh0, org.telegram.ui.Components.cl0, FlagSecureReason.FlagSecureCondition, le.d, b70, org.telegram.ui.Components.iw0 {
    public final int f35906a;
    public final ProfileActivity f35907b;

    public my0(ProfileActivity profileActivity, int i10) {
        this.f35906a = i10;
        this.f35907b = profileActivity;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.f35907b.U4();
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41877a.f(519).d;
        ProfileActivity profileActivity = this.f35907b;
        profileActivity.f31334l6 = i10;
        FrameLayout frameLayout = profileActivity.f31382s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f31334l6 + profileActivity.f31329k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f31382s5.setLayoutParams(marginLayoutParams);
            }
        }
        n01 n01Var = profileActivity.O;
        if (n01Var != null) {
            n01Var.setPagesPaddingBottom(profileActivity.f31334l6 + profileActivity.f31322j6);
            org.telegram.ui.Components.or0 or0Var = profileActivity.O.V;
            if (or0Var != null) {
                or0Var.setButtonOffset(profileActivity.f31334l6 + profileActivity.f31329k6);
            }
        }
        return r0.l1.f41876b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f35907b;
        l11 l11Var = profileActivity.e;
        if (l11Var.f35421w || l11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31425z0);
        alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new my0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35906a) {
            case 0:
                ProfileActivity profileActivity = this.f35907b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f31282e1);
                if (org.telegram.ui.Components.vc.a(profileActivity)) {
                    org.telegram.ui.Components.vc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                l11 l11Var = this.f35907b.e;
                l11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                l11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f35907b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f35907b;
        TLRPC.ChatFull chatFull = profileActivity.f31393u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f31393u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f31393u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new g3(arrayList2, 5), new g3(profileActivity, 6), new rf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f35907b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f35907b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18121id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
