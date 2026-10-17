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
public final class ox0 implements org.telegram.ui.Components.bx0, org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.xh0, org.telegram.ui.Components.yl0, FlagSecureReason.FlagSecureCondition, ne.d, i60 {
    public final int f39898a;
    public final ProfileActivity f39899b;

    public ox0(ProfileActivity profileActivity, int i10) {
        this.f39898a = i10;
        this.f39899b = profileActivity;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f44853a.f(519).d;
        ProfileActivity profileActivity = this.f39899b;
        profileActivity.f33666n6 = i10;
        FrameLayout frameLayout = profileActivity.f33714u5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f33666n6 + profileActivity.f33658m6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f33714u5.setLayoutParams(marginLayoutParams);
            }
        }
        pz0 pz0Var = profileActivity.O;
        if (pz0Var != null) {
            pz0Var.setPagesPaddingBottom(profileActivity.f33666n6 + profileActivity.f33652l6);
            org.telegram.ui.Components.is0 is0Var = profileActivity.O.V;
            if (is0Var != null) {
                is0Var.setButtonOffset(profileActivity.f33666n6 + profileActivity.f33658m6);
            }
        }
        return r0.k1.f44852b;
    }

    @Override
    public boolean a(int i10, View view) {
        ProfileActivity profileActivity = this.f39899b;
        o01 o01Var = profileActivity.e;
        if (o01Var.f39613w || o01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ox0(profileActivity, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39898a) {
            case 1:
                ProfileActivity profileActivity = this.f39899b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f33607f1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = this.f39899b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
            default:
                o01 o01Var = this.f39899b.e;
                o01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                o01Var.l();
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f39899b;
        TLRPC.ChatFull chatFull = profileActivity.f33718v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f33718v2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f33718v2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.F2, profileActivity, arrayList, i10, new j3(arrayList2, 5), new j3(profileActivity, 6), new xe0(profileActivity, arrayList2, hashSet, 24));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39899b;
        return profileActivity.E2 != null || profileActivity.g4();
    }

    @Override
    public void u(int i10, float f7, float f10, ne.e eVar) {
        this.f39899b.U4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f39899b;
        profileActivity.K1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.F2.f20272id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override
    public void h(TLRPC.User user) {
    }

    @Override
    public void E(float f7, int i10) {
    }
}
