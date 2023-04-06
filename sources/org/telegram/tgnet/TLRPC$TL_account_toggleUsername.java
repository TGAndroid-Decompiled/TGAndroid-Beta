package org.telegram.tgnet;
public class TLRPC$TL_account_toggleUsername extends TLObject {
    public static int constructor = 1490465654;
    public boolean active;
    public String username;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.username);
        abstractSerializedData.writeBool(this.active);
    }
}
