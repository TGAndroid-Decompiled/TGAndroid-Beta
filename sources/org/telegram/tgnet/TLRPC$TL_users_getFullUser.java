package org.telegram.tgnet;

public class TLRPC$TL_users_getFullUser extends TLObject {
    public TLRPC$InputUser id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_users_userFull.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1240508136);
        this.id.serializeToStream(abstractSerializedData);
    }
}
