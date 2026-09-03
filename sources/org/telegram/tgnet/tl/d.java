package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public final class d implements Vector.TLDeserializer {
    public final int f19416a;

    public d(int i10) {
        this.f19416a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        switch (this.f19416a) {
            case 0:
                return TL_stats.TL_statsGroupTopAdmin.TLdeserialize(inputSerializedData, i10, z4);
            case 1:
                return TL_stats.TL_statsGroupTopInviter.TLdeserialize(inputSerializedData, i10, z4);
            case 2:
                return TL_stats.PublicForward.TLdeserialize(inputSerializedData, i10, z4);
            case 3:
                return TL_stories.TL_storyAlbum.TLdeserialize(inputSerializedData, i10, z4);
            case 4:
                return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData, i10, z4);
            case 5:
                return TL_stories.StoryItem.TLdeserialize(inputSerializedData, i10, z4);
            case 6:
                return TL_stories.Boost.TLdeserialize(inputSerializedData, i10, z4);
            case 7:
                return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData, i10, z4);
            case 8:
                return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData, i10, z4);
            case 9:
                return TL_stories.PeerStories.TLdeserialize(inputSerializedData, i10, z4);
            case 10:
                return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData, i10, z4);
            case 11:
                return TL_stories.StoryViews.TLdeserialize(inputSerializedData, i10, z4);
            case 12:
                return TL_stories.MediaArea.TLdeserialize(inputSerializedData, i10, z4);
            case 13:
                return TL_stories.StoryReaction.TLdeserialize(inputSerializedData, i10, z4);
            case 14:
                return TL_stories.StoryView.TLdeserialize(inputSerializedData, i10, z4);
            case 15:
                return TLRPC.TL_folderPeer.TLdeserialize(inputSerializedData, i10, z4);
            default:
                return TLRPC.PeerLocated.TLdeserialize(inputSerializedData, i10, z4);
        }
    }
}
