package org.telegram.tgnet;
public class TLRPC$TL_inputReportReasonPersonalDetails extends TLRPC$ReportReason {
    public static int constructor = -1631091139;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
