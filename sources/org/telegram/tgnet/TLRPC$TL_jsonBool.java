package org.telegram.tgnet;

public class TLRPC$TL_jsonBool extends TLRPC$JSONValue {
    public static int constructor = -952869270;
    public boolean value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.value = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeBool(this.value);
    }
}
