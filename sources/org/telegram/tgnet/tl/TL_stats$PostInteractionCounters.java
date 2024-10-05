package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stats$PostInteractionCounters extends TLObject {
    public static TL_stats$PostInteractionCounters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stats$PostInteractionCounters tL_stats$TL_postInteractionCountersMessage = i != -1974989273 ? i != -419066241 ? null : new TL_stats$TL_postInteractionCountersMessage() : new TL_stats$TL_postInteractionCountersStory();
        if (tL_stats$TL_postInteractionCountersMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PostInteractionCounters", Integer.valueOf(i)));
        }
        if (tL_stats$TL_postInteractionCountersMessage != null) {
            tL_stats$TL_postInteractionCountersMessage.readParams(abstractSerializedData, z);
        }
        return tL_stats$TL_postInteractionCountersMessage;
    }
}
