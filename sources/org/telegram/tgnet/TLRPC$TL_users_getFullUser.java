package org.telegram.tgnet;

public class TLRPC$TL_users_getFullUser extends TLObject {
    public static int constructor = -1240508136;
    public TLRPC$InputUser f982id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_users_userFull.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f982id.serializeToStream(abstractSerializedData);
    }
}
