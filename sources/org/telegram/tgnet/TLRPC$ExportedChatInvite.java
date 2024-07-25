package org.telegram.tgnet;
public abstract class TLRPC$ExportedChatInvite extends TLObject {
    public static TLRPC$TL_chatInviteExported TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported;
        switch (i) {
            case -1316944408:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteExported() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.revoked = (readInt32 & 1) != 0;
                        this.permanent = (readInt32 & 32) != 0;
                        this.link = abstractSerializedData2.readString(z2);
                        this.admin_id = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 16) != 0) {
                            this.start_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.expire_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.usage_limit = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.usage = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1316944408);
                        int i2 = this.revoked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.permanent ? i2 | 32 : i2 & (-33);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.link);
                        abstractSerializedData2.writeInt64(this.admin_id);
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.start_date);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.expire_date);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.usage_limit);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.usage);
                        }
                    }
                };
                break;
            case -317687113:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteExported() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-317687113);
                    }
                };
                break;
            case -64092740:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteExported() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.link = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-64092740);
                        abstractSerializedData2.writeString(this.link);
                    }
                };
                break;
            case 179611673:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteExported();
                break;
            case 1776236393:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteEmpty_layer122();
                break;
            case 1847917725:
                tLRPC$TL_chatInviteExported = new TLRPC$TL_chatInviteExported() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.revoked = (readInt32 & 1) != 0;
                        this.permanent = (readInt32 & 32) != 0;
                        this.link = abstractSerializedData2.readString(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 16) != 0) {
                            this.start_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.expire_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.usage_limit = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.usage = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1847917725);
                        int i2 = this.revoked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.permanent ? i2 | 32 : i2 & (-33);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.link);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.start_date);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.expire_date);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.usage_limit);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.usage);
                        }
                    }
                };
                break;
            default:
                tLRPC$TL_chatInviteExported = null;
                break;
        }
        if (tLRPC$TL_chatInviteExported == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ExportedChatInvite", Integer.valueOf(i)));
        }
        if (tLRPC$TL_chatInviteExported != null) {
            tLRPC$TL_chatInviteExported.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_chatInviteExported;
    }
}
