package org.telegram.tgnet;
public class TLRPC$TL_paymentCharge extends TLObject {
    public String id;
    public String provider_charge_id;

    public static TLRPC$TL_paymentCharge TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-368917890 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_paymentCharge", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_paymentCharge tLRPC$TL_paymentCharge = new TLRPC$TL_paymentCharge();
        tLRPC$TL_paymentCharge.readParams(abstractSerializedData, z);
        return tLRPC$TL_paymentCharge;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readString(z);
        this.provider_charge_id = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-368917890);
        abstractSerializedData.writeString(this.id);
        abstractSerializedData.writeString(this.provider_charge_id);
    }
}
