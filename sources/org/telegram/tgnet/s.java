package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class s implements Vector.TLDeserializer {
    public final int f17401a;

    public s(int i10) {
        this.f17401a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f17401a) {
            case 0:
                return TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, i10, z10);
            case 1:
                return TLRPC.TL_groupCallParticipantVideoSourceGroup.TLdeserialize(inputSerializedData, i10, z10);
            case 2:
                return TLRPC.TL_help_country.TLdeserialize(inputSerializedData, i10, z10);
            case 3:
                return TLRPC.TL_help_countryCode.TLdeserialize(inputSerializedData, i10, z10);
            case 4:
                return TLRPC.TL_help_peerColorOption.TLdeserialize(inputSerializedData, i10, z10);
            case 5:
                return TLRPC.Document.TLdeserialize(inputSerializedData, i10, z10);
            case 6:
                return TLRPC.TL_premiumSubscriptionOption.TLdeserialize(inputSerializedData, i10, z10);
            case 7:
                return TLRPC.RecentMeUrl.TLdeserialize(inputSerializedData, i10, z10);
            case 8:
                return TLRPC.TL_timezone.TLdeserialize(inputSerializedData, i10, z10);
            case 9:
                return TLRPC.InputMedia.TLdeserialize(inputSerializedData, i10, z10);
            case 10:
                return TLRPC.InputDocument.TLdeserialize(inputSerializedData, i10, z10);
            case 11:
                return TLRPC.InputUser.TLdeserialize(inputSerializedData, i10, z10);
            case 12:
                return TLRPC.InputSecureFile.TLdeserialize(inputSerializedData, i10, z10);
            case 13:
                return TLRPC.TL_labeledPrice.TLdeserialize(inputSerializedData, i10, z10);
            case 14:
                return TLRPC.JSONValue.TLdeserialize(inputSerializedData, i10, z10);
            case 15:
                return TLRPC.TL_jsonObjectValue.TLdeserialize(inputSerializedData, i10, z10);
            case 16:
                return TLRPC.LangPackString.TLdeserialize(inputSerializedData, i10, z10);
            case 17:
                return TLRPC.TL_langPackLanguage.TLdeserialize(inputSerializedData, i10, z10);
            case 18:
                return TLRPC.SecureValueType.TLdeserialize(inputSerializedData, i10, z10);
            case 19:
                return TLRPC.TodoItem.TLdeserialize(inputSerializedData, i10, z10);
            case 20:
                return TLRPC.MessageExtendedMedia.TLdeserialize(inputSerializedData, i10, z10);
            case 21:
                return TLRPC.TodoCompletion.TLdeserialize(inputSerializedData, i10, z10);
            case 22:
                return TLRPC.ReactionCount.TLdeserialize(inputSerializedData, i10, z10);
            case 23:
                return TLRPC.MessagePeerReaction.TLdeserialize(inputSerializedData, i10, z10);
            case 24:
                return TLRPC.MessageReactor.TLdeserialize(inputSerializedData, i10, z10);
            case 25:
                return TLRPC.StickerSet.TLdeserialize(inputSerializedData, i10, z10);
            case 26:
                return TLRPC.StickerSetCovered.TLdeserialize(inputSerializedData, i10, z10);
            case 27:
                return TLRPC.TL_availableEffect.TLdeserialize(inputSerializedData, i10, z10);
            case 28:
                return TLRPC.TL_availableReaction.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TLRPC.BotInlineResult.TLdeserialize(inputSerializedData, i10, z10);
        }
    }
}
