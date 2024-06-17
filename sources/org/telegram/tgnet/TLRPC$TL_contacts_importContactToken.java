package org.telegram.tgnet;

public class TLRPC$TL_contacts_importContactToken extends TLObject {
    public String token;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$User.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(318789512);
        abstractSerializedData.writeString(this.token);
    }
}
