package org.telegram.tgnet;

public class TLRPC$TL_messageReportOption extends TLObject {
    public byte[] option;
    public String text;

    public static TLRPC$TL_messageReportOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (2030298073 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messageReportOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messageReportOption tLRPC$TL_messageReportOption = new TLRPC$TL_messageReportOption();
        tLRPC$TL_messageReportOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_messageReportOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.option = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2030298073);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeByteArray(this.option);
    }
}
