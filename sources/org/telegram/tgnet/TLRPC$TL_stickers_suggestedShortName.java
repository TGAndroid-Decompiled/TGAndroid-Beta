package org.telegram.tgnet;
public class TLRPC$TL_stickers_suggestedShortName extends TLObject {
    public String short_name;

    public static TLRPC$TL_stickers_suggestedShortName TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-2046910401 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stickers_suggestedShortName", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stickers_suggestedShortName tLRPC$TL_stickers_suggestedShortName = new TLRPC$TL_stickers_suggestedShortName();
        tLRPC$TL_stickers_suggestedShortName.readParams(abstractSerializedData, z);
        return tLRPC$TL_stickers_suggestedShortName;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.short_name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2046910401);
        abstractSerializedData.writeString(this.short_name);
    }
}
