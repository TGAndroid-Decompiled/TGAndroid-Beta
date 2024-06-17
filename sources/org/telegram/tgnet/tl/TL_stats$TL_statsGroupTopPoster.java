package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_statsGroupTopPoster extends TLObject {
    public int avg_chars;
    public int messages;
    public long user_id;

    public static TL_stats$TL_statsGroupTopPoster TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1660637285 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsGroupTopPoster", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_statsGroupTopPoster tL_stats$TL_statsGroupTopPoster = new TL_stats$TL_statsGroupTopPoster();
        tL_stats$TL_statsGroupTopPoster.readParams(abstractSerializedData, z);
        return tL_stats$TL_statsGroupTopPoster;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.messages = abstractSerializedData.readInt32(z);
        this.avg_chars = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1660637285);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.messages);
        abstractSerializedData.writeInt32(this.avg_chars);
    }
}
