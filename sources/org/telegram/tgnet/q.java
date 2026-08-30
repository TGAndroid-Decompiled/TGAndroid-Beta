package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
public final class q implements Vector.TLDeserializer {
    public final int f19381a;

    public q(int i10) {
        this.f19381a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        switch (this.f19381a) {
            case 0:
                return TLRPC.Message.TLdeserialize(inputSerializedData, i10, z4);
            case 1:
                return TLRPC.TL_forumTopic.TLdeserialize(inputSerializedData, i10, z4);
            case 2:
                return TLRPC.TL_chatAdminWithInvites.TLdeserialize(inputSerializedData, i10, z4);
            case 3:
                return TLRPC.TL_chatInviteImporter.TLdeserialize(inputSerializedData, i10, z4);
            case 4:
                return TLRPC.DialogFilter.TLdeserialize(inputSerializedData, i10, z4);
            case 5:
                return TLRPC.Dialog.TLdeserialize(inputSerializedData, i10, z4);
            case 6:
                return TLRPC.EmojiGroup.TLdeserialize(inputSerializedData, i10, z4);
            case 7:
                return TLRPC.ExportedChatInvite.TLdeserialize(inputSerializedData, i10, z4);
            case 8:
                return TLRPC.TL_stickerPack.TLdeserialize(inputSerializedData, i10, z4);
            case 9:
                return TLRPC.DialogPeer.TLdeserialize(inputSerializedData, i10, z4);
            case 10:
                return TLRPC.TL_emojiLanguage.TLdeserialize(inputSerializedData, i10, z4);
            case 11:
                return TLRPC.TL_readParticipantDate.TLdeserialize(inputSerializedData, i10, z4);
            case 12:
                return TLRPC.TL_messages_searchCounter.TLdeserialize(inputSerializedData, i10, z4);
            case 13:
                return TLRPC.TL_dialogFilterSuggested.TLdeserialize(inputSerializedData, i10, z4);
            case 14:
                return TLRPC.TL_highScore.TLdeserialize(inputSerializedData, i10, z4);
            case 15:
                return TLRPC.TL_missingInvitee.TLdeserialize(inputSerializedData, i10, z4);
            case 16:
                return TLRPC.TL_messageViews.TLdeserialize(inputSerializedData, i10, z4);
            case 17:
                return TLRPC.InlineQueryPeerType.TLdeserialize(inputSerializedData, i10, z4);
            case 18:
                return TLRPC.TL_quickReply.TLdeserialize(inputSerializedData, i10, z4);
            case 19:
                return TLRPC.savedDialog.TLdeserialize(inputSerializedData, i10, z4);
            case 20:
                return TLRPC.TL_savedReactionTag.TLdeserialize(inputSerializedData, i10, z4);
            case 21:
                return TLRPC.TL_searchResultsCalendarPeriod.TLdeserialize(inputSerializedData, i10, z4);
            case 22:
                return TLRPC.TL_searchResultPosition.TLdeserialize(inputSerializedData, i10, z4);
            case 23:
                return TLRPC.TL_sponsoredMessage.TLdeserialize(inputSerializedData, i10, z4);
            case 24:
                return TLRPC.TL_stickerKeyword.TLdeserialize(inputSerializedData, i10, z4);
            case 25:
                return TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, i10, z4);
            case 26:
                return TL_iv.RichMessage.TLdeserialize(inputSerializedData, i10, z4);
            case 27:
                return TLRPC.MessagePeerVote.TLdeserialize(inputSerializedData, i10, z4);
            case 28:
                return TLRPC.TL_bankCardOpenUrl.TLdeserialize(inputSerializedData, i10, z4);
            default:
                return TLRPC.TL_premiumGiftCodeOption.TLdeserialize(inputSerializedData, i10, z4);
        }
    }
}
