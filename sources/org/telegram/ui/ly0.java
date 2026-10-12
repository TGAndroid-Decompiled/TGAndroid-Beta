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
public final class ly0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ki0, org.telegram.ui.Components.mm0, FlagSecureReason.FlagSecureCondition, me.d, z60, org.telegram.ui.Components.qx0 {
    public final int f39870a;
    public final ProfileActivity f39871b;

    public ly0(ProfileActivity profileActivity, int i10) {
        this.f39870a = i10;
        this.f39871b = profileActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f47000a.f(519).d;
        ProfileActivity profileActivity = this.f39871b;
        profileActivity.f34134l6 = i10;
        FrameLayout frameLayout = profileActivity.f34182s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f34134l6 + profileActivity.f34129k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34182s5.setLayoutParams(marginLayoutParams);
            }
        }
        m01 m01Var = profileActivity.O;
        if (m01Var != null) {
            m01Var.setPagesPaddingBottom(profileActivity.f34134l6 + profileActivity.f34122j6);
            org.telegram.ui.Components.xs0 xs0Var = profileActivity.O.V;
            if (xs0Var != null) {
                xs0Var.setButtonOffset(profileActivity.f34134l6 + profileActivity.f34129k6);
            }
        }
        return r0.k1.f46999b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f39871b;
        k11 k11Var = profileActivity.f34080e;
        if (k11Var.f39342w || k11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34225z0);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ly0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        profileActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39870a) {
            case 0:
                ProfileActivity profileActivity = this.f39871b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f34082e1);
                if (org.telegram.ui.Components.zc.a(profileActivity)) {
                    org.telegram.ui.Components.zc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                k11 k11Var = this.f39871b.f34080e;
                k11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                k11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f39871b;
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
        ProfileActivity profileActivity = this.f39871b;
        TLRPC.ChatFull chatFull = profileActivity.f34193u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34193u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34193u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new pf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f39871b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39871b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f39871b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f19803id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
