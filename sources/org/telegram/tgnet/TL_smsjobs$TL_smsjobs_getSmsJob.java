package org.telegram.tgnet;
public class TL_smsjobs$TL_smsjobs_getSmsJob extends TLObject {
    public String job_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i == -425595208) {
            TL_smsjobs$TL_smsJob tL_smsjobs$TL_smsJob = new TL_smsjobs$TL_smsJob();
            tL_smsjobs$TL_smsJob.readParams(abstractSerializedData, z);
            return tL_smsjobs$TL_smsJob;
        }
        return null;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2005766191);
        abstractSerializedData.writeString(this.job_id);
    }
}
