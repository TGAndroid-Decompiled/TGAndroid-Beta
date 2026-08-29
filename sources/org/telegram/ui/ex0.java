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
public final class ex0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.yg0, org.telegram.ui.Components.bl0, FlagSecureReason.FlagSecureCondition, vd.b, h60, org.telegram.ui.Components.zv0 {
    public final int f37919a;
    public final ProfileActivity f37920b;

    public ex0(ProfileActivity profileActivity, int i10) {
        this.f37919a = i10;
        this.f37920b = profileActivity;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46843a.f(519).d;
        ProfileActivity profileActivity = this.f37920b;
        profileActivity.f36041h6 = i10;
        FrameLayout frameLayout = profileActivity.f36088o5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f36041h6 + profileActivity.f36034g6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f36088o5.setLayoutParams(marginLayoutParams);
            }
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            hz0Var.setPagesPaddingBottom(profileActivity.f36041h6 + profileActivity.f36027f6);
            org.telegram.ui.Components.gr0 gr0Var = profileActivity.K.R;
            if (gr0Var != null) {
                gr0Var.setButtonOffset(profileActivity.f36041h6 + profileActivity.f36034g6);
            }
        }
        return r0.m1.f46842b;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.f37920b.U4();
    }

    @Override
    public boolean c(int i10, View view) {
        ProfileActivity profileActivity = this.f37920b;
        g01 g01Var = profileActivity.f36012e;
        if (g01Var.f38416w || g01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36129v0);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ex0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37919a) {
            case 0:
                ProfileActivity profileActivity = this.f37920b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f35986a1);
                if (org.telegram.ui.Components.tc.a(profileActivity)) {
                    org.telegram.ui.Components.tc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                g01 g01Var = this.f37920b.f36012e;
                g01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                g01Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f37920b;
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
        ProfileActivity profileActivity = this.f37920b;
        TLRPC.ChatFull chatFull = profileActivity.f36099q2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f36099q2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f36099q2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.A2, profileActivity, arrayList, i10, new l3(arrayList2, 5), new l3(profileActivity, 6), new xe0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f37920b;
        return profileActivity.f36157z2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f37920b;
        profileActivity.F1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.A2.f22392id), null, profileActivity.A2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void z(float f9, int i10) {
    }
}
