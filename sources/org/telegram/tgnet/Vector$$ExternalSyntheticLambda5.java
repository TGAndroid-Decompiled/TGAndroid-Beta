package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_keyboard;

public final class Vector$$ExternalSyntheticLambda5 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public Vector$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.TL_paymentFormMethod.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.TL_paymentSavedCredentialsCard.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.TL_shippingOption.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.Photo.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.TL_messageReportOption.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.SecureFile.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_themeSettings.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.TL_topPeer.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.Update.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.TL_fileHash.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.WebPageAttribute.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
