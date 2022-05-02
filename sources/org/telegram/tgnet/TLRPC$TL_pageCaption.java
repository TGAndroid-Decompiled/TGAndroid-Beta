package org.telegram.tgnet;

public class TLRPC$TL_pageCaption extends TLObject {
    public static int constructor = 1869903447;
    public TLRPC$RichText credit;
    public TLRPC$RichText text;

    public static TLRPC$TL_pageCaption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = new TLRPC$TL_pageCaption();
            tLRPC$TL_pageCaption.readParams(abstractSerializedData, z);
            return tLRPC$TL_pageCaption;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_pageCaption", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.credit = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.text.serializeToStream(abstractSerializedData);
        this.credit.serializeToStream(abstractSerializedData);
    }
}
