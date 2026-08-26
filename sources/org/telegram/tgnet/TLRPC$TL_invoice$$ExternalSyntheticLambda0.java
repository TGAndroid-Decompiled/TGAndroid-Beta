package org.telegram.tgnet;

public final class TLRPC$TL_invoice$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TLRPC$TL_invoice$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TLRPC.TL_labeledPrice.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.TL_groupCallParticipantVideoSourceGroup.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.TL_help_country.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.TL_help_countryCode.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.TL_help_peerColorOption.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.Document.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.TL_premiumSubscriptionOption.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.RecentMeUrl.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.TL_timezone.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.InputMedia.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.InputDocument.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.InputUser.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.InputSecureFile.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.JSONValue.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.TL_jsonObjectValue.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.LangPackString.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.TL_langPackLanguage.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.SecureValueType.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.TodoItem.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.MessageExtendedMedia.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TodoCompletion.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.ReactionCount.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.MessagePeerReaction.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.MessageReactor.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.StickerSet.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TLRPC.StickerSetCovered.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.TL_availableEffect.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.TL_availableReaction.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.BotInlineResult.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
