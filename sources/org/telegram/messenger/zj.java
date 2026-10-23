package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class zj implements Runnable {
    public final int f20333a;
    public final boolean f20334b;
    public final Object f20335c;
    public final Object d;
    public final Object e;

    public zj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f20333a = i10;
        this.f20335c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20334b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20333a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f20335c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f20334b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f20335c, (Pair) this.d, this.e, this.f20334b);
                return;
            case 2:
                ((ChatObject.Call) this.f20335c).lambda$loadMembers$2(this.f20334b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f20335c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f20334b);
                return;
            case 4:
                ((ContactsController) this.f20335c).lambda$deleteContact$56((ArrayList) this.d, this.f20334b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f20335c).lambda$toggleRecordingPause$29((File) this.d, this.f20334b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f20335c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f20334b);
                return;
            case 7:
                ((MediaDataController) this.f20335c).lambda$saveReplyMessages$178(this.f20334b, (ArrayList) this.d, (a0.h) this.e);
                return;
            case 8:
                ((MediaDataController) this.f20335c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.e, this.f20334b);
                return;
            case 9:
                ((MediaDataController) this.f20335c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f20334b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f20335c).lambda$getBlockedPeers$111((TLObject) this.d, this.f20334b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 11:
                ((MessagesController) this.f20335c).lambda$processUpdates$380(this.f20334b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f20335c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f20334b);
                return;
            case 13:
                ((MessagesStorage) this.f20335c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f20334b);
                return;
            default:
                ((NotificationsController) this.f20335c).lambda$removeDeletedMessagesFromNotifications$11((a0.h) this.d, this.f20334b, (ArrayList) this.e);
                return;
        }
    }

    public zj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f20333a = i10;
        this.f20335c = obj;
        this.d = obj2;
        this.f20334b = z10;
        this.e = obj3;
    }

    public zj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f20333a = i10;
        this.f20335c = obj;
        this.f20334b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public zj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f20333a = 6;
        this.f20335c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f20334b = z10;
    }
}
