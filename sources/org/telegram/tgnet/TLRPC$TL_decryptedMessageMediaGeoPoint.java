package org.telegram.tgnet;

public class TLRPC$TL_decryptedMessageMediaGeoPoint extends TLRPC$DecryptedMessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.lat = abstractSerializedData.readDouble(z);
        this._long = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(893913689);
        abstractSerializedData.writeDouble(this.lat);
        abstractSerializedData.writeDouble(this._long);
    }
}
