package org.telegram.tgnet;
public abstract class TLRPC$stories_AllStories extends TLObject {
    public static TLRPC$stories_AllStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$stories_AllStories tLRPC$TL_stories_allStoriesNotModified = i != -2086796248 ? i != 1205903486 ? null : new TLRPC$TL_stories_allStoriesNotModified() : new TLRPC$TL_stories_allStories();
        if (tLRPC$TL_stories_allStoriesNotModified == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in stories_AllStories", Integer.valueOf(i)));
        }
        if (tLRPC$TL_stories_allStoriesNotModified != null) {
            tLRPC$TL_stories_allStoriesNotModified.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_stories_allStoriesNotModified;
    }
}
