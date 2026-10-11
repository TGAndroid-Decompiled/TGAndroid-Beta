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
public final class iy0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ji0, org.telegram.ui.Components.im0, FlagSecureReason.FlagSecureCondition, me.d, x60, org.telegram.ui.Components.mx0 {
    public final int f38800a;
    public final ProfileActivity f38801b;

    public iy0(ProfileActivity profileActivity, int i10) {
        this.f38800a = i10;
        this.f38801b = profileActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46867a.f(519).d;
        ProfileActivity profileActivity = this.f38801b;
        profileActivity.f34323l6 = i10;
        FrameLayout frameLayout = profileActivity.f34371s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f34323l6 + profileActivity.f34318k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34371s5.setLayoutParams(marginLayoutParams);
            }
        }
        j01 j01Var = profileActivity.O;
        if (j01Var != null) {
            j01Var.setPagesPaddingBottom(profileActivity.f34323l6 + profileActivity.f34311j6);
            org.telegram.ui.Components.ts0 ts0Var = profileActivity.O.V;
            if (ts0Var != null) {
                ts0Var.setButtonOffset(profileActivity.f34323l6 + profileActivity.f34318k6);
            }
        }
        return r0.k1.f46866b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f38801b;
        h11 h11Var = profileActivity.f34269e;
        if (h11Var.f38219w || h11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34414z0);
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new iy0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        profileActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38800a) {
            case 0:
                ProfileActivity profileActivity = this.f38801b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f34271e1);
                if (org.telegram.ui.Components.ad.a(profileActivity)) {
                    org.telegram.ui.Components.ad.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                h11 h11Var = this.f38801b.f34269e;
                h11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                h11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f38801b;
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
        ProfileActivity profileActivity = this.f38801b;
        TLRPC.ChatFull chatFull = profileActivity.f34382u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34382u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34382u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new g3(arrayList2, 5), new g3(profileActivity, 6), new nf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f38801b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f38801b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f38801b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f20032id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void A(float f7, int i10) {
    }
}
