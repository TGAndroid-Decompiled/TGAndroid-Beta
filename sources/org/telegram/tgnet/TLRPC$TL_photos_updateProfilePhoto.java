package org.telegram.tgnet;
public class TLRPC$TL_photos_updateProfilePhoto extends TLObject {
    public static int constructor = 1926525996;
    public TLRPC$InputPhoto id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_photos_photo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.id.serializeToStream(abstractSerializedData);
    }
}
