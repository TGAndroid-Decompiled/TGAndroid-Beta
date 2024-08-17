package org.telegram.tgnet;

public class TLRPC$TL_userProfilePhotoEmpty extends TLRPC$UserProfilePhoto {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1326562017);
    }
}
