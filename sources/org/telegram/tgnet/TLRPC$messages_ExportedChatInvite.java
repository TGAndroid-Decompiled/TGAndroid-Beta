package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$messages_ExportedChatInvite extends TLObject {
    public TLRPC$ExportedChatInvite invite;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$messages_ExportedChatInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_ExportedChatInvite tLRPC$messages_ExportedChatInvite;
        if (i != 410107472) {
            tLRPC$messages_ExportedChatInvite = i != 572915951 ? null : new TLRPC$TL_messages_exportedChatInviteReplaced();
        } else {
            tLRPC$messages_ExportedChatInvite = new TLRPC$messages_ExportedChatInvite() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.users.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(410107472);
                    this.invite.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.users.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.users.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$messages_ExportedChatInvite == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_ExportedChatInvite", Integer.valueOf(i)));
        }
        if (tLRPC$messages_ExportedChatInvite != null) {
            tLRPC$messages_ExportedChatInvite.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_ExportedChatInvite;
    }
}
