package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class c implements Vector.TLDeserializer {

    public final int f22638a;

    public c(int i10) {
        this.f22638a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f22638a) {
            case 0:
                return TL_keyboard.access$400(inputSerializedData, i10, z10);
            case 1:
                return TL_account.Passkey.TLdeserialize(inputSerializedData, i10, z10);
            case 2:
                return TL_account.TL_businessWeeklyOpen.TLdeserialize(inputSerializedData, i10, z10);
            case 3:
                return TLRPC.EmojiStatus.TLdeserialize(inputSerializedData, i10, z10);
            case 4:
                return TLRPC.Theme.TLdeserialize(inputSerializedData, i10, z10);
            case 5:
                return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i10, z10);
            case 6:
                return TL_account.WebDomainException.TLdeserialize(inputSerializedData, i10, z10);
            case 7:
                return TLRPC.ChatTheme.TLdeserialize(inputSerializedData, i10, z10);
            case 8:
                return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i10, z10);
            case 9:
                return TLRPC.SecureValueError.TLdeserialize(inputSerializedData, i10, z10);
            case 10:
                return TLRPC.TL_authorization.TLdeserialize(inputSerializedData, i10, z10);
            case 11:
                return TL_account.TL_businessChatLink.TLdeserialize(inputSerializedData, i10, z10);
            case 12:
                return TL_account.TL_connectedBot.TLdeserialize(inputSerializedData, i10, z10);
            case 13:
                return TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, i10, z10);
            case 14:
                return TL_account.RequirementToContact.TLdeserialize(inputSerializedData, i10, z10);
            case 15:
                return TLRPC.PrivacyRule.TLdeserialize(inputSerializedData, i10, z10);
            case 16:
                return TLRPC.TL_webAuthorization.TLdeserialize(inputSerializedData, i10, z10);
            case 17:
                return TL_aicompose.AiComposeTone.TLdeserialize(inputSerializedData, i10, z10);
            case 18:
                return TLRPC.BotCommand.TLdeserialize(inputSerializedData, i10, z10);
            case 19:
                return TL_bots.botPreviewMedia.TLdeserialize(inputSerializedData, i10, z10);
            case 20:
                return TL_chatlists.TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, i10, z10);
            case 21:
                return TL_communities.CommunityPeerRequest.TLdeserialize(inputSerializedData, i10, z10);
            case 22:
                return TL_iv.PageBlock.TLdeserialize(inputSerializedData, i10, z10);
            case 23:
                return TLRPC.InputPhoto.TLdeserialize(inputSerializedData, i10, z10);
            case 24:
                return TL_keyboard.PageButton.TLdeserialize(inputSerializedData, i10, z10);
            case 25:
                return TL_iv.PageListItem.TLdeserialize(inputSerializedData, i10, z10);
            case 26:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
            case 27:
                return TL_iv.PageListOrderedItem.TLdeserialize(inputSerializedData, i10, z10);
            case 28:
                return TL_iv.pageRelatedArticle.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TL_iv.pageTableRow.TLdeserialize(inputSerializedData, i10, z10);
        }
    }
}
