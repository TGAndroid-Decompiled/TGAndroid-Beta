package org.telegram.tgnet;

public class TLRPC$TL_inputGeoPointEmpty extends TLRPC$InputGeoPoint {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-457104426);
    }
}
