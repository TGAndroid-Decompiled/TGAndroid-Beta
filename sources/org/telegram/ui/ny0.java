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
public final class ny0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.mh0, org.telegram.ui.Components.ll0, FlagSecureReason.FlagSecureCondition, le.d, z60, org.telegram.ui.Components.sw0 {
    public final int f35358a;
    public final ProfileActivity f35359b;

    public ny0(ProfileActivity profileActivity, int i10) {
        this.f35358a = i10;
        this.f35359b = profileActivity;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        this.f35359b.U4();
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41074a.f(519).d;
        ProfileActivity profileActivity = this.f35359b;
        profileActivity.f30433l6 = i10;
        FrameLayout frameLayout = profileActivity.f30481s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f30433l6 + profileActivity.f30428k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f30481s5.setLayoutParams(marginLayoutParams);
            }
        }
        r01 r01Var = profileActivity.O;
        if (r01Var != null) {
            r01Var.setPagesPaddingBottom(profileActivity.f30433l6 + profileActivity.f30421j6);
            org.telegram.ui.Components.wr0 wr0Var = profileActivity.O.V;
            if (wr0Var != null) {
                wr0Var.setButtonOffset(profileActivity.f30433l6 + profileActivity.f30428k6);
            }
        }
        return r0.l1.f41073b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f35359b;
        p11 p11Var = profileActivity.e;
        if (p11Var.f35667w || p11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f30524z0);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ny0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        profileActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35358a) {
            case 0:
                ProfileActivity profileActivity = this.f35359b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f30381e1);
                if (org.telegram.ui.Components.wc.a(profileActivity)) {
                    org.telegram.ui.Components.wc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                p11 p11Var = this.f35359b.e;
                p11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                p11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f35359b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public void k(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f35359b;
        TLRPC.ChatFull chatFull = profileActivity.f30492u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f30492u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f30492u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new i3(arrayList2, 5), new i3(profileActivity, 6), new pf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f35359b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f35359b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f17195id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void j(TLRPC.User user) {
    }

    @Override
    public void B(float f7, int i10) {
    }
}
