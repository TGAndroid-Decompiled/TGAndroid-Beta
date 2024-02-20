package org.telegram.tgnet;
public class TLRPC$TL_langpack_getLangPack extends TLObject {
    public String lang_code;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_langPackDifference.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1699363442);
        abstractSerializedData.writeString(this.lang_code);
    }
}
