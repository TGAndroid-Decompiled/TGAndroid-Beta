package org.telegram.tgnet;

public abstract class TLRPC$channels_SponsoredMessageReportResult extends TLObject {
    public static TLRPC$channels_SponsoredMessageReportResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$channels_SponsoredMessageReportResult tLRPC$TL_channels_sponsoredMessageReportResultChooseOption = i != -2073059774 ? i != -1384544183 ? i != 1044107055 ? null : new TLRPC$channels_SponsoredMessageReportResult() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1044107055);
            }
        } : new TLRPC$channels_SponsoredMessageReportResult() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1384544183);
            }
        } : new TLRPC$TL_channels_sponsoredMessageReportResultChooseOption();
        if (tLRPC$TL_channels_sponsoredMessageReportResultChooseOption == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in channels_SponsoredMessageReportResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_channels_sponsoredMessageReportResultChooseOption != null) {
            tLRPC$TL_channels_sponsoredMessageReportResultChooseOption.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_channels_sponsoredMessageReportResultChooseOption;
    }
}
