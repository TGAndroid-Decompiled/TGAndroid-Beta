package org.telegram.tgnet;

public class TLRPC$TL_payments_assignPlayMarketTransaction extends TLObject {
    public static int constructor = 1336560365;
    public String purchase_token;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.purchase_token);
    }
}
