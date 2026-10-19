package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o80 implements vx {
    public final int f39788a = 0;
    public final LaunchActivity f39789b;
    public final TLRPC.User f39790c;
    public final String d;
    public final int e;

    public o80(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f39789b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f39790c = user;
    }

    @Override
    public final boolean D() {
        switch (this.f39788a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean J(cy cyVar) {
        switch (this.f39788a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        int i12 = this.f39788a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f39790c;
        LaunchActivity launchActivity = this.f39789b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f20335id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j10), tL_inputMediaGame, 0L, 0L);
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h, cyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new qn(h), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h10 = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                h10.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    h10.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h10, cyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new qn(h10), true, false);
                }
                return true;
        }
    }

    public o80(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f39789b = launchActivity;
        this.f39790c = user;
        this.d = str;
        this.e = i10;
    }
}
