package org.telegram.tgnet;

public class TLRPC$TL_contacts_getTopPeers extends TLObject {
    public boolean bots_app;
    public boolean bots_inline;
    public boolean bots_pm;
    public boolean channels;
    public boolean correspondents;
    public int flags;
    public boolean forward_chats;
    public boolean forward_users;
    public boolean groups;
    public long hash;
    public int limit;
    public int offset;
    public boolean phone_calls;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$contacts_TopPeers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1758168906);
        int i = this.correspondents ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.bots_pm ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.bots_inline ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.phone_calls ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.forward_users ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.forward_chats ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.groups ? i6 | 1024 : i6 & (-1025);
        this.flags = i7;
        int i8 = this.channels ? i7 | 32768 : i7 & (-32769);
        this.flags = i8;
        int i9 = this.bots_app ? i8 | 65536 : i8 & (-65537);
        this.flags = i9;
        abstractSerializedData.writeInt32(i9);
        abstractSerializedData.writeInt32(this.offset);
        abstractSerializedData.writeInt32(this.limit);
        abstractSerializedData.writeInt64(this.hash);
    }
}
