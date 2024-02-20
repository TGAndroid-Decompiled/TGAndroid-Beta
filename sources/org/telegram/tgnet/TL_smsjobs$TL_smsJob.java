package org.telegram.tgnet;
public class TL_smsjobs$TL_smsJob extends TLObject {
    public String job_id;
    public String phone_number;
    public String text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.job_id = abstractSerializedData.readString(z);
        this.phone_number = abstractSerializedData.readString(z);
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-425595208);
        abstractSerializedData.writeString(this.job_id);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.text);
    }
}
