package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class c implements Vector.TLDeserializer {
    public final int f27218a;

    public c(int i7) {
        this.f27218a = i7;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        switch (this.f27218a) {
            case 0:
                return TL_keyboard.TL_keyboardInlineButtonRow_layer228.a(inputSerializedData, i7, z9);
            case 1:
                return TL_account.Passkey.TLdeserialize(inputSerializedData, i7, z9);
            case 2:
                return TL_account.TL_businessWeeklyOpen.TLdeserialize(inputSerializedData, i7, z9);
            case 3:
                return TLRPC.EmojiStatus.TLdeserialize(inputSerializedData, i7, z9);
            case 4:
                return TLRPC.Theme.TLdeserialize(inputSerializedData, i7, z9);
            case 5:
                return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i7, z9);
            case 6:
                return TL_account.WebDomainException.TLdeserialize(inputSerializedData, i7, z9);
            case 7:
                return TLRPC.ChatTheme.TLdeserialize(inputSerializedData, i7, z9);
            case 8:
                return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i7, z9);
            case 9:
                return TLRPC.SecureValueError.TLdeserialize(inputSerializedData, i7, z9);
            case 10:
                return TLRPC.TL_authorization.TLdeserialize(inputSerializedData, i7, z9);
            case 11:
                return TL_account.TL_businessChatLink.TLdeserialize(inputSerializedData, i7, z9);
            case 12:
                return TL_account.TL_connectedBot.TLdeserialize(inputSerializedData, i7, z9);
            case 13:
                return TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, i7, z9);
            case 14:
                return TL_account.RequirementToContact.TLdeserialize(inputSerializedData, i7, z9);
            case 15:
                return TLRPC.PrivacyRule.TLdeserialize(inputSerializedData, i7, z9);
            case 16:
                return TLRPC.TL_webAuthorization.TLdeserialize(inputSerializedData, i7, z9);
            case 17:
                return TL_aicompose.AiComposeTone.TLdeserialize(inputSerializedData, i7, z9);
            case 18:
                return TLRPC.BotCommand.TLdeserialize(inputSerializedData, i7, z9);
            case 19:
                return TL_bots.botPreviewMedia.TLdeserialize(inputSerializedData, i7, z9);
            case 20:
                return TL_chatlists.TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, i7, z9);
            case 21:
                return TL_communities.CommunityPeerRequest.TLdeserialize(inputSerializedData, i7, z9);
            case 22:
                return TL_iv.PageBlock.TLdeserialize(inputSerializedData, i7, z9);
            case 23:
                return TLRPC.InputPhoto.TLdeserialize(inputSerializedData, i7, z9);
            case 24:
                return TL_keyboard.PageButton.TLdeserialize(inputSerializedData, i7, z9);
            case 25:
                return TL_iv.PageListItem.TLdeserialize(inputSerializedData, i7, z9);
            case 26:
                return TL_iv.PageListOrderedItem.TLdeserialize(inputSerializedData, i7, z9);
            case 27:
                return TL_iv.pageRelatedArticle.TLdeserialize(inputSerializedData, i7, z9);
            case 28:
                return TL_iv.pageTableRow.TLdeserialize(inputSerializedData, i7, z9);
            default:
                return TL_iv.pageTableCell.TLdeserialize(inputSerializedData, i7, z9);
        }
    }
}
