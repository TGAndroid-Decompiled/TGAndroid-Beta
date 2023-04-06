package org.telegram.tgnet;
public class TLRPC$TL_dialogFilterSuggested extends TLObject {
    public static int constructor = 2004110666;
    public String description;
    public TLRPC$DialogFilter filter;

    public static TLRPC$TL_dialogFilterSuggested TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_dialogFilterSuggested", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_dialogFilterSuggested tLRPC$TL_dialogFilterSuggested = new TLRPC$TL_dialogFilterSuggested();
        tLRPC$TL_dialogFilterSuggested.readParams(abstractSerializedData, z);
        return tLRPC$TL_dialogFilterSuggested;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.filter = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.description = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.filter.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.description);
    }
}
