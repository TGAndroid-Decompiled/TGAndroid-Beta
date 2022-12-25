package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_contacts_deleteContacts extends TLObject {
    public static int constructor = 157945344;
    public ArrayList<TLRPC$InputUser> f905id = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.f905id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.f905id.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
