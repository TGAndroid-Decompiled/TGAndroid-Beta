package org.telegram.tgnet;
public class TLRPC$TL_messages_getStickers extends TLObject {
    public static int constructor = -710552671;
    public String emoticon;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Stickers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.emoticon);
        abstractSerializedData.writeInt64(this.hash);
    }
}
