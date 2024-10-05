package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$User;

public class TL_stars$TL_userStarGifts extends TLObject {
    public int count;
    public int flags;
    public String next_offset;
    public ArrayList gifts = new ArrayList();
    public ArrayList users = new ArrayList();

    public static TL_stars$TL_userStarGifts TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$TL_userStarGifts tL_stars$TL_userStarGifts = i != 1801827607 ? null : new TL_stars$TL_userStarGifts();
        if (tL_stars$TL_userStarGifts == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in TL_userStarGifts", Integer.valueOf(i)));
        }
        if (tL_stars$TL_userStarGifts != null) {
            tL_stars$TL_userStarGifts.readParams(abstractSerializedData, z);
        }
        return tL_stars$TL_userStarGifts;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
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
            TL_stars$UserStarGift TLdeserialize = TL_stars$UserStarGift.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.gifts.add(TLdeserialize);
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
            TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.users.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1801827607);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.gifts.size());
        for (int i = 0; i < this.gifts.size(); i++) {
            ((TL_stars$UserStarGift) this.gifts.get(i)).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.users.size());
        for (int i2 = 0; i2 < this.users.size(); i2++) {
            ((TLRPC$User) this.users.get(i2)).serializeToStream(abstractSerializedData);
        }
    }
}
