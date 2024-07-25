package org.telegram.tgnet;
public class TLRPC$TL_inputPhotoEmpty extends TLRPC$InputPhoto {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(483901197);
    }
}
