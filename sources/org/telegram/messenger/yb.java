package org.telegram.messenger;

import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class yb implements Runnable {
    public final int f22237a;
    public final Object f22238b;
    public final Object f22239c;

    public yb(int i9, Object obj, Object obj2) {
        this.f22237a = i9;
        this.f22238b = obj;
        this.f22239c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22237a) {
            case 0:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$394((TL_update.TL_updateLangPack) this.f22239c);
                return;
            case 1:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$384((TL_update.TL_updateGroupCallMessage) this.f22239c);
                return;
            case 2:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$385((TL_update.TL_updateDeleteGroupCallMessages) this.f22239c);
                return;
            case 3:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$386((TL_update.TL_updateUserTyping) this.f22239c);
                return;
            case 4:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$387((TL_update.TL_updateChatUserTyping) this.f22239c);
                return;
            case 5:
                MessagesController.lambda$setCustomChatReactions$468((Utilities.Callback) this.f22238b, (TLRPC.TL_error) this.f22239c);
                return;
            case 6:
                ((MessagesController) this.f22238b).lambda$getSponsoredMessages$438((TLRPC.messages_SponsoredMessages) this.f22239c);
                return;
            case 7:
                ((MessagesController) this.f22238b).lambda$processUpdateArray$412((TL_update.TL_updateChannel) this.f22239c);
                return;
            case 8:
                ((MessagesController) this.f22238b).lambda$getChannelDifference$338((TLRPC.updates_ChannelDifference) this.f22239c);
                return;
            case 9:
                ((MessagesController) this.f22238b).lambda$createChat$257((TLRPC.TL_messages_invitedUsers) this.f22239c);
                return;
            case 10:
                ((MessagesController) this.f22238b).lambda$addToViewsQueue$230((MessageObject) this.f22239c);
                return;
            case 11:
                ((MessagesController) this.f22238b).lambda$getSendAsPeers$441((TLRPC.TL_channels_sendAsPeers) this.f22239c);
                return;
            case 12:
                MessagesController.lambda$toggleChatNoForwards$277((Utilities.Callback2) this.f22238b, (TLRPC.TL_error) this.f22239c);
                return;
            case 13:
                ((MessagesController) this.f22238b).lambda$updateConfig$41((TLRPC.TL_config) this.f22239c);
                return;
            case 14:
                MessagesController.lambda$addUsersToChat$294((q0.a) this.f22238b, (TLRPC.User) this.f22239c);
                return;
            case 15:
                ((MessagesController) this.f22238b).lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) this.f22239c);
                return;
            case 16:
                ((MessagesController) this.f22238b).lambda$checkChatInviter$371((TLRPC.TL_channels_channelParticipant) this.f22239c);
                return;
            case 17:
                MessagesController.lambda$addUserToChat$299((Utilities.Callback) this.f22238b, (Runnable) this.f22239c);
                return;
            case 18:
                ((MessagesController.SavedMusicIds) this.f22238b).lambda$load$0((TLObject) this.f22239c);
                return;
            case 19:
                ((MessagesStorage) this.f22238b).lambda$updateTopicsWithReadMessages$59((HashMap) this.f22239c);
                return;
            case 20:
                ((MessagesStorage) this.f22238b).lambda$putGiftChatThemes$265((List) this.f22239c);
                return;
            case 21:
                ((MessagesStorage) this.f22238b).lambda$putPushMessage$42((MessageObject) this.f22239c);
                return;
            case 22:
                MessagesStorage.lambda$getMessages$161((Timer.Task) this.f22238b, (Runnable) this.f22239c);
                return;
            case 23:
                ((MessagesStorage) this.f22238b).lambda$updateChatParticipants$122((TLRPC.ChatParticipants) this.f22239c);
                return;
            case 24:
                ((MessagesStorage) this.f22238b).lambda$deleteDialogFilter$72((MessagesController.DialogFilter) this.f22239c);
                return;
            case 25:
                ((MessagesStorage) this.f22238b).lambda$loadGiftChatTheme$268((Utilities.Callback) this.f22239c);
                return;
            case 26:
                ((MessagesStorage) this.f22238b).lambda$putStoryPushMessage$38((NotificationsController.StoryNotification) this.f22239c);
                return;
            case 27:
                ((MessagesStorage) this.f22238b).lambda$updateMessageStateAndIdInternal$212((TLRPC.TL_updates) this.f22239c);
                return;
            case 28:
                ((MessagesStorage) this.f22238b).lambda$updateDialogData$241((TLRPC.Dialog) this.f22239c);
                return;
            default:
                NotificationBadge.NewHtcHomeBadger.lambda$executeBadge$0((Intent) this.f22238b, (Intent) this.f22239c);
                return;
        }
    }
}
