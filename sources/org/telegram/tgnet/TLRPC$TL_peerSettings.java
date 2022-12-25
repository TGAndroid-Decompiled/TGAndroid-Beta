package org.telegram.tgnet;

public class TLRPC$TL_peerSettings extends TLObject {
    public static int constructor = -1525149427;
    public boolean add_contact;
    public boolean autoarchived;
    public boolean block_contact;
    public int flags;
    public int geo_distance;
    public boolean invite_members;
    public boolean need_contacts_exception;
    public boolean report_geo;
    public boolean report_spam;
    public boolean request_chat_broadcast;
    public int request_chat_date;
    public String request_chat_title;
    public boolean share_contact;

    public static TLRPC$TL_peerSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_peerSettings", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_peerSettings tLRPC$TL_peerSettings = new TLRPC$TL_peerSettings();
        tLRPC$TL_peerSettings.readParams(abstractSerializedData, z);
        return tLRPC$TL_peerSettings;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.report_spam = (readInt32 & 1) != 0;
        this.add_contact = (readInt32 & 2) != 0;
        this.block_contact = (readInt32 & 4) != 0;
        this.share_contact = (readInt32 & 8) != 0;
        this.need_contacts_exception = (readInt32 & 16) != 0;
        this.report_geo = (readInt32 & 32) != 0;
        this.autoarchived = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
        this.invite_members = (readInt32 & 256) != 0;
        this.request_chat_broadcast = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
        if ((readInt32 & 64) != 0) {
            this.geo_distance = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 512) != 0) {
            this.request_chat_title = abstractSerializedData.readString(z);
        }
        if ((this.flags & 512) != 0) {
            this.request_chat_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.report_spam ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.add_contact ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.block_contact ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.share_contact ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.need_contacts_exception ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.report_geo ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.autoarchived ? i6 | ConnectionsManager.RequestFlagNeedQuickAck : i6 & (-129);
        this.flags = i7;
        int i8 = this.invite_members ? i7 | 256 : i7 & (-257);
        this.flags = i8;
        int i9 = this.request_chat_broadcast ? i8 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i8 & (-1025);
        this.flags = i9;
        abstractSerializedData.writeInt32(i9);
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(this.geo_distance);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeString(this.request_chat_title);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeInt32(this.request_chat_date);
        }
    }
}
