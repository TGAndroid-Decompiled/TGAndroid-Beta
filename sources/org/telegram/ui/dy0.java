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
public final class dy0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.dh0, org.telegram.ui.Components.cl0, FlagSecureReason.FlagSecureCondition, le.e, w60, org.telegram.ui.Components.hw0 {
    public final int f32740a;
    public final ProfileActivity f32741b;

    public dy0(ProfileActivity profileActivity, int i10) {
        this.f32740a = i10;
        this.f32741b = profileActivity;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f32741b.U4();
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41807a.f(519).d;
        ProfileActivity profileActivity = this.f32741b;
        profileActivity.f31292l6 = i10;
        FrameLayout frameLayout = profileActivity.f31340s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f31292l6 + profileActivity.f31287k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f31340s5.setLayoutParams(marginLayoutParams);
            }
        }
        e01 e01Var = profileActivity.O;
        if (e01Var != null) {
            e01Var.setPagesPaddingBottom(profileActivity.f31292l6 + profileActivity.f31280j6);
            org.telegram.ui.Components.nr0 nr0Var = profileActivity.O.V;
            if (nr0Var != null) {
                nr0Var.setButtonOffset(profileActivity.f31292l6 + profileActivity.f31287k6);
            }
        }
        return r0.l1.f41806b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f32741b;
        c11 c11Var = profileActivity.e;
        if (c11Var.f32234w || c11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31383z0);
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new dy0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32740a) {
            case 0:
                ProfileActivity profileActivity = this.f32741b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f31240e1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                c11 c11Var = this.f32741b.e;
                c11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                c11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f32741b;
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
        ProfileActivity profileActivity = this.f32741b;
        TLRPC.ChatFull chatFull = profileActivity.f31351u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f31351u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f31351u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new kf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f32741b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f32741b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18083id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
