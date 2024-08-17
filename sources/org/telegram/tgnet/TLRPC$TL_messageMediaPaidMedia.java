package org.telegram.tgnet;

public class TLRPC$TL_messageMediaPaidMedia extends TLRPC$MessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
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
            TLRPC$MessageExtendedMedia TLdeserialize = TLRPC$MessageExtendedMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize != null) {
                this.extended_media.add(TLdeserialize);
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1467669359);
        abstractSerializedData.writeInt64(this.stars_amount);
        abstractSerializedData.writeInt32(481674261);
        int size = this.extended_media.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.extended_media.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
