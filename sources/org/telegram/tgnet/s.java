package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;
public final class s implements Vector.TLDeserializer {
    public final int f28638a;

    public s(int i7) {
        this.f28638a = i7;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        switch (this.f28638a) {
            case 0:
                return TLRPC.TL_bankCardOpenUrl.TLdeserialize(inputSerializedData, i7, z10);
            case 1:
                return TLRPC.TL_premiumGiftCodeOption.TLdeserialize(inputSerializedData, i7, z10);
            case 2:
                return TLRPC.TL_paymentFormMethod.TLdeserialize(inputSerializedData, i7, z10);
            case 3:
                return TLRPC.TL_paymentSavedCredentialsCard.TLdeserialize(inputSerializedData, i7, z10);
            case 4:
                return TLRPC.TL_shippingOption.TLdeserialize(inputSerializedData, i7, z10);
            case 5:
                return TLRPC.Photo.TLdeserialize(inputSerializedData, i7, z10);
            case 6:
                return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i7, z10);
            case 7:
                return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i7, z10);
            case 8:
                return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i7, z10);
            case 9:
                return TLRPC.TL_messageReportOption.TLdeserialize(inputSerializedData, i7, z10);
            case 10:
                return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i7, z10);
            case 11:
                return TLRPC.SecureFile.TLdeserialize(inputSerializedData, i7, z10);
            case 12:
                return TLRPC.TL_shareThemeBackdropOption.TLdeserialize(inputSerializedData, i7, z10);
            case 13:
                return TLRPC.TL_themeSettings.TLdeserialize(inputSerializedData, i7, z10);
            case 14:
                return TLRPC.TL_topPeer.TLdeserialize(inputSerializedData, i7, z10);
            case 15:
                return TLRPC.Update.TLdeserialize(inputSerializedData, i7, z10);
            case 16:
                return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i7, z10);
            case 17:
                return TLRPC.TL_fileHash.TLdeserialize(inputSerializedData, i7, z10);
            case 18:
                return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i7, z10);
            case 19:
                return TLRPC.WebPageAttribute.TLdeserialize(inputSerializedData, i7, z10);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i7, z10);
        }
    }
}
