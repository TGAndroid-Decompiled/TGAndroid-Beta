package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class LaunchActivity$$ExternalSyntheticLambda107 implements DialogsActivity.DialogsActivityDelegate {
    public final int $r8$classId = 0;
    public final LaunchActivity f$0;
    public final String f$1;
    public final int f$2;
    public final TLRPC.User f$3;

    public LaunchActivity$$ExternalSyntheticLambda107(LaunchActivity launchActivity, String str, int i, TLRPC.User user) {
        this.f$0 = launchActivity;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = user;
    }

    @Override
    public final boolean canSelectStories() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public final boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = this.f$1;
                int i3 = this.f$2;
                tL_inputGameShortName.bot_id = MessagesController.getInstance(i3).getInputUser(this.f$3);
                SendMessagesHelper.getInstance(i3).sendGame(MessagesController.getInstance(i3).getInputPeer(j), tL_inputMediaGame, 0L, 0L);
                Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j)) {
                    bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j));
                } else if (DialogObject.isUserDialog(j)) {
                    bundleM.putLong("user_id", j);
                } else {
                    bundleM.putLong("chat_id", -j);
                }
                if (MessagesController.getInstance(i3).checkCanOpenChat(bundleM, dialogsActivity)) {
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(new ChatActivity(bundleM), true, false);
                }
                break;
            default:
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleM2 = zzkw.m("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j2)) {
                    bundleM2.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
                } else if (DialogObject.isUserDialog(j2)) {
                    bundleM2.putLong("user_id", j2);
                } else {
                    bundleM2.putLong("chat_id", -j2);
                }
                bundleM2.putString("attach_bot", UserObject.getPublicUsername(this.f$3));
                String str = this.f$1;
                if (str != null) {
                    bundleM2.putString("attach_bot_start_command", str);
                }
                int i4 = this.f$2;
                if (MessagesController.getInstance(i4).checkCanOpenChat(bundleM2, dialogsActivity)) {
                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    ((ActionBarLayout) launchActivity2.getActionBarLayout()).presentFragment$1(new ChatActivity(bundleM2), true, false);
                }
                break;
        }
        return true;
    }

    @Override
    public final boolean didSelectStories(DialogsActivity dialogsActivity) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    public LaunchActivity$$ExternalSyntheticLambda107(LaunchActivity launchActivity, TLRPC.User user, String str, int i) {
        this.f$0 = launchActivity;
        this.f$3 = user;
        this.f$1 = str;
        this.f$2 = i;
    }
}
