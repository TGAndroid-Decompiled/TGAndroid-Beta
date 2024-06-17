package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_chatAdminsWithInvites extends TLObject {
    public ArrayList<TLRPC$TL_chatAdminWithInvites> admins = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_messages_chatAdminsWithInvites TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1231326505 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_chatAdminsWithInvites", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_chatAdminsWithInvites tLRPC$TL_messages_chatAdminsWithInvites = new TLRPC$TL_messages_chatAdminsWithInvites();
        tLRPC$TL_messages_chatAdminsWithInvites.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_chatAdminsWithInvites;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_chatAdminWithInvites TLdeserialize = TLRPC$TL_chatAdminWithInvites.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.admins.add(TLdeserialize);
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt324; i2++) {
            TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.users.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1231326505);
        abstractSerializedData.writeInt32(481674261);
        int size = this.admins.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.admins.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.users.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
