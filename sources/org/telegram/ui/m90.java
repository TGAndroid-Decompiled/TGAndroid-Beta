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

public final class m90 implements zx {

    public final int f40402a = 1;

    public final LaunchActivity f40403b;

    public final String f40404c;
    public final int d;

    public final TLRPC.User f40405e;

    public m90(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f40403b = launchActivity;
        this.f40404c = str;
        this.d = i10;
        this.f40405e = user;
    }

    @Override
    public final boolean D() {
        switch (this.f40402a) {
        }
        return false;
    }

    @Override
    public final boolean K(gy gyVar) {
        switch (this.f40402a) {
        }
        return false;
    }

    @Override
    public final boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        int i12 = this.f40402a;
        TLRPC.User user = this.f40405e;
        int i13 = this.d;
        String str = this.f40404c;
        LaunchActivity launchActivity = this.f40403b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else if (DialogObject.isUserDialog(j10)) {
                    bundleH.putLong("user_id", j10);
                } else {
                    bundleH.putLong("chat_id", -j10);
                }
                bundleH.putString("attach_bot", UserObject.getPublicUsername(user));
                if (str != null) {
                    bundleH.putString("attach_bot_start_command", str);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(bundleH, gyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new rn(bundleH), true, false);
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f22442id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i13).getInputUser(user);
                SendMessagesHelper.getInstance(i13).sendGame(MessagesController.getInstance(i13).getInputPeer(j11), tL_inputMediaGame, 0L, 0L);
                Bundle bundleH2 = a9.p.h("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    bundleH2.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else if (DialogObject.isUserDialog(j11)) {
                    bundleH2.putLong("user_id", j11);
                } else {
                    bundleH2.putLong("chat_id", -j11);
                }
                if (MessagesController.getInstance(i13).checkCanOpenChat(bundleH2, gyVar)) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.O()).S(new rn(bundleH2), true, false);
                }
                break;
        }
        return true;
    }

    public m90(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f40403b = launchActivity;
        this.f40405e = user;
        this.f40404c = str;
        this.d = i10;
    }
}
