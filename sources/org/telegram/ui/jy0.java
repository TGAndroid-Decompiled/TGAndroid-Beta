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
public final class jy0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ii0, org.telegram.ui.Components.hm0, FlagSecureReason.FlagSecureCondition, me.d, x60, org.telegram.ui.Components.lx0 {
    public final int f39087a;
    public final ProfileActivity f39088b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f39087a = i10;
        this.f39088b = profileActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46821a.f(519).d;
        ProfileActivity profileActivity = this.f39088b;
        profileActivity.f34333l6 = i10;
        FrameLayout frameLayout = profileActivity.f34381s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f34333l6 + profileActivity.f34328k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34381s5.setLayoutParams(marginLayoutParams);
            }
        }
        k01 k01Var = profileActivity.O;
        if (k01Var != null) {
            k01Var.setPagesPaddingBottom(profileActivity.f34333l6 + profileActivity.f34321j6);
            org.telegram.ui.Components.ss0 ss0Var = profileActivity.O.V;
            if (ss0Var != null) {
                ss0Var.setButtonOffset(profileActivity.f34333l6 + profileActivity.f34328k6);
            }
        }
        return r0.k1.f46820b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f39088b;
        i11 i11Var = profileActivity.f34279e;
        if (i11Var.f38493w || i11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34424z0);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new jy0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        profileActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39087a) {
            case 0:
                ProfileActivity profileActivity = this.f39088b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f34281e1);
                if (org.telegram.ui.Components.ad.a(profileActivity)) {
                    org.telegram.ui.Components.ad.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                i11 i11Var = this.f39088b.f34279e;
                i11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                i11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f39088b;
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
        ProfileActivity profileActivity = this.f39088b;
        TLRPC.ChatFull chatFull = profileActivity.f34392u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34392u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34392u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new of0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f39088b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39088b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f39088b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f20042id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void i(TLRPC.User user) {
    }

    @Override
    public void A(float f7, int i10) {
    }
}
