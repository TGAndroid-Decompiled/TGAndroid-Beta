package org.telegram.tgnet;

public class TLRPC$TL_chat extends TLRPC$Chat {
    public static int constructor = 1103884886;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.creator = (readInt32 & 1) != 0;
        this.kicked = (readInt32 & 2) != 0;
        this.left = (readInt32 & 4) != 0;
        this.deactivated = (readInt32 & 32) != 0;
        this.call_active = (8388608 & readInt32) != 0;
        this.call_not_empty = (16777216 & readInt32) != 0;
        this.noforwards = (readInt32 & ConnectionsManager.FileTypeVideo) != 0;
        this.f848id = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.participants_count = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.version = abstractSerializedData.readInt32(z);
        if ((this.flags & 64) != 0) {
            this.migrated_to = TLRPC$InputChannel.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16384) != 0) {
            this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 262144) != 0) {
            this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.creator ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.kicked ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.left ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.deactivated ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        int i5 = this.call_active ? i4 | 8388608 : i4 & (-8388609);
        this.flags = i5;
        int i6 = this.call_not_empty ? i5 | ConnectionsManager.FileTypePhoto : i5 & (-16777217);
        this.flags = i6;
        int i7 = this.noforwards ? i6 | ConnectionsManager.FileTypeVideo : i6 & (-33554433);
        this.flags = i7;
        abstractSerializedData.writeInt32(i7);
        abstractSerializedData.writeInt64(this.f848id);
        abstractSerializedData.writeString(this.title);
        this.photo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.participants_count);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.version);
        if ((this.flags & 64) != 0) {
            this.migrated_to.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16384) != 0) {
            this.admin_rights.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 262144) != 0) {
            this.default_banned_rights.serializeToStream(abstractSerializedData);
        }
    }
}
