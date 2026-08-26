package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class TL_stories$TL_albums$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TL_stories$TL_albums$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TL_stories.TL_storyAlbum.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TL_stats.TL_statsGroupTopAdmin.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TL_stats.TL_statsGroupTopInviter.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TL_stats.PublicForward.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TL_stories.StoryItem.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TL_stories.Boost.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TL_stories.PeerStories.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TL_stories.StoryViews.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_stories.MediaArea.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TL_stories.StoryReaction.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TL_stories.StoryView.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.TL_folderPeer.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.PeerLocated.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
