package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendEncryptedMultiMedia extends TLObject {
    public ArrayList messages = new ArrayList();
    public ArrayList files = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SentEncryptedMessage.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void freeResources() {
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
    }
}
