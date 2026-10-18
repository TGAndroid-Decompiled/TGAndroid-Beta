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
public final class q80 implements xx {
    public final int f40339a = 0;
    public final LaunchActivity f40340b;
    public final TLRPC.User f40341c;
    public final String d;
    public final int e;

    public q80(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f40340b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f40341c = user;
    }

    @Override
    public final boolean D() {
        switch (this.f40339a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean K(ey eyVar) {
        switch (this.f40339a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        int i12 = this.f40339a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f40341c;
        LaunchActivity launchActivity = this.f40340b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f20341id = tL_inputGameShortName;
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
                if (MessagesController.getInstance(i13).checkCanOpenChat(h, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new sn(h), true, false);
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
                if (MessagesController.getInstance(i13).checkCanOpenChat(h10, eyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new sn(h10), true, false);
                }
                return true;
        }
    }

    public q80(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f40340b = launchActivity;
        this.f40341c = user;
        this.d = str;
        this.e = i10;
    }
}
