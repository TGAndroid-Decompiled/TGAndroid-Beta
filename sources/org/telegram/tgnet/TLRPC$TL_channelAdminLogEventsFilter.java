package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventsFilter extends TLObject {
    public boolean ban;
    public boolean delete;
    public boolean demote;
    public boolean edit;
    public int flags;
    public boolean group_call;
    public boolean info;
    public boolean invite;
    public boolean invites;
    public boolean join;
    public boolean kick;
    public boolean leave;
    public boolean pinned;
    public boolean promote;
    public boolean settings;
    public boolean unban;
    public boolean unkick;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.join = (readInt32 & 1) != 0;
        this.leave = (readInt32 & 2) != 0;
        this.invite = (readInt32 & 4) != 0;
        this.ban = (readInt32 & 8) != 0;
        this.unban = (readInt32 & 16) != 0;
        this.kick = (readInt32 & 32) != 0;
        this.unkick = (readInt32 & 64) != 0;
        this.promote = (readInt32 & 128) != 0;
        this.demote = (readInt32 & 256) != 0;
        this.info = (readInt32 & 512) != 0;
        this.settings = (readInt32 & 1024) != 0;
        this.pinned = (readInt32 & 2048) != 0;
        this.edit = (readInt32 & 4096) != 0;
        this.delete = (readInt32 & 8192) != 0;
        this.group_call = (readInt32 & 16384) != 0;
        this.invites = (readInt32 & 32768) != 0;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-368018716);
        int i = this.join ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.leave ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.invite ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.ban ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.unban ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.kick ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.unkick ? i6 | 64 : i6 & (-65);
        this.flags = i7;
        int i8 = this.promote ? i7 | 128 : i7 & (-129);
        this.flags = i8;
        int i9 = this.demote ? i8 | 256 : i8 & (-257);
        this.flags = i9;
        int i10 = this.info ? i9 | 512 : i9 & (-513);
        this.flags = i10;
        int i11 = this.settings ? i10 | 1024 : i10 & (-1025);
        this.flags = i11;
        int i12 = this.pinned ? i11 | 2048 : i11 & (-2049);
        this.flags = i12;
        int i13 = this.edit ? i12 | 4096 : i12 & (-4097);
        this.flags = i13;
        int i14 = this.delete ? i13 | 8192 : i13 & (-8193);
        this.flags = i14;
        int i15 = this.group_call ? i14 | 16384 : i14 & (-16385);
        this.flags = i15;
        int i16 = this.invites ? i15 | 32768 : i15 & (-32769);
        this.flags = i16;
        abstractSerializedData.writeInt32(i16);
    }
}
