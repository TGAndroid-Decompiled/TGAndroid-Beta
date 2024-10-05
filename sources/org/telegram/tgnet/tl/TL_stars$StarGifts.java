package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stars$StarGifts extends TLObject {
    public static TL_stars$StarGifts TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$StarGifts tL_stars$TL_starGifts = i != -1877571094 ? i != -1551326360 ? null : new TL_stars$StarGifts() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1551326360);
            }
        } : new TL_stars$TL_starGifts();
        if (tL_stars$TL_starGifts == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarGifts", Integer.valueOf(i)));
        }
        if (tL_stars$TL_starGifts != null) {
            tL_stars$TL_starGifts.readParams(abstractSerializedData, z);
        }
        return tL_stars$TL_starGifts;
    }
}
