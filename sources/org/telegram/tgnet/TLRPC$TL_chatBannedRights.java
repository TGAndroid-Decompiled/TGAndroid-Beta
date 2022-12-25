package org.telegram.tgnet;

public class TLRPC$TL_chatBannedRights extends TLObject {
    public static int constructor = -1626209256;
    public boolean change_info;
    public boolean embed_links;
    public int flags;
    public boolean invite_users;
    public boolean manage_topics;
    public boolean pin_messages;
    public boolean send_games;
    public boolean send_gifs;
    public boolean send_inline;
    public boolean send_media;
    public boolean send_messages;
    public boolean send_polls;
    public boolean send_stickers;
    public int until_date;
    public boolean view_messages;

    public static TLRPC$TL_chatBannedRights TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatBannedRights", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = new TLRPC$TL_chatBannedRights();
        tLRPC$TL_chatBannedRights.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatBannedRights;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.view_messages = (readInt32 & 1) != 0;
        this.send_messages = (readInt32 & 2) != 0;
        this.send_media = (readInt32 & 4) != 0;
        this.send_stickers = (readInt32 & 8) != 0;
        this.send_gifs = (readInt32 & 16) != 0;
        this.send_games = (readInt32 & 32) != 0;
        this.send_inline = (readInt32 & 64) != 0;
        this.embed_links = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
        this.send_polls = (readInt32 & 256) != 0;
        this.change_info = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
        this.invite_users = (32768 & readInt32) != 0;
        this.pin_messages = (131072 & readInt32) != 0;
        this.manage_topics = (readInt32 & 262144) != 0;
        this.until_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.view_messages ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.send_messages ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.send_media ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.send_stickers ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.send_gifs ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.send_games ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.send_inline ? i6 | 64 : i6 & (-65);
        this.flags = i7;
        int i8 = this.embed_links ? i7 | ConnectionsManager.RequestFlagNeedQuickAck : i7 & (-129);
        this.flags = i8;
        int i9 = this.send_polls ? i8 | 256 : i8 & (-257);
        this.flags = i9;
        int i10 = this.change_info ? i9 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i9 & (-1025);
        this.flags = i10;
        int i11 = this.invite_users ? i10 | 32768 : i10 & (-32769);
        this.flags = i11;
        int i12 = this.pin_messages ? i11 | 131072 : i11 & (-131073);
        this.flags = i12;
        int i13 = this.manage_topics ? i12 | 262144 : i12 & (-262145);
        this.flags = i13;
        abstractSerializedData.writeInt32(i13);
        abstractSerializedData.writeInt32(this.until_date);
    }
}
