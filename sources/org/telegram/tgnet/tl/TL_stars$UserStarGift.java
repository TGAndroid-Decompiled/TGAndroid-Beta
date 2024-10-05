package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;

public abstract class TL_stars$UserStarGift extends TLObject {
    public long convert_stars;
    public int date;
    public int flags;
    public long from_id;
    public TL_stars$StarGift gift;
    public TLRPC$TL_textWithEntities message;
    public int msg_id;
    public boolean name_hidden;
    public boolean unsaved;

    public static TL_stars$UserStarGift TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$UserStarGift tL_stars$UserStarGift = i != -291202450 ? null : new TL_stars$UserStarGift() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.name_hidden = (readInt32 & 1) != 0;
                this.unsaved = (readInt32 & 32) != 0;
                if ((readInt32 & 2) != 0) {
                    this.from_id = abstractSerializedData2.readInt64(z2);
                }
                this.date = abstractSerializedData2.readInt32(z2);
                this.gift = TL_stars$StarGift.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                if ((this.flags & 4) != 0) {
                    this.message = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
                if ((this.flags & 8) != 0) {
                    this.msg_id = abstractSerializedData2.readInt32(z2);
                }
                if ((this.flags & 16) != 0) {
                    this.convert_stars = abstractSerializedData2.readInt64(z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-291202450);
                int i2 = this.name_hidden ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                int i3 = this.unsaved ? i2 | 32 : i2 & (-33);
                this.flags = i3;
                abstractSerializedData2.writeInt32(i3);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeInt64(this.from_id);
                }
                abstractSerializedData2.writeInt32(this.date);
                this.gift.serializeToStream(abstractSerializedData2);
                if ((this.flags & 4) != 0) {
                    this.message.serializeToStream(abstractSerializedData2);
                }
                if ((this.flags & 8) != 0) {
                    abstractSerializedData2.writeInt32(this.msg_id);
                }
                if ((this.flags & 16) != 0) {
                    abstractSerializedData2.writeInt64(this.convert_stars);
                }
            }
        };
        if (tL_stars$UserStarGift == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in UserStarGift", Integer.valueOf(i)));
        }
        if (tL_stars$UserStarGift != null) {
            tL_stars$UserStarGift.readParams(abstractSerializedData, z);
        }
        return tL_stars$UserStarGift;
    }
}
