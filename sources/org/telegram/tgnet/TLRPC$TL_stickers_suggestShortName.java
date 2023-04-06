package org.telegram.tgnet;
public class TLRPC$TL_stickers_suggestShortName extends TLObject {
    public static int constructor = 1303364867;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_stickers_suggestedShortName.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.title);
    }
}
