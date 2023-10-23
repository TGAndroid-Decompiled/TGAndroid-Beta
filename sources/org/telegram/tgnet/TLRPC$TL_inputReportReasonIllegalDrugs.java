package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonIllegalDrugs extends TLRPC$ReportReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(177124030);
    }
}
