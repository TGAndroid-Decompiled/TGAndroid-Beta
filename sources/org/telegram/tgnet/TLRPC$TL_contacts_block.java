package org.telegram.tgnet;

public class TLRPC$TL_contacts_block extends TLObject {
    public static int constructor = 1758204945;
    public TLRPC$InputPeer f888id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f888id.serializeToStream(abstractSerializedData);
    }
}
