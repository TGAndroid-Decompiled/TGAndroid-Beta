package org.telegram.tgnet;
public class TLRPC$TL_updateLangPack extends TLRPC$Update {
    public TLRPC$TL_langPackDifference difference;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.difference = TLRPC$TL_langPackDifference.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1442983757);
        this.difference.serializeToStream(abstractSerializedData);
    }
}
