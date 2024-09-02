package org.telegram.tgnet;

public class TLRPC$TL_langpack_getLanguage extends TLObject {
    public String lang_code;
    public String lang_pack;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_langPackLanguage.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1784243458);
        abstractSerializedData.writeString(this.lang_pack);
        abstractSerializedData.writeString(this.lang_code);
    }
}
