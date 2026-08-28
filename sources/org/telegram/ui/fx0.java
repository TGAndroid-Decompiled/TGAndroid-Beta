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
public final class fx0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.og0, org.telegram.ui.Components.ok0, FlagSecureReason.FlagSecureCondition, td.b, f60, org.telegram.ui.Components.pv0 {
    public final int f38362a;
    public final ProfileActivity f38363b;

    public fx0(ProfileActivity profileActivity, int i9) {
        this.f38362a = i9;
        this.f38363b = profileActivity;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.f38363b.U4();
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = m1Var.f46929a.f(519).d;
        ProfileActivity profileActivity = this.f38363b;
        profileActivity.f35976h6 = i9;
        FrameLayout frameLayout = profileActivity.f36023o5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.f35976h6 + profileActivity.f35969g6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.f36023o5.setLayoutParams(marginLayoutParams);
            }
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            hz0Var.setPagesPaddingBottom(profileActivity.f35976h6 + profileActivity.f35962f6);
            org.telegram.ui.Components.vq0 vq0Var = profileActivity.K.R;
            if (vq0Var != null) {
                vq0Var.setButtonOffset(profileActivity.f35976h6 + profileActivity.f35969g6);
            }
        }
        return r0.m1.f46928b;
    }

    @Override
    public boolean a(int i9, View view) {
        ProfileActivity profileActivity = this.f38363b;
        f01 f01Var = profileActivity.f35947e;
        if (f01Var.f38070w || f01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36064v0);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new fx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f38362a) {
            case 0:
                ProfileActivity profileActivity = this.f38363b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f35920a1);
                if (org.telegram.ui.Components.oc.a(profileActivity)) {
                    org.telegram.ui.Components.oc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                f01 f01Var = this.f38363b.f35947e;
                f01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                f01Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f38363b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public void j(int i9, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f38363b;
        TLRPC.ChatFull chatFull = profileActivity.f36032q2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f36032q2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f36032q2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i9, new k3(arrayList2, 5), new k3(profileActivity, 6), new ye0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f38363b;
        return profileActivity.f36092z2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f38363b;
        profileActivity.F1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i9);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.A2.f22380id), null, profileActivity.A2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void B(float f10, int i9) {
    }
}
