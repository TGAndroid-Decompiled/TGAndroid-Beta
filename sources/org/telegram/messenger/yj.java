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
public final class yj implements Runnable {
    public final int f20192a;
    public final boolean f20193b;
    public final Object f20194c;
    public final Object d;
    public final Object e;

    public yj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f20192a = i10;
        this.f20194c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20193b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20192a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f20194c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f20193b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f20194c, (Pair) this.d, this.e, this.f20193b);
                return;
            case 2:
                ((ChatObject.Call) this.f20194c).lambda$loadMembers$2(this.f20193b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f20194c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f20193b);
                return;
            case 4:
                ((ContactsController) this.f20194c).lambda$deleteContact$56((ArrayList) this.d, this.f20193b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f20194c).lambda$toggleRecordingPause$28((File) this.d, this.f20193b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f20194c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f20193b);
                return;
            case 7:
                ((MediaDataController) this.f20194c).lambda$saveReplyMessages$178(this.f20193b, (ArrayList) this.d, (a0.h) this.e);
                return;
            case 8:
                ((MediaDataController) this.f20194c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.e, this.f20193b);
                return;
            case 9:
                ((MediaDataController) this.f20194c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f20193b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f20194c).lambda$getBlockedPeers$111((TLObject) this.d, this.f20193b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 11:
                ((MessagesController) this.f20194c).lambda$processUpdates$380(this.f20193b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f20194c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f20193b);
                return;
            case 13:
                ((MessagesStorage) this.f20194c).lambda$putUsersAndChats$181((List) this.d, (List) this.e, this.f20193b);
                return;
            default:
                ((NotificationsController) this.f20194c).lambda$removeDeletedMessagesFromNotifications$11((a0.h) this.d, this.f20193b, (ArrayList) this.e);
                return;
        }
    }

    public yj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f20192a = i10;
        this.f20194c = obj;
        this.d = obj2;
        this.f20193b = z10;
        this.e = obj3;
    }

    public yj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f20192a = i10;
        this.f20194c = obj;
        this.f20193b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public yj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f20192a = 6;
        this.f20194c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f20193b = z10;
    }
}
