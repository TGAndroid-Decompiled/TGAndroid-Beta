package org.telegram.tgnet;

public class TL_smsjobs$TL_smsjobs_finishJob extends TLObject {
    public String error;
    public int flags;
    public String job_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1327415076);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.job_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.error);
        }
    }
}
