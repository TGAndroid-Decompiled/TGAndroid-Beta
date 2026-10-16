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
public final class ia0 implements sy {
    public final int f36766a = 1;
    public final LaunchActivity f36767b;
    public final String f36768c;
    public final int d;
    public final TLRPC.User e;

    public ia0(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f36767b = launchActivity;
        this.f36768c = str;
        this.d = i10;
        this.e = user;
    }

    @Override
    public final boolean D() {
        switch (this.f36766a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean L(yy yyVar) {
        switch (this.f36766a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        int i12 = this.f36766a;
        TLRPC.User user = this.e;
        int i13 = this.d;
        String str = this.f36768c;
        LaunchActivity launchActivity = this.f36767b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    h.putLong("user_id", j10);
                } else {
                    h.putLong("chat_id", -j10);
                }
                h.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    h.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h, yyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new fo(h), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f18978id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j11), tL_inputMediaGame, 0L, 0L);
                Bundle h10 = a1.g.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    h10.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    h10.putLong("user_id", j11);
                } else {
                    h10.putLong("chat_id", -j11);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(h10, yyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new fo(h10), true, false);
                }
                return true;
        }
    }

    public ia0(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f36767b = launchActivity;
        this.e = user;
        this.f36768c = str;
        this.d = i10;
    }
}
