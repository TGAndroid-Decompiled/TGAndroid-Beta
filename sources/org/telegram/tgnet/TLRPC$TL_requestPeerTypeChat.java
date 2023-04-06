package org.telegram.tgnet;
public class TLRPC$TL_requestPeerTypeChat extends TLRPC$RequestPeerType {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.bot_participant = Boolean.valueOf((readInt32 & 32) != 0);
        this.creator = Boolean.valueOf((this.flags & 1) != 0);
        if ((this.flags & 8) != 0) {
            this.has_username = Boolean.valueOf(abstractSerializedData.readBool(z));
        }
        if ((this.flags & 16) != 0) {
            this.forum = Boolean.valueOf(abstractSerializedData.readBool(z));
        }
        if ((this.flags & 2) != 0) {
            this.user_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.bot_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-906990053);
        Boolean bool = this.creator;
        int i = (bool == null || !bool.booleanValue()) ? this.flags & (-2) : this.flags | 1;
        this.flags = i;
        int i2 = this.user_admin_rights != null ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.bot_admin_rights != null ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.has_username != null ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        this.flags = this.forum != null ? i4 | 16 : i4 & (-17);
        Boolean bool2 = this.bot_participant;
        int i5 = (bool2 == null || !bool2.booleanValue()) ? this.flags & (-33) : this.flags | 32;
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        Boolean bool3 = this.has_username;
        if (bool3 != null) {
            abstractSerializedData.writeBool(bool3.booleanValue());
        }
        Boolean bool4 = this.forum;
        if (bool4 != null) {
            abstractSerializedData.writeBool(bool4.booleanValue());
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.user_admin_rights;
        if (tLRPC$TL_chatAdminRights != null) {
            tLRPC$TL_chatAdminRights.serializeToStream(abstractSerializedData);
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = this.bot_admin_rights;
        if (tLRPC$TL_chatAdminRights2 != null) {
            tLRPC$TL_chatAdminRights2.serializeToStream(abstractSerializedData);
        }
    }
}
