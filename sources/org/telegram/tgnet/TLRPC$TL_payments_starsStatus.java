package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_payments_starsStatus extends TLObject {
    public long balance;
    public int flags;
    public String next_offset;
    public ArrayList<TLRPC$StarsTransaction> history = new ArrayList<>();
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_payments_starsStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1930105248 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_starsStatus", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = new TLRPC$TL_payments_starsStatus();
        tLRPC$TL_payments_starsStatus.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_starsStatus;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.balance = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$StarsTransaction TLdeserialize = TLRPC$StarsTransaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.history.add(TLdeserialize);
        }
        if ((this.flags & 1) != 0) {
            this.next_offset = abstractSerializedData.readString(z);
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
            TLRPC$Chat TLdeserialize2 = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.chats.add(TLdeserialize2);
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        if (readInt325 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
            }
            return;
        }
        int readInt326 = abstractSerializedData.readInt32(z);
        for (int i3 = 0; i3 < readInt326; i3++) {
            TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize3 == null) {
                return;
            }
            this.users.add(TLdeserialize3);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1930105248);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.balance);
        abstractSerializedData.writeInt32(481674261);
        int size = this.history.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.history.get(i).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.chats.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.chats.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.users.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.users.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
