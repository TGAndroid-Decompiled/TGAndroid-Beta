package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class d implements Vector.TLDeserializer {
    public final int f20333a;

    public d(int i10) {
        this.f20333a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f20333a) {
            case 0:
                return TL_stats.TL_statsGroupTopAdmin.TLdeserialize(inputSerializedData, i10, z10);
            case 1:
                return TL_stats.TL_statsGroupTopInviter.TLdeserialize(inputSerializedData, i10, z10);
            case 2:
                return TL_stats.PublicForward.TLdeserialize(inputSerializedData, i10, z10);
            case 3:
                return TL_stories.TL_storyAlbum.TLdeserialize(inputSerializedData, i10, z10);
            case 4:
                return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData, i10, z10);
            case 5:
                return TL_stories.StoryItem.TLdeserialize(inputSerializedData, i10, z10);
            case 6:
                return TL_stories.Boost.TLdeserialize(inputSerializedData, i10, z10);
            case 7:
                return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData, i10, z10);
            case 8:
                return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData, i10, z10);
            case 9:
                return TL_stories.PeerStories.TLdeserialize(inputSerializedData, i10, z10);
            case 10:
                return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData, i10, z10);
            case 11:
                return TL_stories.StoryViews.TLdeserialize(inputSerializedData, i10, z10);
            case 12:
                return TL_stories.MediaArea.TLdeserialize(inputSerializedData, i10, z10);
            case 13:
                return TL_stories.StoryReaction.TLdeserialize(inputSerializedData, i10, z10);
            case 14:
                return TL_stories.StoryView.TLdeserialize(inputSerializedData, i10, z10);
            case 15:
                return TL_toncenter.onrampProviderInfo.TLdeserialize(inputSerializedData, i10, z10);
            case 16:
                return TL_toncenter.onrampMethodAvailability.TLdeserialize(inputSerializedData, i10, z10);
            case 17:
                return TLRPC.TL_folderPeer.TLdeserialize(inputSerializedData, i10, z10);
            case 18:
                return TLRPC.PeerLocated.TLdeserialize(inputSerializedData, i10, z10);
            case 19:
                return TL_wallet.currencyRate.TLdeserialize(inputSerializedData, i10, z10);
            case 20:
                return TL_wallet.holderDc.TLdeserialize(inputSerializedData, i10, z10);
            case 21:
                return TL_wallet.nftAttribute.TLdeserialize(inputSerializedData, i10, z10);
            case 22:
                return TL_wallet.nftItem.TLdeserialize(inputSerializedData, i10, z10);
            case 23:
                return TL_wallet.tonConnectRequest.TLdeserialize(inputSerializedData, i10, z10);
            case 24:
                return TL_wallet.tonConnectSession.TLdeserialize(inputSerializedData, i10, z10);
            case 25:
                return TL_wallet.walletUserAddress.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TL_wallet.walletTransaction.TLdeserialize(inputSerializedData, i10, z10);
        }
    }
}
