package org.telegram.tgnet;
public class TLRPC$TL_chatAdminRights extends TLObject {
    public boolean add_admins;
    public boolean anonymous;
    public boolean ban_users;
    public boolean change_info;
    public boolean delete_messages;
    public boolean delete_stories;
    public boolean edit_messages;
    public boolean edit_stories;
    public int flags;
    public boolean invite_users;
    public boolean manage_call;
    public boolean manage_topics;
    public boolean other;
    public boolean pin_messages;
    public boolean post_messages;
    public boolean post_stories;

    public static TLRPC$TL_chatAdminRights TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1605510357 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatAdminRights", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = new TLRPC$TL_chatAdminRights();
        tLRPC$TL_chatAdminRights.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatAdminRights;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.change_info = (readInt32 & 1) != 0;
        this.post_messages = (readInt32 & 2) != 0;
        this.edit_messages = (readInt32 & 4) != 0;
        this.delete_messages = (readInt32 & 8) != 0;
        this.ban_users = (readInt32 & 16) != 0;
        this.invite_users = (readInt32 & 32) != 0;
        this.pin_messages = (readInt32 & 128) != 0;
        this.add_admins = (readInt32 & 512) != 0;
        this.anonymous = (readInt32 & 1024) != 0;
        this.manage_call = (readInt32 & 2048) != 0;
        this.other = (readInt32 & 4096) != 0;
        this.manage_topics = (readInt32 & 8192) != 0;
        this.post_stories = (readInt32 & 16384) != 0;
        this.edit_stories = (32768 & readInt32) != 0;
        this.delete_stories = (readInt32 & 65536) != 0;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1605510357);
        int i = this.change_info ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.post_messages ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.edit_messages ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.delete_messages ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.ban_users ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.invite_users ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.pin_messages ? i6 | 128 : i6 & (-129);
        this.flags = i7;
        int i8 = this.add_admins ? i7 | 512 : i7 & (-513);
        this.flags = i8;
        int i9 = this.anonymous ? i8 | 1024 : i8 & (-1025);
        this.flags = i9;
        int i10 = this.manage_call ? i9 | 2048 : i9 & (-2049);
        this.flags = i10;
        int i11 = this.other ? i10 | 4096 : i10 & (-4097);
        this.flags = i11;
        int i12 = this.manage_topics ? i11 | 8192 : i11 & (-8193);
        this.flags = i12;
        int i13 = this.post_stories ? i12 | 16384 : i12 & (-16385);
        this.flags = i13;
        int i14 = this.edit_stories ? i13 | 32768 : i13 & (-32769);
        this.flags = i14;
        int i15 = this.delete_stories ? i14 | 65536 : i14 & (-65537);
        this.flags = i15;
        abstractSerializedData.writeInt32(i15);
    }
}
