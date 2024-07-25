package org.telegram.tgnet;
public class TLRPC$TL_messageMediaUnsupported_old extends TLRPC$TL_messageMediaUnsupported {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.bytes = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(694364726);
        abstractSerializedData.writeByteArray(this.bytes);
    }
}
