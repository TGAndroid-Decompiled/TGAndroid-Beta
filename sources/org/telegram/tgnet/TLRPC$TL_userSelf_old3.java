package org.telegram.tgnet;
public class TLRPC$TL_userSelf_old3 extends TLRPC$User {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
        this.username = abstractSerializedData.readString(z);
        this.phone = abstractSerializedData.readString(z);
        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(476112392);
        abstractSerializedData.writeInt32((int) this.id);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeString(this.username);
        abstractSerializedData.writeString(this.phone);
        this.photo.serializeToStream(abstractSerializedData);
        this.status.serializeToStream(abstractSerializedData);
    }
}
