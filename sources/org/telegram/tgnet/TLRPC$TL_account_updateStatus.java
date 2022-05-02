package org.telegram.tgnet;

public class TLRPC$TL_account_updateStatus extends TLObject {
    public static int constructor = 1713919532;
    public boolean offline;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeBool(this.offline);
    }
}
