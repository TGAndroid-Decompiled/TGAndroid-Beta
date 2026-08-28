package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;
public final class r implements Vector.TLDeserializer {
    public final int f22580a;

    public r(int i9) {
        this.f22580a = i9;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        switch (this.f22580a) {
            case 0:
                return TLRPC.TL_paymentFormMethod.TLdeserialize(inputSerializedData, i9, z10);
            case 1:
                return TLRPC.TL_paymentSavedCredentialsCard.TLdeserialize(inputSerializedData, i9, z10);
            case 2:
                return TLRPC.TL_shippingOption.TLdeserialize(inputSerializedData, i9, z10);
            case 3:
                return TLRPC.Photo.TLdeserialize(inputSerializedData, i9, z10);
            case 4:
                return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i9, z10);
            case 5:
                return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i9, z10);
            case 6:
                return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i9, z10);
            case 7:
                return TLRPC.TL_messageReportOption.TLdeserialize(inputSerializedData, i9, z10);
            case 8:
                return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i9, z10);
            case 9:
                return TLRPC.SecureFile.TLdeserialize(inputSerializedData, i9, z10);
            case 10:
                return TLRPC.TL_themeSettings.TLdeserialize(inputSerializedData, i9, z10);
            case 11:
                return TLRPC.TL_topPeer.TLdeserialize(inputSerializedData, i9, z10);
            case 12:
                return TLRPC.Update.TLdeserialize(inputSerializedData, i9, z10);
            case 13:
                return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i9, z10);
            case 14:
                return TLRPC.TL_fileHash.TLdeserialize(inputSerializedData, i9, z10);
            case 15:
                return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i9, z10);
            case 16:
                return TLRPC.WebPageAttribute.TLdeserialize(inputSerializedData, i9, z10);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i9, z10);
        }
    }
}
