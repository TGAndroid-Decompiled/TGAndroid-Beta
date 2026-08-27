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

public final class gx0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.qg0, org.telegram.ui.Components.rk0, FlagSecureReason.FlagSecureCondition, ud.b, j60, org.telegram.ui.Components.rv0 {

    public final int f38492a;

    public final ProfileActivity f38493b;

    public gx0(ProfileActivity profileActivity, int i10) {
        this.f38492a = i10;
        this.f38493b = profileActivity;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46619a.f(519).d;
        ProfileActivity profileActivity = this.f38493b;
        profileActivity.f35979h6 = i10;
        FrameLayout frameLayout = profileActivity.f36026o5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f35979h6 + profileActivity.f35972g6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f36026o5.setLayoutParams(marginLayoutParams);
            }
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            hz0Var.setPagesPaddingBottom(profileActivity.f35979h6 + profileActivity.f35965f6);
            org.telegram.ui.Components.wq0 wq0Var = profileActivity.K.R;
            if (wq0Var != null) {
                wq0Var.setButtonOffset(profileActivity.f35979h6 + profileActivity.f35972g6);
            }
        }
        return r0.m1.f46618b;
    }

    @Override
    public boolean a(int i10, View view) {
        ProfileActivity profileActivity = this.f38493b;
        g01 g01Var = profileActivity.f35950e;
        if (g01Var.f38258w || g01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new gx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38492a) {
            case 0:
                ProfileActivity profileActivity = this.f38493b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f35923a1);
                if (org.telegram.ui.Components.mc.a(profileActivity)) {
                    org.telegram.ui.Components.mc.d(profileActivity, true).j();
                }
                break;
            case 5:
                g01 g01Var = this.f38493b.f35950e;
                g01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                g01Var.l();
                break;
            default:
                ProfileActivity profileActivity2 = this.f38493b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                break;
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f38493b;
        TLRPC.ChatFull chatFull = profileActivity.f36036q2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f36036q2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f36036q2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i10, new l3(arrayList2, 5), new l3(profileActivity, 6), new bf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.f38493b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f38493b;
        return profileActivity.f36095z2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f38493b;
        profileActivity.F1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.A2.f22380id), null, profileActivity.A2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void A(float f10, int i10) {
    }
}
