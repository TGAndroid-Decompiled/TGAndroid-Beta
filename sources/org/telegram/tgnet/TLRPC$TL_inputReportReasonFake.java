package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonFake extends TLRPC$ReportReason {
    public static int constructor = -170010905;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
