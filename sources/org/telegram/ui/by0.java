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
public final class by0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.nh0, org.telegram.ui.Components.ml0, FlagSecureReason.FlagSecureCondition, le.e, u60, org.telegram.ui.Components.sw0 {
    public final int f32496a;
    public final ProfileActivity f32497b;

    public by0(ProfileActivity profileActivity, int i10) {
        this.f32496a = i10;
        this.f32497b = profileActivity;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f32497b.U4();
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f42126a.f(519).d;
        ProfileActivity profileActivity = this.f32497b;
        profileActivity.f31593l6 = i10;
        FrameLayout frameLayout = profileActivity.f31641s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f31593l6 + profileActivity.f31588k6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f31641s5.setLayoutParams(marginLayoutParams);
            }
        }
        c01 c01Var = profileActivity.O;
        if (c01Var != null) {
            c01Var.setPagesPaddingBottom(profileActivity.f31593l6 + profileActivity.f31581j6);
            org.telegram.ui.Components.zr0 zr0Var = profileActivity.O.V;
            if (zr0Var != null) {
                zr0Var.setButtonOffset(profileActivity.f31593l6 + profileActivity.f31588k6);
            }
        }
        return r0.l1.f42125b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f32497b;
        a11 a11Var = profileActivity.e;
        if (a11Var.f31943w || a11Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31684z0);
        alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new by0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        profileActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f32496a) {
            case 0:
                ProfileActivity profileActivity = this.f32497b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f31541e1);
                if (org.telegram.ui.Components.yc.a(profileActivity)) {
                    org.telegram.ui.Components.yc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                a11 a11Var = this.f32497b.e;
                a11Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                a11Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f32497b;
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
        ProfileActivity profileActivity = this.f32497b;
        TLRPC.ChatFull chatFull = profileActivity.f31652u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f31652u2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f31652u2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new jf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f32497b;
        return profileActivity.D2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f32497b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f18321id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void g(TLRPC.User user) {
    }

    @Override
    public void C(float f7, int i10) {
    }
}
