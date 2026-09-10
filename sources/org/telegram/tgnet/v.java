package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;
public final class v implements Vector.TLDeserializer {
    public final int f17459a;

    public v(int i10) {
        this.f17459a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f17459a) {
            case 0:
                return TLRPC.TL_paymentFormMethod.TLdeserialize(inputSerializedData, i10, z10);
            case 1:
                return TLRPC.TL_paymentSavedCredentialsCard.TLdeserialize(inputSerializedData, i10, z10);
            case 2:
                return TLRPC.TL_shippingOption.TLdeserialize(inputSerializedData, i10, z10);
            case 3:
                return TLRPC.Photo.TLdeserialize(inputSerializedData, i10, z10);
            case 4:
                return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i10, z10);
            case 5:
                return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i10, z10);
            case 6:
                return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i10, z10);
            case 7:
                return TLRPC.TL_messageReportOption.TLdeserialize(inputSerializedData, i10, z10);
            case 8:
                return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i10, z10);
            case 9:
                return TLRPC.SecureFile.TLdeserialize(inputSerializedData, i10, z10);
            case 10:
                return TLRPC.TL_themeSettings.TLdeserialize(inputSerializedData, i10, z10);
            case 11:
                return TLRPC.TL_topPeer.TLdeserialize(inputSerializedData, i10, z10);
            case 12:
                return TLRPC.Update.TLdeserialize(inputSerializedData, i10, z10);
            case 13:
                return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i10, z10);
            case 14:
                return TLRPC.TL_fileHash.TLdeserialize(inputSerializedData, i10, z10);
            case 15:
                return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i10, z10);
            case 16:
                return TLRPC.WebPageAttribute.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i10, z10);
        }
    }
}
