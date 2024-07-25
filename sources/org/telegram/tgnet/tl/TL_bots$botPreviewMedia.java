package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$MessageMedia;
public class TL_bots$botPreviewMedia extends TLObject {
    public int date;
    public TLRPC$MessageMedia media;

    public static TL_bots$botPreviewMedia TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (602479523 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in botPreviewMedia", Integer.valueOf(i)));
            }
            return null;
        }
        TL_bots$botPreviewMedia tL_bots$botPreviewMedia = new TL_bots$botPreviewMedia();
        tL_bots$botPreviewMedia.readParams(abstractSerializedData, z);
        return tL_bots$botPreviewMedia;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.date = abstractSerializedData.readInt32(z);
        this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(602479523);
        abstractSerializedData.writeInt32(this.date);
        this.media.serializeToStream(abstractSerializedData);
    }
}
