package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonViolence extends TLRPC$ReportReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(505595789);
    }
}
