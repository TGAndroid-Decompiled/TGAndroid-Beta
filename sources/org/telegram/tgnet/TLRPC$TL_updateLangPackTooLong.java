package org.telegram.tgnet;
public class TLRPC$TL_updateLangPackTooLong extends TLRPC$Update {
    public String lang_code;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.lang_code = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1180041828);
        abstractSerializedData.writeString(this.lang_code);
    }
}
