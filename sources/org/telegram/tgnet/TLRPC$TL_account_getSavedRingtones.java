package org.telegram.tgnet;
public class TLRPC$TL_account_getSavedRingtones extends TLObject {
    public static int constructor = -510647672;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_SavedRingtones.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.hash);
    }
}
