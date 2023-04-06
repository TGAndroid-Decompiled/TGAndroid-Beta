package org.telegram.tgnet;
public class TLRPC$TL_stickers_checkShortName extends TLObject {
    public static int constructor = 676017721;
    public String short_name;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.short_name);
    }
}
