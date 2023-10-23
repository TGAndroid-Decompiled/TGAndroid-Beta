package org.telegram.tgnet;
public class TLRPC$TL_jsonBool extends TLRPC$JSONValue {
    public boolean value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.value = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-952869270);
        abstractSerializedData.writeBool(this.value);
    }
}
