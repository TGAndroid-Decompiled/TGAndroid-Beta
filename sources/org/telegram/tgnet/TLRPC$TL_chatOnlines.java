package org.telegram.tgnet;
public class TLRPC$TL_chatOnlines extends TLObject {
    public int onlines;

    public static TLRPC$TL_chatOnlines TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-264117680 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatOnlines", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines = new TLRPC$TL_chatOnlines();
        tLRPC$TL_chatOnlines.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatOnlines;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.onlines = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-264117680);
        abstractSerializedData.writeInt32(this.onlines);
    }
}
