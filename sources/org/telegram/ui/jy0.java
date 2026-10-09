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
public final class jy0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.hi0, org.telegram.ui.Components.gm0, FlagSecureReason.FlagSecureCondition, me.d, x60, org.telegram.ui.Components.kx0 {
    public final int f39043a;
    public final ProfileActivity f39044b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f39043a = i10;
        this.f39044b = profileActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46777a.f(519).d;
        ProfileActivity profileActivity = this.f39044b;
        profileActivity.f34295l6 = i10;
        FrameLayout frameLayout = profileActivity.f34343s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f34295l6 + profileActivity.f34290k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34343s5.setLayoutParams(marginLayoutParams);
            }
        }
        k01 k01Var = profileActivity.O;
        if (k01Var != null) {
            k01Var.setPagesPaddingBottom(profileActivity.f34295l6 + profileActivity.f34283j6);
            org.telegram.ui.Components.rs0 rs0Var = profileActivity.O.V;
            if (rs0Var != null) {
                rs0Var.setButtonOffset(profileActivity.f34295l6 + profileActivity.f34290k6);
            }
        }
        return r0.k1.f46776b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f39044b;
        i11 i11Var = profileActivity.f34241e;
        if (i11Var.f38449w || i11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34386z0);
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new jy0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39043a) {
            case 0:
                ProfileActivity profileActivity = this.f39044b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f34243e1);
                if (org.telegram.ui.Components.ad.a(profileActivity)) {
                    org.telegram.ui.Components.ad.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                i11 i11Var = this.f39044b.f34241e;
                i11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                i11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f39044b;
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
        ProfileActivity profileActivity = this.f39044b;
        TLRPC.ChatFull chatFull = profileActivity.f34354u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34354u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34354u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new of0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f39044b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39044b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f39044b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f20038id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void A(float f7, int i10) {
    }
}
