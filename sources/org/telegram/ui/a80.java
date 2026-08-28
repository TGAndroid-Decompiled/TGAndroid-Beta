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
public final class a80 implements wx, org.telegram.ui.ActionBar.b2 {
    public final int f36390a;
    public final KeyEvent.Callback f36391b;
    public final Object f36392c;
    public final Object d;
    public final Object f36393e;
    public final Object f36394f;

    public a80(LaunchActivity launchActivity, int i9, TLRPC.User user, String str, String str2, dy dyVar) {
        this.f36391b = launchActivity;
        this.f36390a = i9;
        this.f36392c = user;
        this.d = str;
        this.f36393e = str2;
        this.f36394f = dyVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        pf.h1 h1Var = (pf.h1) this.f36391b;
        bg.j1 j1Var = (bg.j1) this.f36392c;
        pf.q1 q1Var = (pf.q1) this.d;
        TextView textView = (TextView) this.f36393e;
        Utilities.Callback callback = (Utilities.Callback) this.f36394f;
        String obj = h1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            pf.r1 f10 = pf.r1.f(this.f36390a);
            if (q1Var == null) {
                i10 = -1;
            } else {
                i10 = q1Var.f45756a;
            }
            pf.q1 d = f10.d(obj);
            if (d != null && d.f45756a != i10) {
                AndroidUtilities.shakeView(h1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                j1Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            c2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(h1Var);
        j1Var.run(Boolean.FALSE);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f36391b;
        final TLRPC.User user = (TLRPC.User) this.f36392c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f36393e;
        final dy dyVar2 = (dy) this.f36394f;
        Pattern pattern = LaunchActivity.f35493x1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10));
        final int i11 = this.f36390a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i11).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.f35493x1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.j8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i11, chat, dyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                    Pattern pattern2 = LaunchActivity.f35493x1;
                    Bundle i13 = aa.d.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i13.putLong("chat_id", j11);
                    qn qnVar = new qn(i13);
                    int i14 = i11;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str3, qnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(qnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public a80(pf.h1 h1Var, bg.j1 j1Var, int i9, pf.q1 q1Var, TextView textView, Utilities.Callback callback) {
        this.f36391b = h1Var;
        this.f36392c = j1Var;
        this.f36390a = i9;
        this.d = q1Var;
        this.f36393e = textView;
        this.f36394f = callback;
    }
}
