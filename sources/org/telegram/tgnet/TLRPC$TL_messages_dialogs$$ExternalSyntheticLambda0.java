package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_iv;

public final class TLRPC$TL_messages_dialogs$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TLRPC$TL_messages_dialogs$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TLRPC.Dialog.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.Message.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.TL_forumTopic.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.TL_chatAdminWithInvites.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.TL_chatInviteImporter.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.DialogFilter.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.EmojiGroup.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.ExportedChatInvite.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.TL_stickerPack.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.DialogPeer.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_emojiLanguage.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_readParticipantDate.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.TL_messages_searchCounter.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.TL_dialogFilterSuggested.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.TL_highScore.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.TL_missingInvitee.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.TL_messageViews.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.InlineQueryPeerType.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.TL_quickReply.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.savedDialog.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.TL_savedReactionTag.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_searchResultsCalendarPeriod.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.TL_searchResultPosition.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.TL_sponsoredMessage.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.TL_stickerKeyword.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_iv.RichMessage.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.MessagePeerVote.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.TL_bankCardOpenUrl.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.TL_premiumGiftCodeOption.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
