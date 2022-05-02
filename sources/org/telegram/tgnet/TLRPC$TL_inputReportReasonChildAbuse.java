package org.telegram.tgnet;

public class TLRPC$TL_inputReportReasonChildAbuse extends TLRPC$ReportReason {
    public static int constructor = -1376497949;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
