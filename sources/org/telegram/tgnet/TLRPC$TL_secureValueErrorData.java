package org.telegram.tgnet;

public class TLRPC$TL_secureValueErrorData extends TLRPC$SecureValueError {
    public static int constructor = -391902247;
    public byte[] data_hash;
    public String field;
    public String text;
    public TLRPC$SecureValueType type;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = TLRPC$SecureValueType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.data_hash = abstractSerializedData.readByteArray(z);
        this.field = abstractSerializedData.readString(z);
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.type.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.data_hash);
        abstractSerializedData.writeString(this.field);
        abstractSerializedData.writeString(this.text);
    }
}
