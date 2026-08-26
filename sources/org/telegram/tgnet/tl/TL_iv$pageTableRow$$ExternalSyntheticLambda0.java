package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class TL_iv$pageTableRow$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TL_iv$pageTableRow$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TL_iv.pageTableCell.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TL_keyboard.KeyboardInlineButton.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TL_stars.TL_StarGiftAuctionAcquiredGift.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TL_stars.TL_StarGiftActiveAuctionState.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TL_payments.connectedBotStarRef.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TL_payments.starRefProgram.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.PhoneConnection.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.GroupCallParticipant.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TL_phone.groupCallDonor.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TL_phone.TL_groupCallStreamChannel.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TL_stars.TL_starsGiftOption.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_stars.TL_starsGiveawayOption.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TL_stars.TL_starsTopupOption.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TL_stars.SavedStarGift.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_stars.StarsSubscription.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TL_stars.StarsTransaction.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TL_stars.TL_AuctionBidLevel.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TL_stars.StarGiftAuctionRound.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TL_stars.TL_starGiftCollection.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TL_stars.StarGiftAttribute.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TL_stars.StarsAmount.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TL_stars.StarGift.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TL_stars.TL_starsGiveawayWinnersOption.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.MessageMedia.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TL_stars.starGiftAttributeCounter.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_stars.StarGiftUpgradePrice.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TL_stats.BroadcastRevenueTransaction.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TL_stats.PostInteractionCounters.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_stats.TL_statsGroupTopPoster.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
