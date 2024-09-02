package org.telegram.tgnet;

public class TLRPC$TL_sponsoredMessageReportOption extends TLObject {
    public byte[] option;
    public String text;

    public static TLRPC$TL_sponsoredMessageReportOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1124938064 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_sponsoredMessageReportOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_sponsoredMessageReportOption tLRPC$TL_sponsoredMessageReportOption = new TLRPC$TL_sponsoredMessageReportOption();
        tLRPC$TL_sponsoredMessageReportOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_sponsoredMessageReportOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.option = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1124938064);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeByteArray(this.option);
    }
}
