package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.messenger.FileLog;

public class TLClassStore {
    static TLClassStore store;
    private SparseArray<Class> classStore;

    public TLClassStore() {
        SparseArray<Class> sparseArray = new SparseArray<>();
        this.classStore = sparseArray;
        sparseArray.put(TLRPC$TL_error.constructor, TLRPC$TL_error.class);
        this.classStore.put(TLRPC$TL_decryptedMessageService.constructor, TLRPC$TL_decryptedMessageService.class);
        this.classStore.put(TLRPC$TL_decryptedMessage.constructor, TLRPC$TL_decryptedMessage.class);
        this.classStore.put(TLRPC$TL_config.constructor, TLRPC$TL_config.class);
        this.classStore.put(TLRPC$TL_decryptedMessageLayer.constructor, TLRPC$TL_decryptedMessageLayer.class);
        this.classStore.put(TLRPC$TL_decryptedMessage_layer17.constructor, TLRPC$TL_decryptedMessage.class);
        this.classStore.put(TLRPC$TL_decryptedMessage_layer45.constructor, TLRPC$TL_decryptedMessage_layer45.class);
        this.classStore.put(TLRPC$TL_decryptedMessageService_layer8.constructor, TLRPC$TL_decryptedMessageService_layer8.class);
        this.classStore.put(TLRPC$TL_decryptedMessage_layer8.constructor, TLRPC$TL_decryptedMessage_layer8.class);
        this.classStore.put(TLRPC$TL_message_secret.constructor, TLRPC$TL_message_secret.class);
        this.classStore.put(TLRPC$TL_message_secret_layer72.constructor, TLRPC$TL_message_secret_layer72.class);
        this.classStore.put(TLRPC$TL_message_secret_old.constructor, TLRPC$TL_message_secret_old.class);
        this.classStore.put(TLRPC$TL_messageEncryptedAction.constructor, TLRPC$TL_messageEncryptedAction.class);
        this.classStore.put(TLRPC$TL_null.constructor, TLRPC$TL_null.class);
        this.classStore.put(TLRPC$TL_updateShortChatMessage.constructor, TLRPC$TL_updateShortChatMessage.class);
        this.classStore.put(TLRPC$TL_updates.constructor, TLRPC$TL_updates.class);
        this.classStore.put(TLRPC$TL_updateShortMessage.constructor, TLRPC$TL_updateShortMessage.class);
        this.classStore.put(TLRPC$TL_updateShort.constructor, TLRPC$TL_updateShort.class);
        this.classStore.put(TLRPC$TL_updatesCombined.constructor, TLRPC$TL_updatesCombined.class);
        this.classStore.put(TLRPC$TL_updateShortSentMessage.constructor, TLRPC$TL_updateShortSentMessage.class);
        this.classStore.put(TLRPC$TL_updatesTooLong.constructor, TLRPC$TL_updatesTooLong.class);
    }

    public static TLClassStore Instance() {
        if (store == null) {
            store = new TLClassStore();
        }
        return store;
    }

    public TLObject TLdeserialize(NativeByteBuffer nativeByteBuffer, int i, boolean z) {
        Class cls = this.classStore.get(i);
        if (cls != null) {
            try {
                TLObject tLObject = (TLObject) cls.newInstance();
                tLObject.readParams(nativeByteBuffer, z);
                return tLObject;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return null;
    }
}
