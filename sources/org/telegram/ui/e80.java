package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class e80 implements zx, org.telegram.ui.ActionBar.a2 {

    public final int f37663a;

    public final KeyEvent.Callback f37664b;

    public final Object f37665c;
    public final Object d;

    public final Object f37666e;

    public final Object f37667f;

    public e80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, gy gyVar) {
        this.f37664b = launchActivity;
        this.f37663a = i10;
        this.f37665c = user;
        this.d = str;
        this.f37666e = str2;
        this.f37667f = gyVar;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        qf.h1 h1Var = (qf.h1) this.f37664b;
        cg.e1 e1Var = (cg.e1) this.f37665c;
        qf.p1 p1Var = (qf.p1) this.d;
        TextView textView = (TextView) this.f37666e;
        Utilities.Callback callback = (Utilities.Callback) this.f37667f;
        String string = h1Var.getText().toString();
        if (string.length() <= 0 || string.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            e1Var.run(Boolean.FALSE);
            return;
        }
        qf.q1 q1VarF = qf.q1.f(this.f37663a);
        int i11 = p1Var == null ? -1 : p1Var.f46418a;
        qf.p1 p1VarD = q1VarF.d(string);
        if (p1VarD == null || p1VarD.f46418a == i11) {
            callback.run(string);
            b2Var.dismiss();
        } else {
            AndroidUtilities.shakeView(h1Var);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            e1Var.run(Boolean.TRUE);
        }
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f37664b;
        final TLRPC.User user = (TLRPC.User) this.f37665c;
        final String str = (String) this.d;
        final String str2 = (String) this.f37666e;
        final gy gyVar2 = (gy) this.f37667f;
        Pattern pattern = LaunchActivity.f35496x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i12 = this.f37663a;
        if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.f35496x1;
                    Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                    long j11 = -j10;
                    bundleH.putLong("chat_id", j11);
                    rn rnVar = new rn(bundleH);
                    int i14 = i12;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str2, rnVar, null);
                    ((ActionBarLayout) launchActivity.O()).S(rnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    Pattern pattern2 = LaunchActivity.f35496x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(launchActivity, str, tL_chatAdminRights2, z12, str2, i12, chat, gyVar2, user, j10, str3));
                }
            });
        }
        return true;
    }

    public e80(qf.h1 h1Var, cg.e1 e1Var, int i10, qf.p1 p1Var, TextView textView, Utilities.Callback callback) {
        this.f37664b = h1Var;
        this.f37665c = e1Var;
        this.f37663a = i10;
        this.d = p1Var;
        this.f37666e = textView;
        this.f37667f = callback;
    }
}
