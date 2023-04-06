package org.telegram.tgnet;
public class TLRPC$TL_updateGroupCall extends TLRPC$Update {
    public static int constructor = 347227392;
    public TLRPC$GroupCall call;
    public long chat_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.chat_id = abstractSerializedData.readInt64(z);
        this.call = TLRPC$GroupCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.chat_id);
        this.call.serializeToStream(abstractSerializedData);
    }
}
