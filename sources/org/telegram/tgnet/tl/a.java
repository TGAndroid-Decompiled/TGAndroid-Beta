package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
public final class a implements Vector.TLDeserializer {
    public final int f22637a;

    public a(int i9) {
        this.f22637a = i9;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        switch (this.f22637a) {
            case 0:
                return TL_iv.pageTableCell.TLdeserialize(inputSerializedData, i9, z10);
            case 1:
                return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData, i9, z10);
            case 2:
                return TL_keyboard.KeyboardInlineButton.TLdeserialize(inputSerializedData, i9, z10);
            case 3:
                return TL_stars.TL_StarGiftAuctionAcquiredGift.TLdeserialize(inputSerializedData, i9, z10);
            case 4:
                return TL_stars.TL_StarGiftActiveAuctionState.TLdeserialize(inputSerializedData, i9, z10);
            case 5:
                return TL_payments.connectedBotStarRef.TLdeserialize(inputSerializedData, i9, z10);
            case 6:
                return TL_payments.starRefProgram.TLdeserialize(inputSerializedData, i9, z10);
            case 7:
                return TLRPC.PhoneConnection.TLdeserialize(inputSerializedData, i9, z10);
            case 8:
                return TLRPC.GroupCallParticipant.TLdeserialize(inputSerializedData, i9, z10);
            case 9:
                return TL_phone.groupCallDonor.TLdeserialize(inputSerializedData, i9, z10);
            case 10:
                return TL_phone.TL_groupCallStreamChannel.TLdeserialize(inputSerializedData, i9, z10);
            case 11:
                return TL_stars.TL_starsGiftOption.TLdeserialize(inputSerializedData, i9, z10);
            case 12:
                return TL_stars.TL_starsGiveawayOption.TLdeserialize(inputSerializedData, i9, z10);
            case 13:
                return TL_stars.TL_starsTopupOption.TLdeserialize(inputSerializedData, i9, z10);
            case 14:
                return TL_stars.SavedStarGift.TLdeserialize(inputSerializedData, i9, z10);
            case 15:
                return TL_stars.StarsSubscription.TLdeserialize(inputSerializedData, i9, z10);
            case 16:
                return TL_stars.StarsTransaction.TLdeserialize(inputSerializedData, i9, z10);
            case 17:
                return TL_stars.TL_AuctionBidLevel.TLdeserialize(inputSerializedData, i9, z10);
            case 18:
                return TL_stars.StarGiftAuctionRound.TLdeserialize(inputSerializedData, i9, z10);
            case 19:
                return TL_stars.TL_starGiftCollection.TLdeserialize(inputSerializedData, i9, z10);
            case 20:
                return TL_stars.StarGiftAttribute.TLdeserialize(inputSerializedData, i9, z10);
            case 21:
                return TL_stars.StarsAmount.TLdeserialize(inputSerializedData, i9, z10);
            case 22:
                return TL_stars.StarGift.TLdeserialize(inputSerializedData, i9, z10);
            case 23:
                return TL_stars.TL_starsGiveawayWinnersOption.TLdeserialize(inputSerializedData, i9, z10);
            case 24:
                return TLRPC.MessageMedia.TLdeserialize(inputSerializedData, i9, z10);
            case 25:
                return TL_stars.starGiftAttributeCounter.TLdeserialize(inputSerializedData, i9, z10);
            case 26:
                return TL_stars.StarGiftUpgradePrice.TLdeserialize(inputSerializedData, i9, z10);
            case 27:
                return TL_stats.BroadcastRevenueTransaction.TLdeserialize(inputSerializedData, i9, z10);
            case 28:
                return TL_stats.PostInteractionCounters.TLdeserialize(inputSerializedData, i9, z10);
            default:
                return TL_stats.TL_statsGroupTopPoster.TLdeserialize(inputSerializedData, i9, z10);
        }
    }
}
