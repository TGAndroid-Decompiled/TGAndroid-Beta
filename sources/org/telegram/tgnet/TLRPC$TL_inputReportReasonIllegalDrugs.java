package org.telegram.tgnet;

public class TLRPC$TL_inputReportReasonIllegalDrugs extends TLRPC$ReportReason {
    public static int constructor = 177124030;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
