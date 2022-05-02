package org.telegram.tgnet;

public class TLRPC$TL_updateUserPhoto extends TLRPC$Update {
    public static int constructor = -232290676;
    public int date;
    public TLRPC$UserProfilePhoto photo;
    public boolean previous;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.previous = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.date);
        this.photo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.previous);
    }
}
