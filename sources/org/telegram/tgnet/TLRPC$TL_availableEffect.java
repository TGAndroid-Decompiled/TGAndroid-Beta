package org.telegram.tgnet;

public class TLRPC$TL_availableEffect extends TLObject {
    public long effect_animation_id;
    public long effect_sticker_id;
    public String emoticon;
    public int flags;
    public long id;
    public boolean premium_required;
    public long static_icon_id;

    public static TLRPC$TL_availableEffect TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1815879042 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_availableEffect", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_availableEffect tLRPC$TL_availableEffect = new TLRPC$TL_availableEffect();
        tLRPC$TL_availableEffect.readParams(abstractSerializedData, z);
        return tLRPC$TL_availableEffect;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.premium_required = (readInt32 & 4) != 0;
        this.id = abstractSerializedData.readInt64(z);
        this.emoticon = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.static_icon_id = abstractSerializedData.readInt64(z);
        }
        this.effect_sticker_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 2) != 0) {
            this.effect_animation_id = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1815879042);
        int i = this.premium_required ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeString(this.emoticon);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.static_icon_id);
        }
        abstractSerializedData.writeInt64(this.effect_sticker_id);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt64(this.effect_animation_id);
        }
    }
}
