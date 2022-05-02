package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendEncryptedMultiMedia extends TLObject {
    public ArrayList<TLRPC$TL_decryptedMessage> messages = new ArrayList<>();
    public ArrayList<TLRPC$InputEncryptedFile> files = new ArrayList<>();

    @Override
    public void freeResources() {
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
    }

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SentEncryptedMessage.TLdeserialize(abstractSerializedData, i, z);
    }
}
