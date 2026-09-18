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
public final class ky0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.nh0, org.telegram.ui.Components.ml0, FlagSecureReason.FlagSecureCondition, le.d, z60, org.telegram.ui.Components.tw0 {
    public final int f35200a;
    public final ProfileActivity f35201b;

    public ky0(ProfileActivity profileActivity, int i10) {
        this.f35200a = i10;
        this.f35201b = profileActivity;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.f35201b.U4();
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f42109a.f(519).d;
        ProfileActivity profileActivity = this.f35201b;
        profileActivity.f31565l6 = i10;
        FrameLayout frameLayout = profileActivity.f31613s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f31565l6 + profileActivity.f31560k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f31613s5.setLayoutParams(marginLayoutParams);
            }
        }
        l01 l01Var = profileActivity.O;
        if (l01Var != null) {
            l01Var.setPagesPaddingBottom(profileActivity.f31565l6 + profileActivity.f31553j6);
            org.telegram.ui.Components.zr0 zr0Var = profileActivity.O.V;
            if (zr0Var != null) {
                zr0Var.setButtonOffset(profileActivity.f31565l6 + profileActivity.f31560k6);
            }
        }
        return r0.m1.f42108b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f35201b;
        j11 j11Var = profileActivity.e;
        if (j11Var.f34686w || j11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31656z0);
        alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ky0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35200a) {
            case 0:
                ProfileActivity profileActivity = this.f35201b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f31513e1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                j11 j11Var = this.f35201b.e;
                j11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                j11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f35201b;
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
        ProfileActivity profileActivity = this.f35201b;
        TLRPC.ChatFull chatFull = profileActivity.f31624u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f31624u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f31624u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new g3(arrayList2, 5), new g3(profileActivity, 6), new qf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f35201b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f35201b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18296id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void g(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
