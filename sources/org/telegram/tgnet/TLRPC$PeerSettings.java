package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;

public class TLRPC$PeerSettings extends TLObject {
    public boolean add_contact;
    public boolean autoarchived;
    public boolean block_contact;
    public boolean business_bot_can_reply;
    public long business_bot_id;
    public String business_bot_manage_url;
    public boolean business_bot_paused;
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

    public static TLRPC$PeerSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_peerSettings tLRPC$TL_peerSettings;
        if (i != -1525149427) {
            tLRPC$TL_peerSettings = i != -1395233698 ? null : new TLRPC$TL_peerSettings();
        } else {
            tLRPC$TL_peerSettings = new TLRPC$TL_peerSettings() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.report_spam = (readInt32 & 1) != 0;
                    this.add_contact = (readInt32 & 2) != 0;
                    this.block_contact = (readInt32 & 4) != 0;
                    this.share_contact = (readInt32 & 8) != 0;
                    this.need_contacts_exception = (readInt32 & 16) != 0;
                    this.report_geo = (readInt32 & 32) != 0;
                    this.autoarchived = (readInt32 & 128) != 0;
                    this.invite_members = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                    this.request_chat_broadcast = (readInt32 & 1024) != 0;
                    if ((readInt32 & 64) != 0) {
                        this.geo_distance = abstractSerializedData2.readInt32(z2);
                    }
                    if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                        this.request_chat_title = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                        this.request_chat_date = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1525149427);
                    int i2 = this.report_spam ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.add_contact ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    int i4 = this.block_contact ? i3 | 4 : i3 & (-5);
                    this.flags = i4;
                    int i5 = this.share_contact ? i4 | 8 : i4 & (-9);
                    this.flags = i5;
                    int i6 = this.need_contacts_exception ? i5 | 16 : i5 & (-17);
                    this.flags = i6;
                    int i7 = this.report_geo ? i6 | 32 : i6 & (-33);
                    this.flags = i7;
                    int i8 = this.autoarchived ? i7 | 128 : i7 & (-129);
                    this.flags = i8;
                    int i9 = this.invite_members ? i8 | LiteMode.FLAG_CHAT_BLUR : i8 & (-257);
                    this.flags = i9;
                    int i10 = this.request_chat_broadcast ? i9 | 1024 : i9 & (-1025);
                    this.flags = i10;
                    abstractSerializedData2.writeInt32(i10);
                    if ((this.flags & 64) != 0) {
                        abstractSerializedData2.writeInt32(this.geo_distance);
                    }
                    if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                        abstractSerializedData2.writeString(this.request_chat_title);
                    }
                    if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                        abstractSerializedData2.writeInt32(this.request_chat_date);
                    }
                }
            };
        }
        if (tLRPC$TL_peerSettings == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PeerSettings", Integer.valueOf(i)));
        }
        if (tLRPC$TL_peerSettings != null) {
            tLRPC$TL_peerSettings.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_peerSettings;
    }
}
