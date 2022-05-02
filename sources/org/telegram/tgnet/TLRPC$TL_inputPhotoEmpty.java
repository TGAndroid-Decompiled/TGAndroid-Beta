package org.telegram.tgnet;

public class TLRPC$TL_inputPhotoEmpty extends TLRPC$InputPhoto {
    public static int constructor = 483901197;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
