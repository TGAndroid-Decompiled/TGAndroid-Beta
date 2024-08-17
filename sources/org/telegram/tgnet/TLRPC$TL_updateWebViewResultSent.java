package org.telegram.tgnet;

public class TLRPC$TL_updateWebViewResultSent extends TLRPC$Update {
    public long query_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.query_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(361936797);
        abstractSerializedData.writeInt64(this.query_id);
    }
}
