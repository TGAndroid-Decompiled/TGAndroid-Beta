package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonSpam extends TLRPC$ReportReason {
    public static int constructor = 1490799288;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
