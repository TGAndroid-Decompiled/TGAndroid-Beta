package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_reportResultChooseOption extends TLRPC$ReportResult {
    public ArrayList options = new ArrayList();
    public String title;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.title = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_messageReportOption TLdeserialize = TLRPC$TL_messageReportOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.options.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-253435722);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.options.size());
        for (int i = 0; i < this.options.size(); i++) {
            ((TLRPC$TL_messageReportOption) this.options.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
