package org.telegram.tgnet;

public class TLRPC$TL_fileLocationToBeDeprecated extends TLRPC$FileLocation {
    public static int constructor = -1132476723;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.volume_id = abstractSerializedData.readInt64(z);
        this.local_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.volume_id);
        abstractSerializedData.writeInt32(this.local_id);
    }
}
