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
    public final int f18290a;
    public final Object f18291b;
    public final Object f18292c;
    public final Object d;

    public z8(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f18290a = i10;
        this.f18291b = obj;
        this.d = obj2;
        this.f18292c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18290a) {
            case 0:
                ((MediaDataController) this.f18291b).lambda$clearBotKeyboard$193((ArrayList) this.f18292c, (MessagesStorage.TopicKey) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18291b).lambda$findStickerSetByNameInCache$30((String) this.f18292c, (Utilities.Callback) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18291b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f18292c, (TLObject) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18291b).lambda$processLoadedMedia$135((ArrayList) this.f18292c, (y6) this.d);
                return;
            case 4:
                ((MediaDataController) this.f18291b).lambda$saveToRingtones$203((TLObject) this.f18292c, (TLRPC.Document) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18291b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18292c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18291b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f18292c);
                return;
            case 7:
                ((MessagesController) this.f18291b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f18292c, (cb) this.d);
                return;
            case 8:
                ((MessagesController) this.f18291b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f18292c, (db) this.d);
                return;
            case 9:
                ((MessagesController) this.f18291b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f18292c, (String) this.d);
                return;
            case 10:
                ((MessagesController) this.f18291b).lambda$addUsersToChat$296((TLRPC.Chat) this.f18292c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.f18291b, (boolean[]) this.f18292c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f18291b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.f18292c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 13:
                ((MessagesController) this.f18291b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f18292c, (LongSparseIntArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f18291b).lambda$getDifference$353((ArrayList) this.f18292c, (TLRPC.updates_Difference) this.d);
                return;
            case 15:
                ((MessagesController) this.f18291b).lambda$getChannelDifference$342((ArrayList) this.f18292c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController.SavedMusicList) this.f18291b).lambda$load$0((TLObject) this.d, (ArrayList) this.f18292c);
                return;
            case 17:
                ((MessagesStorage) this.f18291b).lambda$saveBotCache$126((TLObject) this.f18292c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18291b).lambda$applyPhoneBookUpdates$148((String) this.f18292c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18291b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f18292c);
                return;
            case 20:
                ((MessagesStorage) this.f18291b).lambda$getNewTask$111((a0.i) this.f18292c, (a0.i) this.d);
                return;
            case 21:
                ((SavedMessagesController) this.f18291b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f18292c);
                return;
            case 22:
                ((SecretChatHelper) this.f18291b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18292c, (TLRPC.EncryptedChat) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f18291b).lambda$sendVote$31((String) this.f18292c, (Runnable) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f18291b).lambda$performSendDelayedMessage$49((TLObject) this.f18292c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f18291b).lambda$sendMessage$14((TLRPC.TL_error) this.f18292c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 26:
                ((TelegramMediaSession) this.f18291b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18292c, (String) this.d);
                return;
            case 27:
                ((TranslateController) this.f18291b).lambda$checkDialogMessageSure$10((ArrayList) this.f18292c, (ArrayList) this.d);
                return;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.f18291b, (Utilities.Callback[]) this.f18292c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f18291b, (String) this.f18292c, (byte[]) this.d);
                return;
        }
    }

    public z8(Object obj, Object obj2, Object obj3, int i10) {
        this.f18290a = i10;
        this.f18291b = obj;
        this.f18292c = obj2;
        this.d = obj3;
    }
}
