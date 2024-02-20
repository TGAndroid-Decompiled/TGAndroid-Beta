package org.telegram.tgnet;
public class TL_smsjobs$TL_updateSmsJob extends TLRPC$Update {
    public String job_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.job_id = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-245208620);
        abstractSerializedData.writeString(this.job_id);
    }
}
