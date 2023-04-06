package org.telegram.tgnet;
public abstract class TLRPC$ChannelParticipant extends TLObject {
    public TLRPC$TL_chatAdminRights admin_rights;
    public TLRPC$TL_channelAdminRights_layer92 admin_rights_layer92;
    public TLRPC$TL_chatBannedRights banned_rights;
    public TLRPC$TL_channelBannedRights_layer92 banned_rights_layer92;
    public boolean can_edit;
    public int date;
    public int flags;
    public long inviter_id;
    public long kicked_by;
    public boolean left;
    public TLRPC$Peer peer;
    public long promoted_by;
    public String rank;
    public boolean self;
    public long user_id;
    public boolean via_invite;

    public static TLRPC$ChannelParticipant TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        switch (i) {
            case -2138237532:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantCreator() {
                    public static int constructor = -2138237532;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.rank = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.rank);
                        }
                    }
                };
                break;
            case -1933187430:
                tLRPC$ChannelParticipant = new TLRPC$ChannelParticipant() {
                    public static int constructor = -1933187430;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.kicked_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.kicked_by);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -1861910545:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin() {
                    public static int constructor = -1861910545;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -1743180447:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin() {
                    public static int constructor = -1743180447;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -1557620115:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantSelf() {
                    public static int constructor = -1557620115;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -1473271656:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin() {
                    public static int constructor = -1473271656;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_edit = (readInt32 & 1) != 0;
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.promoted_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_channelAdminRights_layer92 TLdeserialize = TLRPC$TL_channelAdminRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.admin_rights_layer92 = TLdeserialize;
                        this.admin_rights = TLRPC$Chat.mergeAdminRights(TLdeserialize);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_edit ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32((int) this.promoted_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.admin_rights_layer92.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -1072953408:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipant();
                break;
            case -1010402965:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantLeft() {
                    public static int constructor = -1010402965;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                    }
                };
                break;
            case -859915345:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin() {
                    public static int constructor = -859915345;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_edit = (readInt32 & 1) != 0;
                        this.self = (readInt32 & 2) != 0;
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            this.inviter_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.promoted_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.rank = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_edit ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.self ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.inviter_id);
                        }
                        abstractSerializedData2.writeInt32((int) this.promoted_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.admin_rights.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.rank);
                        }
                    }
                };
                break;
            case -471670279:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantCreator() {
                    public static int constructor = -471670279;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                    }
                };
                break;
            case 367766557:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipant() {
                    public static int constructor = 367766557;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case 453242886:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantLeft();
                break;
            case 470789295:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantBanned() {
                    public static int constructor = 470789295;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.left = (readInt32 & 1) != 0;
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.kicked_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.left ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.kicked_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.banned_rights.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 573315206:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantBanned() {
                    public static int constructor = 573315206;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.left = (readInt32 & 1) != 0;
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.kicked_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_channelBannedRights_layer92 TLdeserialize = TLRPC$TL_channelBannedRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.banned_rights_layer92 = TLdeserialize;
                        this.banned_rights = TLRPC$Chat.mergeBannedRights(TLdeserialize);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.left ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        abstractSerializedData2.writeInt32((int) this.kicked_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.banned_rights_layer92.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 682146919:
                tLRPC$ChannelParticipant = new TLRPC$ChannelParticipant() {
                    public static int constructor = 682146919;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt64(z2);
                        this.inviter_id = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.peer.user_id);
                        abstractSerializedData2.writeInt64(this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case 803602899:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantCreator();
                break;
            case 885242707:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin();
                break;
            case 900251559:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantSelf();
                break;
            case 1149094475:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantCreator() {
                    public static int constructor = 1149094475;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.rank = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        this.admin_rights.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.rank);
                        }
                    }
                };
                break;
            case 1352785878:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantBanned() {
                    public static int constructor = 1352785878;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.left = (readInt32 & 1) != 0;
                        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.kicked_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.left ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        this.peer.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32((int) this.kicked_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.banned_rights.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1571450403:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantAdmin() {
                    public static int constructor = 1571450403;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_edit = (readInt32 & 1) != 0;
                        this.self = (readInt32 & 2) != 0;
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            this.inviter_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.promoted_by = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_edit ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.self ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.peer.user_id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.inviter_id);
                        }
                        abstractSerializedData2.writeInt32((int) this.promoted_by);
                        abstractSerializedData2.writeInt32(this.date);
                        this.admin_rights.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1844969806:
                tLRPC$ChannelParticipant = new TLRPC$TL_channelParticipantBanned();
                break;
            default:
                tLRPC$ChannelParticipant = null;
                break;
        }
        if (tLRPC$ChannelParticipant == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChannelParticipant", Integer.valueOf(i)));
        }
        if (tLRPC$ChannelParticipant != null) {
            tLRPC$ChannelParticipant.readParams(abstractSerializedData, z);
        }
        return tLRPC$ChannelParticipant;
    }
}
