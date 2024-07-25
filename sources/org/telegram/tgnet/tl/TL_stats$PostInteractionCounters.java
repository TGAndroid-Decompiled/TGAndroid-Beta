package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public abstract class TL_stats$PostInteractionCounters extends TLObject {
    public static TL_stats$PostInteractionCounters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$PostInteractionCounters tL_stats$TL_postInteractionCountersStory;
        if (i == -1974989273) {
            tL_stats$TL_postInteractionCountersStory = new TL_stats$TL_postInteractionCountersStory();
        } else {
            tL_stats$TL_postInteractionCountersStory = i != -419066241 ? null : new TL_stats$TL_postInteractionCountersMessage();
        }
        if (tL_stats$TL_postInteractionCountersStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PostInteractionCounters", Integer.valueOf(i)));
        }
        if (tL_stats$TL_postInteractionCountersStory != null) {
            tL_stats$TL_postInteractionCountersStory.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_postInteractionCountersStory;
    }
}
