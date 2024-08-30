package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_payments_starsStatus extends TLObject {
    public long balance;
    public int flags;
    public String next_offset;
    public long subscriptions_missing_balance;
    public String subscriptions_next_offset;
    public ArrayList subscriptions = new ArrayList();
    public ArrayList history = new ArrayList();
    public ArrayList chats = new ArrayList();
    public ArrayList users = new ArrayList();

    public static TLRPC$TL_payments_starsStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1141231252 != i) {
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
        if ((this.flags & 2) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$StarsSubscription TLdeserialize = TLRPC$StarsSubscription.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.subscriptions.add(TLdeserialize);
            }
        }
        if ((this.flags & 4) != 0) {
            this.subscriptions_next_offset = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.subscriptions_missing_balance = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 8) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC$StarsTransaction TLdeserialize2 = TLRPC$StarsTransaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.history.add(TLdeserialize2);
            }
        }
        if ((this.flags & 1) != 0) {
            this.next_offset = abstractSerializedData.readString(z);
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
            TLRPC$Chat TLdeserialize3 = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize3 == null) {
                return;
            }
            this.chats.add(TLdeserialize3);
        }
        int readInt327 = abstractSerializedData.readInt32(z);
        if (readInt327 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt327)));
            }
            return;
        }
        int readInt328 = abstractSerializedData.readInt32(z);
        for (int i4 = 0; i4 < readInt328; i4++) {
            TLRPC$User TLdeserialize4 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize4 == null) {
                return;
            }
            this.users.add(TLdeserialize4);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1141231252);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.balance);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.subscriptions.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                ((TLRPC$StarsSubscription) this.subscriptions.get(i)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.subscriptions_next_offset);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt64(this.subscriptions_missing_balance);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.history.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((TLRPC$StarsTransaction) this.history.get(i2)).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.chats.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            ((TLRPC$Chat) this.chats.get(i3)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size4 = this.users.size();
        abstractSerializedData.writeInt32(size4);
        for (int i4 = 0; i4 < size4; i4++) {
            ((TLRPC$User) this.users.get(i4)).serializeToStream(abstractSerializedData);
        }
    }
}
