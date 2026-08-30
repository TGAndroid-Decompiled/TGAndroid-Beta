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
public final class px0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.ih0, org.telegram.ui.Components.kl0, FlagSecureReason.FlagSecureCondition, xd.b, t60, org.telegram.ui.Components.iw0 {
    public final int f37551a;
    public final ProfileActivity f37552b;

    public px0(ProfileActivity profileActivity, int i10) {
        this.f37551a = i10;
        this.f37552b = profileActivity;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f37552b.U4();
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f43130a.f(519).d;
        ProfileActivity profileActivity = this.f37552b;
        profileActivity.f32091i6 = i10;
        FrameLayout frameLayout = profileActivity.f32138p5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f32091i6 + profileActivity.f32084h6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f32138p5.setLayoutParams(marginLayoutParams);
            }
        }
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null) {
            sz0Var.setPagesPaddingBottom(profileActivity.f32091i6 + profileActivity.f32077g6);
            org.telegram.ui.Components.or0 or0Var = profileActivity.L.S;
            if (or0Var != null) {
                or0Var.setButtonOffset(profileActivity.f32091i6 + profileActivity.f32084h6);
            }
        }
        return r0.m1.f43129b;
    }

    @Override
    public boolean f(int i10, View view) {
        ProfileActivity profileActivity = this.f37552b;
        r01 r01Var = profileActivity.e;
        if (r01Var.f37898w || r01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32181w0);
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new px0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        profileActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37551a) {
            case 0:
                ProfileActivity profileActivity = this.f37552b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f32037b1);
                if (org.telegram.ui.Components.qc.a(profileActivity)) {
                    org.telegram.ui.Components.qc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                r01 r01Var = this.f37552b.e;
                r01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                r01Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f37552b;
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
        ProfileActivity profileActivity = this.f37552b;
        TLRPC.ChatFull chatFull = profileActivity.f32150r2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f32150r2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f32150r2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.B2, profileActivity, arrayList, i10, new j3(arrayList2, 5), new j3(profileActivity, 6), new hf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f37552b;
        return profileActivity.A2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z4) {
        ProfileActivity profileActivity = this.f37552b;
        profileActivity.G1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.B2.f19184id), null, profileActivity.B2, Boolean.valueOf(z4));
    }

    @Override
    public void h(TLRPC.User user) {
    }

    @Override
    public void z(float f10, int i10) {
    }
}
