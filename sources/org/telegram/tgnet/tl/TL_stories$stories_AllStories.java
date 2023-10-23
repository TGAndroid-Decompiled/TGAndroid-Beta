package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public abstract class TL_stories$stories_AllStories extends TLObject {
    public static TL_stories$stories_AllStories TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$stories_AllStories tL_stories$TL_stories_allStoriesNotModified;
        if (i == 291044926) {
            tL_stories$TL_stories_allStoriesNotModified = new TL_stories$TL_stories_allStoriesNotModified();
        } else {
            tL_stories$TL_stories_allStoriesNotModified = i != 1862033025 ? null : new TL_stories$TL_stories_allStories();
        }
        if (tL_stories$TL_stories_allStoriesNotModified == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in stories_AllStories", Integer.valueOf(i)));
        }
        if (tL_stories$TL_stories_allStoriesNotModified != null) {
            tL_stories$TL_stories_allStoriesNotModified.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_stories_allStoriesNotModified;
    }
}
