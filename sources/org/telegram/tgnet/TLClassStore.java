package org.telegram.tgnet;

import android.util.SparseArray;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

public class TLClassStore {
    static TLClassStore store;
    private SparseArray<Class> classStore;

    public TLClassStore() {
        SparseArray<Class> sparseArray = new SparseArray<>();
        this.classStore = sparseArray;
        sparseArray.put(-994444869, TLRPC.TL_error.class);
        this.classStore.put(1930838368, TLRPC.TL_decryptedMessageService.class);
        this.classStore.put(-1848883596, TLRPC.TL_decryptedMessage.class);
        this.classStore.put(467867529, TLRPC.TL_decryptedMessageLayer.class);
        this.classStore.put(541931640, TLRPC.TL_decryptedMessage.class);
        this.classStore.put(917541342, TLRPC.TL_decryptedMessage_layer45.class);
        this.classStore.put(-1438109059, TLRPC.TL_decryptedMessageService_layer8.class);
        this.classStore.put(528568095, TLRPC.TL_decryptedMessage_layer8.class);
        this.classStore.put(1431655930, TLRPC.TL_message_secret.class);
        this.classStore.put(1431655929, TLRPC.TL_message_secret_layer72.class);
        this.classStore.put(1431655928, TLRPC.TL_message_secret_old.class);
        this.classStore.put(1431655927, TLRPC.TL_messageEncryptedAction.class);
        this.classStore.put(1450380236, TLRPC.TL_null.class);
        this.classStore.put(1299050149, TLRPC.TL_updateShortChatMessage.class);
        this.classStore.put(1957577280, TLRPC.TL_updates.class);
        this.classStore.put(826001400, TLRPC.TL_updateShortMessage.class);
        this.classStore.put(2027216577, TLRPC.TL_updateShort.class);
        this.classStore.put(1918567619, TLRPC.TL_updatesCombined.class);
        this.classStore.put(-1877614335, TLRPC.TL_updateShortSentMessage.class);
        this.classStore.put(-484987010, TLRPC.TL_updatesTooLong.class);
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
