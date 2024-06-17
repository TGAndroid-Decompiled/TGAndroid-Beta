package org.telegram.tgnet;

public class TLRPC$TL_jsonString extends TLRPC$JSONValue {
    public String value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.value = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1222740358);
        abstractSerializedData.writeString(this.value);
    }
}
