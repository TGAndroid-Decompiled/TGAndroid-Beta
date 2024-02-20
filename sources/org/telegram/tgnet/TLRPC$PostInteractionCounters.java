package org.telegram.tgnet;
public abstract class TLRPC$PostInteractionCounters extends TLObject {
    public static TLRPC$PostInteractionCounters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PostInteractionCounters tLRPC$TL_postInteractionCountersStory;
        if (i == -1974989273) {
            tLRPC$TL_postInteractionCountersStory = new TLRPC$TL_postInteractionCountersStory();
        } else {
            tLRPC$TL_postInteractionCountersStory = i != -419066241 ? null : new TLRPC$TL_postInteractionCountersMessage();
        }
        if (tLRPC$TL_postInteractionCountersStory == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PostInteractionCounters", Integer.valueOf(i)));
        }
        if (tLRPC$TL_postInteractionCountersStory != null) {
            tLRPC$TL_postInteractionCountersStory.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_postInteractionCountersStory;
    }
}
