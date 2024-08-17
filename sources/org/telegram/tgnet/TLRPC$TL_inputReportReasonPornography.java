package org.telegram.tgnet;

public class TLRPC$TL_inputReportReasonPornography extends TLRPC$ReportReason {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(777640226);
    }
}
