package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonFake extends TLRPC$ReportReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-170010905);
    }
}
