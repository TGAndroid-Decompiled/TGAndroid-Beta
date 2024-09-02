package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_bots$previewInfo extends TLObject {
    public ArrayList<TL_bots$botPreviewMedia> media = new ArrayList<>();
    public ArrayList<String> lang_codes = new ArrayList<>();

    public static TL_bots$previewInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (212278628 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in previewInfo", Integer.valueOf(i)));
            }
            return null;
        }
        TL_bots$previewInfo tL_bots$previewInfo = new TL_bots$previewInfo();
        tL_bots$previewInfo.readParams(abstractSerializedData, z);
        return tL_bots$previewInfo;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TL_bots$botPreviewMedia TLdeserialize = TL_bots$botPreviewMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.media.add(TLdeserialize);
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
        } else {
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                this.lang_codes.add(abstractSerializedData.readString(z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(212278628);
        abstractSerializedData.writeInt32(481674261);
        int size = this.media.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.media.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.lang_codes.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeString(this.lang_codes.get(i2));
        }
    }
}
