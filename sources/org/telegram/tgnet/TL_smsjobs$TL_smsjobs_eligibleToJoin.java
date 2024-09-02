package org.telegram.tgnet;

public class TL_smsjobs$TL_smsjobs_eligibleToJoin extends TLObject {
    public int monthly_sent_sms;
    public String terms_of_use;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.terms_of_use = abstractSerializedData.readString(z);
        this.monthly_sent_sms = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-594852657);
        abstractSerializedData.writeString(this.terms_of_use);
        abstractSerializedData.writeInt32(this.monthly_sent_sms);
    }
}
