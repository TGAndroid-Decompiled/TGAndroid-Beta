package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_invitedUsers extends TLObject {
    public ArrayList missing_invitees = new ArrayList();
    public TLRPC$Updates updates;

    public static TLRPC$TL_messages_invitedUsers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 2136862630) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_invitedUsers", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers = new TLRPC$TL_messages_invitedUsers();
        tLRPC$TL_messages_invitedUsers.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_invitedUsers;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.updates = TLRPC$Updates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_missingInvitee TLdeserialize = TLRPC$TL_missingInvitee.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.missing_invitees.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2136862630);
        this.updates.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.missing_invitees.size());
    }
}
