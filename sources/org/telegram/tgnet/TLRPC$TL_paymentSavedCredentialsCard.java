package org.telegram.tgnet;

public class TLRPC$TL_paymentSavedCredentialsCard extends TLObject {
    public String id;
    public String title;

    public static TLRPC$TL_paymentSavedCredentialsCard TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-842892769 != i) {
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
        this.id = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-842892769);
        abstractSerializedData.writeString(this.id);
        abstractSerializedData.writeString(this.title);
    }
}
