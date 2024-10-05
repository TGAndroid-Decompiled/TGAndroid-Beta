package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_inputMediaPaidMedia extends TLRPC$InputMedia {
    public ArrayList extended_media = new ArrayList();
    public int flags;
    public String payload;
    public long stars_amount;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.stars_amount = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$InputMedia TLdeserialize = TLRPC$InputMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.extended_media.add(TLdeserialize);
        }
        if ((this.flags & 1) != 0) {
            this.payload = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1005571194);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.stars_amount);
        abstractSerializedData.writeInt32(481674261);
        int size = this.extended_media.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$InputMedia) this.extended_media.get(i)).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.payload);
        }
    }
}
