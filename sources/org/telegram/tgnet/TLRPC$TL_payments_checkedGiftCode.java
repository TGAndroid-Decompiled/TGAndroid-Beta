package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories$Boost;

public class TLRPC$TL_payments_checkedGiftCode extends TLObject {
    public TL_stories$Boost boost;
    public int date;
    public int flags;
    public TLRPC$Peer from_id;
    public int giveaway_msg_id;
    public int months;
    public int used_date;
    public boolean via_giveaway;
    public long to_id = -1;
    public ArrayList chats = new ArrayList();
    public ArrayList users = new ArrayList();

    public static TLRPC$TL_payments_checkedGiftCode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (675942550 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_checkedGiftCode", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_checkedGiftCode tLRPC$TL_payments_checkedGiftCode = new TLRPC$TL_payments_checkedGiftCode();
        tLRPC$TL_payments_checkedGiftCode.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_checkedGiftCode;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.via_giveaway = (readInt32 & 4) != 0;
        if ((readInt32 & 16) != 0) {
            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            this.giveaway_msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.to_id = abstractSerializedData.readInt64(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.months = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.used_date = abstractSerializedData.readInt32(z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$Chat TLdeserialize = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.chats.add(TLdeserialize);
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.users.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(675942550);
        int i = this.via_giveaway ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 16) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.giveaway_msg_id);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.to_id);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.months);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.used_date);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.chats.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((TLRPC$Chat) this.chats.get(i2)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            ((TLRPC$User) this.users.get(i3)).serializeToStream(abstractSerializedData);
        }
    }
}
