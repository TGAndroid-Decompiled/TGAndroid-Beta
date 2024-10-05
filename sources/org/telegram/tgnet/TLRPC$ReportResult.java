package org.telegram.tgnet;

public abstract class TLRPC$ReportResult extends TLObject {
    public static TLRPC$ReportResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ReportResult tLRPC$TL_reportResultAddComment = i != -1917633461 ? i != -253435722 ? i != 1862904881 ? null : new TLRPC$TL_reportResultAddComment() : new TLRPC$TL_reportResultChooseOption() : new TLRPC$ReportResult() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1917633461);
            }
        };
        if (tLRPC$TL_reportResultAddComment == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ReportResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_reportResultAddComment != null) {
            tLRPC$TL_reportResultAddComment.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_reportResultAddComment;
    }
}
