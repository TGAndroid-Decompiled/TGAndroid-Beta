package org.telegram.tgnet;
public class TLRPC$TL_payments_getBankCardData extends TLObject {
    public static int constructor = 779736953;
    public String number;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_bankCardData.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.number);
    }
}
