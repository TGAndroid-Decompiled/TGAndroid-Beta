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
public final class n80 implements jy, org.telegram.ui.ActionBar.c2 {
    public final int f39223a;
    public final KeyEvent.Callback f39224b;
    public final Object f39225c;
    public final Object d;
    public final Object f39226e;
    public final Object f39227f;

    public n80(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, py pyVar) {
        this.f39224b = launchActivity;
        this.f39223a = i10;
        this.f39225c = user;
        this.d = str;
        this.f39226e = str2;
        this.f39227f = pyVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        vf.g1 g1Var = (vf.g1) this.f39224b;
        hg.c1 c1Var = (hg.c1) this.f39225c;
        vf.o1 o1Var = (vf.o1) this.d;
        TextView textView = (TextView) this.f39226e;
        Utilities.Callback callback = (Utilities.Callback) this.f39227f;
        String obj = g1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            vf.p1 f10 = vf.p1.f(this.f39223a);
            if (o1Var == null) {
                i11 = -1;
            } else {
                i11 = o1Var.f49196a;
            }
            vf.o1 d = f10.d(obj);
            if (d != null && d.f49196a != i11) {
                AndroidUtilities.shakeView(g1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                c1Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            d2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(g1Var);
        c1Var.run(Boolean.FALSE);
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f39224b;
        final TLRPC.User user = (TLRPC.User) this.f39225c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f39226e;
        final py pyVar2 = (py) this.f39227f;
        Pattern pattern = LaunchActivity.f34134y1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(-j10));
        final int i12 = this.f39223a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z11, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.f34134y1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.p8(LaunchActivity.this, str2, tL_chatAdminRights2, z11, str3, i12, chat, pyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.c2() {
                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.f34134y1;
                    Bundle i14 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    xn xnVar = new xn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str3, xnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(xnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n80(vf.g1 g1Var, hg.c1 c1Var, int i10, vf.o1 o1Var, TextView textView, Utilities.Callback callback) {
        this.f39224b = g1Var;
        this.f39225c = c1Var;
        this.f39223a = i10;
        this.d = o1Var;
        this.f39226e = textView;
        this.f39227f = callback;
    }
}
