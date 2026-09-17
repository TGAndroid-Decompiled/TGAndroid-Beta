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
public final class ky0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ch0, org.telegram.ui.Components.bl0, FlagSecureReason.FlagSecureCondition, le.d, a70, org.telegram.ui.Components.gw0 {
    public final int f38179a;
    public final ProfileActivity f38180b;

    public ky0(ProfileActivity profileActivity, int i10) {
        this.f38179a = i10;
        this.f38180b = profileActivity;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.f38180b.U4();
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f44740a.f(519).d;
        ProfileActivity profileActivity = this.f38180b;
        profileActivity.f33968l6 = i10;
        FrameLayout frameLayout = profileActivity.f34016s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f33968l6 + profileActivity.f33963k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34016s5.setLayoutParams(marginLayoutParams);
            }
        }
        m01 m01Var = profileActivity.O;
        if (m01Var != null) {
            m01Var.setPagesPaddingBottom(profileActivity.f33968l6 + profileActivity.f33956j6);
            org.telegram.ui.Components.nr0 nr0Var = profileActivity.O.V;
            if (nr0Var != null) {
                nr0Var.setButtonOffset(profileActivity.f33968l6 + profileActivity.f33963k6);
            }
        }
        return r0.l1.f44739b;
    }

    @Override
    public boolean a(int i10, View view) {
        ProfileActivity profileActivity = this.f38180b;
        l11 l11Var = profileActivity.f33914e;
        if (l11Var.f38199w || l11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34059z0);
        alertDialog$Builder.f20226a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20226a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ky0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20226a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20926q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38179a) {
            case 0:
                ProfileActivity profileActivity = this.f38180b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f33916e1);
                if (org.telegram.ui.Components.yc.a(profileActivity)) {
                    org.telegram.ui.Components.yc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                l11 l11Var = this.f38180b.f33914e;
                l11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                l11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f38180b;
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
        ProfileActivity profileActivity = this.f38180b;
        TLRPC.ChatFull chatFull = profileActivity.f34027u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34027u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34027u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new pf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f38180b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f38180b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f19896id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void z(float f7, int i10) {
    }
}
