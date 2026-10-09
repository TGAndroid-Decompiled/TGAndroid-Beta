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
public final class da0 implements ny {
    public final int f36915a = 1;
    public final LaunchActivity f36916b;
    public final String f36917c;
    public final int d;
    public final TLRPC.User f36918e;

    public da0(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f36916b = launchActivity;
        this.f36917c = str;
        this.d = i10;
        this.f36918e = user;
    }

    @Override
    public final boolean C() {
        switch (this.f36915a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean K(ty tyVar) {
        switch (this.f36915a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        int i12 = this.f36915a;
        TLRPC.User user = this.f36918e;
        int i13 = this.d;
        String str = this.f36917c;
        LaunchActivity launchActivity = this.f36916b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    i14.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else if (DialogObject.isUserDialog(j3)) {
                    i14.putLong("user_id", j3);
                } else {
                    i14.putLong("chat_id", -j3);
                }
                i14.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    i14.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, tyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new zn(i14), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f20100id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j10), tL_inputMediaGame, 0L, 0L);
                Bundle i15 = a1.g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i15.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i15.putLong("user_id", j10);
                } else {
                    i15.putLong("chat_id", -j10);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, tyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new zn(i15), true, false);
                }
                return true;
        }
    }

    public da0(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f36916b = launchActivity;
        this.f36918e = user;
        this.f36917c = str;
        this.d = i10;
    }
}
