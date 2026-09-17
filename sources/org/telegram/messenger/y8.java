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
public final class y8 implements Runnable {
    public final int f19744a;
    public final Object f19745b;
    public final Object f19746c;
    public final Object d;

    public y8(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.f19744a = i10;
        this.f19745b = obj;
        this.d = obj2;
        this.f19746c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19744a) {
            case 0:
                ((MediaDataController) this.f19745b).lambda$clearBotKeyboard$193((ArrayList) this.f19746c, (MessagesStorage.TopicKey) this.d);
                return;
            case 1:
                ((MediaDataController) this.f19745b).lambda$findStickerSetByNameInCache$30((String) this.f19746c, (Utilities.Callback) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19745b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.f19746c, (TLObject) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19745b).lambda$processLoadedMedia$135((ArrayList) this.f19746c, (x6) this.d);
                return;
            case 4:
                ((MediaDataController) this.f19745b).lambda$saveToRingtones$203((TLObject) this.f19746c, (TLRPC.Document) this.d);
                return;
            case 5:
                ((MediaDataController) this.f19745b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f19746c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f19745b).lambda$requestIsUserContactBlocked$494((TLObject) this.d, (ArrayList) this.f19746c);
                return;
            case 7:
                ((MessagesController) this.f19745b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.f19746c, (bb) this.d);
                return;
            case 8:
                ((MessagesController) this.f19745b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.f19746c, (cb) this.d);
                return;
            case 9:
                ((MessagesController) this.f19745b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.f19746c, (String) this.d);
                return;
            case 10:
                ((MessagesController) this.f19745b).lambda$addUsersToChat$296((TLRPC.Chat) this.f19746c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 11:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.b2[]) this.f19745b, (boolean[]) this.f19746c, (org.telegram.ui.ActionBar.n2) this.d);
                return;
            case 12:
                ((MessagesController) this.f19745b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.f19746c, (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 13:
                ((MessagesController) this.f19745b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.f19746c, (LongSparseIntArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f19745b).lambda$getDifference$353((ArrayList) this.f19746c, (TLRPC.updates_Difference) this.d);
                return;
            case 15:
                ((MessagesController) this.f19745b).lambda$getChannelDifference$342((ArrayList) this.f19746c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController.SavedMusicList) this.f19745b).lambda$load$0((TLObject) this.d, (ArrayList) this.f19746c);
                return;
            case 17:
                ((MessagesStorage) this.f19745b).lambda$saveBotCache$126((TLObject) this.f19746c, (String) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f19745b).lambda$applyPhoneBookUpdates$148((String) this.f19746c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f19745b).lambda$replaceMessageIfExists$232((MessageObject) this.d, (ArrayList) this.f19746c);
                return;
            case 20:
                ((MessagesStorage) this.f19745b).lambda$getNewTask$111((a0.i) this.f19746c, (a0.i) this.d);
                return;
            case 21:
                ((SavedMessagesController) this.f19745b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.f19746c);
                return;
            case 22:
                ((SecretChatHelper) this.f19745b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f19746c, (TLRPC.EncryptedChat) this.d);
                return;
            case 23:
                ((SendMessagesHelper) this.f19745b).lambda$sendVote$31((String) this.f19746c, (Runnable) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f19745b).lambda$performSendDelayedMessage$49((TLObject) this.f19746c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f19745b).lambda$sendMessage$14((TLRPC.TL_error) this.f19746c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 26:
                ((TelegramMediaSession) this.f19745b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f19746c, (String) this.d);
                return;
            case 27:
                ((TranslateController) this.f19745b).lambda$checkDialogMessageSure$10((ArrayList) this.f19746c, (ArrayList) this.d);
                return;
            case 28:
                Utilities.lambda$raceCallbacks$1((int[]) this.f19745b, (Utilities.Callback[]) this.f19746c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19745b, (String) this.f19746c, (byte[]) this.d);
                return;
        }
    }

    public y8(Object obj, Object obj2, Object obj3, int i10) {
        this.f19744a = i10;
        this.f19745b = obj;
        this.f19746c = obj2;
        this.d = obj3;
    }
}
