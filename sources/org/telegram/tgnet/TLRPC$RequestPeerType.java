package org.telegram.tgnet;
public class TLRPC$RequestPeerType extends TLObject {
    public TLRPC$TL_chatAdminRights bot_admin_rights;
    public Boolean bot_participant;
    public Boolean creator;
    public int flags;
    public Boolean forum;
    public Boolean has_username;
    public TLRPC$TL_chatAdminRights user_admin_rights;

    public static TLRPC$RequestPeerType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$RequestPeerType tLRPC$TL_requestPeerTypeChat;
        if (i == -906990053) {
            tLRPC$TL_requestPeerTypeChat = new TLRPC$TL_requestPeerTypeChat();
        } else if (i != 865857388) {
            tLRPC$TL_requestPeerTypeChat = i != 1597737472 ? null : new TLRPC$TL_requestPeerTypeUser();
        } else {
            tLRPC$TL_requestPeerTypeChat = new TLRPC$RequestPeerType() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(865857388);
                    Boolean bool = this.creator;
                    int i2 = (bool == null || !bool.booleanValue()) ? this.flags & (-2) : this.flags | 1;
                    this.flags = i2;
                    int i3 = this.user_admin_rights != null ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    int i4 = this.bot_admin_rights != null ? i3 | 4 : i3 & (-5);
                    this.flags = i4;
                    int i5 = this.has_username != null ? i4 | 8 : i4 & (-9);
                    this.flags = i5;
                    abstractSerializedData2.writeInt32(i5);
                    Boolean bool2 = this.has_username;
                    if (bool2 != null) {
                        abstractSerializedData2.writeBool(bool2.booleanValue());
                    }
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.user_admin_rights;
                    if (tLRPC$TL_chatAdminRights != null) {
                        tLRPC$TL_chatAdminRights.serializeToStream(abstractSerializedData2);
                    }
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = this.bot_admin_rights;
                    if (tLRPC$TL_chatAdminRights2 != null) {
                        tLRPC$TL_chatAdminRights2.serializeToStream(abstractSerializedData2);
                    }
                }

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.creator = Boolean.valueOf((readInt32 & 1) != 0);
                    if ((this.flags & 8) != 0) {
                        this.has_username = Boolean.valueOf(abstractSerializedData2.readBool(z2));
                    }
                    if ((this.flags & 2) != 0) {
                        this.user_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.bot_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                }
            };
        }
        if (tLRPC$TL_requestPeerTypeChat == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in RequestPeerType", Integer.valueOf(i)));
        }
        if (tLRPC$TL_requestPeerTypeChat != null) {
            tLRPC$TL_requestPeerTypeChat.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_requestPeerTypeChat;
    }
}
