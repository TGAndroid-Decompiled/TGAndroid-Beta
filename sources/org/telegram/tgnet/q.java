package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
public final class q implements Vector.TLDeserializer {
    public final int f22579a;

    public q(int i9) {
        this.f22579a = i9;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        switch (this.f22579a) {
            case 0:
                return TLRPC.Message.TLdeserialize(inputSerializedData, i9, z10);
            case 1:
                return TLRPC.TL_forumTopic.TLdeserialize(inputSerializedData, i9, z10);
            case 2:
                return TLRPC.TL_chatAdminWithInvites.TLdeserialize(inputSerializedData, i9, z10);
            case 3:
                return TLRPC.TL_chatInviteImporter.TLdeserialize(inputSerializedData, i9, z10);
            case 4:
                return TLRPC.DialogFilter.TLdeserialize(inputSerializedData, i9, z10);
            case 5:
                return TLRPC.Dialog.TLdeserialize(inputSerializedData, i9, z10);
            case 6:
                return TLRPC.EmojiGroup.TLdeserialize(inputSerializedData, i9, z10);
            case 7:
                return TLRPC.ExportedChatInvite.TLdeserialize(inputSerializedData, i9, z10);
            case 8:
                return TLRPC.TL_stickerPack.TLdeserialize(inputSerializedData, i9, z10);
            case 9:
                return TLRPC.DialogPeer.TLdeserialize(inputSerializedData, i9, z10);
            case 10:
                return TLRPC.TL_emojiLanguage.TLdeserialize(inputSerializedData, i9, z10);
            case 11:
                return TLRPC.TL_readParticipantDate.TLdeserialize(inputSerializedData, i9, z10);
            case 12:
                return TLRPC.TL_messages_searchCounter.TLdeserialize(inputSerializedData, i9, z10);
            case 13:
                return TLRPC.TL_dialogFilterSuggested.TLdeserialize(inputSerializedData, i9, z10);
            case 14:
                return TLRPC.TL_highScore.TLdeserialize(inputSerializedData, i9, z10);
            case 15:
                return TLRPC.TL_missingInvitee.TLdeserialize(inputSerializedData, i9, z10);
            case 16:
                return TLRPC.TL_messageViews.TLdeserialize(inputSerializedData, i9, z10);
            case 17:
                return TLRPC.InlineQueryPeerType.TLdeserialize(inputSerializedData, i9, z10);
            case 18:
                return TLRPC.TL_quickReply.TLdeserialize(inputSerializedData, i9, z10);
            case 19:
                return TLRPC.savedDialog.TLdeserialize(inputSerializedData, i9, z10);
            case 20:
                return TLRPC.TL_savedReactionTag.TLdeserialize(inputSerializedData, i9, z10);
            case 21:
                return TLRPC.TL_searchResultsCalendarPeriod.TLdeserialize(inputSerializedData, i9, z10);
            case 22:
                return TLRPC.TL_searchResultPosition.TLdeserialize(inputSerializedData, i9, z10);
            case 23:
                return TLRPC.TL_sponsoredMessage.TLdeserialize(inputSerializedData, i9, z10);
            case 24:
                return TLRPC.TL_stickerKeyword.TLdeserialize(inputSerializedData, i9, z10);
            case 25:
                return TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, i9, z10);
            case 26:
                return TL_iv.RichMessage.TLdeserialize(inputSerializedData, i9, z10);
            case 27:
                return TLRPC.MessagePeerVote.TLdeserialize(inputSerializedData, i9, z10);
            case 28:
                return TLRPC.TL_bankCardOpenUrl.TLdeserialize(inputSerializedData, i9, z10);
            default:
                return TLRPC.TL_premiumGiftCodeOption.TLdeserialize(inputSerializedData, i9, z10);
        }
    }
}
