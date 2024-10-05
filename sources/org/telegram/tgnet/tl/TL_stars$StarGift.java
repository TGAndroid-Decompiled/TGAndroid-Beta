package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;

public abstract class TL_stars$StarGift extends TLObject {
    public int availability_remains;
    public int availability_total;
    public long convert_stars;
    public int flags;
    public long id;
    public boolean limited;
    public long stars;
    public TLRPC$Document sticker;

    public static TL_stars$StarGift TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$StarGift tL_stars$StarGift = i != -1365150482 ? null : new TL_stars$StarGift() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.limited = (readInt32 & 1) != 0;
                this.id = abstractSerializedData2.readInt64(z2);
                this.sticker = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                this.stars = abstractSerializedData2.readInt64(z2);
                if ((this.flags & 1) != 0) {
                    this.availability_remains = abstractSerializedData2.readInt32(z2);
                    this.availability_total = abstractSerializedData2.readInt32(z2);
                }
                this.convert_stars = abstractSerializedData2.readInt64(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1365150482);
                int i2 = this.limited ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt64(this.id);
                this.sticker.serializeToStream(abstractSerializedData2);
                abstractSerializedData2.writeInt64(this.stars);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeInt32(this.availability_remains);
                    abstractSerializedData2.writeInt32(this.availability_total);
                }
                abstractSerializedData2.writeInt64(this.convert_stars);
            }
        };
        if (tL_stars$StarGift == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarGift", Integer.valueOf(i)));
        }
        if (tL_stars$StarGift != null) {
            tL_stars$StarGift.readParams(abstractSerializedData, z);
        }
        return tL_stars$StarGift;
    }
}
