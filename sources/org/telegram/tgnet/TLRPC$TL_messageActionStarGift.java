package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_stars$StarGift;

public class TLRPC$TL_messageActionStarGift extends TLRPC$MessageAction {
    public long convert_stars;
    public boolean converted;
    public int flags;
    public boolean forceIn;
    public TL_stars$StarGift gift;
    public TLRPC$TL_textWithEntities message;
    public boolean name_hidden;
    public boolean saved;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.name_hidden = (readInt32 & 1) != 0;
        this.saved = (readInt32 & 4) != 0;
        this.converted = (readInt32 & 8) != 0;
        this.gift = TL_stars$StarGift.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 2) != 0) {
            this.message = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.convert_stars = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1682706620);
        int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.saved ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.converted ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        this.gift.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            this.message.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt64(this.convert_stars);
    }
}
