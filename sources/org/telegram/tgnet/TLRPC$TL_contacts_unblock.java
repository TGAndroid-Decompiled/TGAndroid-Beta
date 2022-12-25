package org.telegram.tgnet;

public class TLRPC$TL_contacts_unblock extends TLObject {
    public static int constructor = -1096393392;
    public TLRPC$InputPeer f898id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f898id.serializeToStream(abstractSerializedData);
    }
}
