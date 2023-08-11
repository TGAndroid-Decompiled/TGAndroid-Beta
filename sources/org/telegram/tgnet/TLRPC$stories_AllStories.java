package org.telegram.tgnet;
public abstract class TLRPC$stories_AllStories extends TLObject {
    public static TLRPC$stories_AllStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$stories_AllStories tLRPC$TL_stories_allStories = i != 291044926 ? i != 1369278878 ? null : new TLRPC$TL_stories_allStories() : new TLRPC$TL_stories_allStoriesNotModified();
        if (tLRPC$TL_stories_allStories == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in stories_AllStories", Integer.valueOf(i)));
        }
        if (tLRPC$TL_stories_allStories != null) {
            tLRPC$TL_stories_allStories.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_stories_allStories;
    }
}
