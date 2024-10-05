package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_contacts_deleteContacts extends TLObject {
    public ArrayList id = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(157945344);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$InputUser) this.id.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
