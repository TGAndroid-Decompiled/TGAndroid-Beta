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
public final class d80 implements yx, org.telegram.ui.ActionBar.b2 {
    public final int f37404a;
    public final KeyEvent.Callback f37405b;
    public final Object f37406c;
    public final Object d;
    public final Object f37407e;
    public final Object f37408f;

    public d80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, fy fyVar) {
        this.f37405b = launchActivity;
        this.f37404a = i10;
        this.f37406c = user;
        this.d = str;
        this.f37407e = str2;
        this.f37408f = fyVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        sf.h1 h1Var = (sf.h1) this.f37405b;
        eg.d1 d1Var = (eg.d1) this.f37406c;
        sf.r1 r1Var = (sf.r1) this.d;
        TextView textView = (TextView) this.f37407e;
        Utilities.Callback callback = (Utilities.Callback) this.f37408f;
        String obj = h1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            sf.s1 f9 = sf.s1.f(this.f37404a);
            if (r1Var == null) {
                i11 = -1;
            } else {
                i11 = r1Var.f47935a;
            }
            sf.r1 d = f9.d(obj);
            if (d != null && d.f47935a != i11) {
                AndroidUtilities.shakeView(h1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                d1Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            c2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(h1Var);
        d1Var.run(Boolean.FALSE);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f37405b;
        final TLRPC.User user = (TLRPC.User) this.f37406c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f37407e;
        final fy fyVar2 = (fy) this.f37408f;
        Pattern pattern = LaunchActivity.f35560x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i12 = this.f37404a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.f35560x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.o8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, fyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() {
                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.f35560x1;
                    Bundle i14 = a4.w.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    tn tnVar = new tn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str3, tnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(tnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public d80(sf.h1 h1Var, eg.d1 d1Var, int i10, sf.r1 r1Var, TextView textView, Utilities.Callback callback) {
        this.f37405b = h1Var;
        this.f37406c = d1Var;
        this.f37404a = i10;
        this.d = r1Var;
        this.f37407e = textView;
        this.f37408f = callback;
    }
}
