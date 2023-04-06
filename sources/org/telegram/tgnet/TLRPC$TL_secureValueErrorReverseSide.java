package org.telegram.tgnet;
public class TLRPC$TL_secureValueErrorReverseSide extends TLRPC$SecureValueError {
    public static int constructor = -2037765467;
    public byte[] file_hash;
    public String text;
    public TLRPC$SecureValueType type;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = TLRPC$SecureValueType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.file_hash = abstractSerializedData.readByteArray(z);
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.type.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.file_hash);
        abstractSerializedData.writeString(this.text);
    }
}
