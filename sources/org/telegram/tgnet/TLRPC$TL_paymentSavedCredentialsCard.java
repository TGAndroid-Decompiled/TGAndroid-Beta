package org.telegram.tgnet;

public class TLRPC$TL_paymentSavedCredentialsCard extends TLObject {
    public static int constructor = -842892769;
    public String f977id;
    public String title;

    public static TLRPC$TL_paymentSavedCredentialsCard TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_paymentSavedCredentialsCard", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_paymentSavedCredentialsCard tLRPC$TL_paymentSavedCredentialsCard = new TLRPC$TL_paymentSavedCredentialsCard();
        tLRPC$TL_paymentSavedCredentialsCard.readParams(abstractSerializedData, z);
        return tLRPC$TL_paymentSavedCredentialsCard;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f977id = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.f977id);
        abstractSerializedData.writeString(this.title);
    }
}
