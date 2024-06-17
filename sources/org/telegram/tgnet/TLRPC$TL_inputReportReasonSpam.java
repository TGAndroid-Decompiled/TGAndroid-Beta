package org.telegram.tgnet;

public class TLRPC$TL_inputReportReasonSpam extends TLRPC$ReportReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1490799288);
    }
}
