package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
public final class b implements Vector.TLDeserializer {
    public final int f27220a;

    public b(int i7) {
        this.f27220a = i7;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        switch (this.f27220a) {
            case 0:
                return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData, i7, z9);
            case 1:
                return TL_keyboard.KeyboardInlineButton.TLdeserialize(inputSerializedData, i7, z9);
            case 2:
                return TL_stars.TL_StarGiftAuctionAcquiredGift.TLdeserialize(inputSerializedData, i7, z9);
            case 3:
                return TL_stars.TL_StarGiftActiveAuctionState.TLdeserialize(inputSerializedData, i7, z9);
            case 4:
                return TL_payments.connectedBotStarRef.TLdeserialize(inputSerializedData, i7, z9);
            case 5:
                return TL_payments.starRefProgram.TLdeserialize(inputSerializedData, i7, z9);
            case 6:
                return TLRPC.PhoneConnection.TLdeserialize(inputSerializedData, i7, z9);
            case 7:
                return TLRPC.GroupCallParticipant.TLdeserialize(inputSerializedData, i7, z9);
            case 8:
                return TL_phone.groupCallDonor.TLdeserialize(inputSerializedData, i7, z9);
            case 9:
                return TL_phone.TL_groupCallStreamChannel.TLdeserialize(inputSerializedData, i7, z9);
            case 10:
                return TL_stars.TL_starsGiftOption.TLdeserialize(inputSerializedData, i7, z9);
            case 11:
                return TL_stars.TL_starsGiveawayOption.TLdeserialize(inputSerializedData, i7, z9);
            case 12:
                return TL_stars.TL_starsTopupOption.TLdeserialize(inputSerializedData, i7, z9);
            case 13:
                return TL_stars.SavedStarGift.TLdeserialize(inputSerializedData, i7, z9);
            case 14:
                return TL_stars.StarsSubscription.TLdeserialize(inputSerializedData, i7, z9);
            case 15:
                return TL_stars.StarsTransaction.TLdeserialize(inputSerializedData, i7, z9);
            case 16:
                return TL_stars.TL_AuctionBidLevel.TLdeserialize(inputSerializedData, i7, z9);
            case 17:
                return TL_stars.StarGiftAuctionRound.TLdeserialize(inputSerializedData, i7, z9);
            case 18:
                return TL_stars.TL_starGiftCollection.TLdeserialize(inputSerializedData, i7, z9);
            case 19:
                return TL_stars.StarGiftAttribute.TLdeserialize(inputSerializedData, i7, z9);
            case 20:
                return TL_stars.StarsAmount.TLdeserialize(inputSerializedData, i7, z9);
            case 21:
                return TL_stars.StarGift.TLdeserialize(inputSerializedData, i7, z9);
            case 22:
                return TL_stars.TL_starsGiveawayWinnersOption.TLdeserialize(inputSerializedData, i7, z9);
            case 23:
                return TLRPC.MessageMedia.TLdeserialize(inputSerializedData, i7, z9);
            case 24:
                return TL_stars.starGiftAttributeCounter.TLdeserialize(inputSerializedData, i7, z9);
            case 25:
                return TL_stars.StarGiftUpgradePrice.TLdeserialize(inputSerializedData, i7, z9);
            case 26:
                return TL_stats.BroadcastRevenueTransaction.TLdeserialize(inputSerializedData, i7, z9);
            case 27:
                return TL_stats.PostInteractionCounters.TLdeserialize(inputSerializedData, i7, z9);
            case 28:
                return TL_stats.TL_statsGroupTopPoster.TLdeserialize(inputSerializedData, i7, z9);
            default:
                return TL_stats.TL_statsGroupTopAdmin.TLdeserialize(inputSerializedData, i7, z9);
        }
    }
}
