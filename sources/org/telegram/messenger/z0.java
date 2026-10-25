package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z0 implements Runnable {
    public final int f21948a;
    public final long f21949b;
    public final Object f21950c;
    public final Object d;
    public final Object e;

    public z0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f21948a = i10;
        this.f21950c = obj;
        this.d = obj2;
        this.f21949b = j10;
        this.e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21948a) {
            case 0:
                ((ChatMessagesMetadataController) this.f21950c).lambda$loadStoriesForMessages$1((MessageObject) this.d, this.f21949b, (TL_stories.StoryItem) this.e);
                return;
            case 1:
                ((MediaDataController) this.f21950c).lambda$loadReplyMessagesForMessages$170((Timer.Task) this.d, this.f21949b, (ArrayList) this.e);
                return;
            case 2:
                ((MediaDataController) this.f21950c).lambda$loadMusic$141(this.f21949b, (ArrayList) this.d, (ArrayList) this.e);
                return;
            case 3:
                ((MessagesController) this.f21950c).lambda$getGroupCall$61((TLObject) this.d, this.f21949b, (Runnable) this.e);
                return;
            case 4:
                ((MessagesController) this.f21950c).lambda$reloadMessages$72(this.f21949b, (ArrayList) this.d, (ArrayList) this.e);
                return;
            case 5:
                ((MessagesController) this.f21950c).lambda$checkPromoInfoInternal$164((TLRPC.TL_help_promoData) this.d, (TLRPC.TL_messages_peerDialogs) this.e, this.f21949b);
                return;
            case 6:
                ((MessagesController) this.f21950c).lambda$checkChatInviter$375(this.f21949b, (ArrayList) this.d, (TLRPC.TL_channels_channelParticipant) this.e);
                return;
            case 7:
                ((MessagesController) this.f21950c).lambda$addUserToChat$299((Utilities.Callback) this.d, (TLRPC.TL_messages_invitedUsers) this.e, this.f21949b);
                return;
            case 8:
                ((MessagesController) this.f21950c).lambda$updateChannelUserName$290(this.f21949b, (String) this.d, (Runnable) this.e);
                return;
            case 9:
                ((MessagesStorage) this.f21950c).lambda$updateMessagePollResults$104(this.f21949b, (TLRPC.Poll) this.d, (TLRPC.PollResults) this.e);
                return;
            case 10:
                ((MessagesStorage) this.f21950c).lambda$onReactionsUpdate$109((TLRPC.TL_messageReactions) this.d, (TLRPC.TL_messageReactions) this.e, this.f21949b);
                return;
            case 11:
                ((MessagesStorage) this.f21950c).lambda$getUserSync$261((TLRPC.User[]) this.d, this.f21949b, (CountDownLatch) this.e);
                return;
            case 12:
                ((MessagesStorage) this.f21950c).lambda$containsLocalDialog$182(this.f21949b, (Boolean[]) this.d, (CountDownLatch) this.e);
                return;
            case 13:
                ((MessagesStorage) this.f21950c).lambda$getChannelPtsSync$260(this.f21949b, (Integer[]) this.d, (CountDownLatch) this.e);
                return;
            case 14:
                ((MessagesStorage) this.f21950c).lambda$getChatSync$262((TLRPC.Chat[]) this.d, this.f21949b, (CountDownLatch) this.e);
                return;
            case 15:
                ((MessagesStorage) this.f21950c).lambda$deleteUserChatHistory$88((ArrayList) this.d, this.f21949b, (ArrayList) this.e);
                return;
            case 16:
                ((MessagesStorage) this.f21950c).lambda$loadPendingTasks$14((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, this.f21949b);
                return;
            case 17:
                ((MessagesStorage) this.f21950c).lambda$getEncryptedChat$180(this.f21949b, (ArrayList) this.d, (CountDownLatch) this.e);
                return;
            case 18:
                ((SavedMessagesController) this.f21950c).lambda$updateDialogsLastMessage$9((MessagesStorage) this.d, (ArrayList) this.e, this.f21949b);
                return;
            default:
                ((SavedMessagesController) this.f21950c).lambda$loadCache$7((MessagesStorage) this.d, this.f21949b, (Runnable) this.e);
                return;
        }
    }

    public z0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f21948a = i10;
        this.f21950c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f21949b = j10;
    }

    public z0(BaseController baseController, long j10, Object obj, Object obj2, int i10) {
        this.f21948a = i10;
        this.f21950c = baseController;
        this.f21949b = j10;
        this.d = obj;
        this.e = obj2;
    }
}
