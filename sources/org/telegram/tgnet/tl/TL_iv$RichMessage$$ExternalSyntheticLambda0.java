package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class TL_iv$RichMessage$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TL_iv$RichMessage$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TL_iv.PageBlock.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TL_keyboard.access$400(inputSerializedData, i, z);
            case 2:
                return TL_account.Passkey.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TL_account.TL_businessWeeklyOpen.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.EmojiStatus.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.Theme.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_account.WebDomainException.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.ChatTheme.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.SecureValueError.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_authorization.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_account.TL_businessChatLink.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TL_account.TL_connectedBot.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_account.RequirementToContact.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.PrivacyRule.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.TL_webAuthorization.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TL_aicompose.AiComposeTone.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.BotCommand.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TL_bots.botPreviewMedia.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TL_chatlists.TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TL_communities.CommunityPeerRequest.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.InputPhoto.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TL_keyboard.PageButton.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TL_iv.PageListItem.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TL_iv.PageListOrderedItem.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TL_iv.pageRelatedArticle.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_iv.pageTableRow.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
