package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public abstract class TL_stats$PublicForward extends TLObject {
    public static TL_stats$PublicForward TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$PublicForward tL_stories$TL_publicForwardStory;
        if (i != -302797360) {
            tL_stories$TL_publicForwardStory = i != 32685898 ? null : new TL_stats$TL_publicForwardMessage();
        } else {
            tL_stories$TL_publicForwardStory = new TL_stories$TL_publicForwardStory();
        }
        if (tL_stories$TL_publicForwardStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PublicForward", Integer.valueOf(i)));
        }
        if (tL_stories$TL_publicForwardStory != null) {
            tL_stories$TL_publicForwardStory.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_publicForwardStory;
    }
}
