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
public final class i90 implements wx {
    public final int f39081a = 1;
    public final LaunchActivity f39082b;
    public final String f39083c;
    public final int d;
    public final TLRPC.User f39084e;

    public i90(LaunchActivity launchActivity, String str, int i9, TLRPC.User user) {
        this.f39082b = launchActivity;
        this.f39083c = str;
        this.d = i9;
        this.f39084e = user;
    }

    @Override
    public final boolean C() {
        switch (this.f39081a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean I(dy dyVar) {
        switch (this.f39081a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        int i11 = this.f39081a;
        TLRPC.User user = this.f39084e;
        int i12 = this.d;
        String str = this.f39083c;
        LaunchActivity launchActivity = this.f39082b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i13 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                i13.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    i13.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i12).checkCanOpenChat(i13, dyVar)) {
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new qn(i13), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f22442id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i12).getInputUser(user);
                SendMessagesHelper.getInstance(i12).sendGame(MessagesController.getInstance(i12).getInputPeer(j11), tL_inputMediaGame, 0L, 0L);
                Bundle i14 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i14.putLong("user_id", j11);
                } else {
                    i14.putLong("chat_id", -j11);
                }
                if (MessagesController.getInstance(i12).checkCanOpenChat(i14, dyVar)) {
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new qn(i14), true, false);
                }
                return true;
        }
    }

    public i90(LaunchActivity launchActivity, TLRPC.User user, String str, int i9) {
        this.f39082b = launchActivity;
        this.f39084e = user;
        this.f39083c = str;
        this.d = i9;
    }
}
