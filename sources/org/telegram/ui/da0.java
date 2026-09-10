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
public final class da0 implements qy {
    public final int f31871a = 1;
    public final LaunchActivity f31872b;
    public final String f31873c;
    public final int d;
    public final TLRPC.User e;

    public da0(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f31872b = launchActivity;
        this.f31873c = str;
        this.d = i10;
        this.e = user;
    }

    @Override
    public final boolean A() {
        switch (this.f31871a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean J(wy wyVar) {
        switch (this.f31871a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        int i12 = this.f31871a;
        TLRPC.User user = this.e;
        int i13 = this.d;
        String str = this.f31873c;
        LaunchActivity launchActivity = this.f31872b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i14 = a4.a.i("scrollToTopOnResume", true);
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
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, wyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new eo(i14), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f17257id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j10), tL_inputMediaGame, 0L, 0L);
                Bundle i15 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i15.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i15.putLong("user_id", j10);
                } else {
                    i15.putLong("chat_id", -j10);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, wyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new eo(i15), true, false);
                }
                return true;
        }
    }

    public da0(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f31872b = launchActivity;
        this.e = user;
        this.f31873c = str;
        this.d = i10;
    }
}
