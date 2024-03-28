package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stickers_createStickerSet extends TLObject {
    public boolean emojis;
    public int flags;
    public boolean masks;
    public String short_name;
    public String software;
    public ArrayList<TLRPC$TL_inputStickerSetItem> stickers = new ArrayList<>();
    public TLRPC$InputDocument thumb;
    public String title;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_StickerSet.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1876841625);
        int i = this.masks ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.emojis ? i | 32 : i & (-33);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.short_name);
        if ((this.flags & 4) != 0) {
            this.thumb.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.stickers.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.stickers.get(i3).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.software);
        }
    }
}
