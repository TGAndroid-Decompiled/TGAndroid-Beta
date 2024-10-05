package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_sponsoredMessageReportResultChooseOption extends TLRPC$channels_SponsoredMessageReportResult {
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
            TLRPC$TL_sponsoredMessageReportOption TLdeserialize = TLRPC$TL_sponsoredMessageReportOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.options.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2073059774);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(481674261);
        int size = this.options.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$TL_sponsoredMessageReportOption) this.options.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
