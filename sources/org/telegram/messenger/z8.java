package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19800a;
    public final Object f19801b;
    public final Object f19802c;
    public final Object d;

    public z8(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f19800a = i10;
        this.f19801b = obj;
        this.d = obj2;
        this.f19802c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19800a) {
            case 0:
                ((MediaDataController) this.f19801b).lambda$clearBotKeyboard$193((ArrayList) this.f19802c, (MessagesStorage.TopicKey) this.d);
                return;
            case 1:
                ((MediaDataController) this.f19801b).lambda$findStickerSetByNameInCache$30((String) this.f19802c, (Utilities.Callback) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19801b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f19802c, (TLObject) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19801b).lambda$processLoadedMedia$135((ArrayList) this.f19802c, (y6) this.d);
                return;
            case 4:
                ((MediaDataController) this.f19801b).lambda$saveToRingtones$203((TLObject) this.f19802c, (TLRPC.Document) this.d);
                return;
            case 5:
                ((MediaDataController) this.f19801b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f19802c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f19801b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f19802c);
                return;
            case 7:
                ((MessagesController) this.f19801b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f19802c, (cb) this.d);
                return;
            case 8:
                ((MessagesController) this.f19801b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f19802c, (db) this.d);
                return;
            case 9:
                ((MessagesController) this.f19801b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f19802c, (String) this.d);
                return;
            case 10:
                ((MessagesController) this.f19801b).lambda$addUsersToChat$296((TLRPC.Chat) this.f19802c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.f19801b, (boolean[]) this.f19802c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f19801b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.f19802c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 13:
                ((MessagesController) this.f19801b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f19802c, (LongSparseIntArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f19801b).lambda$getDifference$353((ArrayList) this.f19802c, (TLRPC.updates_Difference) this.d);
                return;
            case 15:
                ((MessagesController) this.f19801b).lambda$getChannelDifference$342((ArrayList) this.f19802c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController.SavedMusicList) this.f19801b).lambda$load$0((TLObject) this.d, (ArrayList) this.f19802c);
                return;
            case 17:
                ((MessagesStorage) this.f19801b).lambda$saveBotCache$126((TLObject) this.f19802c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f19801b).lambda$applyPhoneBookUpdates$148((String) this.f19802c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f19801b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f19802c);
                return;
            case 20:
                ((MessagesStorage) this.f19801b).lambda$getNewTask$111((a0.i) this.f19802c, (a0.i) this.d);
                return;
            case 21:
                ((SavedMessagesController) this.f19801b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f19802c);
                return;
            case 22:
                ((SecretChatHelper) this.f19801b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f19802c, (TLRPC.EncryptedChat) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f19801b).lambda$sendVote$31((String) this.f19802c, (Runnable) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f19801b).lambda$performSendDelayedMessage$49((TLObject) this.f19802c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f19801b).lambda$sendMessage$14((TLRPC.TL_error) this.f19802c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 26:
                ((TelegramMediaSession) this.f19801b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f19802c, (String) this.d);
                return;
            case 27:
                ((TranslateController) this.f19801b).lambda$checkDialogMessageSure$10((ArrayList) this.f19802c, (ArrayList) this.d);
                return;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.f19801b, (Utilities.Callback[]) this.f19802c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19801b, (String) this.f19802c, (byte[]) this.d);
                return;
        }
    }

    public z8(Object obj, Object obj2, Object obj3, int i10) {
        this.f19800a = i10;
        this.f19801b = obj;
        this.f19802c = obj2;
        this.d = obj3;
    }
}
