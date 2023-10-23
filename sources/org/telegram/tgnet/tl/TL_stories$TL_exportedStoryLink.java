package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stories$TL_exportedStoryLink extends TLObject {
    public String link;

    public static TL_stories$TL_exportedStoryLink TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1070138683 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_exportedStoryLink", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_exportedStoryLink tL_stories$TL_exportedStoryLink = new TL_stories$TL_exportedStoryLink();
        tL_stories$TL_exportedStoryLink.readParams(abstractSerializedData, z);
        return tL_stories$TL_exportedStoryLink;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.link = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1070138683);
        abstractSerializedData.writeString(this.link);
    }
}
