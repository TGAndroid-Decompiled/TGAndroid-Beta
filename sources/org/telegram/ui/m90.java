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
public final class m90 implements yx {
    public final int f40496a = 1;
    public final LaunchActivity f40497b;
    public final String f40498c;
    public final int d;
    public final TLRPC.User f40499e;

    public m90(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f40497b = launchActivity;
        this.f40498c = str;
        this.d = i10;
        this.f40499e = user;
    }

    @Override
    public final boolean C() {
        switch (this.f40496a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean J(fy fyVar) {
        switch (this.f40496a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        int i12 = this.f40496a;
        TLRPC.User user = this.f40499e;
        int i13 = this.d;
        String str = this.f40498c;
        LaunchActivity launchActivity = this.f40497b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i14 = a4.w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    i14.putLong("user_id", j10);
                } else {
                    i14.putLong("chat_id", -j10);
                }
                i14.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    i14.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i14, fyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new tn(i14), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.f35560x1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f22454id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j11), tL_inputMediaGame, 0L, 0L);
                Bundle i15 = a4.w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i15.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    i15.putLong("user_id", j11);
                } else {
                    i15.putLong("chat_id", -j11);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(i15, fyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new tn(i15), true, false);
                }
                return true;
        }
    }

    public m90(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f40497b = launchActivity;
        this.f40499e = user;
        this.f40498c = str;
        this.d = i10;
    }
}
