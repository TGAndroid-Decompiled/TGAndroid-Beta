package org.telegram.tgnet;

public class TLRPC$TL_fileLocation_layer82 extends TLRPC$TL_fileLocation_layer97 {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.dc_id = abstractSerializedData.readInt32(z);
        this.volume_id = abstractSerializedData.readInt64(z);
        this.local_id = abstractSerializedData.readInt32(z);
        this.secret = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1406570614);
        abstractSerializedData.writeInt32(this.dc_id);
        abstractSerializedData.writeInt64(this.volume_id);
        abstractSerializedData.writeInt32(this.local_id);
        abstractSerializedData.writeInt64(this.secret);
    }
}
