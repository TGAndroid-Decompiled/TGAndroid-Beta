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
public final class py0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.di0, org.telegram.ui.Components.cm0, FlagSecureReason.FlagSecureCondition, ne.d, e70, org.telegram.ui.Components.gx0 {
    public final int f39028a;
    public final ProfileActivity f39029b;

    public py0(ProfileActivity profileActivity, int i10) {
        this.f39028a = i10;
        this.f39029b = profileActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f43497a.f(519).d;
        ProfileActivity profileActivity = this.f39029b;
        profileActivity.f32314l6 = i10;
        FrameLayout frameLayout = profileActivity.f32362s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f32314l6 + profileActivity.f32309k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f32362s5.setLayoutParams(marginLayoutParams);
            }
        }
        q01 q01Var = profileActivity.O;
        if (q01Var != null) {
            q01Var.setPagesPaddingBottom(profileActivity.f32314l6 + profileActivity.f32302j6);
            org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
            if (ns0Var != null) {
                ns0Var.setButtonOffset(profileActivity.f32314l6 + profileActivity.f32309k6);
            }
        }
        return r0.l1.f43496b;
    }

    @Override
    public boolean a(int i10, View view) {
        ProfileActivity profileActivity = this.f39029b;
        p11 p11Var = profileActivity.e;
        if (p11Var.f38795w || p11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32405z0);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new py0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        profileActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39028a) {
            case 0:
                ProfileActivity profileActivity = this.f39029b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f32261e1);
                if (org.telegram.ui.Components.zc.a(profileActivity)) {
                    org.telegram.ui.Components.zc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                p11 p11Var = this.f39029b.e;
                p11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                p11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f39029b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f39029b;
        TLRPC.ChatFull chatFull = profileActivity.f32373u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f32373u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f32373u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new j3(arrayList2, 5), new j3(profileActivity, 6), new tf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        this.f39029b.U4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39029b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f39029b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18916id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void h(TLRPC.User user) {
    }

    @Override
    public void A(float f7, int i10) {
    }
}
