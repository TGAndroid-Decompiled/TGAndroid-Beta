package org.telegram.tgnet;
public class TLRPC$TL_account_saveRingtone extends TLObject {
    public static int constructor = 1038768899;
    public TLRPC$InputDocument id;
    public boolean unsave;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_SavedRingtone.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.unsave);
    }
}
