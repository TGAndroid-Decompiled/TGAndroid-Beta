package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_chatInviteImporters extends TLObject {
    public int count;
    public ArrayList importers = new ArrayList();
    public ArrayList users = new ArrayList();

    public static TLRPC$TL_messages_chatInviteImporters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-2118733814 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_chatInviteImporters", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_chatInviteImporters tLRPC$TL_messages_chatInviteImporters = new TLRPC$TL_messages_chatInviteImporters();
        tLRPC$TL_messages_chatInviteImporters.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_chatInviteImporters;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.count = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_chatInviteImporter TLdeserialize = TLRPC$TL_chatInviteImporter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.importers.add(TLdeserialize);
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
        abstractSerializedData.writeInt32(-2118733814);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.importers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$TL_chatInviteImporter) this.importers.get(i)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((TLRPC$User) this.users.get(i2)).serializeToStream(abstractSerializedData);
        }
    }
}
